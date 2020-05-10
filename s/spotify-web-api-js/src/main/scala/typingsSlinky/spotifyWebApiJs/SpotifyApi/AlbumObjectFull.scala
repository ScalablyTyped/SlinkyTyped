package typingsSlinky.spotifyWebApiJs.SpotifyApi

import typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.album
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Objects from the Object Models of the Spotify Web Api, ordered alphabetically.
// [Object Model](https://developer.spotify.com/web-api/object-model)
//
/**
  * Full Album Object
  * [album object (full)](https://developer.spotify.com/web-api/object-model/#album-object-simplified)
  */
@js.native
trait AlbumObjectFull extends AlbumObjectSimplified {
  var artists: js.Array[ArtistObjectSimplified] = js.native
  var copyrights: js.Array[CopyrightObject] = js.native
  var external_ids: ExternalIdObject = js.native
  var genres: js.Array[String] = js.native
  var popularity: Double = js.native
  var release_date: String = js.native
  var release_date_precision: String = js.native
  var tracks: PagingObject[TrackObjectSimplified] = js.native
}

object AlbumObjectFull {
  @scala.inline
  def apply(
    album_type: String,
    artists: js.Array[ArtistObjectSimplified],
    copyrights: js.Array[CopyrightObject],
    external_ids: ExternalIdObject,
    external_urls: ExternalUrlObject,
    genres: js.Array[String],
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    popularity: Double,
    release_date: String,
    release_date_precision: String,
    tracks: PagingObject[TrackObjectSimplified],
    `type`: album,
    uri: String
  ): AlbumObjectFull = {
    val __obj = js.Dynamic.literal(album_type = album_type.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], copyrights = copyrights.asInstanceOf[js.Any], external_ids = external_ids.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], release_date_precision = release_date_precision.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumObjectFull]
  }
  @scala.inline
  implicit class AlbumObjectFullOps[Self <: AlbumObjectFull] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtists(value: js.Array[ArtistObjectSimplified]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyrights(value: js.Array[CopyrightObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyrights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_ids(value: ExternalIdObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenres(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genres")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease_date_precision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release_date_precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracks(value: PagingObject[TrackObjectSimplified]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

