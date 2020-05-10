package typingsSlinky.senchaTouch.Ext.fx.layout.card

import typingsSlinky.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IEvented {
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of duration
  		* @returns Object
  		*/
  var getDuration: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of reverse
  		* @returns Object
  		*/
  var getReverse: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of duration
  		* @param duration Object The new value.
  		*/
  var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of layout
  		* @param layout Object The new value.
  		*/
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of reverse
  		* @param reverse Object The new value.
  		*/
  var setReverse: js.UndefOr[js.Function1[/* reverse */ js.UndefOr[js.Any], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDirection(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDuration(value: () => _): Self = {
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
    def withGetReverse(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDuration(value: /* duration */ js.UndefOr[js.Any] => Unit): Self = {
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
    @scala.inline
    def withSetLayout(value: /* layout */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReverse(value: /* reverse */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReverse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReverse")(js.undefined)
        ret
    }
  }
  
}

