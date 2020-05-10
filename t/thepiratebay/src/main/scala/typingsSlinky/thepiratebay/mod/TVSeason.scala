package typingsSlinky.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TVSeason extends js.Object {
  var title: String = js.native
  var torrents: js.Array[TVTorrent] = js.native
}

object TVSeason {
  @scala.inline
  def apply(title: String, torrents: js.Array[TVTorrent]): TVSeason = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], torrents = torrents.asInstanceOf[js.Any])
    __obj.asInstanceOf[TVSeason]
  }
  @scala.inline
  implicit class TVSeasonOps[Self <: TVSeason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTorrents(value: js.Array[TVTorrent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torrents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

