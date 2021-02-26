package typingsSlinky.winrt.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlNodeSerializer extends StObject {
  
  def getXml(): String = js.native
  
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
