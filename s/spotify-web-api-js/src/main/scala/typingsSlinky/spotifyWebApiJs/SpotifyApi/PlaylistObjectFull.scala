package typingsSlinky.spotifyWebApiJs.SpotifyApi

import typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.playlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Playlist Object Full
  * [](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait PlaylistObjectFull extends PlaylistBaseObject {
  var description: String = js.native
  var followers: FollowersObject = js.native
  var tracks: PagingObject[PlaylistTrackObject] = js.native
}

object PlaylistObjectFull {
  @scala.inline
  def apply(
    collaborative: Boolean,
    description: String,
    external_urls: ExternalUrlObject,
    followers: FollowersObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    owner: UserObjectPublic,
    public: Boolean,
    snapshot_id: String,
    tracks: PagingObject[PlaylistTrackObject],
    `type`: playlist,
    uri: String
  ): PlaylistObjectFull = {
    val __obj = js.Dynamic.literal(collaborative = collaborative.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistObjectFull]
  }
  @scala.inline
  implicit class PlaylistObjectFullOps[Self <: PlaylistObjectFull] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowers(value: FollowersObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracks(value: PagingObject[PlaylistTrackObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

