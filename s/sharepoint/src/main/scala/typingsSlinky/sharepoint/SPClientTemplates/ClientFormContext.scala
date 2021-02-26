package typingsSlinky.sharepoint.SPClientTemplates

import typingsSlinky.sharepoint.SPClientForms.ClientValidation.ValidatorSet
import typingsSlinky.sharepoint.anon.AllowScriptableWebParts
import typingsSlinky.sharepoint.anon.BaseType
import typingsSlinky.sharepoint.anon.ExternalListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientFormContext extends StObject {
  
  var controlMode: Double = js.native
  
  var fieldName: String = js.native
  
  var fieldSchema: FieldSchemaInForm = js.native
  
  var fieldValue: js.Any = js.native
  
  var itemAttributes: ExternalListItem = js.native
  
  var listAttributes: BaseType = js.native
  
  def registerClientValidator(fieldname: String, validator: ValidatorSet): Unit = js.native
  
  def registerFocusCallback(fieldname: String, callback: js.Function0[Unit]): Unit = js.native
  
  def registerGetValueCallback(fieldname: String, callback: js.Function0[_]): Unit = js.native
  
  def registerHasValueChangedCallback(fieldname: String, callback: js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  def registerInitCallback(fieldname: String, callback: js.Function0[Unit]): Unit = js.native
  
  def registerValidationErrorCallback(fieldname: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  def updateControlValue(fieldname: String, value: js.Any): Unit = js.native
  
  var webAttributes: AllowScriptableWebParts = js.native
}
object ClientFormContext {
  
  @scala.inline
  def apply(
    controlMode: Double,
    fieldName: String,
    fieldSchema: FieldSchemaInForm,
    fieldValue: js.Any,
    itemAttributes: ExternalListItem,
    listAttributes: BaseType,
    registerClientValidator: (String, ValidatorSet) => Unit,
    registerFocusCallback: (String, js.Function0[Unit]) => Unit,
    registerGetValueCallback: (String, js.Function0[_]) => Unit,
    registerHasValueChangedCallback: (String, js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]) => Unit,
    registerInitCallback: (String, js.Function0[Unit]) => Unit,
    registerValidationErrorCallback: (String, js.Function1[/* error */ js.Any, Unit]) => Unit,
    updateControlValue: (String, js.Any) => Unit,
    webAttributes: AllowScriptableWebParts
  ): ClientFormContext = {
    val __obj = js.Dynamic.literal(controlMode = controlMode.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fieldSchema = fieldSchema.asInstanceOf[js.Any], fieldValue = fieldValue.asInstanceOf[js.Any], itemAttributes = itemAttributes.asInstanceOf[js.Any], listAttributes = listAttributes.asInstanceOf[js.Any], registerClientValidator = js.Any.fromFunction2(registerClientValidator), registerFocusCallback = js.Any.fromFunction2(registerFocusCallback), registerGetValueCallback = js.Any.fromFunction2(registerGetValueCallback), registerHasValueChangedCallback = js.Any.fromFunction2(registerHasValueChangedCallback), registerInitCallback = js.Any.fromFunction2(registerInitCallback), registerValidationErrorCallback = js.Any.fromFunction2(registerValidationErrorCallback), updateControlValue = js.Any.fromFunction2(updateControlValue), webAttributes = webAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientFormContext]
  }
  
  @scala.inline
  implicit class ClientFormContextMutableBuilder[Self <: ClientFormContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlMode(value: Double): Self = StObject.set(x, "controlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldSchema(value: FieldSchemaInForm): Self = StObject.set(x, "fieldSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldValue(value: js.Any): Self = StObject.set(x, "fieldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemAttributes(value: ExternalListItem): Self = StObject.set(x, "itemAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListAttributes(value: BaseType): Self = StObject.set(x, "listAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterClientValidator(value: (String, ValidatorSet) => Unit): Self = StObject.set(x, "registerClientValidator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterFocusCallback(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "registerFocusCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterGetValueCallback(value: (String, js.Function0[_]) => Unit): Self = StObject.set(x, "registerGetValueCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterHasValueChangedCallback(value: (String, js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]) => Unit): Self = StObject.set(x, "registerHasValueChangedCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterInitCallback(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "registerInitCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterValidationErrorCallback(value: (String, js.Function1[/* error */ js.Any, Unit]) => Unit): Self = StObject.set(x, "registerValidationErrorCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateControlValue(value: (String, js.Any) => Unit): Self = StObject.set(x, "updateControlValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWebAttributes(value: AllowScriptableWebParts): Self = StObject.set(x, "webAttributes", value.asInstanceOf[js.Any])
  }
}
