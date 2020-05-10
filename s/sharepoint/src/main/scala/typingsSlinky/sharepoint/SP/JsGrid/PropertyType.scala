package typingsSlinky.sharepoint.SP.JsGrid

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType")
@js.native
class PropertyType () extends js.Object

/* static members */
@JSGlobal("SP.JsGrid.PropertyType")
@js.native
object PropertyType extends js.Object {
  @js.native
  class CheckBoxBoolean () extends IPropertyType {
    def DataToLocalized(dataValue: js.Any): java.lang.String = js.native
    def GetBool(dataValue: js.Any): Boolean = js.native
  }
  
  @js.native
  class DropDownBoolean () extends IPropertyType {
    def DataToLocalized(dataValue: js.Any): java.lang.String = js.native
    def GetBool(dataValue: js.Any): Boolean = js.native
  }
  
  @js.native
  class HyperLink () extends IPropertyType {
    var bHyperlink: Boolean = js.native
    def DataToLocalized(dataValue: js.Any): java.lang.String = js.native
    def GetAddress(dataValue: js.Any): java.lang.String = js.native
    /** Returns string like this: '"http:// site.com, Site title"' */
    def GetCopyValue(record: IRecord, dataValue: js.Any, locValue: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  class LookupTable protected () extends ILookupPropertyType {
    def this(items: js.Array[_], id: java.lang.String, bLimitToList: Boolean) = this()
  }
  
  @js.native
  class MultiValuePropType () extends IMultiValuePropertyType
  
  @js.native
  class String () extends IPropertyType
  
  @js.native
  class Utils () extends js.Object
  
  /** Register a custom property type. */
  def RegisterNewCustomPropType(
    propType: IPropertyType,
    displayCtrlName: java.lang.String,
    editControlName: java.lang.String,
    widgetControlNames: js.Array[java.lang.String]
  ): Unit = js.native
  /** Register a custom property type, where display and edit controls, and also widgets, are derived from the specified parent property type. */
  def RegisterNewDerivedCustomPropType(propType: IPropertyType, baseTypeName: java.lang.String): Unit = js.native
  /** Lookup property type factory, based on SP.JsGrid.PropertyType.LookupTable class.
    displayCtrlName should be one of the following: SP.JsGrid.DisplayControl.Type.Image, SP.JsGrid.DisplayControl.Type.ImageText or SP.JsGrid.DisplayControl.Type.Text
    */
  def RegisterNewLookupPropType(id: java.lang.String, items: js.Array[_], displayCtrlName: java.lang.String, bLimitToList: Boolean): Unit = js.native
  /* static members */
  @js.native
  object Utils extends js.Object {
    def RegisterDisplayControl(name: java.lang.String, singleton: js.Any, requiredFunctionNames: js.Array[java.lang.String]): Unit = js.native
    def RegisterEditControl(
      name: java.lang.String,
      factory: js.Function2[
          /* gridContext */ IEditControlGridContext, 
          /* gridTextInputElement */ HTMLElement, 
          IEditControl
        ],
      requiredFunctionNames: js.Array[java.lang.String]
    ): Unit = js.native
    def RegisterWidgetControl(
      name: java.lang.String,
      factory: js.Function1[/* ddContext */ js.Any, IPropertyType],
      requiredFunctionNames: js.Array[java.lang.String]
    ): Unit = js.native
    def UpdateDisplayControlForPropType(propTypeName: java.lang.String, displayControlType: java.lang.String): Unit = js.native
  }
  
}

