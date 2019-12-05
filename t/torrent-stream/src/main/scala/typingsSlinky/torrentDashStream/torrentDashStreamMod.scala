package typingsSlinky.torrentDashStream

import typingsSlinky.node.Buffer
import typingsSlinky.torrentDashStream.TorrentStream.TorrentEngine
import typingsSlinky.torrentDashStream.TorrentStream.TorrentEngineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("torrent-stream", JSImport.Namespace)
@js.native
object torrentDashStreamMod extends js.Object {
  def apply(magnet: String): TorrentEngine = js.native
  def apply(magnet: String, options: TorrentEngineOptions): TorrentEngine = js.native
  def apply(magnet: Buffer): TorrentEngine = js.native
  def apply(magnet: Buffer, options: TorrentEngineOptions): TorrentEngine = js.native
}

