package typingsSlinky.senchaTouch.Ext.device.globalization

import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IObservable {
  /** [Method] Returns the value of currencyCode
  		* @returns String
  		*/
  var getCurrencyCode: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of dateType
  		* @returns String
  		*/
  var getDateType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of formatLength
  		* @returns String
  		*/
  var getFormatLength: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of items
  		* @returns String
  		*/
  var getItems: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of numberType
  		* @returns String
  		*/
  var getNumberType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of selector
  		* @returns String
  		*/
  var getSelector: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IAbstract: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Sets the value of currencyCode
  		* @param currencyCode String The new value.
  		*/
  var setCurrencyCode: js.UndefOr[js.Function1[/* currencyCode */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of dateType
  		* @param dateType String The new value.
  		*/
  var setDateType: js.UndefOr[js.Function1[/* dateType */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of formatLength
  		* @param formatLength String The new value.
  		*/
  var setFormatLength: js.UndefOr[js.Function1[/* formatLength */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of items
  		* @param items String The new value.
  		*/
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of numberType
  		* @param numberType String The new value.
  		*/
  var setNumberType: js.UndefOr[js.Function1[/* numberType */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of selector
  		* @param selector String The new value.
  		*/
  var setSelector: js.UndefOr[js.Function1[/* selector */ js.UndefOr[String], Unit]] = js.native
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
    def withGetCurrencyCode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrencyCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDateType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateType")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFormatLength(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormatLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFormatLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormatLength")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItems(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNumberType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumberType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNumberType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumberType")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelector(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelector")(js.undefined)
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
    def withSetCurrencyCode(value: /* currencyCode */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrencyCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDateType(value: /* dateType */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDateType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDateType")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFormatLength(value: /* formatLength */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFormatLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFormatLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFormatLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItems(value: /* items */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNumberType(value: /* numberType */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNumberType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNumberType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNumberType")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSelector(value: /* selector */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelector")(js.undefined)
        ret
    }
  }
  
}

