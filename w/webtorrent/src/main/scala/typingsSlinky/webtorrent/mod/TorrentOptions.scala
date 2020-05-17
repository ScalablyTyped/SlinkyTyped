package typingsSlinky.webtorrent.mod

import typingsSlinky.webtorrent.anon.Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentOptions extends js.Object {
  var announce: js.UndefOr[js.Array[_]] = js.native
  var getAnnounceOpts: js.UndefOr[js.Function0[Unit]] = js.native
  var maxWebConns: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var store: js.UndefOr[js.Function2[/* chunkLength */ Double, /* storeOpts */ Files, _]] = js.native
}

object TorrentOptions {
  @scala.inline
  def apply(): TorrentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TorrentOptions]
  }
  @scala.inline
  implicit class TorrentOptionsOps[Self <: TorrentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnounce(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announce")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAnnounceOpts(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnnounceOpts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAnnounceOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnnounceOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWebConns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWebConns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWebConns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWebConns")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    def withStore(value: (/* chunkLength */ Double, /* storeOpts */ Files) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
  }
  
}

