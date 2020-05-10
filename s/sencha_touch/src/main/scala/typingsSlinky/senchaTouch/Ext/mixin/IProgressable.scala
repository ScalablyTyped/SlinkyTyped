package typingsSlinky.senchaTouch.Ext.mixin

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgressable extends IBase {
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of dynamic
  		* @returns Boolean
  		*/
  var getDynamic: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of maxProgressInput
  		* @returns Number
  		*/
  var getMaxProgressInput: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maxProgressOutput
  		* @returns Number
  		*/
  var getMaxProgressOutput: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minProgressInput
  		* @returns Number
  		*/
  var getMinProgressInput: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minProgressOutput
  		* @returns Number
  		*/
  var getMinProgressOutput: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of state
  		* @returns String
  		*/
  var getState: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Number) */
  var maxProgressInput: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxProgressOutput: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minProgressInput: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minProgressOutput: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of dynamic
  		* @param dynamic Boolean The new value.
  		*/
  var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of maxProgressInput
  		* @param maxProgressInput Number The new value.
  		*/
  var setMaxProgressInput: js.UndefOr[js.Function1[/* maxProgressInput */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maxProgressOutput
  		* @param maxProgressOutput Number The new value.
  		*/
  var setMaxProgressOutput: js.UndefOr[js.Function1[/* maxProgressOutput */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minProgressInput
  		* @param minProgressInput Number The new value.
  		*/
  var setMinProgressInput: js.UndefOr[js.Function1[/* minProgressInput */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minProgressOutput
  		* @param minProgressOutput Number The new value.
  		*/
  var setMinProgressOutput: js.UndefOr[js.Function1[/* minProgressOutput */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of state
  		* @param state String The new value.
  		*/
  var setState: js.UndefOr[js.Function1[/* state */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var state: js.UndefOr[String] = js.native
}

object IProgressable {
  @scala.inline
  def apply(): IProgressable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressable]
  }
  @scala.inline
  implicit class IProgressableOps[Self <: IProgressable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDynamic(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDynamic")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDynamic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDynamic")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxProgressInput(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxProgressInput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxProgressInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxProgressInput")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxProgressOutput(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxProgressOutput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxProgressOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxProgressOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinProgressInput(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinProgressInput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinProgressInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinProgressInput")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinProgressOutput(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinProgressOutput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinProgressOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinProgressOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withGetState(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxProgressInput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProgressInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxProgressInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProgressInput")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxProgressOutput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProgressOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxProgressOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProgressOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withMinProgressInput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProgressInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinProgressInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProgressInput")(js.undefined)
        ret
    }
    @scala.inline
    def withMinProgressOutput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProgressOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinProgressOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProgressOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDynamic(value: /* dynamic */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDynamic")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDynamic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDynamic")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxProgressInput(value: /* maxProgressInput */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxProgressInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxProgressInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxProgressInput")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxProgressOutput(value: /* maxProgressOutput */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxProgressOutput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxProgressOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxProgressOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinProgressInput(value: /* minProgressInput */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinProgressInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinProgressInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinProgressInput")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinProgressOutput(value: /* minProgressOutput */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinProgressOutput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinProgressOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinProgressOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withSetState(value: /* state */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

