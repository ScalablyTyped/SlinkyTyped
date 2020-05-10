package typingsSlinky.structuredSource.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StructuredSource extends js.Object {
  def indexToPosition(index: Double): SourcePosition = js.native
  def locationToRange(loc: SourceLocation): js.Tuple2[Double, Double] = js.native
  def positionToIndex(pos: SourcePosition): Double = js.native
  def rangeToLocation(range: js.Tuple2[Double, Double]): SourceLocation = js.native
}

object StructuredSource {
  @scala.inline
  def apply(
    indexToPosition: Double => SourcePosition,
    locationToRange: SourceLocation => js.Tuple2[Double, Double],
    positionToIndex: SourcePosition => Double,
    rangeToLocation: js.Tuple2[Double, Double] => SourceLocation
  ): StructuredSource = {
    val __obj = js.Dynamic.literal(indexToPosition = js.Any.fromFunction1(indexToPosition), locationToRange = js.Any.fromFunction1(locationToRange), positionToIndex = js.Any.fromFunction1(positionToIndex), rangeToLocation = js.Any.fromFunction1(rangeToLocation))
    __obj.asInstanceOf[StructuredSource]
  }
  @scala.inline
  implicit class StructuredSourceOps[Self <: StructuredSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexToPosition(value: Double => SourcePosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexToPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocationToRange(value: SourceLocation => js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationToRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPositionToIndex(value: SourcePosition => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionToIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRangeToLocation(value: js.Tuple2[Double, Double] => SourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeToLocation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

