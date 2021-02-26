package typingsSlinky.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Templates extends StObject {
  
  // TODO: determine appropriate context type and purpose of this template
  var Body: js.UndefOr[RenderCallback | String] = js.native
  
  /** Defines templates for fields rendering. The field is specified by it's internal name. */
  var Fields: js.UndefOr[FieldTemplates] = js.native
  
  /** Defines template for rendering list view footer.
    Can be either string or SingleTemplateCallback */
  var Footer: js.UndefOr[SingleTemplateCallback | String] = js.native
  
  // TODO: determine appropriate context type and purpose of this template
  /** Defines templates for rendering groups (aggregations). */
  var Group: js.UndefOr[GroupCallback | String] = js.native
  
  /** Defines template for rendering list view header.
    Can be either string or SingleTemplateCallback */
  var Header: js.UndefOr[SingleTemplateCallback | String] = js.native
  
  /** Defines templates for list items rendering. */
  var Item: js.UndefOr[ItemCallback | String] = js.native
  
  var View: js.UndefOr[RenderCallback | String] = js.native
}
object Templates {
  
  @scala.inline
  def apply(): Templates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Templates]
  }
  
  @scala.inline
  implicit class TemplatesMutableBuilder[Self <: Templates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: RenderCallback | String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyFunction1(value: /* ctx */ RenderContext => Unit): Self = StObject.set(x, "Body", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    @scala.inline
    def setFields(value: FieldTemplates): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    @scala.inline
    def setFooter(value: SingleTemplateCallback | String): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterFunction1(value: /* renderContext */ RenderContextInView => String): Self = StObject.set(x, "Footer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "Footer", js.undefined)
    
    @scala.inline
    def setGroup(value: GroupCallback | String): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupFunction1(value: /* renderContext */ RenderContextGroupInView => String): Self = StObject.set(x, "Group", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    @scala.inline
    def setHeader(value: SingleTemplateCallback | String): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFunction1(value: /* renderContext */ RenderContextInView => String): Self = StObject.set(x, "Header", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    @scala.inline
    def setItem(value: ItemCallback | String): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemFunction1(value: /* renderContext */ RenderContext => String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    
    @scala.inline
    def setView(value: RenderCallback | String): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewFunction1(value: /* ctx */ RenderContext => Unit): Self = StObject.set(x, "View", js.Any.fromFunction1(value))
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "View", js.undefined)
  }
}
