package typingsSlinky.torrentStream.TorrentStream

import typingsSlinky.torrentStream.torrentStreamStrings.download
import typingsSlinky.torrentStream.torrentStreamStrings.idle
import typingsSlinky.torrentStream.torrentStreamStrings.ready
import typingsSlinky.torrentStream.torrentStreamStrings.torrent
import typingsSlinky.torrentStream.torrentStreamStrings.upload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TorrentEngine extends js.Object {
  
  def block(peer: String): Unit = js.native
  
  def connect(peer: String): Unit = js.native
  
  def destroy(callback: js.Function0[Unit]): Unit = js.native
  
  def disconnect(peer: String): Unit = js.native
  
  var files: js.Array[TorrentFile] = js.native
  
  var infoHash: String = js.native
  
  def listen(port: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def on(event: String, callback: js.Function): Unit = js.native
  @JSName("on")
  def on_download(event: download, callback: js.Function1[/* pieceIndex */ Double, Unit]): Unit = js.native
  @JSName("on")
  def on_idle(event: idle, callback: js.Function): Unit = js.native
  // Events
  @JSName("on")
  def on_ready(event: ready, callback: js.Function): Unit = js.native
  @JSName("on")
  def on_torrent(event: torrent, callback: js.Function): Unit = js.native
  @JSName("on")
  def on_upload(
    event: upload,
    callback: js.Function3[/* pieceIndex */ Double, /* offset */ Double, /* length */ Double, Unit]
  ): Unit = js.native
  
  def remove(keepPieces: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  var swarm: Swarm = js.native
}
