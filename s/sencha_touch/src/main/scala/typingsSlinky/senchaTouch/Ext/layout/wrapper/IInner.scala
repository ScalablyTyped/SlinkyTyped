package typingsSlinky.senchaTouch.Ext.layout.wrapper

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInner extends IBase {
  /** [Method] Returns the value of container
  		* @returns Object
  		*/
  var getContainer: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of sizeState
  		* @returns Object
  		*/
  var getSizeState: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of container
  		* @param container Object The new value.
  		*/
  var setContainer: js.UndefOr[js.Function1[/* container */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of sizeState
  		* @param sizeState Object The new value.
  		*/
  var setSizeState: js.UndefOr[js.Function1[/* sizeState */ js.UndefOr[js.Any], Unit]] = js.native
}

object IInner {
  @scala.inline
  def apply(): IInner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInner]
  }
  @scala.inline
  implicit class IInnerOps[Self <: IInner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withGetSizeState(value: () => _): Self = {
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
    def withSetSizeState(value: /* sizeState */ js.UndefOr[js.Any] => Unit): Self = {
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

