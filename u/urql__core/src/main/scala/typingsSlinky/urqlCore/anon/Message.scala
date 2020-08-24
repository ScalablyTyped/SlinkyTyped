package typingsSlinky.urqlCore.anon

import typingsSlinky.urqlCore.typesMod.Operation
import typingsSlinky.urqlCore.urqlCoreStrings.cacheHit
import typingsSlinky.urqlCore.urqlCoreStrings.cacheInvalidation
import typingsSlinky.urqlCore.urqlCoreStrings.fetchError
import typingsSlinky.urqlCore.urqlCoreStrings.fetchRequest
import typingsSlinky.urqlCore.urqlCoreStrings.fetchSuccess
import typingsSlinky.urqlCore.urqlCoreStrings.retryRetrying
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message[T /* <: cacheHit | cacheInvalidation | fetchRequest | fetchSuccess | fetchError | retryRetrying | String */] extends js.Object {
  var message: String = js.native
  var operation: Operation = js.native
  var `type`: T = js.native
}

object Message {
  @scala.inline
  def apply[/* <: typingsSlinky.urqlCore.urqlCoreStrings.cacheHit | typingsSlinky.urqlCore.urqlCoreStrings.cacheInvalidation | typingsSlinky.urqlCore.urqlCoreStrings.fetchRequest | typingsSlinky.urqlCore.urqlCoreStrings.fetchSuccess | typingsSlinky.urqlCore.urqlCoreStrings.fetchError | typingsSlinky.urqlCore.urqlCoreStrings.retryRetrying | java.lang.String */ T](message: String, operation: Operation, `type`: T): Message[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message[T]]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message[_], /* <: typingsSlinky.urqlCore.urqlCoreStrings.cacheHit | typingsSlinky.urqlCore.urqlCoreStrings.cacheInvalidation | typingsSlinky.urqlCore.urqlCoreStrings.fetchRequest | typingsSlinky.urqlCore.urqlCoreStrings.fetchSuccess | typingsSlinky.urqlCore.urqlCoreStrings.fetchError | typingsSlinky.urqlCore.urqlCoreStrings.retryRetrying | java.lang.String */ T] (val x: Self with Message[T]) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: Operation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

