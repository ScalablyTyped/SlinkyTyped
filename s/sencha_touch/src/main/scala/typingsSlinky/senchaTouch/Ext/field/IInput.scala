package typingsSlinky.senchaTouch.Ext.field

import typingsSlinky.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInput extends IComponent {
  /** [Config Option] (Boolean) */
  var autoCapitalize: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoComplete: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoCorrect: js.UndefOr[Boolean] = js.native
  /** [Method] Attempts to forcefully blur input focus for the field
  		* @returns Ext.field.Input this
  		*/
  var blur: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IInput: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var fastFocus: js.UndefOr[Boolean] = js.native
  /** [Method] Attempts to set the field as the active input focus
  		* @returns Ext.field.Input this
  		*/
  var focus: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[String] = js.native
  /** [Method] Returns the value of autoCapitalize
  		* @returns Boolean
  		*/
  var getAutoCapitalize: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of autoComplete
  		* @returns Boolean
  		*/
  var getAutoComplete: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of autoCorrect
  		* @returns Boolean
  		*/
  var getAutoCorrect: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the checked value of this field
  		* @returns Mixed value The field value
  		*/
  var getChecked: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_IInput: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of fastFocus
  		* @returns Boolean
  		*/
  var getFastFocus: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of focusCls
  		* @returns String
  		*/
  var getFocusCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of maxLength
  		* @returns Number
  		*/
  var getMaxLength: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maxRows
  		* @returns Number
  		*/
  var getMaxRows: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maxValue
  		* @returns Number
  		*/
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minValue
  		* @returns Number
  		*/
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of pattern
  		* @returns String
  		*/
  var getPattern: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of placeHolder
  		* @returns String
  		*/
  var getPlaceHolder: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of startValue
  		* @returns Mixed
  		*/
  var getStartValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of stepValue
  		* @returns Number
  		*/
  var getStepValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of tabIndex
  		* @returns Number
  		*/
  var getTabIndex: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of type
  		* @returns String
  		*/
  var getType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the field data value
  		* @returns Mixed value The field value.
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns true if the value of this Field has been changed from its original value
  		* @returns Boolean
  		*/
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Property] (Boolean) */
  var isFocused: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var pattern: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var placeHolder: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** [Method] Resets the current field value to the original value  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Attempts to forcefully select all the contents of the input field
  		* @returns Ext.field.Input this
  		*/
  var select: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Sets the value of autoCapitalize
  		* @param autoCapitalize Boolean The new value.
  		*/
  var setAutoCapitalize: js.UndefOr[js.Function1[/* autoCapitalize */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of autoComplete
  		* @param autoComplete Boolean The new value.
  		*/
  var setAutoComplete: js.UndefOr[js.Function1[/* autoComplete */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of autoCorrect
  		* @param autoCorrect Boolean The new value.
  		*/
  var setAutoCorrect: js.UndefOr[js.Function1[/* autoCorrect */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_IInput: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of fastFocus
  		* @param fastFocus Boolean The new value.
  		*/
  var setFastFocus: js.UndefOr[js.Function1[/* fastFocus */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of focusCls
  		* @param focusCls String The new value.
  		*/
  var setFocusCls: js.UndefOr[js.Function1[/* focusCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of maxLength
  		* @param maxLength Number The new value.
  		*/
  var setMaxLength: js.UndefOr[js.Function1[/* maxLength */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maxRows
  		* @param maxRows Number The new value.
  		*/
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maxValue
  		* @param maxValue Number The new value.
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minValue
  		* @param minValue Number The new value.
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of pattern
  		* @param pattern String The new value.
  		*/
  var setPattern: js.UndefOr[js.Function1[/* pattern */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of placeHolder
  		* @param placeHolder String The new value.
  		*/
  var setPlaceHolder: js.UndefOr[js.Function1[/* placeHolder */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of startValue
  		* @param startValue Mixed The new value.
  		*/
  var setStartValue: js.UndefOr[js.Function1[/* startValue */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of stepValue
  		* @param stepValue Number The new value.
  		*/
  var setStepValue: js.UndefOr[js.Function1[/* stepValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of tabIndex
  		* @param tabIndex Number The new value.
  		*/
  var setTabIndex: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of type
  		* @param type String The new value.
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Mixed) */
  var startValue: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var stepValue: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
  /** [Method] Updates the cls configuration
  		* @param newCls Object
  		* @param oldCls Object
  		*/
  var updateCls: js.UndefOr[
    js.Function2[/* newCls */ js.UndefOr[js.Any], /* oldCls */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Updates the useMask configuration
  		* @param newUseMask Object
  		*/
  var updateUseMask: js.UndefOr[js.Function1[/* newUseMask */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[js.Any] = js.native
}

object IInput {
  @scala.inline
  def apply(): IInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInput]
  }
  @scala.inline
  implicit class IInputOps[Self <: IInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCapitalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCorrect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withBlur(value: () => IInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(js.undefined)
        ret
    }
    @scala.inline
    def withFastFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: () => IInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoCapitalize(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoCapitalize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoCapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoCapitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoComplete(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoCorrect(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoCorrect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoCorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoCorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withGetChecked(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFastFocus(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFastFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFastFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFastFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFocusCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocusCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFocusCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocusCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxRows(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPattern(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPattern")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPlaceHolder(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlaceHolder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlaceHolder")(js.undefined)
        ret
    }
    @scala.inline
    def withGetReadOnly(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReadOnly")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStartValue(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStartValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStepValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStepValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStepValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStepValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTabIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDirty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceHolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: () => IInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoCapitalize(value: /* autoCapitalize */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoCapitalize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoCapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoCapitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoComplete(value: /* autoComplete */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoCorrect(value: /* autoCorrect */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoCorrect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoCorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoCorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFastFocus(value: /* fastFocus */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFastFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFastFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFastFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFocusCls(value: /* focusCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFocusCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFocusCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFocusCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxLength(value: /* maxLength */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxRows(value: /* maxRows */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxRows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxValue(value: /* maxValue */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinValue(value: /* minValue */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetName(value: /* name */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPattern(value: /* pattern */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPlaceHolder(value: /* placeHolder */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPlaceHolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPlaceHolder")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReadOnly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStartValue(value: /* startValue */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStartValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStepValue(value: /* stepValue */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStepValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStepValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStepValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTabIndex(value: /* tabIndex */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTabIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSetType(value: /* type */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setType")(js.undefined)
        ret
    }
    @scala.inline
    def withStartValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStepValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateCls(value: (/* newCls */ js.UndefOr[js.Any], /* oldCls */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCls")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCls")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateUseMask(value: /* newUseMask */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUseMask")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateUseMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUseMask")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

