package typingsSlinky.sharepoint.SPClientTemplates

import typingsSlinky.sharepoint.SPClientForms.ClientValidation.ValidatorSet
import typingsSlinky.sharepoint.anon.AllowScriptableWebParts
import typingsSlinky.sharepoint.anon.BaseType
import typingsSlinky.sharepoint.anon.ExternalListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientFormContext extends js.Object {
  var controlMode: Double = js.native
  var fieldName: String = js.native
  var fieldSchema: FieldSchemaInForm = js.native
  var fieldValue: js.Any = js.native
  var itemAttributes: ExternalListItem = js.native
  var listAttributes: BaseType = js.native
  var webAttributes: AllowScriptableWebParts = js.native
  def registerClientValidator(fieldname: String, validator: ValidatorSet): Unit = js.native
  def registerFocusCallback(fieldname: String, callback: js.Function0[Unit]): Unit = js.native
  def registerGetValueCallback(fieldname: String, callback: js.Function0[_]): Unit = js.native
  def registerHasValueChangedCallback(fieldname: String, callback: js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def registerInitCallback(fieldname: String, callback: js.Function0[Unit]): Unit = js.native
  def registerValidationErrorCallback(fieldname: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def updateControlValue(fieldname: String, value: js.Any): Unit = js.native
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
  implicit class ClientFormContextOps[Self <: ClientFormContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldSchema(value: FieldSchemaInForm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemAttributes(value: ExternalListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAttributes(value: BaseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisterClientValidator(value: (String, ValidatorSet) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerClientValidator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterFocusCallback(value: (String, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerFocusCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterGetValueCallback(value: (String, js.Function0[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerGetValueCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterHasValueChangedCallback(value: (String, js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerHasValueChangedCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterInitCallback(value: (String, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerInitCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterValidationErrorCallback(value: (String, js.Function1[/* error */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerValidationErrorCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateControlValue(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateControlValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWebAttributes(value: AllowScriptableWebParts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAttributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

