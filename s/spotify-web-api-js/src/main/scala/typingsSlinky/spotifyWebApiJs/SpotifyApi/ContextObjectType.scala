package typingsSlinky.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.artist
  - typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.playlist
  - typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.album
*/
trait ContextObjectType extends js.Object

object ContextObjectType {
  @scala.inline
  def album: typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.album = this.cast("album")
  @scala.inline
  def artist: typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.artist = this.cast("artist")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def playlist: typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.playlist = this.cast("playlist")
}

