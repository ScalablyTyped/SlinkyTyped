package typingsSlinky.workboxSw

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.Response
import typingsSlinky.std.HeadersInit
import typingsSlinky.workboxBackgroundSync.queueMod.QueueOptions
import typingsSlinky.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdateOptions
import typingsSlinky.workboxBroadcastUpdate.broadcastUpdateMod.BroadcastUpdateOptions
import typingsSlinky.workboxCacheableResponse.cacheableResponseMod.CacheableResponseConfig
import typingsSlinky.workboxCore.anon.PartialCacheNameDetails
import typingsSlinky.workboxCore.cacheNamesMod.CacheNames_
import typingsSlinky.workboxCore.workboxPluginMod.WorkboxPlugin
import typingsSlinky.workboxExpiration.cacheExpirationMod.CacheExpirationConfig
import typingsSlinky.workboxExpiration.pluginMod.ExpirationPluginConfig
import typingsSlinky.workboxGoogleAnalytics.initializeMod.InitializeOptions
import typingsSlinky.workboxPrecaching.fetchListenerOptionsMod.FetchListenerOptions
import typingsSlinky.workboxPrecaching.precacheEntryMod.PrecacheEntry
import typingsSlinky.workboxRouting.httpmethodMod.HTTPMethod
import typingsSlinky.workboxRouting.navigationRouteMod.NavigationRouteOptions
import typingsSlinky.workboxRouting.registerNavigationRouteMod.RegisterNavigationRouteOptions
import typingsSlinky.workboxRouting.registerRouteMod.RegisterRouteCapture
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandler
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typingsSlinky.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import typingsSlinky.workboxStrategies.cacheFirstMod.CacheFirstOptions
import typingsSlinky.workboxStrategies.cacheOnlyMod.CacheOnlyOptions
import typingsSlinky.workboxStrategies.networkFirstMod.NetworkFirstOptions
import typingsSlinky.workboxStrategies.networkOnlyMod.NetworkOnlyOptions
import typingsSlinky.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidateOptions
import typingsSlinky.workboxStreams.concatenateMod.ConcatenateReturn
import typingsSlinky.workboxStreams.concatenateToResponseMod.ConcatenateToResponseReturn
import typingsSlinky.workboxStreams.strategyMod.StreamsHandlerCallback
import typingsSlinky.workboxStreams.streamSourceMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object workbox {
      
      /* was `typeof WorkboxBackgroundSync` */
      object backgroundSync {
        
        @JSGlobal("workbox.backgroundSync.Plugin")
        @js.native
        class Plugin protected ()
          extends typingsSlinky.workboxBackgroundSync.mod.Plugin {
          def this(name: String) = this()
          def this(name: String, options: QueueOptions) = this()
        }
        
        @JSGlobal("workbox.backgroundSync.Queue")
        @js.native
        class Queue protected ()
          extends typingsSlinky.workboxBackgroundSync.mod.Queue {
          def this(name: String) = this()
          def this(name: String, options: QueueOptions) = this()
        }
      }
      
      /* was `typeof WorkboxBroadcastUpdate` */
      object broadcastUpdate {
        
        @JSGlobal("workbox.broadcastUpdate.BroadcastCacheUpdate")
        @js.native
        class BroadcastCacheUpdate ()
          extends typingsSlinky.workboxBroadcastUpdate.mod.BroadcastCacheUpdate {
          def this(options: BroadcastCacheUpdateOptions) = this()
        }
        
        @JSGlobal("workbox.broadcastUpdate.Plugin")
        @js.native
        class Plugin ()
          extends typingsSlinky.workboxBroadcastUpdate.mod.Plugin {
          def this(options: BroadcastCacheUpdateOptions) = this()
        }
        
        @JSGlobal("workbox.broadcastUpdate.broadcastUpdate")
        @js.native
        def broadcastUpdate(options: BroadcastUpdateOptions): js.Promise[Unit] = js.native
      }
      
      /* was `typeof WorkboxCacheableResponse` */
      object cacheableResponse {
        
        @JSGlobal("workbox.cacheableResponse.CacheableResponse")
        @js.native
        class CacheableResponse ()
          extends typingsSlinky.workboxCacheableResponse.mod.CacheableResponse {
          def this(config: CacheableResponseConfig) = this()
        }
        
        @JSGlobal("workbox.cacheableResponse.Plugin")
        @js.native
        class Plugin ()
          extends typingsSlinky.workboxCacheableResponse.mod.Plugin {
          def this(config: CacheableResponseConfig) = this()
        }
      }
      
      /* was `typeof WorkboxCore` */
      object core {
        
        @JSGlobal("workbox.core.cacheNames")
        @js.native
        val cacheNames: CacheNames_ = js.native
        
        @JSGlobal("workbox.core.clientsClaim")
        @js.native
        def clientsClaim(): Unit = js.native
        
        @JSGlobal("workbox.core.registerQuotaErrorCallback")
        @js.native
        def registerQuotaErrorCallback(callback: js.Function0[Unit]): Unit = js.native
        
        @JSGlobal("workbox.core.setCacheNameDetails")
        @js.native
        def setCacheNameDetails(details: PartialCacheNameDetails): Unit = js.native
        
        @JSGlobal("workbox.core.skipWaiting")
        @js.native
        def skipWaiting(): Unit = js.native
      }
      
      /* was `typeof WorkboxExpiration` */
      object expiration {
        
        @JSGlobal("workbox.expiration.CacheExpiration")
        @js.native
        class CacheExpiration protected ()
          extends typingsSlinky.workboxExpiration.mod.CacheExpiration {
          def this(cacheName: String) = this()
          def this(cacheName: String, config: CacheExpirationConfig) = this()
        }
        
        @JSGlobal("workbox.expiration.Plugin")
        @js.native
        class Plugin ()
          extends typingsSlinky.workboxExpiration.mod.Plugin {
          def this(config: ExpirationPluginConfig) = this()
        }
      }
      
      /* was `typeof WorkboxGoogleAnalytics` */
      object googleAnalytics {
        
        @JSGlobal("workbox.googleAnalytics.initialize")
        @js.native
        def initialize(): Unit = js.native
        @JSGlobal("workbox.googleAnalytics.initialize")
        @js.native
        def initialize(options: InitializeOptions): Unit = js.native
      }
      
      @JSGlobal("workbox.loadModule")
      @js.native
      def loadModule(moduleName: String): Unit = js.native
      
      /* was `typeof WorkboxNavigationPreload` */
      object navigationPreload {
        
        @JSGlobal("workbox.navigationPreload.disable")
        @js.native
        def disable(): Unit = js.native
        
        @JSGlobal("workbox.navigationPreload.enable")
        @js.native
        def enable(): Unit = js.native
        @JSGlobal("workbox.navigationPreload.enable")
        @js.native
        def enable(headerValue: String): Unit = js.native
        
        @JSGlobal("workbox.navigationPreload.isSupported")
        @js.native
        def isSupported(): Boolean = js.native
      }
      
      /* was `typeof WorkboxPrecaching` */
      object precaching {
        
        @JSGlobal("workbox.precaching.PrecacheController")
        @js.native
        class PrecacheController ()
          extends typingsSlinky.workboxPrecaching.mod.PrecacheController {
          def this(cacheName: String) = this()
        }
        
        @JSGlobal("workbox.precaching.addPlugins")
        @js.native
        def addPlugins(newPlugins: js.Array[WorkboxPlugin]): Unit = js.native
        
        @JSGlobal("workbox.precaching.addRoute")
        @js.native
        def addRoute(): Unit = js.native
        @JSGlobal("workbox.precaching.addRoute")
        @js.native
        def addRoute(options: FetchListenerOptions): Unit = js.native
        
        @JSGlobal("workbox.precaching.cleanupOutdatedCaches")
        @js.native
        def cleanupOutdatedCaches(): Unit = js.native
        
        @JSGlobal("workbox.precaching.getCacheKeyForURL")
        @js.native
        def getCacheKeyForURL(url: String): String = js.native
        
        @JSGlobal("workbox.precaching.precache")
        @js.native
        def precache(entries: js.Array[String | PrecacheEntry]): Unit = js.native
        
        @JSGlobal("workbox.precaching.precacheAndRoute")
        @js.native
        def precacheAndRoute(entries: js.Array[String | PrecacheEntry]): Unit = js.native
        @JSGlobal("workbox.precaching.precacheAndRoute")
        @js.native
        def precacheAndRoute(entries: js.Array[String | PrecacheEntry], options: FetchListenerOptions): Unit = js.native
      }
      
      /* was `typeof WorkboxRangeRequests` */
      object rangeRequests {
        
        @JSGlobal("workbox.rangeRequests.Plugin")
        @js.native
        class Plugin ()
          extends typingsSlinky.workboxRangeRequests.mod.Plugin
        
        @JSGlobal("workbox.rangeRequests.createPartialResponse")
        @js.native
        def createPartialResponse(request: Request, originalResponse: Response): js.Promise[Response] = js.native
      }
      
      /* was `typeof WorkboxRouting` */
      object routing {
        
        @JSGlobal("workbox.routing.NavigationRoute")
        @js.native
        class NavigationRoute protected ()
          extends typingsSlinky.workboxRouting.mod.NavigationRoute {
          def this(handler: RouteHandler) = this()
          def this(handler: RouteHandler, options: NavigationRouteOptions) = this()
        }
        
        @JSGlobal("workbox.routing.RegExpRoute")
        @js.native
        class RegExpRoute protected ()
          extends typingsSlinky.workboxRouting.mod.RegExpRoute {
          def this(regExp: js.RegExp, handler: RouteHandler) = this()
          def this(regExp: js.RegExp, handler: RouteHandler, method: HTTPMethod) = this()
        }
        
        @JSGlobal("workbox.routing.Route")
        @js.native
        class Route[MatchReturn] protected ()
          extends typingsSlinky.workboxRouting.mod.Route[MatchReturn] {
          def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
          def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
        }
        
        @JSGlobal("workbox.routing.Router")
        @js.native
        class Router ()
          extends typingsSlinky.workboxRouting.mod.Router
        
        @JSGlobal("workbox.routing.registerNavigationRoute")
        @js.native
        def registerNavigationRoute(cachedAssetUrl: String): typingsSlinky.workboxRouting.navigationRouteMod.NavigationRoute = js.native
        @JSGlobal("workbox.routing.registerNavigationRoute")
        @js.native
        def registerNavigationRoute(cachedAssetUrl: String, options: RegisterNavigationRouteOptions): typingsSlinky.workboxRouting.navigationRouteMod.NavigationRoute = js.native
        
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute(capture: String): typingsSlinky.workboxRouting.routeMod.Route[Boolean] = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute(capture: String, handler: js.UndefOr[RouteHandler], method: HTTPMethod): typingsSlinky.workboxRouting.routeMod.Route[Boolean] = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute(capture: String, handler: RouteHandler): typingsSlinky.workboxRouting.routeMod.Route[Boolean] = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute(capture: js.RegExp): typingsSlinky.workboxRouting.regExpRouteMod.RegExpRoute = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute(capture: js.RegExp, handler: js.UndefOr[RouteHandler], method: HTTPMethod): typingsSlinky.workboxRouting.regExpRouteMod.RegExpRoute = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute(capture: js.RegExp, handler: RouteHandler): typingsSlinky.workboxRouting.regExpRouteMod.RegExpRoute = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute(capture: RegisterRouteCapture): typingsSlinky.workboxRouting.routeMod.Route[_] = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute(capture: RegisterRouteCapture, handler: js.UndefOr[RouteHandler], method: HTTPMethod): typingsSlinky.workboxRouting.routeMod.Route[_] = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler): typingsSlinky.workboxRouting.routeMod.Route[_] = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn]): typingsSlinky.workboxRouting.routeMod.Route[MatchReturn] = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: js.UndefOr[RouteHandler], method: HTTPMethod): typingsSlinky.workboxRouting.routeMod.Route[MatchReturn] = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): typingsSlinky.workboxRouting.routeMod.Route[MatchReturn] = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute[MatchReturn](capture: typingsSlinky.workboxRouting.routeMod.Route[MatchReturn]): typingsSlinky.workboxRouting.routeMod.Route[MatchReturn] = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute[MatchReturn](
          capture: typingsSlinky.workboxRouting.routeMod.Route[MatchReturn],
          handler: js.UndefOr[RouteHandler],
          method: HTTPMethod
        ): typingsSlinky.workboxRouting.routeMod.Route[MatchReturn] = js.native
        @JSGlobal("workbox.routing.registerRoute")
        @js.native
        def registerRoute[MatchReturn](capture: typingsSlinky.workboxRouting.routeMod.Route[MatchReturn], handler: RouteHandler): typingsSlinky.workboxRouting.routeMod.Route[MatchReturn] = js.native
        
        @JSGlobal("workbox.routing.setCatchHandler")
        @js.native
        def setCatchHandler(handler: RouteHandler): Unit = js.native
        
        @JSGlobal("workbox.routing.setDefaultHandler")
        @js.native
        def setDefaultHandler(handler: RouteHandler): Unit = js.native
      }
      
      @JSGlobal("workbox.setConfig")
      @js.native
      def setConfig(): Unit = js.native
      @JSGlobal("workbox.setConfig")
      @js.native
      def setConfig(options: WorkboxOptions): Unit = js.native
      
      /* was `typeof WorkboxStrategies` */
      object strategies {
        
        @JSGlobal("workbox.strategies.CacheFirst")
        @js.native
        class CacheFirst ()
          extends typingsSlinky.workboxStrategies.mod.CacheFirst {
          def this(options: CacheFirstOptions) = this()
        }
        
        @JSGlobal("workbox.strategies.CacheOnly")
        @js.native
        class CacheOnly ()
          extends typingsSlinky.workboxStrategies.mod.CacheOnly {
          def this(options: CacheOnlyOptions) = this()
        }
        
        @JSGlobal("workbox.strategies.NetworkFirst")
        @js.native
        class NetworkFirst ()
          extends typingsSlinky.workboxStrategies.mod.NetworkFirst {
          def this(options: NetworkFirstOptions) = this()
        }
        
        @JSGlobal("workbox.strategies.NetworkOnly")
        @js.native
        class NetworkOnly ()
          extends typingsSlinky.workboxStrategies.mod.NetworkOnly {
          def this(options: NetworkOnlyOptions) = this()
        }
        
        @JSGlobal("workbox.strategies.StaleWhileRevalidate")
        @js.native
        class StaleWhileRevalidate ()
          extends typingsSlinky.workboxStrategies.mod.StaleWhileRevalidate {
          def this(options: StaleWhileRevalidateOptions) = this()
        }
      }
      
      /* was `typeof WorkboxStreams` */
      object streams {
        
        @JSGlobal("workbox.streams.concatenate")
        @js.native
        def concatenate(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateReturn = js.native
        
        @JSGlobal("workbox.streams.concatenateToResponse")
        @js.native
        def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateToResponseReturn = js.native
        @JSGlobal("workbox.streams.concatenateToResponse")
        @js.native
        def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: HeadersInit): ConcatenateToResponseReturn = js.native
        
        @JSGlobal("workbox.streams.isSupported")
        @js.native
        def isSupported(): Boolean = js.native
        
        @JSGlobal("workbox.streams.strategy")
        @js.native
        def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = js.native
        @JSGlobal("workbox.streams.strategy")
        @js.native
        def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = js.native
      }
      
      type ModulePathCallback = js.Function2[/* moduleName */ String, /* debug */ Boolean, String]
      
      @js.native
      trait WorkboxOptions extends StObject {
        
        var debug: js.UndefOr[Boolean] = js.native
        
        var modulePathCb: js.UndefOr[ModulePathCallback] = js.native
        
        var modulePathPrefix: js.UndefOr[String] = js.native
      }
      object WorkboxOptions {
        
        @scala.inline
        def apply(): WorkboxOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[WorkboxOptions]
        }
        
        @scala.inline
        implicit class WorkboxOptionsMutableBuilder[Self <: WorkboxOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
          
          @scala.inline
          def setModulePathCb(value: (/* moduleName */ String, /* debug */ Boolean) => String): Self = StObject.set(x, "modulePathCb", js.Any.fromFunction2(value))
          
          @scala.inline
          def setModulePathCbUndefined: Self = StObject.set(x, "modulePathCb", js.undefined)
          
          @scala.inline
          def setModulePathPrefix(value: String): Self = StObject.set(x, "modulePathPrefix", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setModulePathPrefixUndefined: Self = StObject.set(x, "modulePathPrefix", js.undefined)
        }
      }
    }
  }
}
