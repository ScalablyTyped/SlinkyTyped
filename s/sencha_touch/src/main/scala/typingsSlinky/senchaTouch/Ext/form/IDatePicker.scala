package typingsSlinky.senchaTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePicker
  extends typingsSlinky.senchaTouch.Ext.field.ISelect {
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var destroyPickerOnHide: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of dateFormat
  		* @returns String
  		*/
  var getDateFormat: js.UndefOr[js.Function0[String]] = js.native
  /** [Method]  */
  var getDatePicker: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of destroyPickerOnHide
  		* @returns Boolean
  		*/
  var getDestroyPickerOnHide: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of the field formatted using the specified format
  		* @param format String The format to be returned.
  		* @returns String The formatted date.
  		*/
  var getFormattedValue: js.UndefOr[js.Function1[/* format */ js.UndefOr[String], String]] = js.native
  /** [Method] Override this or change event will be fired twice  */
  var onChange: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object/Ext.picker.Date) */
  var picker: js.UndefOr[js.Any] = js.native
  /** [Method] Resets the Select field to the value of the first record in the store
  		* @returns Ext.field.Select this
  		*/
  @JSName("reset")
  var reset_IDatePicker: js.UndefOr[js.Function0[typingsSlinky.senchaTouch.Ext.field.ISelect]] = js.native
  /** [Method] Sets the value of dateFormat
  		* @param dateFormat String The new value.
  		*/
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of destroyPickerOnHide
  		* @param destroyPickerOnHide Boolean The new value.
  		*/
  var setDestroyPickerOnHide: js.UndefOr[js.Function1[/* destroyPickerOnHide */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of picker
  		* @param picker Object/Ext.picker.Date The new value.
  		*/
  var setPicker: js.UndefOr[js.Function1[/* picker */ js.UndefOr[js.Any], Unit]] = js.native
}

object IDatePicker {
  @scala.inline
  def apply(): IDatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePicker]
  }
  @scala.inline
  implicit class IDatePickerOps[Self <: IDatePicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyPickerOnHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyPickerOnHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyPickerOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyPickerOnHide")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDateFormat(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDatePicker(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatePicker")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDatePicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatePicker")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDestroyPickerOnHide(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDestroyPickerOnHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDestroyPickerOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDestroyPickerOnHide")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFormattedValue(value: /* format */ js.UndefOr[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattedValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetFormattedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPicker(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: () => typingsSlinky.senchaTouch.Ext.field.ISelect): Self = {
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
    def withSetDateFormat(value: /* dateFormat */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDateFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDestroyPickerOnHide(value: /* destroyPickerOnHide */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDestroyPickerOnHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDestroyPickerOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDestroyPickerOnHide")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPicker(value: /* picker */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPicker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPicker")(js.undefined)
        ret
    }
  }
  
}

