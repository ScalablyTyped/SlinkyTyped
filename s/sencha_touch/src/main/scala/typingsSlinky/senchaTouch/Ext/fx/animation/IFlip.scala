package typingsSlinky.senchaTouch.Ext.fx.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFlip extends IAbstract {
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.native
  /** [Method] Returns the value of half
  		* @returns Boolean
  		*/
  var getHalf: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of out
  		* @returns Object
  		*/
  var getOut: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of half
  		* @param half Boolean The new value.
  		*/
  var setHalf: js.UndefOr[js.Function1[/* half */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of out
  		* @param out Object The new value.
  		*/
  var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[js.Any], Unit]] = js.native
}

object IFlip {
  @scala.inline
  def apply(): IFlip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFlip]
  }
  @scala.inline
  implicit class IFlipOps[Self <: IFlip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHalf(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHalf")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHalf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHalf")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOut(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOut")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHalf(value: /* half */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHalf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHalf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHalf")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOut(value: /* out */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOut")(js.undefined)
        ret
    }
  }
  
}

