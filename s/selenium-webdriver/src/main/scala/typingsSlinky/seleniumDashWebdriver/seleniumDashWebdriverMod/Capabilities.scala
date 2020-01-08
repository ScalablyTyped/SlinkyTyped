package typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Capabilities")
@js.native
// region Constructors
/**
  * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
  *     capabilities to initialize this instance from.
  */
class Capabilities ()
  extends typingsSlinky.seleniumDashWebdriver.libCapabilitiesMod.Capabilities {
  def this(other: js.Object) = this()
  def this(other: typingsSlinky.seleniumDashWebdriver.libCapabilitiesMod.Capabilities) = this()
  def this(other: Map[String, _]) = this()
}

/* static members */
@JSImport("selenium-webdriver", "Capabilities")
@js.native
object Capabilities extends js.Object {
  // endregion
  // region Static Methods
  /**
    * @return {!Capabilities} A basic set of capabilities for Chrome.
    */
  def chrome(): typingsSlinky.seleniumDashWebdriver.libCapabilitiesMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Microsoft Edge.
    */
  def edge(): typingsSlinky.seleniumDashWebdriver.libCapabilitiesMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Firefox.
    */
  def firefox(): typingsSlinky.seleniumDashWebdriver.libCapabilitiesMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     Internet Explorer.
    */
  def ie(): typingsSlinky.seleniumDashWebdriver.libCapabilitiesMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Safari.
    */
  def safari(): typingsSlinky.seleniumDashWebdriver.libCapabilitiesMod.Capabilities = js.native
}

