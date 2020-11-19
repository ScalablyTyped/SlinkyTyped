package typingsSlinky.workboxPrecaching

import typingsSlinky.workboxCore.workboxPluginMod.WorkboxPlugin
import typingsSlinky.workboxPrecaching.fetchListenerOptionsMod.FetchListenerOptions
import typingsSlinky.workboxPrecaching.precacheEntryMod.PrecacheEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-precaching", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addPlugins(newPlugins: js.Array[WorkboxPlugin]): Unit = js.native
  
  def addRoute(): Unit = js.native
  def addRoute(options: FetchListenerOptions): Unit = js.native
  
  def cleanupOutdatedCaches(): Unit = js.native
  
  def getCacheKeyForURL(url: String): String = js.native
  
  def precache(entries: js.Array[String | PrecacheEntry]): Unit = js.native
  
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry]): Unit = js.native
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry], options: FetchListenerOptions): Unit = js.native
  
  @js.native
  class PrecacheController ()
    extends typingsSlinky.workboxPrecaching.precacheControllerMod.PrecacheController {
    def this(cacheName: String) = this()
  }
}
