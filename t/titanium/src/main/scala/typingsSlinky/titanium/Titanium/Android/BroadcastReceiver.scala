package typingsSlinky.titanium.Titanium.Android

import typingsSlinky.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Monitor and handle Android system broadcasts.
  */
@js.native
trait BroadcastReceiver extends Proxy {
  
  /**
    * Gets the value of the <Titanium.Android.BroadcastReceiver.onReceived> property.
    * @deprecated Access <Titanium.Android.BroadcastReceiver.onReceived> instead.
    */
  def getOnReceived(): js.Function1[/* param0 */ js.Any, Unit] = js.native
  
  /**
    * Gets the value of the <Titanium.Android.BroadcastReceiver.url> property.
    * @deprecated Access <Titanium.Android.BroadcastReceiver.url> instead.
    */
  def getUrl(): String = js.native
  
  /**
    * The function called when a broadcast is received.
    */
  def onReceived(param0: js.Any): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.BroadcastReceiver.onReceived> property.
    * @deprecated Set the value using <Titanium.Android.BroadcastReceiver.onReceived> instead.
    */
  def setOnReceived(onReceived: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.BroadcastReceiver.url> property.
    * @deprecated Set the value using <Titanium.Android.BroadcastReceiver.url> instead.
    */
  def setUrl(url: String): Unit = js.native
  
  /**
    * URL of the JavaScript file to handle the broadcast.
    */
  var url: String = js.native
}
