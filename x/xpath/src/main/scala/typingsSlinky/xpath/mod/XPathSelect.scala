package typingsSlinky.xpath.mod

import org.scalajs.dom.raw.Node
import typingsSlinky.xpath.xpathBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XPathSelect extends js.Object {
  def apply(expression: String): js.Array[SelectedValue] = js.native
  def apply(expression: String, node: Node): js.Array[SelectedValue] = js.native
  def apply(expression: String, node: Node, single: `true`): SelectedValue = js.native
}

