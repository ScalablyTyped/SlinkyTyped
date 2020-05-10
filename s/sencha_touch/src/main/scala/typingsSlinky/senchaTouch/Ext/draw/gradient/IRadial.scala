package typingsSlinky.senchaTouch.Ext.draw.gradient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRadial extends IGradient {
  /** [Config Option] (Object) */
  var end: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of end
  		* @returns Object
  		*/
  var getEnd: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of start
  		* @returns Object
  		*/
  var getStart: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of end
  		* @param end Object The new value.
  		*/
  var setEnd: js.UndefOr[js.Function1[/* end */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of start
  		* @param start Object The new value.
  		*/
  var setStart: js.UndefOr[js.Function1[/* start */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var start: js.UndefOr[js.Any] = js.native
}

object IRadial {
  @scala.inline
  def apply(): IRadial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadial]
  }
  @scala.inline
  implicit class IRadialOps[Self <: IRadial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEnd(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStart(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEnd(value: /* end */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStart(value: /* start */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStart")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

