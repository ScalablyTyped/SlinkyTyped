package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReader extends IObservable {
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[String] = js.native
  /** [Method] Returns the value of clientIdProperty
  		* @returns String
  		*/
  var getClientIdProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of idProperty
  		* @returns String
  		*/
  var getIdProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of implicitIncludes
  		* @returns Boolean
  		*/
  var getImplicitIncludes: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of messageProperty
  		* @returns String
  		*/
  var getMessageProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of model
  		* @returns Object
  		*/
  var getModel: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Takes a raw response object as passed to this read and returns the useful data segment of it
  		* @param response Object The response object
  		* @returns Object The useful data from the response
  		*/
  var getResponseData: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the value of rootProperty
  		* @returns String
  		*/
  var getRootProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of successProperty
  		* @returns any
  		*/
  var getSuccessProperty: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of totalProperty
  		* @returns any
  		*/
  var getTotalProperty: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var implicitIncludes: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var messageProperty: js.UndefOr[String] = js.native
  /** [Property] (Object) */
  var metaData: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var rawData: js.UndefOr[js.Any] = js.native
  /** [Method] Reads the given response object
  		* @param response Object The response object. This may be either an XMLHttpRequest object or a plain JS object
  		* @returns Ext.data.ResultSet The parsed ResultSet object
  		*/
  var read: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IResultSet]] = js.native
  /** [Method] Abstracts common functionality used by all Reader subclasses
  		* @param data Object The raw data object
  		* @returns Ext.data.ResultSet A ResultSet object
  		*/
  var readRecords: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], IResultSet]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IReader: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var rootProperty: js.UndefOr[String] = js.native
  /** [Method] Sets the value of clientIdProperty
  		* @param clientIdProperty String The new value.
  		*/
  var setClientIdProperty: js.UndefOr[js.Function1[/* clientIdProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of idProperty
  		* @param idProperty String The new value.
  		*/
  var setIdProperty: js.UndefOr[js.Function1[/* idProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of implicitIncludes
  		* @param implicitIncludes Boolean The new value.
  		*/
  var setImplicitIncludes: js.UndefOr[js.Function1[/* implicitIncludes */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of messageProperty
  		* @param messageProperty String The new value.
  		*/
  var setMessageProperty: js.UndefOr[js.Function1[/* messageProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of model
  		* @param model Object The new value.
  		*/
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of rootProperty
  		* @param rootProperty String The new value.
  		*/
  var setRootProperty: js.UndefOr[js.Function1[/* rootProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of successProperty
  		* @param successProperty String The new value.
  		*/
  var setSuccessProperty: js.UndefOr[js.Function1[/* successProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of totalProperty
  		* @param totalProperty String The new value.
  		*/
  var setTotalProperty: js.UndefOr[js.Function1[/* totalProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var successProperty: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var totalProperty: js.UndefOr[String] = js.native
}

object IReader {
  @scala.inline
  def apply(): IReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReader]
  }
  @scala.inline
  implicit class IReaderOps[Self <: IReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientIdProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIdProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientIdProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClientIdProperty(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientIdProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetClientIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientIdProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIdProperty(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIdProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIdProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetImplicitIncludes(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImplicitIncludes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetImplicitIncludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImplicitIncludes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMessageProperty(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessageProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMessageProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessageProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetModel(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetResponseData(value: /* response */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResponseData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetResponseData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResponseData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRootProperty(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRootProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSuccessProperty(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuccessProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSuccessProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuccessProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTotalProperty(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTotalProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withIdProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withImplicitIncludes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitIncludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplicitIncludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitIncludes")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(js.undefined)
        ret
    }
    @scala.inline
    def withRawData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawData")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: /* response */ js.UndefOr[js.Any] => IResultSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withReadRecords(value: /* data */ js.UndefOr[js.Any] => IResultSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRecords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReadRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRecords")(js.undefined)
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
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetClientIdProperty(value: /* clientIdProperty */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClientIdProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetClientIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClientIdProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIdProperty(value: /* idProperty */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIdProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIdProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetImplicitIncludes(value: /* implicitIncludes */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImplicitIncludes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetImplicitIncludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImplicitIncludes")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMessageProperty(value: /* messageProperty */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessageProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMessageProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessageProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetModel(value: /* model */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRootProperty(value: /* rootProperty */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRootProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRootProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRootProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSuccessProperty(value: /* successProperty */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccessProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSuccessProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccessProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTotalProperty(value: /* totalProperty */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTotalProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTotalProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTotalProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalProperty")(js.undefined)
        ret
    }
  }
  
}

