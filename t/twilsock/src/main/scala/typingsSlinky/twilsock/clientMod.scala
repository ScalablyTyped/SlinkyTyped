package typingsSlinky.twilsock

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.twilsock.offlinestorageMod.OfflineProductStorage
import typingsSlinky.twilsock.telemetrytrackerMod.TelemetryEventDescription
import typingsSlinky.twilsock.telemetrytrackerMod.TelemetryPoint
import typingsSlinky.twilsock.upstreamMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/client", JSImport.Namespace)
@js.native
object clientMod extends js.Object {
  
  @js.native
  class TelemetryEvents () extends js.Object
  /* static members */
  @js.native
  object TelemetryEvents extends js.Object {
    
    val TWILSOCK_CONNECT: /* "twilsock.sdk.connect" */ String = js.native
    
    val TWILSOCK_INIT: /* "twilsock.sdk.init" */ String = js.native
  }
  
  /**
    * @alias Twilsock
    * @classdesc Client library for the Twilsock service
    * It allows to recevie service-generated updates as well as bi-directional transport
    * @fires Twilsock#message
    * @fires Twilsock#connected
    * @fires Twilsock#disconnected
    * @fires Twilsock#tokenAboutToExpire
    * @fires Twilsock#stateChanged
    * @fires Twilsock#connectionError
    */
  @js.native
  class Twilsock protected () extends TwilsockClient {
    /**
      * @param {string} token Twilio access token
      * @param {string} productId Product identifier. Should be the same as a grant name in token
      */
    def this(token: String, productId: String) = this()
    def this(token: String, productId: String, options: js.Any) = this()
  }
  
  /**
    * @alias Twilsock
    * @classdesc Client library for the Twilsock service
    * It allows to recevie service-generated updates as well as bi-directional transport
    * @fires Twilsock#message
    * @fires Twilsock#connected
    * @fires Twilsock#disconnected
    * @fires Twilsock#tokenAboutToExpire
    * @fires Twilsock#stateChanged
    * @fires Twilsock#connectionError
    */
  @js.native
  class TwilsockClient protected () extends EventEmitter {
    /**
      * @param {string} token Twilio access token
      * @param {string} productId Product identifier. Should be the same as a grant name in token
      */
    def this(token: String, productId: String) = this()
    def this(token: String, productId: String, options: js.Any) = this()
    
    /**
      * Submits internal telemetry event. Not to be used for any customer and/or sensitive data.
      * @param {TelemetryEventDescription} event Event details.
      * @param {string} eventKey Unique event key.
      * @param {TelemetryPoint} point Is this partial event for start or end of measurement.
      * @returns {void}
      */
    def addPartialTelemetryEvent(event: TelemetryEventDescription, eventKey: String, point: TelemetryPoint): Unit = js.native
    
    /**
      * Submits internal telemetry event. Not to be used for any customer and/or sensitive data.
      * @param {TelemetryEventDescription} event Event details.
      * @returns {void}
      */
    def addTelemetryEvent(event: TelemetryEventDescription): Unit = js.native
    
    val channel: js.Any = js.native
    
    val config: js.Any = js.native
    
    /**
      * Connect to the server
      * @fires Twilsock#connected
      * @public
      * @returns {void}
      */
    def connect(): Unit = js.native
    
    /**
      * Delete HTTP request to upstream service
      * @param {string} url Upstream service url
      * @param {headers} headers Set of custom headers
      * @returns {Promise}
      */
    def delete(url: String, headers: js.Any): js.Promise[Result] = js.native
    
    /**
      * Disconnect from the server
      * @fires Twilsock#disconnected
      * @public
      * @returns {Promise}
      */
    def disconnect(): js.Promise[Unit] = js.native
    
    /**
      * Get HTTP request to upstream service
      * @param {string} url Upstream service url
      * @param {headers} headers Set of custom headers
      * @returns {Promise}
      */
    def get(url: String, headers: js.Any): js.Promise[Result] = js.native
    
    var handleStorageId: js.Any = js.native
    
    /**
      * Indicates if twilsock is connected now
      * @returns {Boolean}
      */
    def isConnected: Boolean = js.native
    
    var offlineStorageDeferred: js.Any = js.native
    
    /**
      * Post HTTP request to upstream service
      * @param {string} url Upstream service url
      * @param {headers} headers Set of custom headers
      * @param {body} body Body to send
      * @returns {Promise}
      */
    def post(url: String, headers: js.Any, body: js.Any): js.Promise[Result] = js.native
    
    /**
      * Put HTTP request to upstream service
      * @param {string} url Upstream service url
      * @param {headers} headers Set of custom headers
      * @param {body} body Body to send
      * @returns {Promise}
      */
    def put(url: String, headers: js.Any, body: js.Any): js.Promise[Result] = js.native
    
    val registrations: js.Any = js.native
    
    /**
      * Remove notification context.
      * This method shouldn't be used anyone except twilio notifications library
      * @param contextId id of notification context
      * @private
      */
    def removeNotificationsContext(contextId: String): Unit = js.native
    
    /**
      * Updates notification context.
      * This method shouldn't be used anyone except twilio notifications library
      * @param contextId id of notification context
      * @param context value of notification context
      * @private
      */
    def setNotificationsContext(contextId: String, context: Context): Unit = js.native
    
    /**
      * Current state
      * @returns {String}
      */
    def state: String = js.native
    
    /**
      * Get offline storage ID
      * @returns {Promise}
      */
    def storageId(): js.Promise[OfflineProductStorage] = js.native
    
    val telemetryTracker: js.Any = js.native
    
    /**
      * Update token
      * @param {String} token
      * @returns {Promise}
      */
    def updateToken(token: String): js.Promise[Unit] = js.native
    
    val upstream: js.Any = js.native
  }
  
  type Context = typingsSlinky.twilsock.protocolMod.Protocol.Context
}
