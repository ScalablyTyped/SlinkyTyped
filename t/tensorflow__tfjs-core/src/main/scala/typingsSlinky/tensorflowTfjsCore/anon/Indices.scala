package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indices[T /* <: Tensor[Rank] */] extends js.Object {
  var indices: T = js.native
  var values: T = js.native
}

object Indices {
  @scala.inline
  def apply[T](indices: T, values: T): Indices[T] = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices[T]]
  }
  @scala.inline
  implicit class IndicesOps[Self[t] <: Indices[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIndices(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

