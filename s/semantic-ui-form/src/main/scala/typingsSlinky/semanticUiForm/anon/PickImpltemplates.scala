package typingsSlinky.semanticUiForm.anon

import typingsSlinky.semanticUiForm.SemanticUI.Form.TemplatesSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'templates'> */
@js.native
trait PickImpltemplates extends StObject {
  
  var templates: TemplatesSettings = js.native
}
object PickImpltemplates {
  
  @scala.inline
  def apply(templates: TemplatesSettings): PickImpltemplates = {
    val __obj = js.Dynamic.literal(templates = templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltemplates]
  }
  
  @scala.inline
  implicit class PickImpltemplatesMutableBuilder[Self <: PickImpltemplates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
  }
}
