package typingsSlinky.sugar.sugarjs.Date

import typingsSlinky.sugar.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateOptions extends js.Object {
  var newDateInternal: Function
}

object DateOptions {
  @scala.inline
  def apply(newDateInternal: Function): DateOptions = {
    val __obj = js.Dynamic.literal(newDateInternal = newDateInternal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateOptions]
  }
}

