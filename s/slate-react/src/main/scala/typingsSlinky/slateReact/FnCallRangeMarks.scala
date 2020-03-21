package typingsSlinky.slateReact

import typingsSlinky.immutable.Immutable.Set_
import typingsSlinky.slate.mod.Controller
import typingsSlinky.slate.mod.Mark
import typingsSlinky.slate.mod.MarkJSON
import typingsSlinky.slate.mod.MarkProperties
import typingsSlinky.slate.mod.RangeType
import typingsSlinky.slate.mod.RangeTypeJSON
import typingsSlinky.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeMarks extends js.Object {
  def apply(range: RangeTypeJSON, marks: js.Array[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def apply(range: RangeTypeJSON, marks: Set_[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def apply(range: RangeTypeProperties, marks: js.Array[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def apply(range: RangeTypeProperties, marks: Set_[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def apply(range: RangeType, marks: js.Array[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def apply(range: RangeType, marks: Set_[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
}

