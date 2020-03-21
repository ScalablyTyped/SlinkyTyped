package typingsSlinky.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.spotifyApi.spotifyApiStrings.artist
  - typingsSlinky.spotifyApi.spotifyApiStrings.playlist
  - typingsSlinky.spotifyApi.spotifyApiStrings.album
*/
trait ContextObjectType extends js.Object

object ContextObjectType {
  @scala.inline
  def album: typingsSlinky.spotifyApi.spotifyApiStrings.album = this.cast("album")
  @scala.inline
  def artist: typingsSlinky.spotifyApi.spotifyApiStrings.artist = this.cast("artist")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def playlist: typingsSlinky.spotifyApi.spotifyApiStrings.playlist = this.cast("playlist")
}

