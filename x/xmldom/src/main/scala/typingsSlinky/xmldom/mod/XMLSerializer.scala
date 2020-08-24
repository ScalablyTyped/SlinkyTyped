package typingsSlinky.xmldom.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLSerializer extends js.Object {
  def serializeToString(node: Node): String = js.native
}

@JSImport("xmldom", "XMLSerializer")
@js.native
object XMLSerializer extends TopLevel[XMLSerializerStatic]

