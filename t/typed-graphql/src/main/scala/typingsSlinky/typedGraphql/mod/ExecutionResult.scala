package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionResult extends js.Object {
  var data: js.Any
  var errors: js.UndefOr[js.Array[js.Error]] = js.undefined
}

object ExecutionResult {
  @scala.inline
  def apply(data: js.Any, errors: js.Array[js.Error] = null): ExecutionResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionResult]
  }
}

