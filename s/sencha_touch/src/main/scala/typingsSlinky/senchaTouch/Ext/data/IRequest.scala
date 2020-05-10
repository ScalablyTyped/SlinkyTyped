package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequest extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var callbackKey: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of action
  		* @returns String
  		*/
  var getAction: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of args
  		* @returns Object
  		*/
  var getArgs: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of callback
  		* @returns Object
  		*/
  var getCallback: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of callbackKey
  		* @returns String
  		*/
  var getCallbackKey: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of directFn
  		* @returns Object
  		*/
  var getDirectFn: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of disableCaching
  		* @returns Boolean
  		*/
  var getDisableCaching: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of headers
  		* @returns Object
  		*/
  var getHeaders: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of jsonData
  		* @returns Object
  		*/
  var getJsonData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of method
  		* @returns String
  		*/
  var getMethod: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of operation
  		* @returns Ext.data.Operation
  		*/
  var getOperation: js.UndefOr[js.Function0[IOperation]] = js.native
  /** [Method] Returns the value of params
  		* @returns Object
  		*/
  var getParams: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of password
  		* @returns String
  		*/
  var getPassword: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of proxy
  		* @returns Ext.data.proxy.Proxy
  		*/
  var getProxy: js.UndefOr[js.Function0[typingsSlinky.senchaTouch.Ext.data.proxy.IProxy]] = js.native
  /** [Method] Returns the value of records
  		* @returns Object
  		*/
  var getRecords: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of useDefaultXhrHeader
  		* @returns Object
  		*/
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of username
  		* @returns String
  		*/
  var getUsername: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of withCredentials
  		* @returns Boolean
  		*/
  var getWithCredentials: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of xmlData
  		* @returns Object
  		*/
  var getXmlData: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Object) */
  var headers: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var jsonData: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.data.JsonP) */
  var jsonp: js.UndefOr[IJsonP] = js.native
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.data.Operation) */
  var operation: js.UndefOr[IOperation] = js.native
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var password: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.data.proxy.Proxy) */
  var proxy: js.UndefOr[typingsSlinky.senchaTouch.Ext.data.proxy.IProxy] = js.native
  /** [Method] Sets the value of action
  		* @param action String The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of args
  		* @param args Object The new value.
  		*/
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of callback
  		* @param callback Object The new value.
  		*/
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of callbackKey
  		* @param callbackKey String The new value.
  		*/
  var setCallbackKey: js.UndefOr[js.Function1[/* callbackKey */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of directFn
  		* @param directFn Object The new value.
  		*/
  var setDirectFn: js.UndefOr[js.Function1[/* directFn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of disableCaching
  		* @param disableCaching Boolean The new value.
  		*/
  var setDisableCaching: js.UndefOr[js.Function1[/* disableCaching */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of headers
  		* @param headers Object The new value.
  		*/
  var setHeaders: js.UndefOr[js.Function1[/* headers */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of jsonData
  		* @param jsonData Object The new value.
  		*/
  var setJsonData: js.UndefOr[js.Function1[/* jsonData */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of method
  		* @param method String The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of operation
  		* @param operation Ext.data.Operation The new value.
  		*/
  var setOperation: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], Unit]] = js.native
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of password
  		* @param password String The new value.
  		*/
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of proxy
  		* @param proxy Ext.data.proxy.Proxy The new value.
  		*/
  var setProxy: js.UndefOr[
    js.Function1[/* proxy */ js.UndefOr[typingsSlinky.senchaTouch.Ext.data.proxy.IProxy], Unit]
  ] = js.native
  /** [Method] Sets the value of records
  		* @param records Object The new value.
  		*/
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of useDefaultXhrHeader
  		* @param useDefaultXhrHeader Object The new value.
  		*/
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of username
  		* @param username String The new value.
  		*/
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of withCredentials
  		* @param withCredentials Boolean The new value.
  		*/
  var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of xmlData
  		* @param xmlData Object The new value.
  		*/
  var setXmlData: js.UndefOr[js.Function1[/* xmlData */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var username: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var xmlData: js.UndefOr[js.Any] = js.native
}

object IRequest {
  @scala.inline
  def apply(): IRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequest]
  }
  @scala.inline
  implicit class IRequestOps[Self <: IRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCaching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCaching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAction(value: () => String): Self = {
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
    def withGetCallbackKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallbackKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCallbackKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallbackKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDirectFn(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirectFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDirectFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirectFn")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDisableCaching(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisableCaching")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDisableCaching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisableCaching")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeaders(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withGetJsonData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJsonData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetJsonData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJsonData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMethod(value: () => String): Self = {
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
    def withGetOperation(value: () => IOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOperation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOperation")(js.undefined)
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
    def withGetPassword(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPassword")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProxy(value: () => typingsSlinky.senchaTouch.Ext.data.proxy.IProxy): Self = {
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
    def withGetRecords(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecords")(js.undefined)
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
    def withGetTimeout(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseDefaultXhrHeader(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseDefaultXhrHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseDefaultXhrHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseDefaultXhrHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUsername(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsername")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsername")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWithCredentials(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWithCredentials")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWithCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withGetXmlData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXmlData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetXmlData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXmlData")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonData")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonp(value: IJsonP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: IOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: typingsSlinky.senchaTouch.Ext.data.proxy.IProxy): Self = {
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
    def withSetAction(value: /* action */ js.UndefOr[String] => Unit): Self = {
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
    def withSetCallbackKey(value: /* callbackKey */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCallbackKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCallbackKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCallbackKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDirectFn(value: /* directFn */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirectFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDirectFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirectFn")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisableCaching(value: /* disableCaching */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisableCaching")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisableCaching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisableCaching")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeaders(value: /* headers */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withSetJsonData(value: /* jsonData */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setJsonData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetJsonData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setJsonData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMethod(value: /* method */ js.UndefOr[String] => Unit): Self = {
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
    def withSetOperation(value: /* operation */ js.UndefOr[IOperation] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOperation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOperation")(js.undefined)
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
    @scala.inline
    def withSetPassword(value: /* password */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPassword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withSetProxy(value: /* proxy */ js.UndefOr[typingsSlinky.senchaTouch.Ext.data.proxy.IProxy] => Unit): Self = {
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
    def withSetRecords(value: /* records */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecords")(js.undefined)
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
    @scala.inline
    def withSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseDefaultXhrHeader(value: /* useDefaultXhrHeader */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseDefaultXhrHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseDefaultXhrHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseDefaultXhrHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUsername(value: /* username */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUsername")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUsername")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWithCredentials(value: /* withCredentials */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWithCredentials")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWithCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withSetXmlData(value: /* xmlData */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXmlData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetXmlData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXmlData")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlData")(js.undefined)
        ret
    }
  }
  
}

