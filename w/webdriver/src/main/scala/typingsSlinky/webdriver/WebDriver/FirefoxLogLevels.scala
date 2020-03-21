package typingsSlinky.webdriver.WebDriver

import typingsSlinky.webdriver.webdriverStrings.config_
import typingsSlinky.webdriver.webdriverStrings.info_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webdriver.webdriverStrings.trace
  - typingsSlinky.webdriver.webdriverStrings.debug
  - typingsSlinky.webdriver.webdriverStrings.config_
  - typingsSlinky.webdriver.webdriverStrings.info_
  - typingsSlinky.webdriver.webdriverStrings.warn
  - typingsSlinky.webdriver.webdriverStrings.error
  - typingsSlinky.webdriver.webdriverStrings.fatal
*/
trait FirefoxLogLevels extends js.Object

object FirefoxLogLevels {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def config: config_ = this.cast("config")
  @scala.inline
  def debug: typingsSlinky.webdriver.webdriverStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.webdriver.webdriverStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsSlinky.webdriver.webdriverStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: info_ = this.cast("info")
  @scala.inline
  def trace: typingsSlinky.webdriver.webdriverStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsSlinky.webdriver.webdriverStrings.warn = this.cast("warn")
}

