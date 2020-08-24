package typingsSlinky.webtorrent.mod

import typingsSlinky.bittorrentProtocol.mod.Wire
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.httpMod.Server
import typingsSlinky.webtorrent.webtorrentStrings.dht
import typingsSlinky.webtorrent.webtorrentStrings.download
import typingsSlinky.webtorrent.webtorrentStrings.error
import typingsSlinky.webtorrent.webtorrentStrings.metadata
import typingsSlinky.webtorrent.webtorrentStrings.noPeers
import typingsSlinky.webtorrent.webtorrentStrings.tracker
import typingsSlinky.webtorrent.webtorrentStrings.upload
import typingsSlinky.webtorrent.webtorrentStrings.warning
import typingsSlinky.webtorrent.webtorrentStrings.wire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Torrent extends EventEmitter {
  val announce: js.Array[String] = js.native
  val comment: String = js.native
  val created: js.Date = js.native
  val createdBy: String = js.native
  val done: Boolean = js.native
  val downloadSpeed: Double = js.native
  val downloaded: Double = js.native
  val files: js.Array[TorrentFile] = js.native
  val infoHash: String = js.native
  val lastPieceLength: Double = js.native
  val length: Double = js.native
  val magnetURI: String = js.native
  val maxWebConns: Double = js.native
  val name: String = js.native
  val numPeers: Double = js.native
  val path: String = js.native
  val paused: Boolean = js.native
  val pieceLength: Double = js.native
  val pieces: js.Array[TorrentPiece | Null] = js.native
  val progress: Double = js.native
  val ratio: Double = js.native
  val ready: Boolean = js.native
  val received: Double = js.native
  val timeRemaining: Double = js.native
  val torrentFile: Buffer = js.native
  val torrentFileBlobURL: String = js.native
  val uploadSpeed: Double = js.native
  val uploaded: Double = js.native
  def addPeer(peer: String): Boolean = js.native
  def addPeer(peer: typingsSlinky.simplePeer.mod.Instance): Boolean = js.native
  def addWebSeed(url: String): Unit = js.native
  def createServer(): Server = js.native
  def createServer(opts: RequestOptions): Server = js.native
  def deselect(start: Double, end: Double, priority: Double): Unit = js.native
  def destroy(): Unit = js.native
  def destroy(cb: js.Function1[/* err */ js.Error | String, Unit]): Unit = js.native
  def on(event: noPeers, callback: js.Function1[/* announceType */ tracker | dht, Unit]): this.type = js.native
  @JSName("on")
  def on_done(event: typingsSlinky.webtorrent.webtorrentStrings.done, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_download(event: download, callback: js.Function1[/* bytes */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* err */ js.Error | String, Unit]): this.type = js.native
  @JSName("on")
  def on_infoHash(event: typingsSlinky.webtorrent.webtorrentStrings.infoHash, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_metadata(event: metadata, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: typingsSlinky.webtorrent.webtorrentStrings.ready, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_upload(event: upload, callback: js.Function1[/* bytes */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, callback: js.Function1[/* err */ js.Error | String, Unit]): this.type = js.native
  @JSName("on")
  def on_wire(event: wire, callback: js.Function2[/* wire */ Wire, /* addr */ js.UndefOr[String], Unit]): this.type = js.native
  def pause(): Unit = js.native
  def removePeer(peer: String): Unit = js.native
  def removePeer(peer: typingsSlinky.simplePeer.mod.Instance): Unit = js.native
  def resume(): Unit = js.native
  def select(start: Double, end: Double): Unit = js.native
  def select(start: Double, end: Double, priority: js.UndefOr[scala.Nothing], notify: js.Function0[Unit]): Unit = js.native
  def select(start: Double, end: Double, priority: Double): Unit = js.native
  def select(start: Double, end: Double, priority: Double, notify: js.Function0[Unit]): Unit = js.native
}

