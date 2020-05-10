package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISimpleText extends js.Object {
  def charCodeAt(index: Double): Double = js.native
  def copyTo(sourceIndex: Double, destination: js.Array[Double], destinationIndex: Double, count: Double): Unit = js.native
  def length(): Double = js.native
  def lineMap(): LineMap = js.native
  def subText(span: TextSpan): ISimpleText = js.native
  def substr(start: Double, length: Double, intern: Boolean): String = js.native
}

object ISimpleText {
  @scala.inline
  def apply(
    charCodeAt: Double => Double,
    copyTo: (Double, js.Array[Double], Double, Double) => Unit,
    length: () => Double,
    lineMap: () => LineMap,
    subText: TextSpan => ISimpleText,
    substr: (Double, Double, Boolean) => String
  ): ISimpleText = {
    val __obj = js.Dynamic.literal(charCodeAt = js.Any.fromFunction1(charCodeAt), copyTo = js.Any.fromFunction4(copyTo), length = js.Any.fromFunction0(length), lineMap = js.Any.fromFunction0(lineMap), subText = js.Any.fromFunction1(subText), substr = js.Any.fromFunction3(substr))
    __obj.asInstanceOf[ISimpleText]
  }
  @scala.inline
  implicit class ISimpleTextOps[Self <: ISimpleText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharCodeAt(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charCodeAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCopyTo(value: (Double, js.Array[Double], Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTo")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLineMap(value: () => LineMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubText(value: TextSpan => ISimpleText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubstr(value: (Double, Double, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substr")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

