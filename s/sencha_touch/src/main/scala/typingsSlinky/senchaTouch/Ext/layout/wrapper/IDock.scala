package typingsSlinky.senchaTouch.Ext.layout.wrapper

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDock extends IBase {
  /** [Method] Returns the value of bodyElement
  		* @returns Object
  		*/
  var getBodyElement: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of container
  		* @returns Object
  		*/
  var getContainer: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of element
  		* @returns Object
  		*/
  var getElement: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of innerWrapper
  		* @returns Object
  		*/
  var getInnerWrapper: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of sizeState
  		* @returns Boolean
  		*/
  var getSizeState: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Sets the value of bodyElement
  		* @param bodyElement Object The new value.
  		*/
  var setBodyElement: js.UndefOr[js.Function1[/* bodyElement */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of container
  		* @param container Object The new value.
  		*/
  var setContainer: js.UndefOr[js.Function1[/* container */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of element
  		* @param element Object The new value.
  		*/
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of innerWrapper
  		* @param innerWrapper Object The new value.
  		*/
  var setInnerWrapper: js.UndefOr[js.Function1[/* innerWrapper */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of sizeState
  		* @param sizeState Boolean The new value.
  		*/
  var setSizeState: js.UndefOr[js.Function1[/* sizeState */ js.UndefOr[Boolean], Unit]] = js.native
}

object IDock {
  @scala.inline
  def apply(): IDock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDock]
  }
  @scala.inline
  implicit class IDockOps[Self <: IDock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBodyElement(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodyElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBodyElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodyElement")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContainer(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.undefined)
        ret
    }
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
    def withGetElement(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInnerWrapper(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerWrapper")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInnerWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSizeState(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSizeState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSizeState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSizeState")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBodyElement(value: /* bodyElement */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBodyElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBodyElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBodyElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSetContainer(value: /* container */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContainer")(js.undefined)
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
    def withSetElement(value: /* element */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInnerWrapper(value: /* innerWrapper */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInnerWrapper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInnerWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInnerWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSizeState(value: /* sizeState */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSizeState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSizeState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSizeState")(js.undefined)
        ret
    }
  }
  
}

