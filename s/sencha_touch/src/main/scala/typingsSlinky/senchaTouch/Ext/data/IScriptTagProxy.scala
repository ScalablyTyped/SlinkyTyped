package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.data.proxy.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScriptTagProxy extends IServer {
  /** [Method] Aborts the current server request if one is currently running  */
  var abort: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var autoAppendParams: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var callbackKey: js.UndefOr[String] = js.native
  /** [Method] Performs the read request to the remote domain
  		* @param operation Ext.data.Operation The Operation object to execute.
  		* @param callback Function A callback function to execute when the Operation has been completed.
  		* @param scope Object The scope to execute the callback in.
  		* @returns Object
  		*/
  @JSName("doRequest")
  var doRequest_IScriptTagProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Returns the value of autoAppendParams
  		* @returns Boolean
  		*/
  var getAutoAppendParams: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of callbackKey
  		* @returns String
  		*/
  var getCallbackKey: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of defaultWriterType
  		* @returns String
  		*/
  var getDefaultWriterType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of recordParam
  		* @returns String
  		*/
  var getRecordParam: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var recordParam: js.UndefOr[String] = js.native
  /** [Method] Sets the value of autoAppendParams
  		* @param autoAppendParams Boolean The new value.
  		*/
  var setAutoAppendParams: js.UndefOr[js.Function1[/* autoAppendParams */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of callbackKey
  		* @param callbackKey String The new value.
  		*/
  var setCallbackKey: js.UndefOr[js.Function1[/* callbackKey */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of defaultWriterType
  		* @param defaultWriterType String The new value.
  		*/
  var setDefaultWriterType: js.UndefOr[js.Function1[/* defaultWriterType */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of recordParam
  		* @param recordParam String The new value.
  		*/
  var setRecordParam: js.UndefOr[js.Function1[/* recordParam */ js.UndefOr[String], Unit]] = js.native
}

object IScriptTagProxy {
  @scala.inline
  def apply(): IScriptTagProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScriptTagProxy]
  }
  @scala.inline
  implicit class IScriptTagProxyOps[Self <: IScriptTagProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAppendParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAppendParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAppendParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAppendParams")(js.undefined)
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
    def withGetAutoAppendParams(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoAppendParams")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoAppendParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoAppendParams")(js.undefined)
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
    def withGetDefaultWriterType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultWriterType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultWriterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultWriterType")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecordParam(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordParam")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRecordParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordParam")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordParam")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoAppendParams(value: /* autoAppendParams */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoAppendParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoAppendParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoAppendParams")(js.undefined)
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
    def withSetDefaultWriterType(value: /* defaultWriterType */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultWriterType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultWriterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultWriterType")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRecordParam(value: /* recordParam */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecordParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRecordParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecordParam")(js.undefined)
        ret
    }
  }
  
}

