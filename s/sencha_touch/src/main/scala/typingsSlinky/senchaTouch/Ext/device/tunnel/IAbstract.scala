package typingsSlinky.senchaTouch.Ext.device.tunnel

import typingsSlinky.senchaTouch.Ext.IBase
import typingsSlinky.senchaTouch.Ext.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Method] Broadcast a message intent to look for receivers who can respond to it
  		* @param message String
  		* @returns Ext.Promise A promise which provides an array of objects upon fulfilled. Each object contains information about a receiver, with 'id', 'name' and 'icon' keys.
  		*/
  var broadcast: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], IPromise]] = js.native
  /** [Method] Create a connection to another application with the given id
  		* @param receiverId String The id of the application to connect to. Get this id from broadcast
  		* @returns Ext.Promise
  		*/
  var connect: js.UndefOr[js.Function1[/* receiverId */ js.UndefOr[String], IPromise]] = js.native
  /** [Method] Assign the callback to handle new connection
  		* @param callback Function
  		*/
  var onConnect: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Assign the callback to handling incoming messages
  		* @param callback Function
  		*/
  var onMessage: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Send a message
  		* @param receiverId String The id of the application to connect to. Get this id from broadcast
  		* @param message * The message to send, can be an object, as long as it is JSON-able.
  		* @param foreground Boolean Whether or not to bring the receiver app to the foreground
  		* @returns Ext.Promise
  		*/
  var send: js.UndefOr[
    js.Function3[
      /* receiverId */ js.UndefOr[String], 
      /* message */ js.UndefOr[js.Any], 
      /* foreground */ js.UndefOr[Boolean], 
      IPromise
    ]
  ] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcast(value: /* message */ js.UndefOr[String] => IPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBroadcast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast")(js.undefined)
        ret
    }
    @scala.inline
    def withConnect(value: /* receiverId */ js.UndefOr[String] => IPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConnect(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMessage(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSend(
      value: (/* receiverId */ js.UndefOr[String], /* message */ js.UndefOr[js.Any], /* foreground */ js.UndefOr[Boolean]) => IPromise
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.undefined)
        ret
    }
  }
  
}

