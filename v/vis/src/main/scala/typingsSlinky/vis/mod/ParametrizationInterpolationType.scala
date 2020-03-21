package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vis.visStrings.centripetal
  - typingsSlinky.vis.visStrings.chordal
  - typingsSlinky.vis.visStrings.uniform
  - typingsSlinky.vis.visStrings.disabled
*/
trait ParametrizationInterpolationType extends js.Object

object ParametrizationInterpolationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def centripetal: typingsSlinky.vis.visStrings.centripetal = this.cast("centripetal")
  @scala.inline
  def chordal: typingsSlinky.vis.visStrings.chordal = this.cast("chordal")
  @scala.inline
  def disabled: typingsSlinky.vis.visStrings.disabled = this.cast("disabled")
  @scala.inline
  def uniform: typingsSlinky.vis.visStrings.uniform = this.cast("uniform")
}

