package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlidingWindowSource extends js.Object {
  def fetchMoreItems(
    argument: js.Any,
    sourceIndex: Double,
    window: js.Array[_],
    destinationIndex: Double,
    spaceAvailable: Double
  ): Double = js.native
}

object ISlidingWindowSource {
  @scala.inline
  def apply(fetchMoreItems: (js.Any, Double, js.Array[_], Double, Double) => Double): ISlidingWindowSource = {
    val __obj = js.Dynamic.literal(fetchMoreItems = js.Any.fromFunction5(fetchMoreItems))
    __obj.asInstanceOf[ISlidingWindowSource]
  }
  @scala.inline
  implicit class ISlidingWindowSourceOps[Self <: ISlidingWindowSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchMoreItems(value: (js.Any, Double, js.Array[_], Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMoreItems")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

