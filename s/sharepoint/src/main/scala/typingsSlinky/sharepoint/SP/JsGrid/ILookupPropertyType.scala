package typingsSlinky.sharepoint.SP.JsGrid

import typingsSlinky.sharepoint.anon.BLimitToList
import typingsSlinky.sharepoint.anon.DataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait ILookupPropertyType extends IPropertyType {
  def DataToLocalized(dataValue: js.Any): String = js.native
  def GetImageSource(record: IRecord, dataValue: js.Any): String = js.native
  def GetIsLimitedToList(): Boolean = js.native
  def GetItems(fnCallback: js.Any): Unit = js.native
  def GetSerializableLookupPropType(): BLimitToList = js.native
  def GetStyleId(dataValue: js.Any): String = js.native
  def LocalizedToData(localized: String): js.Any = js.native
}

object ILookupPropertyType {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit,
    DataToLocalized: js.Any => String,
    GetImageSource: (IRecord, js.Any) => String,
    GetIsLimitedToList: () => Boolean,
    GetItems: js.Any => Unit,
    GetSerializableLookupPropType: () => BLimitToList,
    GetStyleId: js.Any => String,
    ID: String,
    LocalizedToData: String => js.Any
  ): ILookupPropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetImageSource = js.Any.fromFunction2(GetImageSource), GetIsLimitedToList = js.Any.fromFunction0(GetIsLimitedToList), GetItems = js.Any.fromFunction1(GetItems), GetSerializableLookupPropType = js.Any.fromFunction0(GetSerializableLookupPropType), GetStyleId = js.Any.fromFunction1(GetStyleId), ID = ID.asInstanceOf[js.Any], LocalizedToData = js.Any.fromFunction1(LocalizedToData))
    __obj.asInstanceOf[ILookupPropertyType]
  }
  @scala.inline
  implicit class ILookupPropertyTypeOps[Self <: ILookupPropertyType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataToLocalized(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataToLocalized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetImageSource(value: (IRecord, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetImageSource")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetIsLimitedToList(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetIsLimitedToList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItems(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSerializableLookupPropType(value: () => BLimitToList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSerializableLookupPropType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStyleId(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetStyleId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocalizedToData(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalizedToData")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

