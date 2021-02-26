package typingsSlinky.stompit

import typingsSlinky.node.streamMod.Writable
import typingsSlinky.stompit.clientMod.Ack
import typingsSlinky.stompit.clientMod.MessageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionMod {
  
  @JSImport("stompit/lib/client/Subscription", JSImport.Namespace)
  @js.native
  class ^ protected () extends Subscription {
    def this(
      id: Double,
      ack: Ack,
      onMessageCallback: MessageCallback,
      client: typingsSlinky.stompit.clientMod.^
    ) = this()
  }
  
  @js.native
  trait Subscription extends StObject {
    
    def getId(): Double = js.native
    
    def processMessageFrame(error: js.Error, frame: Writable): Unit = js.native
    def processMessageFrame(error: Null, frame: Writable): Unit = js.native
    
    def unsubscribe(): Unit = js.native
    def unsubscribe(headers: js.Any): Unit = js.native
  }
}
