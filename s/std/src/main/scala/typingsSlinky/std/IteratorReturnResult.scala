package typingsSlinky.std

import typingsSlinky.std.stdBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IteratorReturnResult[TReturn]
  extends IteratorResult[js.Any, TReturn] {
  var done: `true` = js.native
  var value: TReturn = js.native
}

object IteratorReturnResult {
  @scala.inline
  def apply[TReturn](done: `true`, value: TReturn): IteratorReturnResult[TReturn] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorReturnResult[TReturn]]
  }
  @scala.inline
  implicit class IteratorReturnResultOps[Self[treturn] <: IteratorReturnResult[treturn], TReturn] (val x: Self[TReturn]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TReturn] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TReturn]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TReturn] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TReturn] with Other]
    @scala.inline
    def withDone(value: `true`): Self[TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: TReturn): Self[TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

