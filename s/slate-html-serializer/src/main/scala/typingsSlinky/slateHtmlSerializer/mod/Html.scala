package typingsSlinky.slateHtmlSerializer.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.slate.mod.BlockProperties
import typingsSlinky.slate.mod.Leaf
import typingsSlinky.slate.mod.Mark
import typingsSlinky.slate.mod.Node
import typingsSlinky.slate.mod.Value
import typingsSlinky.slate.mod.ValueJSON
import typingsSlinky.slateHtmlSerializer.Anon0
import typingsSlinky.slateHtmlSerializer.Anon1
import typingsSlinky.slateHtmlSerializer.AnonRender
import typingsSlinky.slateHtmlSerializer.AnonToJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html extends js.Object {
  var defaultBlock: BlockProperties = js.native
  var rules: js.Array[Rule] = js.native
  def deserialize(html: String): Value = js.native
  def deserialize(html: String, options: Anon0): Value = js.native
  def deserialize(html: String, options: AnonToJSON): ValueJSON = js.native
  /* protected */ def deserializeElement(element: HTMLElement): js.Any = js.native
  /* protected */ def deserializeElements(elements: js.Array[HTMLElement]): js.Array[Node] = js.native
  /* protected */ def deserializeMark(mark: Mark): js.Array[Node] = js.native
  /* protected */ def parseHtml(html: String): HTMLElement = js.native
  def serialize(value: Value): String = js.native
  def serialize(value: Value, options: Anon1): js.Array[Element] = js.native
  def serialize(value: Value, options: AnonRender): String = js.native
  /* protected */ def serializeLeaf(leaf: Leaf): String = js.native
  /* protected */ def serializeNode(node: Node): String = js.native
  /* protected */ def serializeString(string: String): String = js.native
}

