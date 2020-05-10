package typingsSlinky.tstl.isizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISize extends js.Object {
  /**
    * Number of elements in the container.
    */
  def size(): Double = js.native
}

object ISize {
  @scala.inline
  def apply(size: () => Double): ISize = {
    val __obj = js.Dynamic.literal(size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[ISize]
  }
  @scala.inline
  implicit class ISizeOps[Self <: ISize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

