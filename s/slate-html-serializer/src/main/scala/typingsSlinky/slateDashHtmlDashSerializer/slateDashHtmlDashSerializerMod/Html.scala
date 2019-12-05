package typingsSlinky.slateDashHtmlDashSerializer.slateDashHtmlDashSerializerMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.slate.slateMod.BlockProperties
import typingsSlinky.slate.slateMod.Leaf
import typingsSlinky.slate.slateMod.Mark
import typingsSlinky.slate.slateMod.Node
import typingsSlinky.slate.slateMod.Value
import typingsSlinky.slate.slateMod.ValueJSON
import typingsSlinky.slateDashHtmlDashSerializer.Anon_False
import typingsSlinky.slateDashHtmlDashSerializer.Anon_FalseRender
import typingsSlinky.slateDashHtmlDashSerializer.Anon_Render
import typingsSlinky.slateDashHtmlDashSerializer.Anon_ToJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html extends js.Object {
  var defaultBlock: BlockProperties = js.native
  var rules: js.Array[Rule] = js.native
  def deserialize(html: String): Value = js.native
  def deserialize(html: String, options: Anon_False): Value = js.native
  def deserialize(html: String, options: Anon_ToJSON): ValueJSON = js.native
  /* protected */ def deserializeElement(element: HTMLElement): js.Any = js.native
  /* protected */ def deserializeElements(elements: js.Array[HTMLElement]): js.Array[Node] = js.native
  /* protected */ def deserializeMark(mark: Mark): js.Array[Node] = js.native
  /* protected */ def parseHtml(html: String): HTMLElement = js.native
  def serialize(value: Value): String = js.native
  def serialize(value: Value, options: Anon_FalseRender): js.Array[Element] = js.native
  def serialize(value: Value, options: Anon_Render): String = js.native
  /* protected */ def serializeLeaf(leaf: Leaf): String = js.native
  /* protected */ def serializeNode(node: Node): String = js.native
  /* protected */ def serializeString(string: String): String = js.native
}

