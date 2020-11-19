package typingsSlinky.seleniumWebdriver.ieMod

import typingsSlinky.seleniumWebdriver.mod.Capabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver/ie", "Options")
@js.native
class Options () extends Capabilities {
  
  /**
    * Specifies command-line switches to use when launching Internet Explorer.
    * This is only valid when used with {@link #forceCreateProcessApi}.
    *
    * @param {...(string|!Array.<string>)} var_args The arguments to add.
    * @return {!Options} A self reference.
    */
  def addArguments(var_args: String*): Options = js.native
  
  /**
    * Configures the timeout, in milliseconds, that the driver will attempt to
    * located and attach to a newly opened instance of Internet Explorer. The
    * default is zero, which indicates waiting indefinitely.
    *
    * @param {number} timeout How long to wait for IE.
    * @return {!Options} A self reference.
    */
  def browserAttachTimeout(timeout: Double): Options = js.native
  
  /**
    * Configures whether the driver should attempt to remove obsolete
    * {@linkplain webdriver.WebElement WebElements} from its internal cache on
    * page navigation (true by default). Disabling this option will cause the
    * driver to run with a larger memory footprint.
    *
    * @param {boolean} enable Whether to enable element reference cleanup.
    * @return {!Options} A self reference.
    */
  def enableElementCacheCleanup(enable: Boolean): Options = js.native
  
  /**
    * Configures whether to enable persistent mouse hovering (true by default).
    * Persistent hovering is achieved by continuously firing mouse over events at
    * the last location the mouse cursor has been moved to.
    *
    * @param {boolean} enable Whether to enable persistent hovering.
    * @return {!Options} A self reference.
    */
  def enablePersistentHover(enable: Boolean): Options = js.native
  
  /**
    * Configures whether to clear the cache, cookies, history, and saved form
    * data before starting the browser. _Using this capability will clear session
    * data for all running instances of Internet Explorer, including those
    * started manually._
    *
    * @param {boolean} cleanSession Whether to clear all session data on startup.
    * @return {!Options} A self reference.
    */
  def ensureCleanSession(cleanSession: Boolean): Options = js.native
  
  /**
    * Configures whether to launch Internet Explorer using the CreateProcess API.
    * If this option is not specified, IE is launched using IELaunchURL, if
    * available. For IE 8 and above, this option requires the TabProcGrowth
    * registry value to be set to 0.
    *
    * @param {boolean} force Whether to use the CreateProcess API.
    * @return {!Options} A self reference.
    */
  def forceCreateProcessApi(force: Boolean): Options = js.native
  
  /**
    * Indicates whether to skip the check that the browser's zoom level is set to
    * 100%.
    *
    * @param {boolean} ignore Whether to ignore the browser's zoom level
    *     settings.
    * @return {!Options} A self reference.
    */
  def ignoreZoomSetting(ignore: Boolean): Options = js.native
  
  /**
    * Sets the initial URL loaded when IE starts. This is intended to be used
    * with
    * {@link #ignoreProtectedModeSettings} to allow the user to initialize IE in
    * the proper Protected Mode zone. Setting this option may cause browser
    * instability or flaky and unresponsive code. Only 'best effort' support is
    * provided when using this option.
    *
    * @param {string} url The initial browser URL.
    * @return {!Options} A self reference.
    */
  def initialBrowserUrl(url: String): Options = js.native
  
  /**
    * Whether to disable the protected mode settings check when the session is
    * created. Disbling this setting may lead to significant instability as the
    * browser may become unresponsive/hang. Only 'best effort' support is
    * provided when using this capability.
    *
    * For more information, refer to the IEDriver's
    * [required system configuration](http://goo.gl/eH0Yi3).
    *
    * @param {boolean} ignoreSettings Whether to ignore protected mode settings.
    * @return {!Options} A self reference.
    */
  def introduceFlakinessByIgnoringProtectedModeSettings(ignoreSettings: Boolean): Options = js.native
  
  /**
    * Configures whether to require the IE window to have input focus before
    * performing any user interactions (i.e. mouse or keyboard events). This
    * option is disabled by default, but delivers much more accurate interaction
    * events when enabled.
    *
    * @param {boolean} require Whether to require window focus.
    * @return {!Options} A self reference.
    */
  def requireWindowFocus(require: Boolean): Options = js.native
  
  /**
    * Sets the path of the temporary data directory to use.
    * @param {string} path The log file path.
    * @return {!Options} A self reference.
    */
  def setExtractPath(path: String): Options = js.native
  
  /**
    * Sets the IP address of the driver's host adapter.
    * @param {string} host The IP address to use.
    * @return {!Options} A self reference.
    */
  def setHost(host: String): Options = js.native
  
  /**
    * Sets the path to the log file the driver should log to.
    * @param {string} file The log file path.
    * @return {!Options} A self reference.
    */
  def setLogFile(file: String): Options = js.native
  
  /**
    * Sets the IEDriverServer's logging {@linkplain Level level}.
    * @param {Level} level The logging level.
    * @return {!Options} A self reference.
    */
  def setLogLevel(level: Level): Options = js.native
  
  /**
    * Sets whether the driver should start in silent mode.
    * @param {boolean} silent Whether to run in silent mode.
    * @return {!Options} A self reference.
    */
  def silent(silent: Boolean): Options = js.native
  
  /**
    * Configures whether proxies should be configured on a per-process basis. If
    * not set, setting a {@linkplain #setProxy proxy} will configure the system
    * proxy. The default behavior is to use the system proxy.
    *
    * @param {boolean} enable Whether to enable per-process proxy settings.
    * @return {!Options} A self reference.
    */
  def usePerProcessProxy(enable: Boolean): Options = js.native
}
