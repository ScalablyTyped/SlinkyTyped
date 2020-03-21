package typingsSlinky.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wicgMediasession.wicgMediasessionStrings.none
  - typingsSlinky.wicgMediasession.wicgMediasessionStrings.paused
  - typingsSlinky.wicgMediasession.wicgMediasessionStrings.playing
*/
trait MediaSessionPlaybackState extends js.Object

object MediaSessionPlaybackState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.wicgMediasession.wicgMediasessionStrings.none = this.cast("none")
  @scala.inline
  def paused: typingsSlinky.wicgMediasession.wicgMediasessionStrings.paused = this.cast("paused")
  @scala.inline
  def playing: typingsSlinky.wicgMediasession.wicgMediasessionStrings.playing = this.cast("playing")
}

