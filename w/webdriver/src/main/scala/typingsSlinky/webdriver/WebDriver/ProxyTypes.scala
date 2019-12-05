package typingsSlinky.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webdriver.webdriverStrings.pac
  - typings.webdriver.webdriverStrings.noproxy
  - typings.webdriver.webdriverStrings.autodetect
  - typings.webdriver.webdriverStrings.system
  - typings.webdriver.webdriverStrings.manual
*/
trait ProxyTypes extends js.Object

object ProxyTypes {
  @scala.inline
  def autodetect: typingsSlinky.webdriver.webdriverStrings.autodetect = this.cast("autodetect")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manual: typingsSlinky.webdriver.webdriverStrings.manual = this.cast("manual")
  @scala.inline
  def noproxy: typingsSlinky.webdriver.webdriverStrings.noproxy = this.cast("noproxy")
  @scala.inline
  def pac: typingsSlinky.webdriver.webdriverStrings.pac = this.cast("pac")
  @scala.inline
  def system: typingsSlinky.webdriver.webdriverStrings.system = this.cast("system")
}

