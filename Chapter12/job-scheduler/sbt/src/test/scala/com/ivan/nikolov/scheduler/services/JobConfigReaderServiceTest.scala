package com.ivan.nikolov.scheduler.services

import com.ivan.nikolov.scheduler.TestEnvironment
import com.ivan.nikolov.scheduler.config.job.{Console, Daily, JobConfig, TimeOptions}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class JobConfigReaderServiceTest extends AnyFlatSpec with Matchers with TestEnvironment {

  override val ioService: IOService = new IOService
  override val jobConfigReaderService: JobConfigReaderService = new JobConfigReaderService

  "readJobConfigs" should "read and parse configurations successfully." in {
    val result = jobConfigReaderService.readJobConfigs()
    result should have size(1)
    result should contain(
      JobConfig(
        "Test Command",
        "ping google.com -c 10",
        Console,
        Daily,
        TimeOptions(12, 10)
      )
    )
  }
}
