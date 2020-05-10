package typingsSlinky.senchaTouch.Ext.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDroppable
  extends typingsSlinky.senchaTouch.Ext.mixin.IObservable {
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var baseCls: js.UndefOr[String] = js.native
  /** [Method] Disable the Droppable target  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  /** [Method] Enable the Droppable target  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of baseCls
  		* @returns String
  		*/
  var getBaseCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var group: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var hoverCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var invalidCls: js.UndefOr[String] = js.native
  /** [Method] Method to determine whether this Component is currently disabled
  		* @returns Boolean the disabled state of this Component.
  		*/
  var isDisabled: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Method to determine whether this Droppable is currently monitoring drag operations of Draggables
  		* @returns Boolean the monitoring state of this Droppable
  		*/
  var isMonitoring: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IDroppable: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      typingsSlinky.senchaTouch.Ext.mixin.IObservable
    ]
  ] = js.native
  /** [Method] Sets the value of baseCls
  		* @param baseCls String The new value.
  		*/
  var setBaseCls: js.UndefOr[js.Function1[/* baseCls */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var validDropMode: js.UndefOr[String] = js.native
}

object IDroppable {
  @scala.inline
  def apply(): IDroppable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDroppable]
  }
  @scala.inline
  implicit class IDroppableOps[Self <: IDroppable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCls")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCls")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBaseCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBaseCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBaseCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBaseCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCls")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidCls")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDisabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMonitoring(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMonitoring")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMonitoring")(js.undefined)
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
    def withSetBaseCls(value: /* baseCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBaseCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBaseCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBaseCls")(js.undefined)
        ret
    }
    @scala.inline
    def withValidDropMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validDropMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidDropMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validDropMode")(js.undefined)
        ret
    }
  }
  
}

