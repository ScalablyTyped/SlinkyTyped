package typingsSlinky.webcola.powergraphMod

import typingsSlinky.webcola.linklengthsMod.LinkAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkTypeAccessor[Link] extends LinkAccessor[Link] {
  def getType(l: Link): Double = js.native
}

object LinkTypeAccessor {
  @scala.inline
  def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double, getType: Link => Double): LinkTypeAccessor[Link] = {
    val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), getType = js.Any.fromFunction1(getType))
    __obj.asInstanceOf[LinkTypeAccessor[Link]]
  }
  @scala.inline
  implicit class LinkTypeAccessorOps[Self[link] <: LinkTypeAccessor[link], Link] (val x: Self[Link]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Link] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Link]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Link] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Link] with Other]
    @scala.inline
    def withGetType(value: Link => Double): Self[Link] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

