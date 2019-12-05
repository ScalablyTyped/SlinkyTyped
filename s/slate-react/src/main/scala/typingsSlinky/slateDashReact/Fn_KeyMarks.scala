package typingsSlinky.slateDashReact

import typingsSlinky.immutable.Immutable.Set
import typingsSlinky.slate.slateMod.Editor
import typingsSlinky.slate.slateMod.Mark
import typingsSlinky.slate.slateMod.MarkJSON
import typingsSlinky.slate.slateMod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_KeyMarks extends js.Object {
  def apply(key: String, offset: Double, text: String): Editor = js.native
  def apply(
    key: String,
    offset: Double,
    text: String,
    marks: js.Array[String | MarkProperties | MarkJSON | Mark]
  ): Editor = js.native
  def apply(key: String, offset: Double, text: String, marks: Set[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
}

