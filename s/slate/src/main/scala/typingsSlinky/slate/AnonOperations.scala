package typingsSlinky.slate

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.slate.mod.Operation
import typingsSlinky.slate.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOperations extends js.Object {
  var operations: List[Operation]
  var value: Value
}

object AnonOperations {
  @scala.inline
  def apply(operations: List[Operation], value: Value): AnonOperations = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOperations]
  }
}

