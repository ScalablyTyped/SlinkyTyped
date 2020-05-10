package typingsSlinky.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlashCommands[T] extends js.Object {
  var calls: js.Array[SlashCommandCall[T]] = js.native
  def addResponse(opts: SlashCommandOptions[T]): Unit = js.native
  def reset(): Unit = js.native
  def send(targetUrl: SlashCommandUrl, body: T): js.Promise[Unit] = js.native
}

object SlashCommands {
  @scala.inline
  def apply[T](
    addResponse: SlashCommandOptions[T] => Unit,
    calls: js.Array[SlashCommandCall[T]],
    reset: () => Unit,
    send: (SlashCommandUrl, T) => js.Promise[Unit]
  ): SlashCommands[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[SlashCommands[T]]
  }
  @scala.inline
  implicit class SlashCommandsOps[Self[t] <: SlashCommands[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAddResponse(value: SlashCommandOptions[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCalls(value: js.Array[SlashCommandCall[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSend(value: (SlashCommandUrl, T) => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

