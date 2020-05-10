package typingsSlinky.webcola.linklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkSepAccessor[Link] extends LinkAccessor[Link] {
  def getMinSeparation(l: Link): Double = js.native
}

object LinkSepAccessor {
  @scala.inline
  def apply[Link](getMinSeparation: Link => Double, getSourceIndex: Link => Double, getTargetIndex: Link => Double): LinkSepAccessor[Link] = {
    val __obj = js.Dynamic.literal(getMinSeparation = js.Any.fromFunction1(getMinSeparation), getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
    __obj.asInstanceOf[LinkSepAccessor[Link]]
  }
  @scala.inline
  implicit class LinkSepAccessorOps[Self[link] <: LinkSepAccessor[link], Link] (val x: Self[Link]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Link] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Link]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Link] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Link] with Other]
    @scala.inline
    def withGetMinSeparation(value: Link => Double): Self[Link] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinSeparation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

