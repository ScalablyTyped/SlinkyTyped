package typingsSlinky.webtorrent.mod

import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.FileList
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import typingsSlinky.webtorrent.webtorrentStrings.error
import typingsSlinky.webtorrent.webtorrentStrings.torrent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends EventEmitter {
  
  def add(torrent: String): Torrent = js.native
  def add(torrent: String, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: String, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: String, opts: TorrentOptions): Torrent = js.native
  def add(torrent: String, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: Buffer): Torrent = js.native
  def add(torrent: Buffer, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: Buffer, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: Buffer, opts: TorrentOptions): Torrent = js.native
  def add(torrent: Buffer, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: typingsSlinky.parseTorrent.mod.Instance): Torrent = js.native
  def add(torrent: typingsSlinky.parseTorrent.mod.Instance, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(
    torrent: typingsSlinky.parseTorrent.mod.Instance,
    opts: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def add(torrent: typingsSlinky.parseTorrent.mod.Instance, opts: TorrentOptions): Torrent = js.native
  def add(
    torrent: typingsSlinky.parseTorrent.mod.Instance,
    opts: TorrentOptions,
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def add(torrent: File): Torrent = js.native
  def add(torrent: File, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: File, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: File, opts: TorrentOptions): Torrent = js.native
  def add(torrent: File, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  
  def destroy(): Unit = js.native
  def destroy(callback: js.Function1[/* err */ js.Error | String, Unit]): Unit = js.native
  
  val downloadSpeed: Double = js.native
  
  def get(torrentId: String): Torrent | Unit = js.native
  def get(torrentId: Buffer): Torrent | Unit = js.native
  def get(torrentId: Torrent): Torrent | Unit = js.native
  
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* err */ js.Error | String, Unit]): this.type = js.native
  @JSName("on")
  def on_torrent(event: torrent, callback: js.Function1[/* torrent */ Torrent, Unit]): this.type = js.native
  
  val progress: Double = js.native
  
  val ratio: Double = js.native
  
  def remove(torrentId: String): Unit = js.native
  def remove(torrentId: String, callback: js.Function1[/* err */ js.Error | String, Unit]): Unit = js.native
  def remove(torrentId: Buffer): Unit = js.native
  def remove(torrentId: Buffer, callback: js.Function1[/* err */ js.Error | String, Unit]): Unit = js.native
  def remove(torrentId: Torrent): Unit = js.native
  def remove(torrentId: Torrent, callback: js.Function1[/* err */ js.Error | String, Unit]): Unit = js.native
  
  def seed(input: String): Torrent = js.native
  def seed(input: String, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: String, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: String, opts: TorrentOptions): Torrent = js.native
  def seed(input: String, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: js.Array[Buffer | File | ReadableStream | String]): Torrent = js.native
  def seed(
    input: js.Array[Buffer | File | ReadableStream | String],
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def seed(
    input: js.Array[Buffer | File | ReadableStream | String],
    opts: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def seed(input: js.Array[Buffer | File | ReadableStream | String], opts: TorrentOptions): Torrent = js.native
  def seed(
    input: js.Array[Buffer | File | ReadableStream | String],
    opts: TorrentOptions,
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def seed(input: Buffer): Torrent = js.native
  def seed(input: Buffer, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: Buffer, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: Buffer, opts: TorrentOptions): Torrent = js.native
  def seed(input: Buffer, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: ReadableStream): Torrent = js.native
  def seed(input: ReadableStream, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: ReadableStream, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: ReadableStream, opts: TorrentOptions): Torrent = js.native
  def seed(input: ReadableStream, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: File): Torrent = js.native
  def seed(input: FileList): Torrent = js.native
  def seed(input: FileList, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: FileList, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: FileList, opts: TorrentOptions): Torrent = js.native
  def seed(input: FileList, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: File, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: File, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: File, opts: TorrentOptions): Torrent = js.native
  def seed(input: File, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  
  val torrents: js.Array[Torrent] = js.native
  
  val uploadSpeed: Double = js.native
}
