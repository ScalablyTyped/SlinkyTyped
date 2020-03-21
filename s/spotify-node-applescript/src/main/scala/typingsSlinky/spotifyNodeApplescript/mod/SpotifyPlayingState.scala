package typingsSlinky.spotifyNodeApplescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.spotifyNodeApplescript.spotifyNodeApplescriptStrings.playing
  - typingsSlinky.spotifyNodeApplescript.spotifyNodeApplescriptStrings.paused
*/
trait SpotifyPlayingState extends js.Object

object SpotifyPlayingState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def paused: typingsSlinky.spotifyNodeApplescript.spotifyNodeApplescriptStrings.paused = this.cast("paused")
  @scala.inline
  def playing: typingsSlinky.spotifyNodeApplescript.spotifyNodeApplescriptStrings.playing = this.cast("playing")
}

