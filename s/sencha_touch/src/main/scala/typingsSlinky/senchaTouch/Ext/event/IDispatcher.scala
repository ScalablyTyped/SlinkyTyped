package typingsSlinky.senchaTouch.Ext.event

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDispatcher extends IBase {
  /** [Method] Returns the value of publishers
  		* @returns Object
  		*/
  var getPublishers: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of publishers
  		* @param publishers Object The new value.
  		*/
  var setPublishers: js.UndefOr[js.Function1[/* publishers */ js.UndefOr[js.Any], Unit]] = js.native
}

object IDispatcher {
  @scala.inline
  def apply(): IDispatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDispatcher]
  }
  @scala.inline
  implicit class IDispatcherOps[Self <: IDispatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPublishers(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPublishers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPublishers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPublishers")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPublishers(value: /* publishers */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPublishers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPublishers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPublishers")(js.undefined)
        ret
    }
  }
  
}

