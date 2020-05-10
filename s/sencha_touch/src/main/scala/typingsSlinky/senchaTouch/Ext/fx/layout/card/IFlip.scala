package typingsSlinky.senchaTouch.Ext.fx.layout.card

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFlip extends IStyle {
  /** [Method] Returns the value of duration
  		* @returns Number
  		*/
  @JSName("getDuration")
  var getDuration_IFlip: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of duration
  		* @param duration Number The new value.
  		*/
  @JSName("setDuration")
  var setDuration_IFlip: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.native
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
    def withGetDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDuration")(js.undefined)
        ret
    }
  }
  
}

