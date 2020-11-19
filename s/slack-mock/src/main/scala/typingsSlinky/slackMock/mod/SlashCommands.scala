package typingsSlinky.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlashCommands[T] extends js.Object {
  
  def addResponse(opts: SlashCommandOptions[T]): Unit = js.native
  
  var calls: js.Array[SlashCommandCall[T]] = js.native
  
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
  implicit class SlashCommandsOps[Self <: SlashCommands[_], T] (val x: Self with SlashCommands[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddResponse(value: SlashCommandOptions[T] => Unit): Self = this.set("addResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallsVarargs(value: SlashCommandCall[T]*): Self = this.set("calls", js.Array(value :_*))
    
    @scala.inline
    def setCalls(value: js.Array[SlashCommandCall[T]]): Self = this.set("calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSend(value: (SlashCommandUrl, T) => js.Promise[Unit]): Self = this.set("send", js.Any.fromFunction2(value))
  }
}
