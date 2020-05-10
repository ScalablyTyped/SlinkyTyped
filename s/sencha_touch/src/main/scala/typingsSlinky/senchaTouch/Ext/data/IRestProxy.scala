package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.data.proxy.IAjax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRestProxy extends IAjax {
  /** [Config Option] (Boolean) */
  var appendId: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.native
  /** [Method] Returns the value of actionMethods
  		* @returns Object
  		*/
  var getActionMethods: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of appendId
  		* @returns Boolean
  		*/
  var getAppendId: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of format
  		* @returns String
  		*/
  var getFormat: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Sets the value of actionMethods
  		* @param actionMethods Object The new value.
  		*/
  var setActionMethods: js.UndefOr[js.Function1[/* actionMethods */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of appendId
  		* @param appendId Boolean The new value.
  		*/
  var setAppendId: js.UndefOr[js.Function1[/* appendId */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of format
  		* @param format String The new value.
  		*/
  var setFormat: js.UndefOr[js.Function1[/* format */ js.UndefOr[String], Unit]] = js.native
}

object IRestProxy {
  @scala.inline
  def apply(): IRestProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestProxy]
  }
  @scala.inline
  implicit class IRestProxyOps[Self <: IRestProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendId")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActionMethods(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActionMethods")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActionMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActionMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAppendId(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppendId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAppendId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppendId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFormat(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSetActionMethods(value: /* actionMethods */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActionMethods")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActionMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActionMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAppendId(value: /* appendId */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAppendId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAppendId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAppendId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFormat(value: /* format */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFormat")(js.undefined)
        ret
    }
  }
  
}

