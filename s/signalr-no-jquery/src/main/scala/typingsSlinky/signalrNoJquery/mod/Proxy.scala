package typingsSlinky.signalrNoJquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proxy extends js.Object {
  var connection: Connection = js.native
  var hubName: String = js.native
  var state: js.Any = js.native
  def hasSubscriptions(): Boolean = js.native
  def init(connection: Connection, hubName: String): Unit = js.native
  /**
    * Invokes a server hub method with the given arguments.
    *
    * @param methodName The name of the server hub method.
    */
  def invoke(methodName: String, args: js.Any*): js.Promise[_] = js.native
  /**
    * Removes the callback invocation request from the server hub for the given event name.
    *
    * @param eventName The name of the hub event to unregister the callback for.
    * @param callback The callback to be invoked.
    */
  def off(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Proxy = js.native
  /**
    * Wires up a callback to be invoked when a invocation request is received from the server hub.
    *
    * @param eventName The name of the hub event to register the callback for.
    * @param callback The callback to be invoked.
    */
  def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Proxy = js.native
}

object Proxy {
  @scala.inline
  def apply(
    connection: Connection,
    hasSubscriptions: () => Boolean,
    hubName: String,
    init: (Connection, String) => Unit,
    invoke: (String, /* repeated */ js.Any) => js.Promise[_],
    off: (String, js.Function1[/* repeated */ js.Any, Unit]) => Proxy,
    on: (String, js.Function1[/* repeated */ js.Any, Unit]) => Proxy,
    state: js.Any
  ): Proxy = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], hasSubscriptions = js.Any.fromFunction0(hasSubscriptions), hubName = hubName.asInstanceOf[js.Any], init = js.Any.fromFunction2(init), invoke = js.Any.fromFunction2(invoke), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proxy]
  }
  @scala.inline
  implicit class ProxyOps[Self <: Proxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasSubscriptions(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSubscriptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHubName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hubName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(value: (Connection, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInvoke(value: (String, /* repeated */ js.Any) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOff(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => Proxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => Proxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

