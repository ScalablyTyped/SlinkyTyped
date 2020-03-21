package typingsSlinky.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.theo.theoStrings.raw
  - typingsSlinky.theo.theoStrings.ios
  - typingsSlinky.theo.theoStrings.android
  - typingsSlinky.theo.theoStrings.web
*/
trait Transform extends js.Object

object Transform {
  @scala.inline
  def android: typingsSlinky.theo.theoStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ios: typingsSlinky.theo.theoStrings.ios = this.cast("ios")
  @scala.inline
  def raw: typingsSlinky.theo.theoStrings.raw = this.cast("raw")
  @scala.inline
  def web: typingsSlinky.theo.theoStrings.web = this.cast("web")
}

