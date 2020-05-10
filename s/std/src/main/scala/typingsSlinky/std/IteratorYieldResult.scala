package typingsSlinky.std

import typingsSlinky.std.stdBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IteratorYieldResult[TYield]
  extends IteratorResult[TYield, js.Any] {
  var done: js.UndefOr[`false`] = js.native
  var value: TYield = js.native
}

object IteratorYieldResult {
  @scala.inline
  def apply[TYield](value: TYield): IteratorYieldResult[TYield] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorYieldResult[TYield]]
  }
  @scala.inline
  implicit class IteratorYieldResultOps[Self[tyield] <: IteratorYieldResult[tyield], TYield] (val x: Self[TYield]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TYield] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TYield]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TYield] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TYield] with Other]
    @scala.inline
    def withValue(value: TYield): Self[TYield] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone(value: `false`): Self[TYield] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDone: Self[TYield] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
  }
  
}

