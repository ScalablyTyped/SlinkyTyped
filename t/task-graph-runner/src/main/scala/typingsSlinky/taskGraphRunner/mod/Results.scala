package typingsSlinky.taskGraphRunner.mod

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Results[Item, Result] extends js.Object {
  var safe: Boolean = js.native
  var values: Map[Item, Result] = js.native
}

object Results {
  @scala.inline
  def apply[Item, Result](safe: Boolean, values: Map[Item, Result]): Results[Item, Result] = {
    val __obj = js.Dynamic.literal(safe = safe.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results[Item, Result]]
  }
  @scala.inline
  implicit class ResultsOps[Self[item, result] <: Results[item, result], Item, Result] (val x: Self[Item, Result]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Item, Result] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Item, Result]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Item, Result]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Item, Result]) with Other]
    @scala.inline
    def withSafe(value: Boolean): Self[Item, Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: Map[Item, Result]): Self[Item, Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

