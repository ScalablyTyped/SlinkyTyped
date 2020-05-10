package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGradFunc[T /* <: Tensor[Rank] */] extends js.Object {
  var value: T = js.native
  def gradFunc(dy: T, saved: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
}

object AnonGradFunc {
  @scala.inline
  def apply[T](gradFunc: (T, js.Array[Tensor[Rank]]) => Tensor[Rank] | js.Array[Tensor[Rank]], value: T): AnonGradFunc[T] = {
    val __obj = js.Dynamic.literal(gradFunc = js.Any.fromFunction2(gradFunc), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGradFunc[T]]
  }
  @scala.inline
  implicit class AnonGradFuncOps[Self[t] <: AnonGradFunc[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGradFunc(value: (T, js.Array[Tensor[Rank]]) => Tensor[Rank] | js.Array[Tensor[Rank]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradFunc")(js.Any.fromFunction2(value))
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

