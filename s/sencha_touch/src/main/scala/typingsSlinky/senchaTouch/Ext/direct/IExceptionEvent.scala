package typingsSlinky.senchaTouch.Ext.direct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExceptionEvent extends IRemotingEvent {
  /** [Method] Returns the value of error
  		* @returns Object
  		*/
  var getError: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of error
  		* @param error Object The new value.
  		*/
  var setError: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.native
}

object IExceptionEvent {
  @scala.inline
  def apply(): IExceptionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExceptionEvent]
  }
  @scala.inline
  implicit class IExceptionEventOps[Self <: IExceptionEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetError(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getError")(js.undefined)
        ret
    }
    @scala.inline
    def withSetError(value: /* error */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setError")(js.undefined)
        ret
    }
  }
  
}

