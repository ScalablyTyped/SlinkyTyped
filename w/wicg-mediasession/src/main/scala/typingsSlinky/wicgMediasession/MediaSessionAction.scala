package typingsSlinky.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wicgMediasession.wicgMediasessionStrings.play
  - typingsSlinky.wicgMediasession.wicgMediasessionStrings.pause
  - typingsSlinky.wicgMediasession.wicgMediasessionStrings.seekbackward
  - typingsSlinky.wicgMediasession.wicgMediasessionStrings.seekforward
  - typingsSlinky.wicgMediasession.wicgMediasessionStrings.previoustrack
  - typingsSlinky.wicgMediasession.wicgMediasessionStrings.nexttrack
*/
trait MediaSessionAction extends js.Object

object MediaSessionAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nexttrack: typingsSlinky.wicgMediasession.wicgMediasessionStrings.nexttrack = this.cast("nexttrack")
  @scala.inline
  def pause: typingsSlinky.wicgMediasession.wicgMediasessionStrings.pause = this.cast("pause")
  @scala.inline
  def play: typingsSlinky.wicgMediasession.wicgMediasessionStrings.play = this.cast("play")
  @scala.inline
  def previoustrack: typingsSlinky.wicgMediasession.wicgMediasessionStrings.previoustrack = this.cast("previoustrack")
  @scala.inline
  def seekbackward: typingsSlinky.wicgMediasession.wicgMediasessionStrings.seekbackward = this.cast("seekbackward")
  @scala.inline
  def seekforward: typingsSlinky.wicgMediasession.wicgMediasessionStrings.seekforward = this.cast("seekforward")
}

