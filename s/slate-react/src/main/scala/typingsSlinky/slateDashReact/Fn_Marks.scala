package typingsSlinky.slateDashReact

import typingsSlinky.immutable.Immutable.Set
import typingsSlinky.slate.slateMod.Editor
import typingsSlinky.slate.slateMod.Mark
import typingsSlinky.slate.slateMod.MarkJSON
import typingsSlinky.slate.slateMod.MarkProperties
import typingsSlinky.slate.slateMod.RangeType
import typingsSlinky.slate.slateMod.RangeTypeJSON
import typingsSlinky.slate.slateMod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Marks extends js.Object {
  def apply(range: RangeTypeJSON, marks: js.Array[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeTypeJSON, marks: Set[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeTypeProperties, marks: js.Array[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeTypeProperties, marks: Set[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeType, marks: js.Array[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeType, marks: Set[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
}

