package typingsSlinky.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReorderPlaylistTracksOptions extends SnapshotOptions {
  var range_length: js.UndefOr[Double] = js.native
}

object ReorderPlaylistTracksOptions {
  @scala.inline
  def apply(): ReorderPlaylistTracksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReorderPlaylistTracksOptions]
  }
  @scala.inline
  implicit class ReorderPlaylistTracksOptionsOps[Self <: ReorderPlaylistTracksOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange_length: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range_length")(js.undefined)
        ret
    }
  }
  
}

