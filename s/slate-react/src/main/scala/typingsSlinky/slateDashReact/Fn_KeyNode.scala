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
trait Fn_KeyNode extends js.Object {
  def apply(key: String, node: Block): Editor = js.native
  def apply(key: String, node: Document): Editor = js.native
  def apply(key: String, node: Inline): Editor = js.native
  def apply(key: String, node: Node): Controller = js.native
  def apply(key: String, node: Text): Editor = js.native
}

