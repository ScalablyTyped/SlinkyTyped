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
trait Fn_KeyParent extends js.Object {
  def apply(key: String, parent: Block): Editor = js.native
  def apply(key: String, parent: Document): Editor = js.native
  def apply(key: String, parent: Inline): Editor = js.native
  def apply(key: String, parent: Node): Controller = js.native
  def apply(key: String, parent: Text): Editor = js.native
}

