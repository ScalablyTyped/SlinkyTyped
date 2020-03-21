package typingsSlinky.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webdriver.webdriverStrings.script
  - typingsSlinky.webdriver.webdriverStrings.pageLoad
  - typingsSlinky.webdriver.webdriverStrings.`implicit`
*/
trait Timeouts extends js.Object

object Timeouts {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `implicit`: typingsSlinky.webdriver.webdriverStrings.`implicit` = this.cast("implicit")
  @scala.inline
  def pageLoad: typingsSlinky.webdriver.webdriverStrings.pageLoad = this.cast("pageLoad")
  @scala.inline
  def script: typingsSlinky.webdriver.webdriverStrings.script = this.cast("script")
}

