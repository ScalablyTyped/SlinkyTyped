package typingsSlinky.senchaTouch.Ext.fx.easing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMomentum extends IAbstract {
  /** [Method] Returns the value of acceleration
  		* @returns Number
  		*/
  var getAcceleration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of friction
  		* @returns Number
  		*/
  var getFriction: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of startVelocity
  		* @returns Number
  		*/
  var getStartVelocity: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of acceleration
  		* @param acceleration Number The new value.
  		*/
  var setAcceleration: js.UndefOr[js.Function1[/* acceleration */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of friction
  		* @param friction Number The new value.
  		*/
  var setFriction: js.UndefOr[js.Function1[/* friction */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of startVelocity
  		* @param startVelocity Number The new value.
  		*/
  var setStartVelocity: js.UndefOr[js.Function1[/* startVelocity */ js.UndefOr[Double], Unit]] = js.native
}

object IMomentum {
  @scala.inline
  def apply(): IMomentum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMomentum]
  }
  @scala.inline
  implicit class IMomentumOps[Self <: IMomentum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAcceleration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAcceleration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAcceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAcceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFriction(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFriction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFriction")(js.undefined)
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
    def withSetAcceleration(value: /* acceleration */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAcceleration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAcceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAcceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFriction(value: /* friction */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFriction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFriction")(js.undefined)
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
  }
  
}

