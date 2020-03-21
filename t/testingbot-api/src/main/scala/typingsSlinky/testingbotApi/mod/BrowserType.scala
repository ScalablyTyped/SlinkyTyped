package typingsSlinky.testingbotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.testingbotApi.testingbotApiStrings.webdriver
  - typingsSlinky.testingbotApi.testingbotApiStrings.rc
*/
trait BrowserType extends js.Object

object BrowserType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rc: typingsSlinky.testingbotApi.testingbotApiStrings.rc = this.cast("rc")
  @scala.inline
  def webdriver: typingsSlinky.testingbotApi.testingbotApiStrings.webdriver = this.cast("webdriver")
}

