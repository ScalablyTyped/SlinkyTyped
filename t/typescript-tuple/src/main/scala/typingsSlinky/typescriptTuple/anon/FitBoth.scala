package typingsSlinky.typescriptTuple.anon

import typingsSlinky.typescriptTuple.typescriptTupleStrings.equal
import typingsSlinky.typescriptTuple.typescriptTupleStrings.shorterLeft
import typingsSlinky.typescriptTuple.typescriptTupleStrings.shorterRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitBoth[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] extends js.Object {
  var fitBoth: equal
  var fitLeft: shorterLeft
  var fitRight: shorterRight
  var unfit: js.Any
}

object FitBoth {
  @scala.inline
  def apply[Left, Right](fitBoth: equal, fitLeft: shorterLeft, fitRight: shorterRight, unfit: js.Any): FitBoth[Left, Right] = {
    val __obj = js.Dynamic.literal(fitBoth = fitBoth.asInstanceOf[js.Any], fitLeft = fitLeft.asInstanceOf[js.Any], fitRight = fitRight.asInstanceOf[js.Any], unfit = unfit.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitBoth[Left, Right]]
  }
}

