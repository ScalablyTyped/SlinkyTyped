package typingsSlinky.slateDashReact

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.slate.slateMod.Block
import typingsSlinky.slate.slateMod.Controller
import typingsSlinky.slate.slateMod.Document
import typingsSlinky.slate.slateMod.Editor
import typingsSlinky.slate.slateMod.Inline
import typingsSlinky.slate.slateMod.Node
import typingsSlinky.slate.slateMod.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_IndexNode extends js.Object {
  def apply(path: List[Double], index: Double, node: Block): Editor = js.native
  def apply(path: List[Double], index: Double, node: Document): Editor = js.native
  def apply(path: List[Double], index: Double, node: Inline): Editor = js.native
  def apply(path: List[Double], index: Double, node: Node): Controller = js.native
  def apply(path: List[Double], index: Double, node: Text): Editor = js.native
}

