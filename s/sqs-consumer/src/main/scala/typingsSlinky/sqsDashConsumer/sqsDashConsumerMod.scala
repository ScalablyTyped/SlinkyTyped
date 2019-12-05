package typingsSlinky.sqsDashConsumer

import typingsSlinky.sqsDashConsumer.distConsumerMod.ConsumerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqs-consumer", JSImport.Namespace)
@js.native
object sqsDashConsumerMod extends js.Object {
  @js.native
  class Consumer protected ()
    extends typingsSlinky.sqsDashConsumer.distConsumerMod.Consumer {
    def this(options: ConsumerOptions) = this()
  }
  
  /* static members */
  @js.native
  object Consumer extends js.Object {
    def create(options: ConsumerOptions): typingsSlinky.sqsDashConsumer.distConsumerMod.Consumer = js.native
  }
  
}

