package typingsSlinky.sugar.sugarjs.Date

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateOptions extends js.Object {
  var newDateInternal: typingsSlinky.sugar.Function
}

object DateOptions {
  @scala.inline
  def apply(newDateInternal: typingsSlinky.sugar.Function): DateOptions = {
    val __obj = js.Dynamic.literal(newDateInternal = newDateInternal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateOptions]
  }
}

