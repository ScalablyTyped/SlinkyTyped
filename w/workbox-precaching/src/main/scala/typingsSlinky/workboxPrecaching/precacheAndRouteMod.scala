package typingsSlinky.workboxPrecaching

import typingsSlinky.workboxPrecaching.fetchListenerOptionsMod.FetchListenerOptions
import typingsSlinky.workboxPrecaching.precacheEntryMod.PrecacheEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-precaching/precacheAndRoute", JSImport.Namespace)
@js.native
object precacheAndRouteMod extends js.Object {
  
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry]): Unit = js.native
  def precacheAndRoute(entries: js.Array[String | PrecacheEntry], options: FetchListenerOptions): Unit = js.native
}
