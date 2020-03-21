package typingsSlinky.torrentStream

import typingsSlinky.node.Buffer
import typingsSlinky.torrentStream.TorrentStream.TorrentEngine
import typingsSlinky.torrentStream.TorrentStream.TorrentEngineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("torrent-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(magnet: String): TorrentEngine = js.native
  def apply(magnet: String, options: TorrentEngineOptions): TorrentEngine = js.native
  def apply(magnet: Buffer): TorrentEngine = js.native
  def apply(magnet: Buffer, options: TorrentEngineOptions): TorrentEngine = js.native
}

