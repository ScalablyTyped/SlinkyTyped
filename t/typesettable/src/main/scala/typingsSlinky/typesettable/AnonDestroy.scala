package typingsSlinky.typesettable

import typingsSlinky.typesettable.writerMod.IXAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDestroy extends js.Object {
  def destroy(): Unit = js.native
  def write(line: String, width: Double, xAlign: IXAlign, xOffset: Double, yOffset: Double): Unit = js.native
}

object AnonDestroy {
  @scala.inline
  def apply(destroy: () => Unit, write: (String, Double, IXAlign, Double, Double) => Unit): AnonDestroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), write = js.Any.fromFunction5(write))
    __obj.asInstanceOf[AnonDestroy]
  }
  @scala.inline
  implicit class AnonDestroyOps[Self <: AnonDestroy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWrite(value: (String, Double, IXAlign, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

