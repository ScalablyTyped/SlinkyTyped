package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a session of the USSD network protocol. */
@js.native
trait UssdSession extends StObject {
  
  /** Closes the USSD session with the network. */
  def close(): Unit = js.native
  
  /**
    * Sends a message to a USSD session and returns a handler to retrieve the reply asynchronously.
    * @param message The message to send to the USSD session.
    * @return An asynchronous handler to retrieve the USSD response to the sent message.
    */
  def sendMessageAndGetReplyAsync(message: UssdMessage): IPromiseWithIAsyncOperation[UssdReply] = js.native
}
object UssdSession {
  
  @scala.inline
  def apply(
    close: () => Unit,
    sendMessageAndGetReplyAsync: UssdMessage => IPromiseWithIAsyncOperation[UssdReply]
  ): UssdSession = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), sendMessageAndGetReplyAsync = js.Any.fromFunction1(sendMessageAndGetReplyAsync))
    __obj.asInstanceOf[UssdSession]
  }
  
  @scala.inline
  implicit class UssdSessionMutableBuilder[Self <: UssdSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSendMessageAndGetReplyAsync(value: UssdMessage => IPromiseWithIAsyncOperation[UssdReply]): Self = StObject.set(x, "sendMessageAndGetReplyAsync", js.Any.fromFunction1(value))
  }
}
