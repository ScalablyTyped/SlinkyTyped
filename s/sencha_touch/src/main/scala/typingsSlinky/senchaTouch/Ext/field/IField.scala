package typingsSlinky.senchaTouch.Ext.field

import typingsSlinky.senchaTouch.Ext.IDecorator
import typingsSlinky.senchaTouch.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IField extends IDecorator {
  /** [Config Option] (Boolean) */
  var clearIcon: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var fieldCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var fieldLabel: js.UndefOr[String] = js.native
  /** [Method] Returns the value of clearIcon
  		* @returns Boolean
  		*/
  var getClearIcon: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of inputCls
  		* @returns String
  		*/
  var getInputCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of inputType
  		* @returns String
  		*/
  var getInputType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of label
  		* @returns String
  		*/
  var getLabel: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of labelAlign
  		* @returns String
  		*/
  var getLabelAlign: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of labelCls
  		* @returns String
  		*/
  var getLabelCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of labelWidth
  		* @returns Number/String
  		*/
  var getLabelWidth: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of labelWrap
  		* @returns Boolean
  		*/
  var getLabelWrap: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of required
  		* @returns Boolean
  		*/
  var getRequired: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of requiredCls
  		* @returns String
  		*/
  var getRequiredCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of tabIndex
  		* @returns Number
  		*/
  var getTabIndex: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of value
  		* @returns Mixed
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String) */
  var inputCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var inputType: js.UndefOr[String] = js.native
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
  		* @returns Boolean true if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Property] (Boolean) */
  var isField: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var label: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var labelAlign: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var labelEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (Number/String) */
  var labelWidth: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var labelWrap: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Property] (Mixed) */
  var originalValue: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var required: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var requiredCls: js.UndefOr[String] = js.native
  /** [Method] Resets the current field value back to the original value on this field when it was created
  		* @returns Ext.field.Field this
  		*/
  var reset: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of clearIcon
  		* @param clearIcon Boolean The new value.
  		*/
  var setClearIcon: js.UndefOr[js.Function1[/* clearIcon */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of inputCls
  		* @param inputCls String The new value.
  		*/
  var setInputCls: js.UndefOr[js.Function1[/* inputCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of inputType
  		* @param inputType String The new value.
  		*/
  var setInputType: js.UndefOr[js.Function1[/* inputType */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of label
  		* @param label String The new value.
  		*/
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of labelAlign
  		* @param labelAlign String The new value.
  		*/
  var setLabelAlign: js.UndefOr[js.Function1[/* labelAlign */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of labelCls
  		* @param labelCls String The new value.
  		*/
  var setLabelCls: js.UndefOr[js.Function1[/* labelCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of labelWidth
  		* @param labelWidth Number/String The new value.
  		*/
  var setLabelWidth: js.UndefOr[js.Function1[/* labelWidth */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of labelWrap
  		* @param labelWrap Boolean The new value.
  		*/
  var setLabelWrap: js.UndefOr[js.Function1[/* labelWrap */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of required
  		* @param required Boolean The new value.
  		*/
  var setRequired: js.UndefOr[js.Function1[/* required */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of requiredCls
  		* @param requiredCls String The new value.
  		*/
  var setRequiredCls: js.UndefOr[js.Function1[/* requiredCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of tabIndex
  		* @param tabIndex Number The new value.
  		*/
  var setTabIndex: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of value
  		* @param value Mixed The new value.
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var useClearIcon: js.UndefOr[String] = js.native
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[js.Any] = js.native
}

object IField {
  @scala.inline
  def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  @scala.inline
  implicit class IFieldOps[Self <: IField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCls")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClearIcon(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClearIcon")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetClearIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClearIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInputCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInputCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInputType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputType")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabel(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabelAlign(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelAlign")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabelAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabelCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabelCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabelWidth(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabelWrap(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelWrap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabelWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelWrap")(js.undefined)
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
    def withGetRequired(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequired")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRequiredCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequiredCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRequiredCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequiredCls")(js.undefined)
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
    def withInputCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputCls")(js.undefined)
        ret
    }
    @scala.inline
    def withInputType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(js.undefined)
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
    def withIsField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isField")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCls")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelEl(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelEl")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrap")(js.undefined)
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
    def withOriginalValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredCls")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: () => IField): Self = {
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
    def withResetOriginalValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOriginalValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResetOriginalValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOriginalValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetClearIcon(value: /* clearIcon */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClearIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetClearIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClearIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInputCls(value: /* inputCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInputCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInputCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInputCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInputType(value: /* inputType */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInputType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInputType")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLabel(value: /* label */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLabelAlign(value: /* labelAlign */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelAlign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLabelAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLabelCls(value: /* labelCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLabelCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLabelWidth(value: /* labelWidth */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLabelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLabelWrap(value: /* labelWrap */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelWrap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLabelWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelWrap")(js.undefined)
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
    def withSetRequired(value: /* required */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequired")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRequiredCls(value: /* requiredCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequiredCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRequiredCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequiredCls")(js.undefined)
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
    def withSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withUseClearIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useClearIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseClearIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useClearIcon")(js.undefined)
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

