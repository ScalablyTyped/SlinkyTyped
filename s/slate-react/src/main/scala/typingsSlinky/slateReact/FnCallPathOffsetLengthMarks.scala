package typingsSlinky.slateReact

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.immutable.Immutable.Set_
import typingsSlinky.slate.mod.Controller
import typingsSlinky.slate.mod.Mark
import typingsSlinky.slate.mod.MarkJSON
import typingsSlinky.slate.mod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathOffsetLengthMarks extends js.Object {
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: js.Array[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: Set_[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
}

