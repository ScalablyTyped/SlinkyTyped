package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDelayedTask extends IBase {
  /** [Method] Cancel the last queued timeout */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Cancels any pending timeout and queues a new one
  		* @param delay Number The milliseconds to delay
  		* @param newFn Function Overrides the original function passed when instantiated.
  		* @param newScope Object Overrides the original scope passed when instantiated. Remember that if no scope is specified, this will refer to the browser window.
  		* @param newArgs Array Overrides the original args passed when instantiated.
  		*/
  var delay: js.UndefOr[
    js.Function4[
      /* delay */ js.UndefOr[Double], 
      /* newFn */ js.UndefOr[js.Any], 
      /* newScope */ js.UndefOr[js.Any], 
      /* newArgs */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.native
  /** [Method] Returns the value of args
  		* @returns Object
  		*/
  var getArgs: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of delay
  		* @returns Object
  		*/
  var getDelay: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of fn
  		* @returns Object
  		*/
  var getFn: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of interval
  		* @returns Object
  		*/
  var getInterval: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of args
  		* @param args Object The new value.
  		*/
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of delay
  		* @param delay Object The new value.
  		*/
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of fn
  		* @param fn Object The new value.
  		*/
  var setFn: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of interval
  		* @param interval Object The new value.
  		*/
  var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
}

object IDelayedTask {
  @scala.inline
  def apply(): IDelayedTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDelayedTask]
  }
  @scala.inline
  implicit class IDelayedTaskOps[Self <: IDelayedTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(
      value: (/* delay */ js.UndefOr[Double], /* newFn */ js.UndefOr[js.Any], /* newScope */ js.UndefOr[js.Any], /* newArgs */ js.UndefOr[Array]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
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
    def withGetDelay(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDelay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFn(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFn")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInterval(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInterval")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScope(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScope")(js.undefined)
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
    def withSetDelay(value: /* delay */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDelay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFn(value: /* fn */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFn")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInterval(value: /* interval */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInterval")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScope")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScope")(js.undefined)
        ret
    }
  }
  
}

