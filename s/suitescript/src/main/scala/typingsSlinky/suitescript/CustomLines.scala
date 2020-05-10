package typingsSlinky.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLines extends js.Object {
  def addNewLine(): CustomLine = js.native
  def getCount(): Double = js.native
  def getLine(index: Double): CustomLine = js.native
}

object CustomLines {
  @scala.inline
  def apply(addNewLine: () => CustomLine, getCount: () => Double, getLine: Double => CustomLine): CustomLines = {
    val __obj = js.Dynamic.literal(addNewLine = js.Any.fromFunction0(addNewLine), getCount = js.Any.fromFunction0(getCount), getLine = js.Any.fromFunction1(getLine))
    __obj.asInstanceOf[CustomLines]
  }
  @scala.inline
  implicit class CustomLinesOps[Self <: CustomLines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddNewLine(value: () => CustomLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNewLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLine(value: Double => CustomLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLine")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

