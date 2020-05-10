package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISheet extends IPanel {
  /** [Config Option] (String) */
  var enter: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var exit: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the value of enter
  		* @returns String
  		*/
  var getEnter: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of exit
  		* @returns String
  		*/
  var getExit: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of stretchX
  		* @returns Boolean
  		*/
  var getStretchX: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of stretchY
  		* @returns Boolean
  		*/
  var getStretchY: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Sets the value of enter
  		* @param enter String The new value.
  		*/
  var setEnter: js.UndefOr[js.Function1[/* enter */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of exit
  		* @param exit String The new value.
  		*/
  var setExit: js.UndefOr[js.Function1[/* exit */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of stretchX
  		* @param stretchX Boolean The new value.
  		*/
  var setStretchX: js.UndefOr[js.Function1[/* stretchX */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of stretchY
  		* @param stretchY Boolean The new value.
  		*/
  var setStretchY: js.UndefOr[js.Function1[/* stretchY */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var stretchX: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var stretchY: js.UndefOr[Boolean] = js.native
}

object ISheet {
  @scala.inline
  def apply(): ISheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISheet]
  }
  @scala.inline
  implicit class ISheetOps[Self <: ISheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnter(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withExit(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEnter(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetExit(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExit")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStretchX(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStretchX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStretchX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStretchX")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStretchY(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStretchY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStretchY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStretchY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEnter(value: /* enter */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withSetExit(value: /* exit */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExit")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStretchX(value: /* stretchX */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStretchX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStretchX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStretchX")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStretchY(value: /* stretchY */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStretchY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStretchY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStretchY")(js.undefined)
        ret
    }
    @scala.inline
    def withStretchX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretchX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchX")(js.undefined)
        ret
    }
    @scala.inline
    def withStretchY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretchY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchY")(js.undefined)
        ret
    }
  }
  
}

