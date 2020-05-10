package typingsSlinky.senchaTouch.Ext

import typingsSlinky.senchaTouch.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoadMask extends IMask {
  /** [Method] Changes the data store bound to this LoadMask
  		* @param store Ext.data.Store The store to bind to this LoadMask
  		*/
  var bindStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_ILoadMask: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_ILoadMask: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of indicator
  		* @returns Boolean
  		*/
  var getIndicator: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of message
  		* @returns String
  		*/
  var getMessage: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of messageCls
  		* @returns String
  		*/
  var getMessageCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Config Option] (Boolean) */
  var indicator: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var message: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var messageCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var msg: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var msgCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_ILoadMask: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of indicator
  		* @param indicator Boolean The new value.
  		*/
  var setIndicator: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of messageCls
  		* @param messageCls String The new value.
  		*/
  var setMessageCls: js.UndefOr[js.Function1[/* messageCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
}

object ILoadMask {
  @scala.inline
  def apply(): ILoadMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoadMask]
  }
  @scala.inline
  implicit class ILoadMaskOps[Self <: ILoadMask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindStore(value: /* store */ js.UndefOr[IStore] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(js.undefined)
        ret
    }
    @scala.inline
    def withCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIndicator(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndicator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMessage(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMessageCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessageCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMessageCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessageCls")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageCls")(js.undefined)
        ret
    }
    @scala.inline
    def withMsg(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(js.undefined)
        ret
    }
    @scala.inline
    def withMsgCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsgCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIndicator(value: /* indicator */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndicator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMessage(value: /* message */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMessageCls(value: /* messageCls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessageCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMessageCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessageCls")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: IStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
  }
  
}

