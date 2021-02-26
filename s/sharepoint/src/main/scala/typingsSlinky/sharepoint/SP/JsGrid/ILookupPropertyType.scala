package typingsSlinky.sharepoint.SP.JsGrid

import typingsSlinky.sharepoint.anon.BLimitToList
import typingsSlinky.sharepoint.anon.DataValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ILookupPropertyTypeMutableBuilder[Self <: ILookupPropertyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataToLocalized(value: js.Any => String): Self = StObject.set(x, "DataToLocalized", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetImageSource(value: (IRecord, js.Any) => String): Self = StObject.set(x, "GetImageSource", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetIsLimitedToList(value: () => Boolean): Self = StObject.set(x, "GetIsLimitedToList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItems(value: js.Any => Unit): Self = StObject.set(x, "GetItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSerializableLookupPropType(value: () => BLimitToList): Self = StObject.set(x, "GetSerializableLookupPropType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStyleId(value: js.Any => String): Self = StObject.set(x, "GetStyleId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocalizedToData(value: String => js.Any): Self = StObject.set(x, "LocalizedToData", js.Any.fromFunction1(value))
  }
}
