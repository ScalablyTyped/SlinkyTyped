package typingsSlinky.twilioSync

import typingsSlinky.twilioSync.closeableMod.Closeable
import typingsSlinky.twilioSync.servicesMod.Network
import typingsSlinky.twilioSync.servicesMod.Router
import typingsSlinky.twilioSync.servicesMod.Storage
import typingsSlinky.twilioSync.syncerrorMod.SyncError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityMod {
  
  @JSImport("twilio-sync/lib/entity", JSImport.Default)
  @js.native
  abstract class default protected () extends SyncEntity {
    protected def this(services: EntityServices, removalHandler: RemovalHandler) = this()
  }
  
  @JSImport("twilio-sync/lib/entity", "SyncEntity")
  @js.native
  abstract class SyncEntity protected () extends StObject {
    protected def this(services: EntityServices, removalHandler: RemovalHandler) = this()
    
    def _advanceLastEventId(eventId: Double): Unit = js.native
    def _advanceLastEventId(eventId: Double, revision: String): Unit = js.native
    
    val _attachedListeners: js.Any = js.native
    
    def _setSubscriptionState(newState: SubscriptionState): Unit = js.native
    
    /**
      * Subscribe to changes of data entity
      * @private
      */
    def _subscribe(): Unit = js.native
    
    /**
      * Unsubscribe from changes of current data entity
      * @private
      */
    def _unsubscribe(): Unit = js.native
    
    def _update(update: js.Any, isStrictlyOrdered: Boolean): Unit = js.native
    
    def attach(closeable: Closeable): Unit = js.native
    
    /* protected */ def broadcastEventToListeners(eventName: String, args: js.Any): Unit = js.native
    
    /**
      * @public
      */
    def close(): Unit = js.native
    
    def detach(listenerUuid: String): Unit = js.native
    
    def indexName: String = js.native
    
    def lastEventId: Double = js.native
    
    /* protected */ def onRemoved(locally: Boolean): Unit = js.native
    
    def queryString: String = js.native
    
    /* protected */ def removalHandler(`type`: String, sid: String, uniqueName: String): Unit = js.native
    
    def reportFailure(err: SyncError): Unit = js.native
    
    val services: EntityServices = js.native
    
    def sid: String = js.native
    
    var subscriptionState: js.Any = js.native
    
    def `type`: String = js.native
    
    def uniqueName: String = js.native
  }
  
  @js.native
  trait EntityServices extends StObject {
    
    var network: Network = js.native
    
    var router: Router = js.native
    
    var storage: Storage = js.native
  }
  object EntityServices {
    
    @scala.inline
    def apply(network: Network, router: Router, storage: Storage): EntityServices = {
      val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityServices]
    }
    
    @scala.inline
    implicit class EntityServicesMutableBuilder[Self <: EntityServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorage(value: Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    }
  }
  
  type RemovalHandler = js.Function3[/* type */ String, /* sid */ String, /* uniqueName */ String, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.twilioSync.twilioSyncStrings.none
    - typingsSlinky.twilioSync.twilioSyncStrings.request_in_flight
    - typingsSlinky.twilioSync.twilioSyncStrings.response_in_flight
    - typingsSlinky.twilioSync.twilioSyncStrings.established
  */
  trait SubscriptionState extends StObject
  object SubscriptionState {
    
    @scala.inline
    def established: typingsSlinky.twilioSync.twilioSyncStrings.established = "established".asInstanceOf[typingsSlinky.twilioSync.twilioSyncStrings.established]
    
    @scala.inline
    def none: typingsSlinky.twilioSync.twilioSyncStrings.none = "none".asInstanceOf[typingsSlinky.twilioSync.twilioSyncStrings.none]
    
    @scala.inline
    def request_in_flight: typingsSlinky.twilioSync.twilioSyncStrings.request_in_flight = "request_in_flight".asInstanceOf[typingsSlinky.twilioSync.twilioSyncStrings.request_in_flight]
    
    @scala.inline
    def response_in_flight: typingsSlinky.twilioSync.twilioSyncStrings.response_in_flight = "response_in_flight".asInstanceOf[typingsSlinky.twilioSync.twilioSyncStrings.response_in_flight]
  }
}
