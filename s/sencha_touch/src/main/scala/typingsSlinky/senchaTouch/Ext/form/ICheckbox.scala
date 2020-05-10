package typingsSlinky.senchaTouch.Ext.form

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckbox
  extends typingsSlinky.senchaTouch.Ext.field.IField {
  /** [Method] Set the checked state of the checkbox to true
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var check: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.native
  /** [Method] Method called when this Ext field Checkbox has been checked  */
  var doChecked: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Method called when this Ext field Checkbox has been unchecked  */
  var doUnChecked: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the field checked value
  		* @returns Mixed The field value.
  		*/
  var getChecked: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns an array of values from the checkboxes in the group that are checked
  		* @returns Array
  		*/
  var getGroupValues: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the submit value for the checkbox which can be used when submitting forms
  		* @returns Boolean/String value The value of value or true, if checked.
  		*/
  var getSubmitValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of value
  		* @returns String
  		*/
  @JSName("getValue")
  var getValue_ICheckbox: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the checked state of the checkbox
  		* @returns Boolean true if checked, false otherwise.
  		*/
  var isChecked: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Resets the status of all matched checkboxes in the same group to checked
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var resetGroupValues: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Resets the current field value back to the original value on this field when it was created
  		* @returns Ext.field.Field this
  		*/
  @JSName("reset")
  var reset_ICheckbox: js.UndefOr[js.Function0[typingsSlinky.senchaTouch.Ext.field.IField]] = js.native
  /** [Method] Set the status of all matched checkboxes in the same group to checked
  		* @param values Array An array of values.
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var setGroupValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[Array], this.type]] = js.native
  /** [Method] Sets the value of value
  		* @param value String The new value.
  		*/
  @JSName("setValue")
  var setValue_ICheckbox: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Set the checked state of the checkbox to false
  		* @returns Ext.field.Checkbox This checkbox.
  		*/
  var uncheck: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (String) */
  @JSName("value")
  var value_ICheckbox: js.UndefOr[String] = js.native
}

object ICheckbox {
  @scala.inline
  def apply(): ICheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckbox]
  }
  @scala.inline
  implicit class ICheckboxOps[Self <: ICheckbox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheck(value: () => ICheckbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.undefined)
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
    def withDoChecked(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doChecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDoChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withDoUnChecked(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doUnChecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDoUnChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doUnChecked")(js.undefined)
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
    def withGetGroupValues(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGroupValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupValues")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSubmitValue(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmitValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSubmitValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmitValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: () => String): Self = {
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
    def withIsChecked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: () => typingsSlinky.senchaTouch.Ext.field.IField): Self = {
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
    def withResetGroupValues(value: () => ICheckbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetGroupValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResetGroupValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetGroupValues")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGroupValues(value: /* values */ js.UndefOr[Array] => ICheckbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupValues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGroupValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupValues")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: /* value */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
    @scala.inline
    def withUncheck(value: () => ICheckbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheck")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUncheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheck")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
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

