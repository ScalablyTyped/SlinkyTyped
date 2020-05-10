package typingsSlinky.webcola.linklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkAccessor[Link] extends js.Object {
  def getSourceIndex(l: Link): Double = js.native
  def getTargetIndex(l: Link): Double = js.native
}

object LinkAccessor {
  @scala.inline
  def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double): LinkAccessor[Link] = {
    val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
    __obj.asInstanceOf[LinkAccessor[Link]]
  }
  @scala.inline
  implicit class LinkAccessorOps[Self[link] <: LinkAccessor[link], Link] (val x: Self[Link]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Link] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Link]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Link] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Link] with Other]
    @scala.inline
    def withGetSourceIndex(value: Link => Double): Self[Link] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTargetIndex(value: Link => Double): Self[Link] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTargetIndex")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

