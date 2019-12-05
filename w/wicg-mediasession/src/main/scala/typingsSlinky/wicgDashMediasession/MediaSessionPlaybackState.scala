package typingsSlinky.wicgDashMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wicgDashMediasession.wicgDashMediasessionStrings.none
  - typings.wicgDashMediasession.wicgDashMediasessionStrings.paused
  - typings.wicgDashMediasession.wicgDashMediasessionStrings.playing
*/
trait MediaSessionPlaybackState extends js.Object

object MediaSessionPlaybackState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.wicgDashMediasession.wicgDashMediasessionStrings.none = this.cast("none")
  @scala.inline
  def paused: typingsSlinky.wicgDashMediasession.wicgDashMediasessionStrings.paused = this.cast("paused")
  @scala.inline
  def playing: typingsSlinky.wicgDashMediasession.wicgDashMediasessionStrings.playing = this.cast("playing")
}

