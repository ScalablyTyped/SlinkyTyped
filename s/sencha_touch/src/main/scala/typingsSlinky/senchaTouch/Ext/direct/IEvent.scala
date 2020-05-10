package typingsSlinky.senchaTouch.Ext.direct

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEvent extends IBase {
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of code
  		* @returns Object
  		*/
  var getCode: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of message
  		* @returns String
  		*/
  var getMessage: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of result
  		* @returns Object
  		*/
  var getResult: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of status
  		* @returns Boolean
  		*/
  var getStatus: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of transaction
  		* @returns Object
  		*/
  var getTransaction: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of xhr
  		* @returns Object
  		*/
  var getXhr: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Method] Sets the value of code
  		* @param code Object The new value.
  		*/
  var setCode: js.UndefOr[js.Function1[/* code */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of result
  		* @param result Object The new value.
  		*/
  var setResult: js.UndefOr[js.Function1[/* result */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of status
  		* @param status Boolean The new value.
  		*/
  var setStatus: js.UndefOr[js.Function1[/* status */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of transaction
  		* @param transaction Object The new value.
  		*/
  var setTransaction: js.UndefOr[js.Function1[/* transaction */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of xhr
  		* @param xhr Object The new value.
  		*/
  var setXhr: js.UndefOr[js.Function1[/* xhr */ js.UndefOr[js.Any], Unit]] = js.native
}

object IEvent {
  @scala.inline
  def apply(): IEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEvent]
  }
  @scala.inline
  implicit class IEventOps[Self <: IEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCode(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetResult(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResult")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResult")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStatus(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTransaction(value: () => _): Self = {
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
    def withGetXhr(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXhr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetXhr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXhr")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCode(value: /* code */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMessage(value: /* message */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSetName(value: /* name */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetResult(value: /* result */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResult")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStatus(value: /* status */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTransaction(value: /* transaction */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransaction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransaction")(js.undefined)
        ret
    }
    @scala.inline
    def withSetXhr(value: /* xhr */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXhr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetXhr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXhr")(js.undefined)
        ret
    }
  }
  
}

