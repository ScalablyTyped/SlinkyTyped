package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.data.proxy.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMemoryProxy extends IClient {
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
}

object IMemoryProxy {
  @scala.inline
  def apply(): IMemoryProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMemoryProxy]
  }
  @scala.inline
  implicit class IMemoryProxyOps[Self <: IMemoryProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withGetData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.undefined)
        ret
    }
  }
  
}

