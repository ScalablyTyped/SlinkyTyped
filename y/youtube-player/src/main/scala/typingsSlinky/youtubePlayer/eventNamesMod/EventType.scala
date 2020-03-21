package typingsSlinky.youtubePlayer.eventNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.youtubePlayer.youtubePlayerStrings.ready
  - typingsSlinky.youtubePlayer.youtubePlayerStrings.stateChange
  - typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackQualityChange
  - typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackRateChange
  - typingsSlinky.youtubePlayer.youtubePlayerStrings.error
  - typingsSlinky.youtubePlayer.youtubePlayerStrings.apiChange
  - typingsSlinky.youtubePlayer.youtubePlayerStrings.volumeChange
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def apiChange: typingsSlinky.youtubePlayer.youtubePlayerStrings.apiChange = this.cast("apiChange")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.youtubePlayer.youtubePlayerStrings.error = this.cast("error")
  @scala.inline
  def playbackQualityChange: typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackQualityChange = this.cast("playbackQualityChange")
  @scala.inline
  def playbackRateChange: typingsSlinky.youtubePlayer.youtubePlayerStrings.playbackRateChange = this.cast("playbackRateChange")
  @scala.inline
  def ready: typingsSlinky.youtubePlayer.youtubePlayerStrings.ready = this.cast("ready")
  @scala.inline
  def stateChange: typingsSlinky.youtubePlayer.youtubePlayerStrings.stateChange = this.cast("stateChange")
  @scala.inline
  def volumeChange: typingsSlinky.youtubePlayer.youtubePlayerStrings.volumeChange = this.cast("volumeChange")
}

