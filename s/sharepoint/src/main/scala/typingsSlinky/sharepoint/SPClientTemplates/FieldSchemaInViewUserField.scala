package typingsSlinky.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldSchemaInViewUserField extends FieldSchemaInView {
  
  /** Either "TRUE" or "FALSE" */
  var AllowMultipleValues: String = js.native
  
  /** Either "1" or "0" */
  var DefaultRender: String = js.native
  
  /** Either "TRUE" or "FALSE" */
  var HasPrefix: String = js.native
  
  /** Either "1" or "0" */
  var HasUserLink: String = js.native
  
  /** Either "TRUE" or "FALSE" */
  var ImnHeader: String = js.native
}
object FieldSchemaInViewUserField {
  
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    AllowMultipleValues: String,
    CalloutMenu: String,
    ClassInfo: String,
    DefaultRender: String,
    DisplayName: String,
    Explicit: String,
    FieldTitle: String,
    FieldType: String,
    Filterable: String,
    GridActiveAndReadOnly: String,
    GroupField: String,
    HasPrefix: String,
    HasUserLink: String,
    ID: String,
    ImnHeader: String,
    Name: String,
    ReadOnly: String,
    RealFieldName: String,
    ResultType: String,
    Sortable: String,
    Type: String,
    css: String,
    fieldRenderer: js.Any,
    listItemMenu: String
  ): FieldSchemaInViewUserField = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], AllowMultipleValues = AllowMultipleValues.asInstanceOf[js.Any], CalloutMenu = CalloutMenu.asInstanceOf[js.Any], ClassInfo = ClassInfo.asInstanceOf[js.Any], DefaultRender = DefaultRender.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Explicit = Explicit.asInstanceOf[js.Any], FieldTitle = FieldTitle.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Filterable = Filterable.asInstanceOf[js.Any], GridActiveAndReadOnly = GridActiveAndReadOnly.asInstanceOf[js.Any], GroupField = GroupField.asInstanceOf[js.Any], HasPrefix = HasPrefix.asInstanceOf[js.Any], HasUserLink = HasUserLink.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], ImnHeader = ImnHeader.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], RealFieldName = RealFieldName.asInstanceOf[js.Any], ResultType = ResultType.asInstanceOf[js.Any], Sortable = Sortable.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], fieldRenderer = fieldRenderer.asInstanceOf[js.Any], listItemMenu = listItemMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInViewUserField]
  }
  
  @scala.inline
  implicit class FieldSchemaInViewUserFieldMutableBuilder[Self <: FieldSchemaInViewUserField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMultipleValues(value: String): Self = StObject.set(x, "AllowMultipleValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRender(value: String): Self = StObject.set(x, "DefaultRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPrefix(value: String): Self = StObject.set(x, "HasPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasUserLink(value: String): Self = StObject.set(x, "HasUserLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImnHeader(value: String): Self = StObject.set(x, "ImnHeader", value.asInstanceOf[js.Any])
  }
}
