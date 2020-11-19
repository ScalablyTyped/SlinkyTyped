package typingsSlinky.seleniumWebdriver

import typingsSlinky.seleniumWebdriver.mod.Capabilities
import typingsSlinky.seleniumWebdriver.mod.CreateSessionCapabilities
import typingsSlinky.seleniumWebdriver.mod.WebDriver
import typingsSlinky.seleniumWebdriver.remoteMod.DriverService
import typingsSlinky.seleniumWebdriver.remoteMod.DriverService.Builder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver/edge", JSImport.Namespace)
@js.native
object edgeMod extends js.Object {
  
  def getDefaultService(): DriverService = js.native
  
  def setDefaultService(service: DriverService): Unit = js.native
  
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
  @js.native
  object Driver extends js.Object {
    
    /**
      * Creates a new browser session for Microsoft's Edge browser.
      *
      * @param {(capabilities.Capabilities|Options)=} opt_config The configuration
      *     options.
      * @param {remote.DriverService=} opt_service The session to use; will use
      *     the {@linkplain #getDefaultService default service} by default.
      * @return {!Driver} A new driver instance.
      */
    def createSession(): Driver = js.native
    def createSession(opt_config: js.UndefOr[scala.Nothing], opt_service: DriverService): Driver = js.native
    def createSession(opt_config: CreateSessionCapabilities): Driver = js.native
    def createSession(opt_config: CreateSessionCapabilities, opt_service: DriverService): Driver = js.native
  }
  
  @js.native
  class Options () extends Capabilities
  
  @js.native
  /**
    * @param {string=} opt_exe Path to the server executable to use. If omitted,
    *   the builder will attempt to locate the MicrosoftEdgeDriver on the current
    *   PATH.
    * @throws {Error} If provided executable does not exist, or the
    *   MicrosoftEdgeDriver cannot be found on the PATH.
    */
  class ServiceBuilder () extends Builder {
    def this(opt_exe: String) = this()
  }
}
