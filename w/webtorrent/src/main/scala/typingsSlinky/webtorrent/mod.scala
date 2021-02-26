package typingsSlinky.webtorrent

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.FileList
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLMediaElement
import typingsSlinky.bittorrentProtocol.mod.Wire
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.httpMod.Server
import typingsSlinky.webtorrent.anon.Autoplay
import typingsSlinky.webtorrent.anon.End
import typingsSlinky.webtorrent.anon.Files
import typingsSlinky.webtorrent.webtorrentStrings.dht
import typingsSlinky.webtorrent.webtorrentStrings.download
import typingsSlinky.webtorrent.webtorrentStrings.error
import typingsSlinky.webtorrent.webtorrentStrings.metadata
import typingsSlinky.webtorrent.webtorrentStrings.noPeers
import typingsSlinky.webtorrent.webtorrentStrings.torrent
import typingsSlinky.webtorrent.webtorrentStrings.tracker
import typingsSlinky.webtorrent.webtorrentStrings.upload
import typingsSlinky.webtorrent.webtorrentStrings.warning
import typingsSlinky.webtorrent.webtorrentStrings.wire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("webtorrent", JSImport.Namespace)
  @js.native
  class ^ () extends Instance {
    def this(config: Options) = this()
  }
  @JSImport("webtorrent", JSImport.Namespace)
  @js.native
  val ^ : WebTorrent = js.native
  
  @js.native
  trait Instance extends EventEmitter {
    
    def add(torrent: String): Torrent = js.native
    def add(torrent: String, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
    def add(torrent: String, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
    def add(torrent: String, opts: TorrentOptions): Torrent = js.native
    def add(torrent: String, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
    def add(torrent: File): Torrent = js.native
    def add(torrent: File, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
    def add(torrent: File, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
    def add(torrent: File, opts: TorrentOptions): Torrent = js.native
    def add(torrent: File, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
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
    def remove(
      torrentId: String,
      opts: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.Error | String, Unit]
    ): Unit = js.native
    def remove(torrentId: String, opts: TorrentDestroyOptions): Unit = js.native
    def remove(
      torrentId: String,
      opts: TorrentDestroyOptions,
      callback: js.Function1[/* err */ js.Error | String, Unit]
    ): Unit = js.native
    def remove(torrentId: Buffer): Unit = js.native
    def remove(
      torrentId: Buffer,
      opts: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.Error | String, Unit]
    ): Unit = js.native
    def remove(torrentId: Buffer, opts: TorrentDestroyOptions): Unit = js.native
    def remove(
      torrentId: Buffer,
      opts: TorrentDestroyOptions,
      callback: js.Function1[/* err */ js.Error | String, Unit]
    ): Unit = js.native
    def remove(torrentId: Torrent): Unit = js.native
    def remove(
      torrentId: Torrent,
      opts: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.Error | String, Unit]
    ): Unit = js.native
    def remove(torrentId: Torrent, opts: TorrentDestroyOptions): Unit = js.native
    def remove(
      torrentId: Torrent,
      opts: TorrentDestroyOptions,
      callback: js.Function1[/* err */ js.Error | String, Unit]
    ): Unit = js.native
    
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
    
    val torrents: js.Array[Torrent] = js.native
    
    val uploadSpeed: Double = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var dht: js.UndefOr[Boolean | js.Object] = js.native
    
    var maxConns: js.UndefOr[Double] = js.native
    
    var nodeId: js.UndefOr[String | Buffer] = js.native
    
    var peerId: js.UndefOr[String | Buffer] = js.native
    
    var tracker: js.UndefOr[Boolean | js.Object] = js.native
    
    var utp: js.UndefOr[Boolean] = js.native
    
    var webSeeds: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDht(value: Boolean | js.Object): Self = StObject.set(x, "dht", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhtUndefined: Self = StObject.set(x, "dht", js.undefined)
      
      @scala.inline
      def setMaxConns(value: Double): Self = StObject.set(x, "maxConns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConnsUndefined: Self = StObject.set(x, "maxConns", js.undefined)
      
      @scala.inline
      def setNodeId(value: String | Buffer): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      @scala.inline
      def setPeerId(value: String | Buffer): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
      
      @scala.inline
      def setTracker(value: Boolean | js.Object): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackerUndefined: Self = StObject.set(x, "tracker", js.undefined)
      
      @scala.inline
      def setUtp(value: Boolean): Self = StObject.set(x, "utp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtpUndefined: Self = StObject.set(x, "utp", js.undefined)
      
      @scala.inline
      def setWebSeeds(value: Boolean): Self = StObject.set(x, "webSeeds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebSeedsUndefined: Self = StObject.set(x, "webSeeds", js.undefined)
    }
  }
  
  @js.native
  trait Torrent extends EventEmitter {
    
    def addPeer(peer: String): Boolean = js.native
    def addPeer(peer: typingsSlinky.simplePeer.mod.Instance): Boolean = js.native
    
    def addWebSeed(url: String): Unit = js.native
    
    val announce: js.Array[String] = js.native
    
    val comment: String = js.native
    
    def createServer(): Server = js.native
    def createServer(opts: RequestOptions): Server = js.native
    
    val created: js.Date = js.native
    
    val createdBy: String = js.native
    
    def deselect(start: Double, end: Double, priority: Double): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* err */ js.Error | String, Unit]): Unit = js.native
    def destroy(opts: TorrentDestroyOptions): Unit = js.native
    def destroy(opts: TorrentDestroyOptions, cb: js.Function1[/* err */ js.Error | String, Unit]): Unit = js.native
    
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
    
    val path: String = js.native
    
    def pause(): Unit = js.native
    
    val paused: Boolean = js.native
    
    val pieceLength: Double = js.native
    
    val pieces: js.Array[TorrentPiece | Null] = js.native
    
    val progress: Double = js.native
    
    val ratio: Double = js.native
    
    val ready: Boolean = js.native
    
    val received: Double = js.native
    
    def removePeer(peer: String): Unit = js.native
    def removePeer(peer: typingsSlinky.simplePeer.mod.Instance): Unit = js.native
    
    def resume(): Unit = js.native
    
    def select(start: Double, end: Double): Unit = js.native
    def select(start: Double, end: Double, priority: js.UndefOr[scala.Nothing], notify: js.Function0[Unit]): Unit = js.native
    def select(start: Double, end: Double, priority: Double): Unit = js.native
    def select(start: Double, end: Double, priority: Double, notify: js.Function0[Unit]): Unit = js.native
    
    val timeRemaining: Double = js.native
    
    val torrentFile: Buffer = js.native
    
    val torrentFileBlobURL: String = js.native
    
    val uploadSpeed: Double = js.native
    
    val uploaded: Double = js.native
  }
  
  @js.native
  trait TorrentDestroyOptions extends StObject {
    
    var destroyStore: js.UndefOr[Boolean] = js.native
  }
  object TorrentDestroyOptions {
    
    @scala.inline
    def apply(): TorrentDestroyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TorrentDestroyOptions]
    }
    
    @scala.inline
    implicit class TorrentDestroyOptionsMutableBuilder[Self <: TorrentDestroyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroyStore(value: Boolean): Self = StObject.set(x, "destroyStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyStoreUndefined: Self = StObject.set(x, "destroyStore", js.undefined)
    }
  }
  
  @js.native
  trait TorrentFile extends EventEmitter {
    
    def appendTo(rootElement: String): Unit = js.native
    def appendTo(
      rootElement: String,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def appendTo(
      rootElement: String,
      opts: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def appendTo(rootElement: String, opts: Autoplay): Unit = js.native
    def appendTo(
      rootElement: String,
      opts: Autoplay,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def appendTo(rootElement: HTMLElement): Unit = js.native
    def appendTo(
      rootElement: HTMLElement,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def appendTo(
      rootElement: HTMLElement,
      opts: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def appendTo(rootElement: HTMLElement, opts: Autoplay): Unit = js.native
    def appendTo(
      rootElement: HTMLElement,
      opts: Autoplay,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    
    def createReadStream(): ReadableStream = js.native
    def createReadStream(opts: End): ReadableStream = js.native
    
    def deselect(): Unit = js.native
    
    val downloaded: Double = js.native
    
    def getBlob(callback: js.Function2[/* err */ js.UndefOr[String | js.Error], /* blob */ js.UndefOr[Blob], Unit]): Unit = js.native
    
    def getBlobURL(
      callback: js.Function2[/* err */ js.UndefOr[String | js.Error], /* blobURL */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    def getBuffer(
      callback: js.Function2[/* err */ js.UndefOr[String | js.Error], /* buffer */ js.UndefOr[Buffer], Unit]
    ): Unit = js.native
    
    val length: Double = js.native
    
    val name: String = js.native
    
    val path: String = js.native
    
    val progress: Double = js.native
    
    def renderTo(rootElement: String): Unit = js.native
    def renderTo(
      rootElement: String,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def renderTo(
      rootElement: String,
      opts: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def renderTo(rootElement: String, opts: Autoplay): Unit = js.native
    def renderTo(
      rootElement: String,
      opts: Autoplay,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def renderTo(rootElement: HTMLMediaElement): Unit = js.native
    def renderTo(
      rootElement: HTMLMediaElement,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def renderTo(
      rootElement: HTMLMediaElement,
      opts: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def renderTo(rootElement: HTMLMediaElement, opts: Autoplay): Unit = js.native
    def renderTo(
      rootElement: HTMLMediaElement,
      opts: Autoplay,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    
    def select(): Unit = js.native
  }
  
  @js.native
  trait TorrentOptions extends StObject {
    
    var announce: js.UndefOr[js.Array[_]] = js.native
    
    var getAnnounceOpts: js.UndefOr[js.Function0[Unit]] = js.native
    
    var maxWebConns: js.UndefOr[Double] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var `private`: js.UndefOr[Boolean] = js.native
    
    var store: js.UndefOr[js.Function2[/* chunkLength */ Double, /* storeOpts */ Files, _]] = js.native
  }
  object TorrentOptions {
    
    @scala.inline
    def apply(): TorrentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TorrentOptions]
    }
    
    @scala.inline
    implicit class TorrentOptionsMutableBuilder[Self <: TorrentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnounce(value: js.Array[_]): Self = StObject.set(x, "announce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnounceUndefined: Self = StObject.set(x, "announce", js.undefined)
      
      @scala.inline
      def setAnnounceVarargs(value: js.Any*): Self = StObject.set(x, "announce", js.Array(value :_*))
      
      @scala.inline
      def setGetAnnounceOpts(value: () => Unit): Self = StObject.set(x, "getAnnounceOpts", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAnnounceOptsUndefined: Self = StObject.set(x, "getAnnounceOpts", js.undefined)
      
      @scala.inline
      def setMaxWebConns(value: Double): Self = StObject.set(x, "maxWebConns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWebConnsUndefined: Self = StObject.set(x, "maxWebConns", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      @scala.inline
      def setStore(value: (/* chunkLength */ Double, /* storeOpts */ Files) => _): Self = StObject.set(x, "store", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  @js.native
  trait TorrentPiece extends StObject {
    
    val length: Double = js.native
    
    val missing: Double = js.native
  }
  object TorrentPiece {
    
    @scala.inline
    def apply(length: Double, missing: Double): TorrentPiece = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any])
      __obj.asInstanceOf[TorrentPiece]
    }
    
    @scala.inline
    implicit class TorrentPieceMutableBuilder[Self <: TorrentPiece] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissing(value: Double): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebTorrent
    extends Instantiable0[Instance]
       with Instantiable1[/* config */ Options, Instance] {
    
    def apply(): Instance = js.native
    def apply(config: Options): Instance = js.native
    
    var WEBRTC_SUPPORT: Boolean = js.native
  }
  
  type _To = WebTorrent
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: WebTorrent = ^
}
