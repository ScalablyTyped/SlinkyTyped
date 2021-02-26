package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the serializeToString() method to construct an XML string representing a DOM tree. */
@js.native
trait XMLSerializer extends StObject {
  
  def serializeToString(root: org.scalajs.dom.raw.Node): java.lang.String = js.native
}
object XMLSerializer {
  
  @scala.inline
  def apply(serializeToString: org.scalajs.dom.raw.Node => java.lang.String): org.scalajs.dom.raw.XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.asInstanceOf[org.scalajs.dom.raw.XMLSerializer]
  }
  
  @scala.inline
  implicit class XMLSerializerMutableBuilder[Self <: org.scalajs.dom.raw.XMLSerializer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializeToString(value: org.scalajs.dom.raw.Node => java.lang.String): Self = StObject.set(x, "serializeToString", js.Any.fromFunction1(value))
  }
}
