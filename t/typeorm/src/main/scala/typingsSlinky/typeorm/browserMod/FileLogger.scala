package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.loggerOptionsMod.FileLoggerOptions
import typingsSlinky.typeorm.typeormStrings.all
import typingsSlinky.typeorm.typeormStrings.error
import typingsSlinky.typeorm.typeormStrings.info
import typingsSlinky.typeorm.typeormStrings.log
import typingsSlinky.typeorm.typeormStrings.migration
import typingsSlinky.typeorm.typeormStrings.query
import typingsSlinky.typeorm.typeormStrings.schema
import typingsSlinky.typeorm.typeormStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "FileLogger")
@js.native
class FileLogger ()
  extends typingsSlinky.typeorm.fileLoggerMod.FileLogger {
  def this(options: js.Array[error | log | info | warn | query | schema | migration]) = this()
  def this(options: Boolean) = this()
  def this(options: all) = this()
  def this(options: js.UndefOr[scala.Nothing], fileLoggerOptions: FileLoggerOptions) = this()
  def this(
    options: js.Array[error | log | info | warn | query | schema | migration],
    fileLoggerOptions: FileLoggerOptions
  ) = this()
  def this(options: Boolean, fileLoggerOptions: FileLoggerOptions) = this()
  def this(options: all, fileLoggerOptions: FileLoggerOptions) = this()
}
