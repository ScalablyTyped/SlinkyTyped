package typingsSlinky.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.off
  - typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.track
  - typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.context
*/
trait PlaybackRepeatState extends js.Object

object PlaybackRepeatState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def context: typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.context = this.cast("context")
  @scala.inline
  def off: typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.off = this.cast("off")
  @scala.inline
  def track: typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.track = this.cast("track")
}

