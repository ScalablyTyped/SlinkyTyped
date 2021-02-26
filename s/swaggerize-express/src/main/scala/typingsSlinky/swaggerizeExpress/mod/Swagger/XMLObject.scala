package typingsSlinky.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLObject
  extends /* index */ StringDictionary[js.Any] {
  
  var attribute: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namespace: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var wrapped: js.UndefOr[Boolean] = js.native
}
object XMLObject {
  
  @scala.inline
  def apply(): XMLObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLObject]
  }
  
  @scala.inline
  implicit class XMLObjectMutableBuilder[Self <: XMLObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: Boolean): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setWrapped(value: Boolean): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrappedUndefined: Self = StObject.set(x, "wrapped", js.undefined)
  }
}
