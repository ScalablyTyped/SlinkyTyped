package typingsSlinky.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// RTM
@js.native
trait Rtm[T] extends js.Object {
  var calls: js.Array[RtmCall[T]] = js.native
  var clients: js.Array[typingsSlinky.ws.mod.^] = js.native
  def reset(): Unit = js.native
  def send(token: String, message: T): js.Promise[Unit] = js.native
  def startServer(token: String): Unit = js.native
  def stopServer(token: String): Unit = js.native
}

object Rtm {
  @scala.inline
  def apply[T](
    calls: js.Array[RtmCall[T]],
    clients: js.Array[typingsSlinky.ws.mod.^],
    reset: () => Unit,
    send: (String, T) => js.Promise[Unit],
    startServer: String => Unit,
    stopServer: String => Unit
  ): Rtm[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], clients = clients.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send), startServer = js.Any.fromFunction1(startServer), stopServer = js.Any.fromFunction1(stopServer))
    __obj.asInstanceOf[Rtm[T]]
  }
  @scala.inline
  implicit class RtmOps[Self[t] <: Rtm[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCalls(value: js.Array[RtmCall[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClients(value: js.Array[typingsSlinky.ws.mod.^]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSend(value: (String, T) => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStartServer(value: String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startServer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStopServer(value: String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopServer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

