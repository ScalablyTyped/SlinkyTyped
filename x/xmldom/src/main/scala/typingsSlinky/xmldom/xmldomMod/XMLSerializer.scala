package typingsSlinky.xmldom.xmldomMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLSerializer extends js.Object {
  def serializeToString(node: Node): String
}

@JSImport("xmldom", "XMLSerializer")
@js.native
object XMLSerializer extends TopLevel[XMLSerializerStatic]

