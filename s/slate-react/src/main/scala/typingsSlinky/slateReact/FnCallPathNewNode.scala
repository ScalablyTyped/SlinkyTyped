package typingsSlinky.slateReact

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.slate.mod.Block
import typingsSlinky.slate.mod.Controller
import typingsSlinky.slate.mod.Document
import typingsSlinky.slate.mod.Editor
import typingsSlinky.slate.mod.Inline
import typingsSlinky.slate.mod.Node
import typingsSlinky.slate.mod.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathNewNode extends js.Object {
  def apply(path: List[Double], newNode: Block): Editor = js.native
  def apply(path: List[Double], newNode: Document): Editor = js.native
  def apply(path: List[Double], newNode: Inline): Editor = js.native
  def apply(path: List[Double], newNode: Node): Controller = js.native
  def apply(path: List[Double], newNode: Text): Editor = js.native
}

