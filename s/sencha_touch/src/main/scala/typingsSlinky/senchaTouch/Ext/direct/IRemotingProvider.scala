package typingsSlinky.senchaTouch.Ext.direct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRemotingProvider extends IJsonProvider {
  /** [Config Option] (Object) */
  var actions: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/Boolean) */
  var enableBuffer: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var enableUrlEncode: js.UndefOr[String] = js.native
  /** [Method] Returns the value of actions
  		* @returns Object
  		*/
  var getActions: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of enableBuffer
  		* @returns Number/Boolean
  		*/
  var getEnableBuffer: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of enableUrlEncode
  		* @returns String
  		*/
  var getEnableUrlEncode: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of maxRetries
  		* @returns Number
  		*/
  var getMaxRetries: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of namespace
  		* @returns String/Object
  		*/
  var getNamespace: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Number) */
  var maxRetries: js.UndefOr[Double] = js.native
  /** [Config Option] (String/Object) */
  var namespace: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of actions
  		* @param actions Object The new value.
  		*/
  var setActions: js.UndefOr[js.Function1[/* actions */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of enableBuffer
  		* @param enableBuffer Number/Boolean The new value.
  		*/
  var setEnableBuffer: js.UndefOr[js.Function1[/* enableBuffer */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of enableUrlEncode
  		* @param enableUrlEncode String The new value.
  		*/
  var setEnableUrlEncode: js.UndefOr[js.Function1[/* enableUrlEncode */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of maxRetries
  		* @param maxRetries Number The new value.
  		*/
  var setMaxRetries: js.UndefOr[js.Function1[/* maxRetries */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of namespace
  		* @param namespace String/Object The new value.
  		*/
  var setNamespace: js.UndefOr[js.Function1[/* namespace */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
}

object IRemotingProvider {
  @scala.inline
  def apply(): IRemotingProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRemotingProvider]
  }
  @scala.inline
  implicit class IRemotingProviderOps[Self <: IRemotingProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBuffer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableUrlEncode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUrlEncode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableUrlEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUrlEncode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActions(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEnableBuffer(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnableBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEnableBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnableBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEnableUrlEncode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnableUrlEncode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEnableUrlEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnableUrlEncode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxRetries(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxRetries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNamespace(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamespace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamespace")(js.undefined)
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
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withSetActions(value: /* actions */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActions")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEnableBuffer(value: /* enableBuffer */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnableBuffer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEnableBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnableBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEnableUrlEncode(value: /* enableUrlEncode */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnableUrlEncode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEnableUrlEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnableUrlEncode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxRetries(value: /* maxRetries */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxRetries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNamespace(value: /* namespace */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNamespace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNamespace")(js.undefined)
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
  }
  
}

