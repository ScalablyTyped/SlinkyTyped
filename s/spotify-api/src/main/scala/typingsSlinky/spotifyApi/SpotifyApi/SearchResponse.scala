package typingsSlinky.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search for artists/albums/tracks/playlists
  * 
  * GET /v1/search?type=album
  * https://developer.spotify.com/web-api/search-item/
  */
/* Inlined parent std.Partial<spotify-api.SpotifyApi.ArtistSearchResponse> */
/* Inlined parent std.Partial<spotify-api.SpotifyApi.AlbumSearchResponse> */
/* Inlined parent std.Partial<spotify-api.SpotifyApi.TrackSearchResponse> */
/* Inlined parent std.Partial<spotify-api.SpotifyApi.PlaylistSearchResponse> */
@js.native
trait SearchResponse extends js.Object {
  var albums: js.UndefOr[PagingObject[AlbumObjectSimplified]] = js.native
  var artists: js.UndefOr[PagingObject[ArtistObjectFull]] = js.native
  var playlists: js.UndefOr[PagingObject[PlaylistObjectSimplified]] = js.native
  var tracks: js.UndefOr[PagingObject[TrackObjectFull]] = js.native
}

object SearchResponse {
  @scala.inline
  def apply(): SearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResponse]
  }
  @scala.inline
  implicit class SearchResponseOps[Self <: SearchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbums(value: PagingObject[AlbumObjectSimplified]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albums")(js.undefined)
        ret
    }
    @scala.inline
    def withArtists(value: PagingObject[ArtistObjectFull]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artists")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaylists(value: PagingObject[PlaylistObjectSimplified]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlists")(js.undefined)
        ret
    }
    @scala.inline
    def withTracks(value: PagingObject[TrackObjectFull]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(js.undefined)
        ret
    }
  }
  
}

