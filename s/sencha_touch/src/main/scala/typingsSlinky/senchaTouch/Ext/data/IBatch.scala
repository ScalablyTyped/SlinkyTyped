package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBatch extends IObservable {
  /** [Method] Adds a new operation to this batch
  		* @param operation Object The Operation object.
  		*/
  var add: js.UndefOr[js.Function1[/* operation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var autoStart: js.UndefOr[Boolean] = js.native
  /** [Property] (Number) */
  var current: js.UndefOr[Double] = js.native
  /** [Method] Returns the value of autoStart
  		* @returns Boolean
  		*/
  var getAutoStart: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of pauseOnException
  		* @returns Boolean
  		*/
  var getPauseOnException: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of proxy
  		* @returns Ext.data.Proxy
  		*/
  var getProxy: js.UndefOr[js.Function0[IProxy]] = js.native
  /** [Property] (Boolean) */
  var hasException: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isComplete: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isRunning: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.data.Operation[]) */
  var operations: js.UndefOr[Array] = js.native
  /** [Method] Pauses execution of the batch but does not cancel the current operation  */
  var pause: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var pauseOnException: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.Proxy) */
  var proxy: js.UndefOr[IProxy] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IBatch: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Executes a operation by its numeric index
  		* @param index Number The operation index to run.
  		*/
  var runOperation: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of autoStart
  		* @param autoStart Boolean The new value.
  		*/
  var setAutoStart: js.UndefOr[js.Function1[/* autoStart */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of pauseOnException
  		* @param pauseOnException Boolean The new value.
  		*/
  var setPauseOnException: js.UndefOr[js.Function1[/* pauseOnException */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of proxy
  		* @param proxy Ext.data.Proxy The new value.
  		*/
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[IProxy], Unit]] = js.native
  /** [Method] Kicks off the execution of the batch continuing from the next operation if the previous operation encountered an exc  */
  var start: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Number) */
  var total: js.UndefOr[Double] = js.native
}

object IBatch {
  @scala.inline
  def apply(): IBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatch]
  }
  @scala.inline
  implicit class IBatchOps[Self <: IBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: /* operation */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoStart(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPauseOnException(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPauseOnException")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPauseOnException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPauseOnException")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProxy(value: () => IProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withHasException(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasException")(js.undefined)
        ret
    }
    @scala.inline
    def withIsComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRunning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRunning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunning")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnException(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnException")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: IProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRelayEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRunOperation(value: /* index */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOperation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRunOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoStart(value: /* autoStart */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPauseOnException(value: /* pauseOnException */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPauseOnException")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPauseOnException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPauseOnException")(js.undefined)
        ret
    }
    @scala.inline
    def withSetProxy(value: /* proxy */ js.UndefOr[IProxy] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProxy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

