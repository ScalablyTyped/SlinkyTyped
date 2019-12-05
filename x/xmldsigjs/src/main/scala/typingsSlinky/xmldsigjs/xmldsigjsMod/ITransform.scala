package typingsSlinky.xmldsigjs.xmldsigjsMod

import org.scalajs.dom.raw.Node
import typingsSlinky.xmlDashCore.xmlDashCoreMod.IXmlSerializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransform extends IXmlSerializable {
  var Algorithm: String = js.native
  def GetInnerXml(): Node | Null = js.native
  def GetOutput(): js.Any = js.native
  def LoadInnerXml(node: Node): Unit = js.native
}

