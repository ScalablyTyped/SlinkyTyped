package typingsSlinky.ytDashPlayer.ytDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ytDashPlayer.ytDashPlayerStrings.unstarted
  - typings.ytDashPlayer.ytDashPlayerStrings.ended
  - typings.ytDashPlayer.ytDashPlayerStrings.playing
  - typings.ytDashPlayer.ytDashPlayerStrings.paused
  - typings.ytDashPlayer.ytDashPlayerStrings.buffering
  - typings.ytDashPlayer.ytDashPlayerStrings.cued
*/
trait YouTubePlayerState extends js.Object

object YouTubePlayerState {
  @scala.inline
  def buffering: typingsSlinky.ytDashPlayer.ytDashPlayerStrings.buffering = this.cast("buffering")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cued: typingsSlinky.ytDashPlayer.ytDashPlayerStrings.cued = this.cast("cued")
  @scala.inline
  def ended: typingsSlinky.ytDashPlayer.ytDashPlayerStrings.ended = this.cast("ended")
  @scala.inline
  def paused: typingsSlinky.ytDashPlayer.ytDashPlayerStrings.paused = this.cast("paused")
  @scala.inline
  def playing: typingsSlinky.ytDashPlayer.ytDashPlayerStrings.playing = this.cast("playing")
  @scala.inline
  def unstarted: typingsSlinky.ytDashPlayer.ytDashPlayerStrings.unstarted = this.cast("unstarted")
}

