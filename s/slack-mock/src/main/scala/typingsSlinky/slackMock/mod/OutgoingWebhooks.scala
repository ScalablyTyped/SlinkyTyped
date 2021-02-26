package typingsSlinky.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutgoingWebhooks[T] extends StObject {
  
  var calls: js.Array[OutgoingWebhookCall[T]] = js.native
  
  def reset(): Unit = js.native
  
  def send(targetUrl: OutgoingWebhookUrl, body: T): js.Promise[Unit] = js.native
}
object OutgoingWebhooks {
  
  @scala.inline
  def apply[T](
    calls: js.Array[OutgoingWebhookCall[T]],
    reset: () => Unit,
    send: (OutgoingWebhookUrl, T) => js.Promise[Unit]
  ): OutgoingWebhooks[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[OutgoingWebhooks[T]]
  }
  
  @scala.inline
  implicit class OutgoingWebhooksMutableBuilder[Self <: OutgoingWebhooks[_], T] (val x: Self with OutgoingWebhooks[T]) extends AnyVal {
    
    @scala.inline
    def setCalls(value: js.Array[OutgoingWebhookCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallsVarargs(value: OutgoingWebhookCall[T]*): Self = StObject.set(x, "calls", js.Array(value :_*))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSend(value: (OutgoingWebhookUrl, T) => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
  }
}
