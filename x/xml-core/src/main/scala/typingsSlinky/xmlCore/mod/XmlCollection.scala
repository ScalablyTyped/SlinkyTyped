package typingsSlinky.xmlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "XmlCollection")
@js.native
class XmlCollection[I /* <: XmlObject */] ()
  extends XmlObject
     with ICollection[I] {
  /**
    * The maximum number of elements
    */
  var MaxOccurs: Double = js.native
  /**
    * The minimum number of elements
    */
  var MinOccurs: Double = js.native
  var items: js.Array[I] = js.native
  @JSName("Count")
  def Count_MXmlCollection: Double = js.native
  /* InferMemberOverrides */
  override def IsEmpty(): Boolean = js.native
}

/* static members */
@JSImport("xml-core", "XmlCollection")
@js.native
object XmlCollection extends js.Object {
  var parser: js.Any = js.native
}

