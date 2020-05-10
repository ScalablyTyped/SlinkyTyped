package typingsSlinky.senchaTouch.Ext.fx.easing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBoundMomentum extends IAbstract {
  /** [Config Option] (Object) */
  var bounce: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of bounce
  		* @returns Object
  		*/
  var getBounce: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of maxMomentumValue
  		* @returns Number
  		*/
  var getMaxMomentumValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minMomentumValue
  		* @returns Number
  		*/
  var getMinMomentumValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minVelocity
  		* @returns Number
  		*/
  var getMinVelocity: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of momentum
  		* @returns Object
  		*/
  var getMomentum: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of startVelocity
  		* @returns Number
  		*/
  var getStartVelocity: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var minVelocity: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var momentum: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of bounce
  		* @param bounce Object The new value.
  		*/
  var setBounce: js.UndefOr[js.Function1[/* bounce */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of maxMomentumValue
  		* @param maxMomentumValue Number The new value.
  		*/
  var setMaxMomentumValue: js.UndefOr[js.Function1[/* maxMomentumValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minMomentumValue
  		* @param minMomentumValue Number The new value.
  		*/
  var setMinMomentumValue: js.UndefOr[js.Function1[/* minMomentumValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minVelocity
  		* @param minVelocity Number The new value.
  		*/
  var setMinVelocity: js.UndefOr[js.Function1[/* minVelocity */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of momentum
  		* @param momentum Object The new value.
  		*/
  var setMomentum: js.UndefOr[js.Function1[/* momentum */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of startVelocity
  		* @param startVelocity Number The new value.
  		*/
  var setStartVelocity: js.UndefOr[js.Function1[/* startVelocity */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Number) */
  var startVelocity: js.UndefOr[Double] = js.native
}

object IBoundMomentum {
  @scala.inline
  def apply(): IBoundMomentum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoundMomentum]
  }
  @scala.inline
  implicit class IBoundMomentumOps[Self <: IBoundMomentum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounce(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBounce(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBounce")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBounce")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxMomentumValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxMomentumValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxMomentumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxMomentumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinMomentumValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinMomentumValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinMomentumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinMomentumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinVelocity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinVelocity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMomentum(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMomentum")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMomentum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMomentum")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStartVelocity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartVelocity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStartVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withMinVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withMomentum(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMomentum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentum")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBounce(value: /* bounce */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounce")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxMomentumValue(value: /* maxMomentumValue */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxMomentumValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxMomentumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxMomentumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinMomentumValue(value: /* minMomentumValue */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinMomentumValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinMomentumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinMomentumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinVelocity(value: /* minVelocity */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinVelocity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMomentum(value: /* momentum */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMomentum")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMomentum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMomentum")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStartVelocity(value: /* startVelocity */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartVelocity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStartVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withStartVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startVelocity")(js.undefined)
        ret
    }
  }
  
}

