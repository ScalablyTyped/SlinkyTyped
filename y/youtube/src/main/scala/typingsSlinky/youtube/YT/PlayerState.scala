package typingsSlinky.youtube.YT

import typingsSlinky.youtube.youtubeNumbers.`-1`
import typingsSlinky.youtube.youtubeNumbers.`0`
import typingsSlinky.youtube.youtubeNumbers.`1`
import typingsSlinky.youtube.youtubeNumbers.`2`
import typingsSlinky.youtube.youtubeNumbers.`3`
import typingsSlinky.youtube.youtubeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.youtube.youtubeNumbers.`-1`
  - typingsSlinky.youtube.youtubeNumbers.`0`
  - typingsSlinky.youtube.youtubeNumbers.`1`
  - typingsSlinky.youtube.youtubeNumbers.`2`
  - typingsSlinky.youtube.youtubeNumbers.`3`
  - typingsSlinky.youtube.youtubeNumbers.`5`
*/
trait PlayerState extends js.Object

object PlayerState {
  @scala.inline
  def BUFFERING: `3` = this.cast(3)
  @scala.inline
  def CUED: `5` = this.cast(5)
  @scala.inline
  def ENDED: `0` = this.cast(0)
  @scala.inline
  def PAUSED: `2` = this.cast(2)
  @scala.inline
  def PLAYING: `1` = this.cast(1)
  @scala.inline
  def UNSTARTED: `-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

