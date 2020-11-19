package typingsSlinky.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A modal dialog was open, blocking this operation.
  */
@JSImport("selenium-webdriver", "error.UnexpectedAlertOpenError")
@js.native
class UnexpectedAlertOpenError () extends WebDriverError {
  def this(message: String) = this()
  def this(message: js.UndefOr[scala.Nothing], openAlertText: String) = this()
  def this(message: String, openAlertText: String) = this()
  
  /**
    * @return {(string|undefined)} The text displayed with the unhandled alert,
    *     if available.
    */
  def getAlertText(): String = js.native
}
