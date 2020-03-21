package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vis.visStrings.line
  - typingsSlinky.vis.visStrings.bar
  - typingsSlinky.vis.visStrings.points
*/
trait Graph2dStyleType extends js.Object

object Graph2dStyleType {
  @scala.inline
  def bar: typingsSlinky.vis.visStrings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def line: typingsSlinky.vis.visStrings.line = this.cast("line")
  @scala.inline
  def points: typingsSlinky.vis.visStrings.points = this.cast("points")
}

