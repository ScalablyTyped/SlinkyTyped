package typingsSlinky.senchaTouch.Ext.data

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnection extends IObservable {
  /** [Method] Aborts any outstanding request
  		* @param request Object Defaults to the last request.
  		*/
  var abort: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Aborts all outstanding requests  */
  var abortAll: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var defaultHeaders: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var defaultXhrHeader: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var disableCachingParam: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of async
  		* @returns Boolean
  		*/
  var getAsync: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of autoAbort
  		* @returns Boolean
  		*/
  var getAutoAbort: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of defaultHeaders
  		* @returns Object
  		*/
  var getDefaultHeaders: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of defaultPostHeader
  		* @returns String
  		*/
  var getDefaultPostHeader: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of defaultXhrHeader
  		* @returns String
  		*/
  var getDefaultXhrHeader: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of disableCaching
  		* @returns Boolean
  		*/
  var getDisableCaching: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of disableCachingParam
  		* @returns String
  		*/
  var getDisableCachingParam: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of extraParams
  		* @returns Object
  		*/
  var getExtraParams: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of method
  		* @returns String
  		*/
  var getMethod: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of password
  		* @returns String
  		*/
  var getPassword: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of useDefaultHeader
  		* @returns Boolean
  		*/
  var getUseDefaultHeader: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of useDefaultXhrHeader
  		* @returns Boolean
  		*/
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of username
  		* @returns String
  		*/
  var getUsername: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Determines whether this object has a request outstanding
  		* @param request Object The request to check.
  		* @returns Boolean True if there is an outstanding request.
  		*/
  var isLoading: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.native
  /** [Method] Checks if the response status was successful
  		* @param status Number The status code.
  		* @param xhr XMLHttpRequest
  		* @returns Object An object containing success/status state.
  		*/
  var parseStatus: js.UndefOr[
    js.Function2[/* status */ js.UndefOr[Double], /* xhr */ js.UndefOr[XMLHttpRequest], _]
  ] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IConnection: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Sends an HTTP request to a remote server
  		* @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform post-processing in a callback because it is passed to callback functions.)
  		* @returns Object/null The request object. This may be used to cancel the request.
  		*/
  var request: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Sets the value of async
  		* @param async Boolean The new value.
  		*/
  var setAsync: js.UndefOr[js.Function1[/* async */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of autoAbort
  		* @param autoAbort Boolean The new value.
  		*/
  var setAutoAbort: js.UndefOr[js.Function1[/* autoAbort */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of defaultHeaders
  		* @param defaultHeaders Object The new value.
  		*/
  var setDefaultHeaders: js.UndefOr[js.Function1[/* defaultHeaders */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of defaultPostHeader
  		* @param defaultPostHeader String The new value.
  		*/
  var setDefaultPostHeader: js.UndefOr[js.Function1[/* defaultPostHeader */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of defaultXhrHeader
  		* @param defaultXhrHeader String The new value.
  		*/
  var setDefaultXhrHeader: js.UndefOr[js.Function1[/* defaultXhrHeader */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of disableCaching
  		* @param disableCaching Boolean The new value.
  		*/
  var setDisableCaching: js.UndefOr[js.Function1[/* disableCaching */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of disableCachingParam
  		* @param disableCachingParam String The new value.
  		*/
  var setDisableCachingParam: js.UndefOr[js.Function1[/* disableCachingParam */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of extraParams
  		* @param extraParams Object The new value.
  		*/
  var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of method
  		* @param method String The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets various options such as the url params for the request
  		* @param options Object The initial options.
  		* @param scope Object The scope to execute in.
  		* @returns Object The params for the request.
  		*/
  var setOptions: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Sets the value of password
  		* @param password String The new value.
  		*/
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of useDefaultHeader
  		* @param useDefaultHeader Boolean The new value.
  		*/
  var setUseDefaultHeader: js.UndefOr[js.Function1[/* useDefaultHeader */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of useDefaultXhrHeader
  		* @param useDefaultXhrHeader Boolean The new value.
  		*/
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of username
  		* @param username String The new value.
  		*/
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Method] Uploads a form using a hidden iframe
  		* @param form String/HTMLElement/Ext.Element The form to upload.
  		* @param url String The url to post to.
  		* @param params String Any extra parameters to pass.
  		* @param options Object The initial options.
  		*/
  var upload: js.UndefOr[
    js.Function4[
      /* form */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[String], 
      /* params */ js.UndefOr[String], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var useDefaultXhrHeader: js.UndefOr[Boolean] = js.native
}

object IConnection {
  @scala.inline
  def apply(): IConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnection]
  }
  @scala.inline
  implicit class IConnectionOps[Self <: IConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: /* request */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.undefined)
        ret
    }
    @scala.inline
    def withAbortAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAbortAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortAll")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultXhrHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultXhrHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultXhrHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultXhrHeader")(js.undefined)
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
    def withDisableCachingParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCachingParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCachingParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCachingParam")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraParams")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAsync(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoAbort(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoAbort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultHeaders(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultPostHeader(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultPostHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultPostHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultPostHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultXhrHeader(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultXhrHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultXhrHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultXhrHeader")(js.undefined)
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
    def withGetDisableCachingParam(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisableCachingParam")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDisableCachingParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisableCachingParam")(js.undefined)
        ret
    }
    @scala.inline
    def withGetExtraParams(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtraParams")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetExtraParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtraParams")(js.undefined)
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
    def withGetUseDefaultHeader(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseDefaultHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseDefaultHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseDefaultHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseDefaultXhrHeader(value: () => Boolean): Self = {
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
    def withIsLoading(value: /* request */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.undefined)
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
    def withParseStatus(value: (/* status */ js.UndefOr[Double], /* xhr */ js.UndefOr[XMLHttpRequest]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseStatus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutParseStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseStatus")(js.undefined)
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
    def withRequest(value: /* options */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAsync(value: /* async */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoAbort(value: /* autoAbort */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoAbort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultHeaders(value: /* defaultHeaders */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultPostHeader(value: /* defaultPostHeader */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultPostHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultPostHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultPostHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultXhrHeader(value: /* defaultXhrHeader */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultXhrHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultXhrHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultXhrHeader")(js.undefined)
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
    def withSetDisableCachingParam(value: /* disableCachingParam */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisableCachingParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisableCachingParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisableCachingParam")(js.undefined)
        ret
    }
    @scala.inline
    def withSetExtraParams(value: /* extraParams */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExtraParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetExtraParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExtraParams")(js.undefined)
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
    def withSetOptions(value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.undefined)
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
    def withSetUseDefaultHeader(value: /* useDefaultHeader */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseDefaultHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseDefaultHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseDefaultHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseDefaultXhrHeader(value: /* useDefaultXhrHeader */ js.UndefOr[Boolean] => Unit): Self = {
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
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload(
      value: (/* form */ js.UndefOr[js.Any], /* url */ js.UndefOr[String], /* params */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.undefined)
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
    def withUseDefaultXhrHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefaultXhrHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDefaultXhrHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefaultXhrHeader")(js.undefined)
        ret
    }
  }
  
}

