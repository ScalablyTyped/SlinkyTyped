package typingsSlinky.scrivito.mod

import typingsSlinky.scrivito.anon.Toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeProps extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[Toolbar] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var values: js.UndefOr[js.Array[AttributeValue]] = js.native
}
object AttributeProps {
  
  @scala.inline
  def apply(): AttributeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeProps]
  }
  
  @scala.inline
  implicit class AttributePropsMutableBuilder[Self <: AttributeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setOptions(value: Toolbar): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[AttributeValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: AttributeValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
