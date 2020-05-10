package typingsSlinky.senchaTouch.Ext.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITapRepeater
  extends typingsSlinky.senchaTouch.Ext.mixin.IObservable {
  /** [Method] Returns the value of accelerate
  		* @returns Boolean
  		*/
  var getAccelerate: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of delay
  		* @returns Number
  		*/
  var getDelay: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of el
  		* @returns Object
  		*/
  var getEl: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of interval
  		* @returns Number
  		*/
  var getInterval: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of pressCls
  		* @returns Object
  		*/
  var getPressCls: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of preventDefault
  		* @returns Boolean
  		*/
  var getPreventDefault: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of stopDefault
  		* @returns Boolean
  		*/
  var getStopDefault: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of timer
  		* @returns Number
  		*/
  var getTimer: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_ITapRepeater: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      typingsSlinky.senchaTouch.Ext.mixin.IObservable
    ]
  ] = js.native
  /** [Method] Sets the value of accelerate
  		* @param accelerate Boolean The new value.
  		*/
  var setAccelerate: js.UndefOr[js.Function1[/* accelerate */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of delay
  		* @param delay Number The new value.
  		*/
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of el
  		* @param el Object The new value.
  		*/
  var setEl: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of interval
  		* @param interval Number The new value.
  		*/
  var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of pressCls
  		* @param pressCls Object The new value.
  		*/
  var setPressCls: js.UndefOr[js.Function1[/* pressCls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of preventDefault
  		* @param preventDefault Boolean The new value.
  		*/
  var setPreventDefault: js.UndefOr[js.Function1[/* preventDefault */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of stopDefault
  		* @param stopDefault Boolean The new value.
  		*/
  var setStopDefault: js.UndefOr[js.Function1[/* stopDefault */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of timer
  		* @param timer Number The new value.
  		*/
  var setTimer: js.UndefOr[js.Function1[/* timer */ js.UndefOr[Double], Unit]] = js.native
}

object ITapRepeater {
  @scala.inline
  def apply(): ITapRepeater = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITapRepeater]
  }
  @scala.inline
  implicit class ITapRepeaterOps[Self <: ITapRepeater] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAccelerate(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccelerate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAccelerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccelerate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDelay(value: () => Double): Self = {
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
    def withGetEl(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInterval(value: () => Double): Self = {
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
    def withGetPressCls(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPressCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPreventDefault(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStopDefault(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStopDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStopDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStopDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTimer(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimer")(js.undefined)
        ret
    }
    @scala.inline
    def withRelayEvents(
      value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => typingsSlinky.senchaTouch.Ext.mixin.IObservable
    ): Self = {
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
    def withSetAccelerate(value: /* accelerate */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccelerate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAccelerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccelerate")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDelay(value: /* delay */ js.UndefOr[Double] => Unit): Self = {
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
    def withSetEl(value: /* el */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEl")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInterval(value: /* interval */ js.UndefOr[Double] => Unit): Self = {
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
    def withSetPressCls(value: /* pressCls */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPressCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPreventDefault(value: /* preventDefault */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreventDefault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStopDefault(value: /* stopDefault */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStopDefault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStopDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStopDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTimer(value: /* timer */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimer")(js.undefined)
        ret
    }
  }
  
}

