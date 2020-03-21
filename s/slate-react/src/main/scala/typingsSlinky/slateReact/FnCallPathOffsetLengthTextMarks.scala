package typingsSlinky.slateReact

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.immutable.Immutable.Set_
import typingsSlinky.slate.mod.Controller
import typingsSlinky.slate.mod.Mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathOffsetLengthTextMarks extends js.Object {
  def apply(path: List[Double], offset: Double, length: Double, text: String): Controller = js.native
  def apply(path: List[Double], offset: Double, length: Double, text: String, marks: js.Array[Mark]): Controller = js.native
  def apply(path: List[Double], offset: Double, length: Double, text: String, marks: Set_[Mark]): Controller = js.native
}

