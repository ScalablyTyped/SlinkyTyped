package typingsSlinky.ytPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ytPlayer.ytPlayerStrings.unstarted
  - typingsSlinky.ytPlayer.ytPlayerStrings.ended
  - typingsSlinky.ytPlayer.ytPlayerStrings.playing
  - typingsSlinky.ytPlayer.ytPlayerStrings.paused
  - typingsSlinky.ytPlayer.ytPlayerStrings.buffering
  - typingsSlinky.ytPlayer.ytPlayerStrings.cued
*/
trait YouTubePlayerState extends js.Object

object YouTubePlayerState {
  @scala.inline
  def buffering: typingsSlinky.ytPlayer.ytPlayerStrings.buffering = this.cast("buffering")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cued: typingsSlinky.ytPlayer.ytPlayerStrings.cued = this.cast("cued")
  @scala.inline
  def ended: typingsSlinky.ytPlayer.ytPlayerStrings.ended = this.cast("ended")
  @scala.inline
  def paused: typingsSlinky.ytPlayer.ytPlayerStrings.paused = this.cast("paused")
  @scala.inline
  def playing: typingsSlinky.ytPlayer.ytPlayerStrings.playing = this.cast("playing")
  @scala.inline
  def unstarted: typingsSlinky.ytPlayer.ytPlayerStrings.unstarted = this.cast("unstarted")
}

