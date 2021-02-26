package typingsSlinky.signalr

import typingsSlinky.signalr.SignalR.Connection
import typingsSlinky.signalr.SignalR.Hub.HubCreator
import typingsSlinky.signalr.SignalR.Hub.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  /**
    * Creates a new SignalR connection for the given url
    *
    * @param url   The URL of the long polling endpoint
    * @param queryString   [Optional] Custom querystring parameters to add to the connection URL. If an object, every non-function member will be added to the querystring. If a string, it's added to the QS as specified.
    * @param logging [Optional] A flag indicating whether connection logging is enabled to the browser console/log. Defaults to false.
    */
  def connection(url: String): Connection = js.native
  def connection(url: String, queryString: js.UndefOr[scala.Nothing], logging: Boolean): Connection = js.native
  def connection(url: String, queryString: String): Connection = js.native
  def connection(url: String, queryString: String, logging: Boolean): Connection = js.native
  def connection(url: String, queryString: js.Object): Connection = js.native
  def connection(url: String, queryString: js.Object, logging: Boolean): Connection = js.native
  @JSName("connection")
  var connection_Original: SignalR = js.native
  
  def hubConnection(): typingsSlinky.signalr.SignalR.Hub.Connection = js.native
  def hubConnection(url: js.UndefOr[scala.Nothing], options: Options): typingsSlinky.signalr.SignalR.Hub.Connection = js.native
  def hubConnection(url: String): typingsSlinky.signalr.SignalR.Hub.Connection = js.native
  def hubConnection(url: String, options: Options): typingsSlinky.signalr.SignalR.Hub.Connection = js.native
  @JSName("hubConnection")
  var hubConnection_Original: HubCreator = js.native
  
  /**
    * Creates a new SignalR connection for the given url
    *
    * @param url   The URL of the long polling endpoint
    * @param queryString   [Optional] Custom querystring parameters to add to the connection URL. If an object, every non-function member will be added to the querystring. If a string, it's added to the QS as specified.
    * @param logging [Optional] A flag indicating whether connection logging is enabled to the browser console/log. Defaults to false.
    */
  def signalR(url: String): Connection = js.native
  def signalR(url: String, queryString: js.UndefOr[scala.Nothing], logging: Boolean): Connection = js.native
  def signalR(url: String, queryString: String): Connection = js.native
  def signalR(url: String, queryString: String, logging: Boolean): Connection = js.native
  def signalR(url: String, queryString: js.Object): Connection = js.native
  def signalR(url: String, queryString: js.Object, logging: Boolean): Connection = js.native
  @JSName("signalR")
  var signalR_Original: SignalR = js.native
}
