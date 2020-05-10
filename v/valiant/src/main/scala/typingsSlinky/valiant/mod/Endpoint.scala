package typingsSlinky.valiant.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint[T] extends js.Object {
  var finite: Boolean = js.native
  var inclusive: Boolean = js.native
  var value: T = js.native
}

object Endpoint {
  @scala.inline
  def apply[T](finite: Boolean, inclusive: Boolean, value: T): Endpoint[T] = {
    val __obj = js.Dynamic.literal(finite = finite.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint[T]]
  }
  @scala.inline
  implicit class EndpointOps[Self[t] <: Endpoint[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFinite(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclusive(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

