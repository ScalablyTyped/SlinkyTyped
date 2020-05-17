package typingsSlinky.uifabricUtilities.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configurable[T /* <: js.Function */] extends js.Object {
  var configurable: Boolean = js.native
  def get(): T = js.native
}

object Configurable {
  @scala.inline
  def apply[T](configurable: Boolean, get: () => T): Configurable[T] = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Configurable[T]]
  }
  @scala.inline
  implicit class ConfigurableOps[Self[t] <: Configurable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withConfigurable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

