package typingsSlinky.senchaTouch.Ext.field

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelect extends IText {
  /** [Config Option] (Boolean) */
  var autoSelect: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var defaultPhonePickerConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var defaultTabletPickerConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Number) */
  var displayField: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of autoSelect
  		* @returns Boolean
  		*/
  var getAutoSelect: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of defaultPhonePickerConfig
  		* @returns Object
  		*/
  var getDefaultPhonePickerConfig: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of defaultTabletPickerConfig
  		* @returns Object
  		*/
  var getDefaultTabletPickerConfig: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of displayField
  		* @returns String/Number
  		*/
  var getDisplayField: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of hiddenName
  		* @returns String
  		*/
  var getHiddenName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of options
  		* @returns Array
  		*/
  var getOptions: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of store
  		* @returns Ext.data.Store/Object/String
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of usePicker
  		* @returns String/Boolean
  		*/
  var getUsePicker: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of valueField
  		* @returns String/Number
  		*/
  var getValueField: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String) */
  var hiddenName: js.UndefOr[String] = js.native
  /** [Method] Called when the internal store s data has changed
  		* @param store Object
  		*/
  var onStoreDataChanged: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Array) */
  var options: js.UndefOr[Array] = js.native
  /** [Method] Sets the value of autoSelect
  		* @param autoSelect Boolean The new value.
  		*/
  var setAutoSelect: js.UndefOr[js.Function1[/* autoSelect */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of defaultPhonePickerConfig
  		* @param defaultPhonePickerConfig Object The new value.
  		*/
  var setDefaultPhonePickerConfig: js.UndefOr[js.Function1[/* defaultPhonePickerConfig */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of defaultTabletPickerConfig
  		* @param defaultTabletPickerConfig Object The new value.
  		*/
  var setDefaultTabletPickerConfig: js.UndefOr[js.Function1[/* defaultTabletPickerConfig */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of displayField
  		* @param displayField String/Number The new value.
  		*/
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of hiddenName
  		* @param hiddenName String The new value.
  		*/
  var setHiddenName: js.UndefOr[js.Function1[/* hiddenName */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of options
  		* @param options Array The new value.
  		*/
  var setOptions: js.UndefOr[js.Function1[/* options */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of store
  		* @param store Ext.data.Store/Object/String The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of usePicker
  		* @param usePicker String/Boolean The new value.
  		*/
  var setUsePicker: js.UndefOr[js.Function1[/* usePicker */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of valueField
  		* @param valueField String/Number The new value.
  		*/
  var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Shows the picker for the select field whether that is a Ext picker Picker or a simple list  */
  var showPicker: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Ext.data.Store/Object/String) */
  var store: js.UndefOr[js.Any] = js.native
  /** [Method] Updates the underlying lt options gt list with new values
  		* @param newOptions Array An array of options configurations to insert or append. selectBox.setOptions([  {text: 'First Option', value: 'first'},  {text: 'Second Option', value: 'second'},  {text: 'Third Option', value: 'third'} ]).setValue('third');  Note: option object member names should correspond with defined valueField and displayField values.
  		* @returns Ext.field.Select this
  		*/
  var updateOptions: js.UndefOr[js.Function1[/* newOptions */ js.UndefOr[Array], this.type]] = js.native
  /** [Config Option] (String/Boolean) */
  var usePicker: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Number) */
  var valueField: js.UndefOr[js.Any] = js.native
}

object ISelect {
  @scala.inline
  def apply(): ISelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISelect]
  }
  @scala.inline
  implicit class ISelectOps[Self <: ISelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPhonePickerConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPhonePickerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPhonePickerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPhonePickerConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTabletPickerConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTabletPickerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTabletPickerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTabletPickerConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayField(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoSelect(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoSelect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultPhonePickerConfig(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultPhonePickerConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultPhonePickerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultPhonePickerConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultTabletPickerConfig(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultTabletPickerConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultTabletPickerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultTabletPickerConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDisplayField(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHiddenName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHiddenName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHiddenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHiddenName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOptions(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStore(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUsePicker(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsePicker")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUsePicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsePicker")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValueField(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueField")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStoreDataChanged(value: /* store */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStoreDataChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStoreDataChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStoreDataChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoSelect(value: /* autoSelect */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultPhonePickerConfig(value: /* defaultPhonePickerConfig */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultPhonePickerConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultPhonePickerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultPhonePickerConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultTabletPickerConfig(value: /* defaultTabletPickerConfig */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultTabletPickerConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultTabletPickerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultTabletPickerConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisplayField(value: /* displayField */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisplayField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisplayField")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHiddenName(value: /* hiddenName */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHiddenName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHiddenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHiddenName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOptions(value: /* options */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStore")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUsePicker(value: /* usePicker */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUsePicker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUsePicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUsePicker")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValueField(value: /* valueField */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueField")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPicker(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPicker")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShowPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPicker")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOptions(value: /* newOptions */ js.UndefOr[Array] => ISelect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePicker(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePicker")(js.undefined)
        ret
    }
    @scala.inline
    def withValueField(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(js.undefined)
        ret
    }
  }
  
}

