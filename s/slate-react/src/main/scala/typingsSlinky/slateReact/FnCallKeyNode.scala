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
trait FnCallKeyNode extends js.Object {
  def apply(key: String, node: Block): Editor = js.native
  def apply(key: String, node: Document): Editor = js.native
  def apply(key: String, node: Inline): Editor = js.native
  def apply(key: String, node: Node): Controller = js.native
  def apply(key: String, node: Text): Editor = js.native
}

