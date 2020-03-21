package typingsSlinky.workboxWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.workboxWebpackPlugin.workboxWebpackPluginStrings.CacheFirst
  - typingsSlinky.workboxWebpackPlugin.workboxWebpackPluginStrings.CacheOnly
  - typingsSlinky.workboxWebpackPlugin.workboxWebpackPluginStrings.NetworkFirst
  - typingsSlinky.workboxWebpackPlugin.workboxWebpackPluginStrings.NetworkOnly
  - typingsSlinky.workboxWebpackPlugin.workboxWebpackPluginStrings.StaleWhileRevalidate
*/
trait ChacheStrategy extends js.Object

object ChacheStrategy {
  @scala.inline
  def CacheFirst: typingsSlinky.workboxWebpackPlugin.workboxWebpackPluginStrings.CacheFirst = this.cast("CacheFirst")
  @scala.inline
  def CacheOnly: typingsSlinky.workboxWebpackPlugin.workboxWebpackPluginStrings.CacheOnly = this.cast("CacheOnly")
  @scala.inline
  def NetworkFirst: typingsSlinky.workboxWebpackPlugin.workboxWebpackPluginStrings.NetworkFirst = this.cast("NetworkFirst")
  @scala.inline
  def NetworkOnly: typingsSlinky.workboxWebpackPlugin.workboxWebpackPluginStrings.NetworkOnly = this.cast("NetworkOnly")
  @scala.inline
  def StaleWhileRevalidate: typingsSlinky.workboxWebpackPlugin.workboxWebpackPluginStrings.StaleWhileRevalidate = this.cast("StaleWhileRevalidate")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

