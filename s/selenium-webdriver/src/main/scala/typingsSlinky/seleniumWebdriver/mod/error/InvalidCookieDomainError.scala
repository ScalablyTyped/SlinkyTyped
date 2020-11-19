package typingsSlinky.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An illegal attempt was made to set a cookie under a different domain than
  * the current page.
  */
@JSImport("selenium-webdriver", "error.InvalidCookieDomainError")
@js.native
class InvalidCookieDomainError () extends WebDriverError {
  def this(message: String) = this()
}
