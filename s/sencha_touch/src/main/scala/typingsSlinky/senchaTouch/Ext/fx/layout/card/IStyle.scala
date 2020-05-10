package typingsSlinky.senchaTouch.Ext.fx.layout.card

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStyle extends IAbstract {
  /** [Method] Returns the value of inAnimation
  		* @returns Object
  		*/
  var getInAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of outAnimation
  		* @returns Object
  		*/
  var getOutAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of inAnimation
  		* @param inAnimation Object The new value.
  		*/
  var setInAnimation: js.UndefOr[js.Function1[/* inAnimation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of outAnimation
  		* @param outAnimation Object The new value.
  		*/
  var setOutAnimation: js.UndefOr[js.Function1[/* outAnimation */ js.UndefOr[js.Any], Unit]] = js.native
}

object IStyle {
  @scala.inline
  def apply(): IStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStyle]
  }
  @scala.inline
  implicit class IStyleOps[Self <: IStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInAnimation(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOutAnimation(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInAnimation(value: /* inAnimation */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInAnimation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOutAnimation(value: /* outAnimation */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOutAnimation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOutAnimation")(js.undefined)
        ret
    }
  }
  
}

