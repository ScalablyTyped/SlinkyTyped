package typingsSlinky.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.weappApi.weappApiStrings.bevel
  - typingsSlinky.weappApi.weappApiStrings.round
  - typingsSlinky.weappApi.weappApiStrings.miter
*/
trait LineJoinType extends js.Object

object LineJoinType {
  @scala.inline
  def bevel: typingsSlinky.weappApi.weappApiStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typingsSlinky.weappApi.weappApiStrings.miter = this.cast("miter")
  @scala.inline
  def round: typingsSlinky.weappApi.weappApiStrings.round = this.cast("round")
}

