package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.data.proxy.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDirectProxy extends IServer {
  /** [Method] Generates a url based on a given Ext data Request object
  		* @returns String The url
  		*/
  @JSName("buildUrl")
  var buildUrl_IDirectProxy: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Function/String) */
  var directFn: js.UndefOr[js.Any] = js.native
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("doRequest")
  var doRequest_IDirectProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Returns the value of directFn
  		* @returns Function/String
  		*/
  var getDirectFn: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of paramOrder
  		* @returns String/String[]
  		*/
  var getParamOrder: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of paramsAsHash
  		* @returns Boolean
  		*/
  var getParamsAsHash: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of directFn
  		* @param directFn Function/String The new value.
  		*/
  var setDirectFn: js.UndefOr[js.Function1[/* directFn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of paramOrder
  		* @param paramOrder String/String[] The new value.
  		*/
  var setParamOrder: js.UndefOr[js.Function1[/* paramOrder */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of paramsAsHash
  		* @param paramsAsHash Boolean The new value.
  		*/
  var setParamsAsHash: js.UndefOr[js.Function1[/* paramsAsHash */ js.UndefOr[Boolean], Unit]] = js.native
}

object IDirectProxy {
  @scala.inline
  def apply(): IDirectProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectProxy]
  }
  @scala.inline
  implicit class IDirectProxyOps[Self <: IDirectProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBuildUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectFn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directFn")(js.undefined)
        ret
    }
    @scala.inline
    def withDoRequest(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
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
    def withGetParamOrder(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParamOrder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetParamOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParamOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParamsAsHash(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParamsAsHash")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetParamsAsHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParamsAsHash")(js.undefined)
        ret
    }
    @scala.inline
    def withParamOrder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withParamsAsHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsAsHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamsAsHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsAsHash")(js.undefined)
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
    def withSetParamOrder(value: /* paramOrder */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParamOrder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetParamOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParamOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSetParamsAsHash(value: /* paramsAsHash */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParamsAsHash")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetParamsAsHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParamsAsHash")(js.undefined)
        ret
    }
  }
  
}

