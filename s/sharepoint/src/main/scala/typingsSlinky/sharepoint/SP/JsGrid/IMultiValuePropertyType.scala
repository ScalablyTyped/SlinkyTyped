package typingsSlinky.sharepoint.SP.JsGrid

import typingsSlinky.sharepoint.anon.BDelayInit
import typingsSlinky.sharepoint.anon.DataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IMultiValuePropertyType extends IPropertyType {
  var bMultiValue: Boolean = js.native
  var separator: String = js.native
  var singleValuePropType: String = js.native
  def GetSerializableMultiValuePropType(): BDelayInit = js.native
  def InitSingleValuePropType(): Unit = js.native
  def LocStrArrayToLocStr(locStrArray: js.Array[String]): String = js.native
  def LocStrToLocStrArray(locStr: String): js.Array[String] = js.native
}

object IMultiValuePropertyType {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit,
    GetSerializableMultiValuePropType: () => BDelayInit,
    ID: String,
    InitSingleValuePropType: () => Unit,
    LocStrArrayToLocStr: js.Array[String] => String,
    LocStrToLocStrArray: String => js.Array[String],
    bMultiValue: Boolean,
    separator: String,
    singleValuePropType: String
  ): IMultiValuePropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), GetSerializableMultiValuePropType = js.Any.fromFunction0(GetSerializableMultiValuePropType), ID = ID.asInstanceOf[js.Any], InitSingleValuePropType = js.Any.fromFunction0(InitSingleValuePropType), LocStrArrayToLocStr = js.Any.fromFunction1(LocStrArrayToLocStr), LocStrToLocStrArray = js.Any.fromFunction1(LocStrToLocStrArray), bMultiValue = bMultiValue.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], singleValuePropType = singleValuePropType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiValuePropertyType]
  }
  @scala.inline
  implicit class IMultiValuePropertyTypeOps[Self <: IMultiValuePropertyType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetSerializableMultiValuePropType(value: () => BDelayInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSerializableMultiValuePropType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitSingleValuePropType(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitSingleValuePropType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLocStrArrayToLocStr(value: js.Array[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocStrArrayToLocStr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocStrToLocStrArray(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocStrToLocStrArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBMultiValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bMultiValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleValuePropType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValuePropType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

