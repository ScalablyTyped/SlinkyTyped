package typingsSlinky.semanticUiApi.anon

import typingsSlinky.semanticUiApi.semanticUiApiStrings.html
import typingsSlinky.semanticUiApi.semanticUiApiStrings.json
import typingsSlinky.semanticUiApi.semanticUiApiStrings.jsonp
import typingsSlinky.semanticUiApi.semanticUiApiStrings.script
import typingsSlinky.semanticUiApi.semanticUiApiStrings.text
import typingsSlinky.semanticUiApi.semanticUiApiStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'dataType'> */
@js.native
trait PickImpldataType extends StObject {
  
  var dataType: xml | json | jsonp | script | html | text = js.native
}
object PickImpldataType {
  
  @scala.inline
  def apply(dataType: xml | json | jsonp | script | html | text): PickImpldataType = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldataType]
  }
  
  @scala.inline
  implicit class PickImpldataTypeMutableBuilder[Self <: PickImpldataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: xml | json | jsonp | script | html | text): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
  }
}
