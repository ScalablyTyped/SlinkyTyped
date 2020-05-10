package typingsSlinky.typesettable

import typingsSlinky.typesettable.writerMod.IXAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWrite extends js.Object {
  def write(line: String, width: Double, xAlign: IXAlign, xOffset: Double, yOffset: Double): Unit = js.native
}

object AnonWrite {
  @scala.inline
  def apply(write: (String, Double, IXAlign, Double, Double) => Unit): AnonWrite = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction5(write))
    __obj.asInstanceOf[AnonWrite]
  }
  @scala.inline
  implicit class AnonWriteOps[Self <: AnonWrite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWrite(value: (String, Double, IXAlign, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

