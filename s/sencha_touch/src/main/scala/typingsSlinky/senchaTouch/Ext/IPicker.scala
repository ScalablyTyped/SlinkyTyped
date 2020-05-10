package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPicker extends ISheet {
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Updates the cancelButton configuration
  		* @param config Object
  		* @returns Object
  		*/
  var applyCancelButton: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Updates the doneButton configuration
  		* @param config Object
  		* @returns Object
  		*/
  var applyDoneButton: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (String/Mixed) */
  var cancelButton: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Mixed) */
  var doneButton: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of bottom
  		* @returns Number
  		*/
  @JSName("getBottom")
  var getBottom_IPicker: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of cancelButton
  		* @returns String/Mixed
  		*/
  var getCancelButton: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of activeItem
  		* @returns Object/String/Number
  		*/
  var getCard: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of doneButton
  		* @returns String/Mixed
  		*/
  var getDoneButton: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of slots
  		* @returns Array
  		*/
  var getSlots: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of toolbar
  		* @returns Ext.TitleBar/Ext.Toolbar/Object
  		*/
  var getToolbar: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of toolbarPosition
  		* @returns String
  		*/
  var getToolbarPosition: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of useTitles
  		* @returns Boolean
  		*/
  var getUseTitles: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the values of each of the pickers slots
  		* @param useDom Object
  		* @returns Object The values of the pickers slots
  		*/
  var getValue: js.UndefOr[js.Function1[/* useDom */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the values of each of the pickers slots
  		* @returns Object The values of the pickers slots.
  		*/
  var getValues: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  @JSName("height")
  var height_IPicker: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of bottom
  		* @param bottom Number The new value.
  		*/
  @JSName("setBottom")
  var setBottom_IPicker: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of cancelButton
  		* @param cancelButton String/Mixed The new value.
  		*/
  var setCancelButton: js.UndefOr[js.Function1[/* cancelButton */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of activeItem
  		* @param activeItem Object/String/Number The new value.
  		*/
  var setCard: js.UndefOr[js.Function1[/* activeItem */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of doneButton
  		* @param doneButton String/Mixed The new value.
  		*/
  var setDoneButton: js.UndefOr[js.Function1[/* doneButton */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of height
  		* @param height Number The new value.
  		*/
  @JSName("setHeight")
  var setHeight_IPicker: js.UndefOr[js.Function1[/* height */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of left
  		* @param left Number The new value.
  		*/
  @JSName("setLeft")
  var setLeft_IPicker: js.UndefOr[js.Function1[/* left */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of right
  		* @param right Number The new value.
  		*/
  @JSName("setRight")
  var setRight_IPicker: js.UndefOr[js.Function1[/* right */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of slots
  		* @param slots Array The new value.
  		*/
  var setSlots: js.UndefOr[js.Function1[/* slots */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of toolbar
  		* @param toolbar Ext.TitleBar/Ext.Toolbar/Object The new value.
  		*/
  var setToolbar: js.UndefOr[js.Function1[/* toolbar */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of toolbarPosition
  		* @param toolbarPosition String The new value.
  		*/
  var setToolbarPosition: js.UndefOr[js.Function1[/* toolbarPosition */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of useTitles
  		* @param useTitles Boolean The new value.
  		*/
  var setUseTitles: js.UndefOr[js.Function1[/* useTitles */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the values of the pickers slots
  		* @param values Object The values in a {name:'value'} format.
  		* @param animated Boolean true to animate setting the values.
  		* @returns Ext.Picker this This picker.
  		*/
  var setValue: js.UndefOr[
    js.Function2[/* values */ js.UndefOr[js.Any], /* animated */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Config Option] (Array) */
  var slots: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.TitleBar/Ext.Toolbar/Object) */
  var toolbar: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var useTitles: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/Number) */
  var value: js.UndefOr[js.Any] = js.native
}

object IPicker {
  @scala.inline
  def apply(): IPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPicker]
  }
  @scala.inline
  implicit class IPickerOps[Self <: IPicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCls")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyCancelButton(value: /* config */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyCancelButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyCancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyDoneButton(value: /* config */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyDoneButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyDoneButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyDoneButton")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButton(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withDoneButton(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoneButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneButton")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBottom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCancelButton(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCancelButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCard(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCard")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCard")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDoneButton(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDoneButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDoneButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDoneButton")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLayout(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSlots(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSlots")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSlots")(js.undefined)
        ret
    }
    @scala.inline
    def withGetToolbar(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToolbar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withGetToolbarPosition(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToolbarPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetToolbarPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToolbarPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseTitles(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseTitles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseTitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseTitles")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: /* useDom */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValues(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBottom(value: /* bottom */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCancelButton(value: /* cancelButton */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCancelButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCard(value: /* activeItem */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCard")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDoneButton(value: /* doneButton */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDoneButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDoneButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDoneButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeight(value: /* height */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLeft(value: /* left */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRight(value: /* right */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSlots(value: /* slots */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSlots")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSlots")(js.undefined)
        ret
    }
    @scala.inline
    def withSetToolbar(value: /* toolbar */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToolbar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withSetToolbarPosition(value: /* toolbarPosition */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToolbarPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetToolbarPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToolbarPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseTitles(value: /* useTitles */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseTitles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseTitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseTitles")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: (/* values */ js.UndefOr[js.Any], /* animated */ js.UndefOr[Boolean]) => IPicker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSlots(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTitles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTitles")(js.undefined)
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

