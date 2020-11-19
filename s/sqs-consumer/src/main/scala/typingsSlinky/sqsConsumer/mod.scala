package typingsSlinky.sqsConsumer

import typingsSlinky.sqsConsumer.consumerMod.ConsumerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sqs-consumer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Consumer protected ()
    extends typingsSlinky.sqsConsumer.consumerMod.Consumer {
    def this(options: ConsumerOptions) = this()
  }
  /* static members */
  @js.native
  object Consumer extends js.Object {
    
    def create(options: ConsumerOptions): typingsSlinky.sqsConsumer.consumerMod.Consumer = js.native
  }
}
