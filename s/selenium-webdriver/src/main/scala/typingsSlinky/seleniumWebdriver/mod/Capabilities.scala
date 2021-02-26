package typingsSlinky.seleniumWebdriver.mod

import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "Capabilities")
@js.native
// region Constructors
/**
  * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
  *     capabilities to initialize this instance from.
  */
class Capabilities ()
  extends typingsSlinky.seleniumWebdriver.capabilitiesMod.Capabilities {
  def this(other: js.Object) = this()
  def this(other: typingsSlinky.seleniumWebdriver.capabilitiesMod.Capabilities) = this()
  def this(other: Map[String, _]) = this()
}
/* static members */
object Capabilities {
  
  // endregion
  // region Static Methods
  /**
    * @return {!Capabilities} A basic set of capabilities for Chrome.
    */
  @JSImport("selenium-webdriver", "Capabilities.chrome")
  @js.native
  def chrome(): typingsSlinky.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
  
  /**
    * @return {!Capabilities} A basic set of capabilities for Microsoft Edge.
    */
  @JSImport("selenium-webdriver", "Capabilities.edge")
  @js.native
  def edge(): typingsSlinky.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
  
  /**
    * @return {!Capabilities} A basic set of capabilities for Firefox.
    */
  @JSImport("selenium-webdriver", "Capabilities.firefox")
  @js.native
  def firefox(): typingsSlinky.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
  
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     Internet Explorer.
    */
  @JSImport("selenium-webdriver", "Capabilities.ie")
  @js.native
  def ie(): typingsSlinky.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
  
  /**
    * @return {!Capabilities} A basic set of capabilities for Safari.
    */
  @JSImport("selenium-webdriver", "Capabilities.safari")
  @js.native
  def safari(): typingsSlinky.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
}
