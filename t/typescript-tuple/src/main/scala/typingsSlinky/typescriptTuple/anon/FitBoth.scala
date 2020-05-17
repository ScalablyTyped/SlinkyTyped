package typingsSlinky.typescriptTuple.anon

import typingsSlinky.typescriptTuple.typescriptTupleStrings.equal
import typingsSlinky.typescriptTuple.typescriptTupleStrings.shorterLeft
import typingsSlinky.typescriptTuple.typescriptTupleStrings.shorterRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FitBoth[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] extends js.Object {
  var fitBoth: equal = js.native
  var fitLeft: shorterLeft = js.native
  var fitRight: shorterRight = js.native
  var unfit: js.Any = js.native
}

object FitBoth {
  @scala.inline
  def apply[Left, Right](fitBoth: equal, fitLeft: shorterLeft, fitRight: shorterRight, unfit: js.Any): FitBoth[Left, Right] = {
    val __obj = js.Dynamic.literal(fitBoth = fitBoth.asInstanceOf[js.Any], fitLeft = fitLeft.asInstanceOf[js.Any], fitRight = fitRight.asInstanceOf[js.Any], unfit = unfit.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitBoth[Left, Right]]
  }
  @scala.inline
  implicit class FitBothOps[Self[left, right] <: FitBoth[left, right], Left, Right] (val x: Self[Left, Right]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Left, Right] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Left, Right]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Left, Right]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Left, Right]) with Other]
    @scala.inline
    def withFitBoth(value: equal): Self[Left, Right] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitBoth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFitLeft(value: shorterLeft): Self[Left, Right] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFitRight(value: shorterRight): Self[Left, Right] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnfit(value: js.Any): Self[Left, Right] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

