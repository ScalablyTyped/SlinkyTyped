package typingsSlinky.seleniumWebdriver

import typingsSlinky.seleniumWebdriver.httpMod.Executor
import typingsSlinky.seleniumWebdriver.mod.Capabilities
import typingsSlinky.seleniumWebdriver.mod.CreateSessionCapabilities
import typingsSlinky.seleniumWebdriver.mod.Session
import typingsSlinky.seleniumWebdriver.mod.WebDriver
import typingsSlinky.seleniumWebdriver.remoteMod.DriverService
import typingsSlinky.seleniumWebdriver.remoteMod.DriverService.Builder
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object edgeMod {
  
  @JSImport("selenium-webdriver/edge", "Driver")
  @js.native
  class Driver protected () extends WebDriver {
    def this(session: js.Promise[Session], executor: Executor) = this()
    // region Constructors
    /**
      * @param {!(Session|Promise<!Session>)} session Either a
      *     known session or a promise that will be resolved to a session.
      * @param {!command.Executor} executor The executor to use when sending
      *     commands to the browser.
      */
    def this(session: Session, executor: Executor) = this()
    
    /**
      * This function is a no-op as file detectors are not supported by this
      * implementation.
      * @override
      */
    def setFileDetector(): Unit = js.native
  }
  /* static members */
  object Driver {
    
    /**
      * Creates a new browser session for Microsoft's Edge browser.
      *
      * @param {(capabilities.Capabilities|Options)=} opt_config The configuration
      *     options.
      * @param {remote.DriverService=} opt_service The session to use; will use
      *     the {@linkplain #getDefaultService default service} by default.
      * @return {!Driver} A new driver instance.
      */
    @JSImport("selenium-webdriver/edge", "Driver.createSession")
    @js.native
    def createSession(): Driver = js.native
    @JSImport("selenium-webdriver/edge", "Driver.createSession")
    @js.native
    def createSession(opt_config: js.UndefOr[scala.Nothing], opt_service: DriverService): Driver = js.native
    @JSImport("selenium-webdriver/edge", "Driver.createSession")
    @js.native
    def createSession(opt_config: CreateSessionCapabilities): Driver = js.native
    @JSImport("selenium-webdriver/edge", "Driver.createSession")
    @js.native
    def createSession(opt_config: CreateSessionCapabilities, opt_service: DriverService): Driver = js.native
  }
  
  @JSImport("selenium-webdriver/edge", "Options")
  @js.native
  // region Constructors
  /**
    * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
    *     capabilities to initialize this instance from.
    */
  class Options () extends Capabilities {
    def this(other: js.Object) = this()
    def this(other: typingsSlinky.seleniumWebdriver.capabilitiesMod.Capabilities) = this()
    def this(other: Map[String, _]) = this()
  }
  
  @JSImport("selenium-webdriver/edge", "ServiceBuilder")
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
  
  @JSImport("selenium-webdriver/edge", "getDefaultService")
  @js.native
  def getDefaultService(): DriverService = js.native
  
  @JSImport("selenium-webdriver/edge", "setDefaultService")
  @js.native
  def setDefaultService(service: DriverService): Unit = js.native
}
