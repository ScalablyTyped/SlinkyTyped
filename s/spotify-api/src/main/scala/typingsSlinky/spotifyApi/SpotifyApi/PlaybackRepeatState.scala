package typingsSlinky.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.spotifyApi.spotifyApiStrings.off
  - typingsSlinky.spotifyApi.spotifyApiStrings.track
  - typingsSlinky.spotifyApi.spotifyApiStrings.context
*/
trait PlaybackRepeatState extends js.Object

object PlaybackRepeatState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def context: typingsSlinky.spotifyApi.spotifyApiStrings.context = this.cast("context")
  @scala.inline
  def off: typingsSlinky.spotifyApi.spotifyApiStrings.off = this.cast("off")
  @scala.inline
  def track: typingsSlinky.spotifyApi.spotifyApiStrings.track = this.cast("track")
}

