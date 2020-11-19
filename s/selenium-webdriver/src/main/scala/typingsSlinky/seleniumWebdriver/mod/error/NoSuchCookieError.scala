package typingsSlinky.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates a named cookie could not be found in the cookie jar for the
  * currently selected document.
  */
@JSImport("selenium-webdriver", "error.NoSuchCookieError")
@js.native
class NoSuchCookieError () extends WebDriverError {
  def this(message: String) = this()
}
