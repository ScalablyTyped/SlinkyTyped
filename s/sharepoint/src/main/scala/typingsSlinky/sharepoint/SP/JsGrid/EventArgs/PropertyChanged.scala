package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IChangeKey
import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import typingsSlinky.sharepoint.SP.JsGrid.IPropertyType
import typingsSlinky.sharepoint.SP.JsGrid.Internal.PropertyUpdate
import typingsSlinky.sharepoint.SP.JsGrid.ValidationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyChanged extends IEventArgs {
  var changeKey: IChangeKey = js.native
  var fieldKey: String = js.native
  var newProp: PropertyUpdate = js.native
  var oldProp: PropertyUpdate = js.native
  var propType: IPropertyType = js.native
  var recordKey: Double = js.native
  var validationState: ValidationState = js.native
}

object PropertyChanged {
  @scala.inline
  def apply(
    changeKey: IChangeKey,
    fieldKey: String,
    newProp: PropertyUpdate,
    oldProp: PropertyUpdate,
    propType: IPropertyType,
    recordKey: Double,
    validationState: ValidationState
  ): PropertyChanged = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], newProp = newProp.asInstanceOf[js.Any], oldProp = oldProp.asInstanceOf[js.Any], propType = propType.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any], validationState = validationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChanged]
  }
  @scala.inline
  implicit class PropertyChangedOps[Self <: PropertyChanged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeKey(value: IChangeKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewProp(value: PropertyUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldProp(value: PropertyUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropType(value: IPropertyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationState(value: ValidationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

