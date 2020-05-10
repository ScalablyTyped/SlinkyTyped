package typingsSlinky.senchaTouch.Ext.direct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRemotingEvent extends IEvent {
  /** [Method] Returns the value of tid
  		* @returns Object
  		*/
  var getTid: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Get the transaction associated with this event
  		* @returns Ext.direct.Transaction The transaction
  		*/
  @JSName("getTransaction")
  var getTransaction_IRemotingEvent: js.UndefOr[js.Function0[ITransaction]] = js.native
  /** [Method] Sets the value of tid
  		* @param tid Object The new value.
  		*/
  var setTid: js.UndefOr[js.Function1[/* tid */ js.UndefOr[js.Any], Unit]] = js.native
}

object IRemotingEvent {
  @scala.inline
  def apply(): IRemotingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRemotingEvent]
  }
  @scala.inline
  implicit class IRemotingEventOps[Self <: IRemotingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTid(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTid")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTransaction(value: () => ITransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransaction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransaction")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTid(value: /* tid */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTid")(js.undefined)
        ret
    }
  }
  
}

