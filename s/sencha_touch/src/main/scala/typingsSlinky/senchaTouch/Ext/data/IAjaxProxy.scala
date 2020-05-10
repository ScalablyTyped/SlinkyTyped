package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.data.proxy.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAjaxProxy extends IServer {
  /** [Property] (Object) */
  var actionMethods: js.UndefOr[js.Any] = js.native
  /** [Method] Performs Ajax request
  		* @param operation Ext.data.Operation
  		* @param callback Function
  		* @param scope Object
  		* @returns Object
  		*/
  @JSName("doRequest")
  var doRequest_IAjaxProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Returns the value of headers
  		* @returns Object
  		*/
  var getHeaders: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the HTTP method name for a given request
  		* @param request Ext.data.Request The request object.
  		* @returns String The HTTP method to use (should be one of 'GET', 'POST', 'PUT' or 'DELETE').
  		*/
  var getMethod: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.native
  /** [Method] Returns the value of password
  		* @returns String
  		*/
  var getPassword: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of useDefaultXhrHeader
  		* @returns Boolean
  		*/
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of username
  		* @returns String
  		*/
  var getUsername: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of withCredentials
  		* @returns Boolean
  		*/
  var getWithCredentials: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Object) */
  var headers: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var password: js.UndefOr[String] = js.native
  /** [Method] Sets the value of headers
  		* @param headers Object The new value.
  		*/
  var setHeaders: js.UndefOr[js.Function1[/* headers */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of password
  		* @param password String The new value.
  		*/
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of useDefaultXhrHeader
  		* @param useDefaultXhrHeader Boolean The new value.
  		*/
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of username
  		* @param username String The new value.
  		*/
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of withCredentials
  		* @param withCredentials Boolean The new value.
  		*/
  var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var useDefaultXhrHeader: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var username: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object IAjaxProxy {
  @scala.inline
  def apply(): IAjaxProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAjaxProxy]
  }
  @scala.inline
  implicit class IAjaxProxyOps[Self <: IAjaxProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionMethods(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doRequest")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDoRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doRequest")(js.undefined)
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
    def withGetMethod(value: /* request */ js.UndefOr[IRequest] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMethod")(js.Any.fromFunction1(value))
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
  }
  
}

