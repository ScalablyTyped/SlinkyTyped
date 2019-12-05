package typingsSlinky.slateDashReact.slateDashReactMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import typingsSlinky.slate.slateMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "findDOMNode")
@js.native
object findDOMNode extends js.Object {
  def apply(node: String): Element = js.native
  def apply(node: String, win: Window): Element = js.native
  def apply(node: Node): Element = js.native
  def apply(node: Node, win: Window): Element = js.native
}

