package typingsSlinky.typesettable.writerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPen extends js.Object {
  /**
    * Called once all the lines have been written
    */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called once for each line of text in the block.
    *
    * `xOffset` and `yOffset` are assumed to be in an independent text-aligned
    * coordinate space.
    */
  def write(line: String, width: Double, anchor: IXAlign, xOffset: Double, yOffset: Double): Unit = js.native
}

object IPen {
  @scala.inline
  def apply(write: (String, Double, IXAlign, Double, Double) => Unit): IPen = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction5(write))
    __obj.asInstanceOf[IPen]
  }
  @scala.inline
  implicit class IPenOps[Self <: IPen] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
  }
  
}

