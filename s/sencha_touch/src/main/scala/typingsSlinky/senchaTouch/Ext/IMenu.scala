package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenu extends ISheet {
  /** [Method] Only fire the hide event if it is initialized */
  var doSetHidden: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of bottom
  		* @returns Number
  		*/
  @JSName("getBottom")
  var getBottom_IMenu: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of height
  		* @returns String
  		*/
  @JSName("getHeight")
  var getHeight_IMenu: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of left
  		* @returns Number
  		*/
  @JSName("getLeft")
  var getLeft_IMenu: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of right
  		* @returns Number
  		*/
  @JSName("getRight")
  var getRight_IMenu: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of width
  		* @returns String
  		*/
  @JSName("getWidth")
  var getWidth_IMenu: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Sets the value of bottom
  		* @param bottom Number The new value.
  		*/
  @JSName("setBottom")
  var setBottom_IMenu: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of height
  		* @param height String The new value.
  		*/
  @JSName("setHeight")
  var setHeight_IMenu: js.UndefOr[js.Function1[/* height */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of left
  		* @param left Number The new value.
  		*/
  @JSName("setLeft")
  var setLeft_IMenu: js.UndefOr[js.Function1[/* left */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of right
  		* @param right Number The new value.
  		*/
  @JSName("setRight")
  var setRight_IMenu: js.UndefOr[js.Function1[/* right */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of width
  		* @param width String The new value.
  		*/
  @JSName("setWidth")
  var setWidth_IMenu: js.UndefOr[js.Function1[/* width */ js.UndefOr[java.lang.String], Unit]] = js.native
}

object IMenu {
  @scala.inline
  def apply(): IMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenu]
  }
  @scala.inline
  implicit class IMenuOps[Self <: IMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoSetHidden(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doSetHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDoSetHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doSetHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBottom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeight(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLeft(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLeft")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWidth(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBottom(value: /* bottom */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeight(value: /* height */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLeft(value: /* left */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRight(value: /* right */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWidth(value: /* width */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.undefined)
        ret
    }
  }
  
}

