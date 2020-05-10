package typingsSlinky.senchaTouch.Ext.form

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IText
  extends typingsSlinky.senchaTouch.Ext.field.IField {
  /** [Config Option] (Boolean) */
  var autoCapitalize: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoComplete: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoCorrect: js.UndefOr[Boolean] = js.native
  /** [Method] Attempts to forcefully blur input focus for the field
  		* @returns Ext.field.Text This field
  		*/
  var blur: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Attempts to set the field as the active input focus
  		* @returns Ext.field.Text This field
  		*/
  var focus: js.UndefOr[js.Function0[this.type]] = js.native
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
  /** [Method] Returns the value of maxLength
  		* @returns Number
  		*/
  var getMaxLength: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of placeHolder
  		* @returns String
  		*/
  var getPlaceHolder: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var placeHolder: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** [Method] Resets the current field value back to the original value on this field when it was created
  		* @returns Ext.field.Field this
  		*/
  @JSName("reset")
  var reset_IText: js.UndefOr[js.Function0[typingsSlinky.senchaTouch.Ext.field.IField]] = js.native
  /** [Method] Attempts to forcefully select all the contents of the input field
  		* @returns Ext.field.Text this
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
  /** [Method] Sets the value of bubbleEvents
  		* @param bubbleEvents Array The new value.
  		*/
  @JSName("setBubbleEvents")
  var setBubbleEvents_IText: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of maxLength
  		* @param maxLength Number The new value.
  		*/
  var setMaxLength: js.UndefOr[js.Function1[/* maxLength */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of placeHolder
  		* @param placeHolder String The new value.
  		*/
  var setPlaceHolder: js.UndefOr[js.Function1[/* placeHolder */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Property] (String/Number) */
  var startValue: js.UndefOr[js.Any] = js.native
}

object IText {
  @scala.inline
  def apply(): IText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IText]
  }
  @scala.inline
  implicit class ITextOps[Self <: IText] (val x: Self) extends AnyVal {
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
    def withBlur(value: () => IText): Self = {
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
    def withFocus(value: () => IText): Self = {
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
    def withSelect(value: () => IText): Self = {
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
    def withSetBubbleEvents(value: /* bubbleEvents */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBubbleEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBubbleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBubbleEvents")(js.undefined)
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
  }
  
}

