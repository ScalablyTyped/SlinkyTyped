package typingsSlinky.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeOptions extends StObject {
  
  var attributes: js.UndefOr[js.Any] = js.native
  
  var legalNodes: js.Array[String] = js.native
  
  var name: String = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var topLevel: js.UndefOr[Boolean] = js.native
}
object NodeOptions {
  
  @scala.inline
  def apply(legalNodes: js.Array[String], name: String): NodeOptions = {
    val __obj = js.Dynamic.literal(legalNodes = legalNodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions]
  }
  
  @scala.inline
  implicit class NodeOptionsMutableBuilder[Self <: NodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setLegalNodes(value: js.Array[String]): Self = StObject.set(x, "legalNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalNodesVarargs(value: String*): Self = StObject.set(x, "legalNodes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTopLevel(value: Boolean): Self = StObject.set(x, "topLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLevelUndefined: Self = StObject.set(x, "topLevel", js.undefined)
  }
}
