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

trait Message[T /* <: cacheHit | cacheInvalidation | fetchRequest | fetchSuccess | fetchError | retryRetrying | String */] extends js.Object {
  var message: String
  var operation: Operation
  var `type`: T
}

object Message {
  @scala.inline
  def apply[T](message: String, operation: Operation, `type`: T): Message[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message[T]]
  }
}

