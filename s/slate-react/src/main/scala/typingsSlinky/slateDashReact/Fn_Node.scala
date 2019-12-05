package typingsSlinky.slateDashReact

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
trait Fn_Node extends js.Object {
  def apply(node: Block): Editor = js.native
  def apply(node: Document): Editor = js.native
  def apply(node: Inline): Editor = js.native
  def apply(node: Node): Controller = js.native
  def apply(node: Text): Editor = js.native
}

