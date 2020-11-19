package typingsSlinky.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thepiratebay", "userTorrents")
@js.native
object userTorrents extends js.Object {
  
  def apply(user: String): js.Promise[js.Array[TorrentSearchResult]] = js.native
  def apply(user: String, options: SearchOptions): js.Promise[js.Array[TorrentSearchResult]] = js.native
}
