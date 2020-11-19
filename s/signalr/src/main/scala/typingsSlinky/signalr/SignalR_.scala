package typingsSlinky.signalr

import typingsSlinky.signalr.SignalR.AjaxDefaults
import typingsSlinky.signalr.SignalR.AvailableEvents
import typingsSlinky.signalr.SignalR.Connection
import typingsSlinky.signalr.SignalR.ConnectionStates
import typingsSlinky.signalr.SignalR.Hub.HubCreator
import typingsSlinky.signalr.SignalR.Hub.Options
import typingsSlinky.signalr.SignalR.Transports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalR_ extends js.Object {
  
  /**
    * Creates a new SignalR connection for the given url
    *
    * @param url   The URL of the long polling endpoint
    * @param queryString   [Optional] Custom querystring parameters to add to the connection URL. If an object, every non-function member will be added to the querystring. If a string, it's added to the QS as specified.
    * @param logging [Optional] A flag indicating whether connection logging is enabled to the browser console/log. Defaults to false.
    */
  def apply(url: String): Connection = js.native
  def apply(url: String, queryString: js.UndefOr[scala.Nothing], logging: Boolean): Connection = js.native
  def apply(url: String, queryString: String): Connection = js.native
  def apply(url: String, queryString: String, logging: Boolean): Connection = js.native
  def apply(url: String, queryString: js.Object): Connection = js.native
  def apply(url: String, queryString: js.Object, logging: Boolean): Connection = js.native
  
  var ajaxDefaults: AjaxDefaults = js.native
  
  def changeState(connection: Connection, expectedState: Double, newState: Double): Unit = js.native
  
  var connectionState: ConnectionStates = js.native
  
  var events: AvailableEvents = js.native
  
  var hub: typingsSlinky.signalr.SignalR.Hub.Connection = js.native
  
  def hubConnection(): typingsSlinky.signalr.SignalR.Hub.Connection = js.native
  def hubConnection(url: js.UndefOr[scala.Nothing], options: Options): typingsSlinky.signalr.SignalR.Hub.Connection = js.native
  def hubConnection(url: String): typingsSlinky.signalr.SignalR.Hub.Connection = js.native
  def hubConnection(url: String, options: Options): typingsSlinky.signalr.SignalR.Hub.Connection = js.native
  @JSName("hubConnection")
  var hubConnection_Original: HubCreator = js.native
  
  def isDisconnecting(connection: Connection): Boolean = js.native
  
  /**
    *   Reinstates the original value of $.connection and returns the signalR object for manual assignment.
    */
  def noConflict(): Connection = js.native
  
  var transports: Transports = js.native
  
  /**
    *   Current SignalR version.
    */
  var version: String = js.native
}
