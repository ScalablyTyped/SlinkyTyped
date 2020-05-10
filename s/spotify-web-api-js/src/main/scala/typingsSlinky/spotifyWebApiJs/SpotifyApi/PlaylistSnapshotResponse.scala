package typingsSlinky.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response with Playlist Snapshot
  */
@js.native
trait PlaylistSnapshotResponse extends js.Object {
  var snapshot_id: String = js.native
}

object PlaylistSnapshotResponse {
  @scala.inline
  def apply(snapshot_id: String): PlaylistSnapshotResponse = {
    val __obj = js.Dynamic.literal(snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistSnapshotResponse]
  }
  @scala.inline
  implicit class PlaylistSnapshotResponseOps[Self <: PlaylistSnapshotResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapshot_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

