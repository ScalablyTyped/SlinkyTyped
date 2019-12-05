package typingsSlinky.slateDashReact

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.immutable.Immutable.Set
import typingsSlinky.slate.slateMod.Editor
import typingsSlinky.slate.slateMod.Mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_LengthMarksOffset extends js.Object {
  def apply(path: List[Double], offset: Double, length: Double, text: String): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, text: String, marks: js.Array[Mark]): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, text: String, marks: Set[Mark]): Editor = js.native
}

