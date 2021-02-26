package typingsSlinky.workboxPrecaching

import typingsSlinky.std.Record
import typingsSlinky.workboxCore.workboxPluginMod.WorkboxPlugin
import typingsSlinky.workboxPrecaching.cleanupResultMod.CleanupResult
import typingsSlinky.workboxPrecaching.installResultMod.InstallResult
import typingsSlinky.workboxPrecaching.precacheControllerMod.PrecacheController.InstallOptions
import typingsSlinky.workboxPrecaching.precacheEntryMod.PrecacheEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precacheControllerMod {
  
  @JSImport("workbox-precaching/PrecacheController", "PrecacheController")
  @js.native
  class PrecacheController () extends StObject {
    def this(cacheName: String) = this()
    
    def activate(): js.Promise[CleanupResult] = js.native
    
    def addToCacheList(entries: js.Array[String | PrecacheEntry]): Unit = js.native
    
    def getCacheKeyForURL(url: String): String = js.native
    
    def getCachedURLs(): js.Array[String] = js.native
    
    def getURLsToCacheKeys(): Record[String, String] = js.native
    
    def install(): js.Promise[InstallResult] = js.native
    def install(options: InstallOptions): js.Promise[InstallResult] = js.native
  }
  object PrecacheController {
    
    @js.native
    trait InstallOptions extends StObject {
      
      var event: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
          ] = js.native
      
      var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.native
    }
    object InstallOptions {
      
      @scala.inline
      def apply(): InstallOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InstallOptions]
      }
      
      @scala.inline
      implicit class InstallOptionsMutableBuilder[Self <: InstallOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEvent(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
        ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
        
        @scala.inline
        def setPlugins(value: js.Array[WorkboxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
        
        @scala.inline
        def setPluginsVarargs(value: WorkboxPlugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      }
    }
  }
}
