package typingsSlinky.senchaTouch.Ext.direct

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransaction extends IBase {
  /** [Method] Returns the value of action
  		* @returns Object
  		*/
  var getAction: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of args
  		* @returns Object
  		*/
  var getArgs: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of callback
  		* @returns Object
  		*/
  var getCallback: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of form
  		* @returns Object
  		*/
  var getForm: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of id
  		* @returns Object
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of method
  		* @returns Object
  		*/
  var getMethod: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of provider
  		* @returns Object
  		*/
  var getProvider: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of retryCount
  		* @returns Number
  		*/
  var getRetryCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of action
  		* @param action Object The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of args
  		* @param args Object The new value.
  		*/
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of callback
  		* @param callback Object The new value.
  		*/
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of form
  		* @param form Object The new value.
  		*/
  var setForm: js.UndefOr[js.Function1[/* form */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of id
  		* @param id Object The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of method
  		* @param method Object The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of provider
  		* @param provider Object The new value.
  		*/
  var setProvider: js.UndefOr[js.Function1[/* provider */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of retryCount
  		* @param retryCount Number The new value.
  		*/
  var setRetryCount: js.UndefOr[js.Function1[/* retryCount */ js.UndefOr[Double], Unit]] = js.native
}

object ITransaction {
  @scala.inline
  def apply(): ITransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransaction]
  }
  @scala.inline
  implicit class ITransactionOps[Self <: ITransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAction(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAction")(js.undefined)
        ret
    }
    @scala.inline
    def withGetArgs(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArgs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCallback(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallback")(js.undefined)
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
    def withGetForm(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForm")(js.undefined)
        ret
    }
    @scala.inline
    def withGetId(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMethod(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMethod")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProvider(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProvider")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRetryCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRetryCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRetryCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRetryCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAction(value: /* action */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAction")(js.undefined)
        ret
    }
    @scala.inline
    def withSetArgs(value: /* args */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setArgs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCallback(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCallback")(js.undefined)
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
    def withSetForm(value: /* form */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setForm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setForm")(js.undefined)
        ret
    }
    @scala.inline
    def withSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMethod(value: /* method */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMethod")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withSetProvider(value: /* provider */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRetryCount(value: /* retryCount */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRetryCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRetryCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRetryCount")(js.undefined)
        ret
    }
  }
  
}

