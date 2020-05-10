package typingsSlinky.senchaTouch.Ext.direct

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRemotingMethod extends IBase {
  /** [Method] Takes the arguments for the Direct function and splits the arguments from the scope and the callback
  		* @param args Array The arguments passed to the direct call
  		* @returns Object An object with 3 properties, args, callback &amp; scope.
  		*/
  var getCallData: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], _]] = js.native
  /** [Method] Returns the value of formHandler
  		* @returns Object
  		*/
  var getFormHandler: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of len
  		* @returns Object
  		*/
  var getLen: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of name
  		* @returns Object
  		*/
  var getName: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of ordered
  		* @returns Boolean
  		*/
  var getOrdered: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of params
  		* @returns Object
  		*/
  var getParams: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of formHandler
  		* @param formHandler Object The new value.
  		*/
  var setFormHandler: js.UndefOr[js.Function1[/* formHandler */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of len
  		* @param len Object The new value.
  		*/
  var setLen: js.UndefOr[js.Function1[/* len */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of name
  		* @param name Object The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of ordered
  		* @param ordered Boolean The new value.
  		*/
  var setOrdered: js.UndefOr[js.Function1[/* ordered */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
}

object IRemotingMethod {
  @scala.inline
  def apply(): IRemotingMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRemotingMethod]
  }
  @scala.inline
  implicit class IRemotingMethodOps[Self <: IRemotingMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCallData(value: /* args */ js.UndefOr[Array] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetCallData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFormHandler(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFormHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLen(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLen")(js.undefined)
        ret
    }
    @scala.inline
    def withGetName(value: () => _): Self = {
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
    def withGetOrdered(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrdered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOrdered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrdered")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParams(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParams")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParams")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFormHandler(value: /* formHandler */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFormHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFormHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFormHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLen(value: /* len */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLen")(js.undefined)
        ret
    }
    @scala.inline
    def withSetName(value: /* name */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withSetOrdered(value: /* ordered */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOrdered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOrdered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOrdered")(js.undefined)
        ret
    }
    @scala.inline
    def withSetParams(value: /* params */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParams")(js.undefined)
        ret
    }
  }
  
}

