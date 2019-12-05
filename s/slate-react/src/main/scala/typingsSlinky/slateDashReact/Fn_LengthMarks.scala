package typingsSlinky.slateDashReact

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.immutable.Immutable.Set
import typingsSlinky.slate.slateMod.Editor
import typingsSlinky.slate.slateMod.Mark
import typingsSlinky.slate.slateMod.MarkJSON
import typingsSlinky.slate.slateMod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_LengthMarks extends js.Object {
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: js.Array[String | MarkProperties | MarkJSON | Mark]
  ): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: Set[String | MarkProperties | MarkJSON | Mark]
  ): Editor = js.native
}

