package typingsSlinky.sharepoint.SP.JsGrid

import typingsSlinky.sharepoint.anon.DataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IPropertyType extends js.Object {
  var ID: String = js.native
  def BeginValidateNormalizeConvert(
    recordKey: Double,
    fieldKey: String,
    newValue: js.Any,
    bIsLocalized: Boolean,
    fnCallback: js.Function1[/* args */ DataValue, Unit],
    fnError: js.Any
  ): Unit = js.native
}

object IPropertyType {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit,
    ID: String
  ): IPropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyType]
  }
  @scala.inline
  implicit class IPropertyTypeOps[Self <: IPropertyType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginValidateNormalizeConvert(value: (Double, String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginValidateNormalizeConvert")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

