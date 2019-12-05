package typingsSlinky.slateDashReact

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.slate.slateMod.Editor
import typingsSlinky.slate.slateMod.Mark
import typingsSlinky.slate.slateMod.MarkJSON
import typingsSlinky.slate.slateMod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Length extends js.Object {
  def apply(path: List[Double], offset: Double, length: Double, mark: String): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, mark: Mark): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, mark: MarkJSON): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, mark: MarkProperties): Editor = js.native
}

