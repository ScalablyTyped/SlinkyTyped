package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISegmentedButton extends IContainer {
  /** [Config Option] (Boolean) */
  var allowDepress: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var allowMultiple: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var allowToggle: js.UndefOr[Boolean] = js.native
  /** [Method] We override initItems so we can check for the pressed config  */
  var applyItems: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of allowDepress
  		* @returns Boolean
  		*/
  var getAllowDepress: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of allowMultiple
  		* @returns Boolean
  		*/
  var getAllowMultiple: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of allowToggle
  		* @returns Boolean
  		*/
  var getAllowToggle: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the currently pressed button s */
  var getPressed: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of pressedButtons
  		* @returns Array
  		*/
  var getPressedButtons: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of pressedCls
  		* @returns String
  		*/
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns true if a specified Ext Button is pressed
  		* @param button Ext.Button The button to check if pressed.
  		* @returns Boolean pressed
  		*/
  var isPressed: js.UndefOr[js.Function1[/* button */ js.UndefOr[IButton], Boolean]] = js.native
  /** [Config Option] (Array) */
  var pressedButtons: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of allowDepress
  		* @param allowDepress Boolean The new value.
  		*/
  var setAllowDepress: js.UndefOr[js.Function1[/* allowDepress */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of allowMultiple
  		* @param allowMultiple Boolean The new value.
  		*/
  var setAllowMultiple: js.UndefOr[js.Function1[/* allowMultiple */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of allowToggle
  		* @param allowToggle Boolean The new value.
  		*/
  var setAllowToggle: js.UndefOr[js.Function1[/* allowToggle */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Activates a button
  		* @param button Number/String/Ext.Button The button to activate.
  		* @param pressed Boolean If defined, sets the pressed state of the button, otherwise the pressed state is toggled.
  		* @param suppressEvents Boolean true to suppress toggle events during the action. If allowMultiple is true, then setPressed will toggle the button state.
  		*/
  var setPressed: js.UndefOr[
    js.Function3[
      /* button */ js.UndefOr[js.Any], 
      /* pressed */ js.UndefOr[Boolean], 
      /* suppressEvents */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of pressedButtons
  		* @param pressedButtons Array The new value.
  		*/
  var setPressedButtons: js.UndefOr[js.Function1[/* pressedButtons */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of pressedCls
  		* @param pressedCls String The new value.
  		*/
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], Unit]] = js.native
}

object ISegmentedButton {
  @scala.inline
  def apply(): ISegmentedButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISegmentedButton]
  }
  @scala.inline
  implicit class ISegmentedButtonOps[Self <: ISegmentedButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDepress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDepress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDepress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDepress")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyItems(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutApplyItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAllowDepress(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowDepress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAllowDepress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowDepress")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAllowMultiple(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowMultiple")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAllowMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAllowToggle(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowToggle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAllowToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowToggle")(js.undefined)
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
    def withGetPressed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressed")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPressedButtons(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressedButtons")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPressedButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressedButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPressedCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressedCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPressedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPressed(value: /* button */ js.UndefOr[IButton] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPressed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsPressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPressed")(js.undefined)
        ret
    }
    @scala.inline
    def withPressedButtons(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressedButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withPressedCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAllowDepress(value: /* allowDepress */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowDepress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAllowDepress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowDepress")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAllowMultiple(value: /* allowMultiple */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowMultiple")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAllowMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAllowToggle(value: /* allowToggle */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAllowToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPressed(
      value: (/* button */ js.UndefOr[js.Any], /* pressed */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressed")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetPressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressed")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPressedButtons(value: /* pressedButtons */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressedButtons")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPressedButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressedButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPressedCls(value: /* pressedCls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressedCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPressedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressedCls")(js.undefined)
        ret
    }
  }
  
}

