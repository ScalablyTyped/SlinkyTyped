package typingsSlinky.workboxBroadcastUpdate

import org.scalajs.dom.experimental.Response
import org.scalajs.dom.raw.Event
import typingsSlinky.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdate.NotifyIfUpdatedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastCacheUpdateMod {
  
  @JSImport("workbox-broadcast-update/BroadcastCacheUpdate", "BroadcastCacheUpdate")
  @js.native
  class BroadcastCacheUpdate () extends StObject {
    def this(options: BroadcastCacheUpdateOptions) = this()
    
    def notifyIfUpdated(options: NotifyIfUpdatedOptions): js.Promise[Unit] = js.native
  }
  object BroadcastCacheUpdate {
    
    @js.native
    trait NotifyIfUpdatedOptions extends StObject {
      
      var cacheName: String = js.native
      
      var event: js.UndefOr[Event] = js.native
      
      var newResponse: Response = js.native
      
      var oldResponse: js.UndefOr[Response] = js.native
      
      var url: String = js.native
    }
    object NotifyIfUpdatedOptions {
      
      @scala.inline
      def apply(cacheName: String, newResponse: Response, url: String): NotifyIfUpdatedOptions = {
        val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], newResponse = newResponse.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[NotifyIfUpdatedOptions]
      }
      
      @scala.inline
      implicit class NotifyIfUpdatedOptionsMutableBuilder[Self <: NotifyIfUpdatedOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
        
        @scala.inline
        def setNewResponse(value: Response): Self = StObject.set(x, "newResponse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOldResponse(value: Response): Self = StObject.set(x, "oldResponse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOldResponseUndefined: Self = StObject.set(x, "oldResponse", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait BroadcastCacheUpdateOptions extends StObject {
    
    var channelName: js.UndefOr[String] = js.native
    
    var deferNoticationTimeout: js.UndefOr[Double] = js.native
    
    var headersToCheck: js.UndefOr[js.Array[String]] = js.native
  }
  object BroadcastCacheUpdateOptions {
    
    @scala.inline
    def apply(): BroadcastCacheUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BroadcastCacheUpdateOptions]
    }
    
    @scala.inline
    implicit class BroadcastCacheUpdateOptionsMutableBuilder[Self <: BroadcastCacheUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
      
      @scala.inline
      def setDeferNoticationTimeout(value: Double): Self = StObject.set(x, "deferNoticationTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferNoticationTimeoutUndefined: Self = StObject.set(x, "deferNoticationTimeout", js.undefined)
      
      @scala.inline
      def setHeadersToCheck(value: js.Array[String]): Self = StObject.set(x, "headersToCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersToCheckUndefined: Self = StObject.set(x, "headersToCheck", js.undefined)
      
      @scala.inline
      def setHeadersToCheckVarargs(value: String*): Self = StObject.set(x, "headersToCheck", js.Array(value :_*))
    }
  }
}
