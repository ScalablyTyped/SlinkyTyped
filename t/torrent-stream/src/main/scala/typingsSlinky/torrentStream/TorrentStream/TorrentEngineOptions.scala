package typingsSlinky.torrentStream.TorrentStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentEngineOptions extends js.Object {
  var connections: js.UndefOr[Double] = js.native
   // Verify previously stored data before starting.
  var dht: js.UndefOr[Boolean] = js.native
   // Root folder for the files storage. Default folder under /tmp/torrent-stream/{infoHash}.
  var path: js.UndefOr[String] = js.native
   // Allows to declare additional custom trackers to use.
  var storage: js.UndefOr[js.Any] = js.native
   // Number of upload slots.
  var tmp: js.UndefOr[String] = js.native
   // Whether or not to use DHT to initialize the swarm.
  var tracker: js.UndefOr[Boolean] = js.native
   // Whether or not to use trackers from torrent file or magnet link.
  var trackers: js.UndefOr[js.Array[String]] = js.native
   // Max amount of peers to be connected to.
  var uploads: js.UndefOr[Double] = js.native
   // Path where to save the files. Overrides 'tmp'.
  var verify: js.UndefOr[Boolean] = js.native
}

object TorrentEngineOptions {
  @scala.inline
  def apply(): TorrentEngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TorrentEngineOptions]
  }
  @scala.inline
  implicit class TorrentEngineOptionsOps[Self <: TorrentEngineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(js.undefined)
        ret
    }
    @scala.inline
    def withDht(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dht")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDht: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dht")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
    @scala.inline
    def withTmp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmp")(js.undefined)
        ret
    }
    @scala.inline
    def withTracker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackers")(js.undefined)
        ret
    }
    @scala.inline
    def withUploads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(js.undefined)
        ret
    }
    @scala.inline
    def withVerify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.undefined)
        ret
    }
  }
  
}

