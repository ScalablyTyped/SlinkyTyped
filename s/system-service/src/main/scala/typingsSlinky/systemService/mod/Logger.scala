package typingsSlinky.systemService.mod

import typingsSlinky.systemLogger.mod.FileConfiguration
import typingsSlinky.systemLogger.mod.LoggerConfiguration
import typingsSlinky.systemLogger.mod.SourcesConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("system-service", "Logger")
@js.native
class Logger ()
  extends typingsSlinky.systemLogger.mod.Logger {
  def this(configuration: LoggerConfiguration) = this()
  def this(configuration: js.UndefOr[scala.Nothing], fileConfig: FileConfiguration) = this()
  def this(configuration: LoggerConfiguration, fileConfig: FileConfiguration) = this()
  def this(
    configuration: js.UndefOr[scala.Nothing],
    fileConfig: js.UndefOr[scala.Nothing],
    sourceConfig: SourcesConfiguration
  ) = this()
  def this(
    configuration: js.UndefOr[scala.Nothing],
    fileConfig: FileConfiguration,
    sourceConfig: SourcesConfiguration
  ) = this()
  def this(
    configuration: LoggerConfiguration,
    fileConfig: js.UndefOr[scala.Nothing],
    sourceConfig: SourcesConfiguration
  ) = this()
  def this(
    configuration: LoggerConfiguration,
    fileConfig: FileConfiguration,
    sourceConfig: SourcesConfiguration
  ) = this()
}

