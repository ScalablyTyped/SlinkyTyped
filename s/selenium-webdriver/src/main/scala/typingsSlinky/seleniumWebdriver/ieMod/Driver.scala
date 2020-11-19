package typingsSlinky.seleniumWebdriver.ieMod

import typingsSlinky.seleniumWebdriver.mod.Capabilities
import typingsSlinky.seleniumWebdriver.mod.WebDriver
import typingsSlinky.seleniumWebdriver.remoteMod.DriverService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver/ie", "Driver")
@js.native
class Driver () extends WebDriver {
  
  /**
    * This function is a no-op as file detectors are not supported by this
    * implementation.
    * @override
    */
  def setFileDetector(): Unit = js.native
}
/* static members */
@JSImport("selenium-webdriver/ie", "Driver")
@js.native
object Driver extends js.Object {
  
  /**
    * Creates a new session for Microsoft's Internet Explorer.
    *
    * @param {(Capabilities|Options)=} options The configuration options.
    * @param {(remote.DriverService)=} opt_service The `DriverService` to use
    *   to start the IEDriverServer in a child process, optionally.
    * @return {!Driver} A new driver instance.
    */
  def createSession(): Driver = js.native
  def createSession(options: js.UndefOr[scala.Nothing], opt_service: DriverService): Driver = js.native
  def createSession(options: Options): Driver = js.native
  def createSession(options: Options, opt_service: DriverService): Driver = js.native
  def createSession(options: Capabilities): Driver = js.native
  def createSession(options: Capabilities, opt_service: DriverService): Driver = js.native
}
