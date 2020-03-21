package typingsSlinky.slateReact

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.slate.mod.Controller
import typingsSlinky.slate.mod.Mark
import typingsSlinky.slate.mod.MarkJSON
import typingsSlinky.slate.mod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathOffsetLengthMark extends js.Object {
  def apply(path: List[Double], offset: Double, length: Double, mark: String): Controller = js.native
  def apply(path: List[Double], offset: Double, length: Double, mark: Mark): Controller = js.native
  def apply(path: List[Double], offset: Double, length: Double, mark: MarkJSON): Controller = js.native
  def apply(path: List[Double], offset: Double, length: Double, mark: MarkProperties): Controller = js.native
}

