package typingsSlinky.titanium.global.Titanium

import typingsSlinky.titanium.Titanium.Event
import typingsSlinky.titanium.Titanium.UI.TabGroup
import typingsSlinky.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level API module, containing methods to output messages to the system log.
  */
@JSGlobal("Titanium.API")
@js.native
class API ()
  extends typingsSlinky.titanium.Titanium.Proxy
/* static members */
@JSGlobal("Titanium.API")
@js.native
object API extends js.Object {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  
  def debug(message: String): Unit = js.native
  /**
    * Logs messages with a `debug` severity-level.
    */
  def debug(message: js.Array[String]): Unit = js.native
  
  def error(message: String): Unit = js.native
  /**
    * Logs messages with an `error` severity-level.
    */
  def error(message: js.Array[String]): Unit = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.API.apiName> property.
    * @deprecated Access <Titanium.API.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.API.bubbleParent> property.
    * @deprecated Access <Titanium.API.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.API.lifecycleContainer> property.
    * @deprecated Access <Titanium.API.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  def info(message: String): Unit = js.native
  /**
    * Logs messages with an `info` severity-level.
    */
  def info(message: js.Array[String]): Unit = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  
  def log(level: String, message: String): Unit = js.native
  /**
    * Logs messages with the specified severity-level.
    */
  def log(level: String, message: js.Array[String]): Unit = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.API.bubbleParent> property.
    * @deprecated Set the value using <Titanium.API.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.API.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.API.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  def timestamp(message: String): Unit = js.native
  /**
    * Logs messages with a `timestamp` severity-level, prefixed with a timestamp float number
    * representing the number of seconds since January 1st, 2001.
    */
  def timestamp(message: js.Array[String]): Unit = js.native
  
  def trace(message: String): Unit = js.native
  /**
    * Logs messages with a `trace` severity-level.
    */
  def trace(message: js.Array[String]): Unit = js.native
  
  def warn(message: String): Unit = js.native
  /**
    * Logs messages with a `warn` severity-level.
    */
  def warn(message: js.Array[String]): Unit = js.native
}
