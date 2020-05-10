package typingsSlinky.senchaTouch.Ext.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpinner extends INumber {
  /** [Config Option] (Boolean) */
  var accelerateOnTapHold: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var cycle: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var defaultValue: js.UndefOr[Double] = js.native
  /** [Method] Returns the value of accelerateOnTapHold
  		* @returns Boolean
  		*/
  var getAccelerateOnTapHold: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_ISpinner: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of cycle
  		* @returns Boolean
  		*/
  var getCycle: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of defaultValue
  		* @returns Number
  		*/
  var getDefaultValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of groupButtons
  		* @returns Boolean
  		*/
  var getGroupButtons: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var groupButtons: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var increment: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var incrementValue: js.UndefOr[String] = js.native
  /** [Method] Sets the value of accelerateOnTapHold
  		* @param accelerateOnTapHold Boolean The new value.
  		*/
  var setAccelerateOnTapHold: js.UndefOr[js.Function1[/* accelerateOnTapHold */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_ISpinner: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of cycle
  		* @param cycle Boolean The new value.
  		*/
  var setCycle: js.UndefOr[js.Function1[/* cycle */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of defaultValue
  		* @param defaultValue Number The new value.
  		*/
  var setDefaultValue: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of groupButtons
  		* @param groupButtons Boolean The new value.
  		*/
  var setGroupButtons: js.UndefOr[js.Function1[/* groupButtons */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Updates the component configuration
  		* @param newComponent Object
  		*/
  var updateComponent: js.UndefOr[js.Function1[/* newComponent */ js.UndefOr[js.Any], Unit]] = js.native
}

object ISpinner {
  @scala.inline
  def apply(): ISpinner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpinner]
  }
  @scala.inline
  implicit class ISpinnerOps[Self <: ISpinner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerateOnTapHold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerateOnTapHold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerateOnTapHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerateOnTapHold")(js.undefined)
        ret
    }
    @scala.inline
    def withCycle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cycle")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAccelerateOnTapHold(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccelerateOnTapHold")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAccelerateOnTapHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccelerateOnTapHold")(js.undefined)
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
    def withGetCycle(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCycle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCycle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGroupButtons(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupButtons")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGroupButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAccelerateOnTapHold(value: /* accelerateOnTapHold */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccelerateOnTapHold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAccelerateOnTapHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccelerateOnTapHold")(js.undefined)
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
    def withSetCycle(value: /* cycle */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCycle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCycle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultValue(value: /* defaultValue */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGroupButtons(value: /* groupButtons */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupButtons")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGroupButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateComponent(value: /* newComponent */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateComponent")(js.undefined)
        ret
    }
  }
  
}

