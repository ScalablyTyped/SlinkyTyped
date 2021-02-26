package typingsSlinky.workboxPrecaching

import typingsSlinky.workboxCore.workboxPluginMod.WorkboxPlugin
import typingsSlinky.workboxPrecaching.fetchListenerOptionsMod.FetchListenerOptions
import typingsSlinky.workboxPrecaching.precacheEntryMod.PrecacheEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-precaching", "PrecacheController")
  @js.native
  class PrecacheController ()
    extends typingsSlinky.workboxPrecaching.precacheControllerMod.PrecacheController {
    def this(cacheName: String) = this()
  }
  
  @JSImport("workbox-precaching", "addPlugins")
  @js.native
  def addPlugins(newPlugins: js.Array[WorkboxPlugin]): Unit = js.native
  
  @JSImport("workbox-precaching", "addRoute")
  @js.native
  def addRoute(): Unit = js.native
  @JSImport("workbox-precaching", "addRoute")
  @js.native
  def addRoute(options: FetchListenerOptions): Unit = js.native
  
  @JSImport("workbox-precaching", "cleanupOutdatedCaches")
  @js.native
  def cleanupOutdatedCaches(): Unit = js.native
  
  @JSImport("workbox-precaching", "getCacheKeyForURL")
  @js.native
  def getCacheKeyForURL(url: String): String = js.native
  
  @JSImport("workbox-precaching", "precache")
  @js.native
  def precache(entries: js.Array[String | PrecacheEntry]): Unit = js.native
  
  @JSImport("workbox-precaching", "precacheAndRoute")
  @js.native
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry]): Unit = js.native
  @JSImport("workbox-precaching", "precacheAndRoute")
  @js.native
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry], options: FetchListenerOptions): Unit = js.native
}
