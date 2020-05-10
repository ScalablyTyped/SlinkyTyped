package typingsSlinky.webcola.linklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkLengthAccessor[Link] extends LinkAccessor[Link] {
  def setLength(l: Link, value: Double): Unit = js.native
}

object LinkLengthAccessor {
  @scala.inline
  def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double, setLength: (Link, Double) => Unit): LinkLengthAccessor[Link] = {
    val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), setLength = js.Any.fromFunction2(setLength))
    __obj.asInstanceOf[LinkLengthAccessor[Link]]
  }
  @scala.inline
  implicit class LinkLengthAccessorOps[Self[link] <: LinkLengthAccessor[link], Link] (val x: Self[Link]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Link] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Link]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Link] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Link] with Other]
    @scala.inline
    def withSetLength(value: (Link, Double) => Unit): Self[Link] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLength")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

