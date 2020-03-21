package typingsSlinky.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.album
  - typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.artist
  - typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.playlist
  - typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.track
*/
trait SearchType extends js.Object

object SearchType {
  @scala.inline
  def album: typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.album = this.cast("album")
  @scala.inline
  def artist: typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.artist = this.cast("artist")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def playlist: typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.playlist = this.cast("playlist")
  @scala.inline
  def track: typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.track = this.cast("track")
}

