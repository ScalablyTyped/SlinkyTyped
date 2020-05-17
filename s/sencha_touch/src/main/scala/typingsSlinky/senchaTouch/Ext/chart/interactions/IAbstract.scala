package typingsSlinky.senchaTouch.Ext.chart.interactions

import org.scalajs.dom.raw.Event
import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.chart.IAbstractChart
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IObservable {
  /** [Config Option] (Ext.chart.AbstractChart) */
  var chart: js.UndefOr[IAbstractChart] = js.native
  /** [Config Option] (Boolean) */
  var enabled: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var gesture: js.UndefOr[String] = js.native
  /** [Method] Returns the value of chart
  		* @returns Ext.chart.AbstractChart
  		*/
  var getChart: js.UndefOr[js.Function0[IAbstractChart]] = js.native
  /** [Method] Returns the value of enabled
  		* @returns Boolean
  		*/
  var getEnabled: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of gesture
  		* @returns String
  		*/
  var getGesture: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Find and return a single series item corresponding to the given event or null if no matching item is found
  		* @param e Event
  		* @returns Object the item object or null if none found.
  		*/
  var getItemForEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], _]] = js.native
  /** [Method] Find and return all series items corresponding to the given event
  		* @param e Event
  		* @returns Array array of matching item objects
  		*/
  var getItemsForEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Array]] = js.native
  /** [Method] A method to be implemented by subclasses where all event attachment should occur  */
  var initialize: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Placeholder method  */
  var onGesture: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IAbstract: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Sets the value of chart
  		* @param chart Ext.chart.AbstractChart The new value.
  		*/
  var setChart: js.UndefOr[js.Function1[/* chart */ js.UndefOr[IAbstractChart], Unit]] = js.native
  /** [Method] Sets the value of enabled
  		* @param enabled Boolean The new value.
  		*/
  var setEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of gesture
  		* @param gesture String The new value.
  		*/
  var setGesture: js.UndefOr[js.Function1[/* gesture */ js.UndefOr[String], Unit]] = js.native
  /** [Property] (Number) */
  var throttleGap: js.UndefOr[Double] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: IAbstractChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGesture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesture")(js.undefined)
        ret
    }
    @scala.inline
    def withGetChart(value: () => IAbstractChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChart")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGesture(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGesture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemForEvent(value: /* e */ js.UndefOr[Event] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemForEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetItemForEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemForEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemsForEvent(value: /* e */ js.UndefOr[Event] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemsForEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetItemsForEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemsForEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGesture(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGesture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGesture")(js.undefined)
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
    def withSetChart(value: /* chart */ js.UndefOr[IAbstractChart] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChart")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEnabled(value: /* enabled */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGesture(value: /* gesture */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGesture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGesture")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottleGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottleGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleGap")(js.undefined)
        ret
    }
  }
  
}

