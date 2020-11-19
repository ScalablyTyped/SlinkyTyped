package typingsSlinky.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSnapshot_id(value: String): Self = this.set("snapshot_id", value.asInstanceOf[js.Any])
  }
}
