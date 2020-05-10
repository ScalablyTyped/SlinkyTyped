package typingsSlinky.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardLines extends js.Object {
  def getCount(): Double = js.native
  def getLine(index: Double): StandardLine = js.native
}

object StandardLines {
  @scala.inline
  def apply(getCount: () => Double, getLine: Double => StandardLine): StandardLines = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction0(getCount), getLine = js.Any.fromFunction1(getLine))
    __obj.asInstanceOf[StandardLines]
  }
  @scala.inline
  implicit class StandardLinesOps[Self <: StandardLines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLine(value: Double => StandardLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLine")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

