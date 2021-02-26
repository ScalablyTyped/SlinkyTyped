package typingsSlinky.winrtUwp.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates the methods needed to serialize a DOM tree or subtree to a string representation. */
@js.native
trait IXmlNodeSerializer extends StObject {
  
  /**
    * Returns the XML representation of the node and all its descendants.
    * @return The XML representation of the node and all its descendants.
    */
  def getXml(): String = js.native
  
  /** Gets and sets the text from inside the XML. */
  var innerText: String = js.native
}
object IXmlNodeSerializer {
  
  @scala.inline
  def apply(getXml: () => String, innerText: String): IXmlNodeSerializer = {
    val __obj = js.Dynamic.literal(getXml = js.Any.fromFunction0(getXml), innerText = innerText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlNodeSerializer]
  }
  
  @scala.inline
  implicit class IXmlNodeSerializerMutableBuilder[Self <: IXmlNodeSerializer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetXml(value: () => String): Self = StObject.set(x, "getXml", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInnerText(value: String): Self = StObject.set(x, "innerText", value.asInstanceOf[js.Any])
  }
}
