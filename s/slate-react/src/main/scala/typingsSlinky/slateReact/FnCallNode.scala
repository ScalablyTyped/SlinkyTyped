package typingsSlinky.slateReact

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
trait FnCallNode extends js.Object {
  def apply(node: Block): Editor = js.native
  def apply(node: Document): Editor = js.native
  def apply(node: Inline): Editor = js.native
  def apply(node: Node): Controller = js.native
  def apply(node: Text): Editor = js.native
}

