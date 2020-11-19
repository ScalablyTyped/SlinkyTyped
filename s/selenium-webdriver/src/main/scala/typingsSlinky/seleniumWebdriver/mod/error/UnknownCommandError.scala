package typingsSlinky.seleniumWebdriver.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command could not be executed because the remote end is not aware of it.
  */
@JSImport("selenium-webdriver", "error.UnknownCommandError")
@js.native
class UnknownCommandError () extends WebDriverError {
  def this(message: String) = this()
}
