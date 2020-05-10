package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.encodeMod.BaseValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonValue[T] extends BaseValueRef[T] {
  var value: T | Null = js.native
}

object AnonValue {
  @scala.inline
  def apply[T](): AnonValue[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonValue[T]]
  }
  @scala.inline
  implicit class AnonValueOps[Self[t] <: AnonValue[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

