package typingsSlinky.textBuffer.mod.global.TextBuffer.Options

import typingsSlinky.textBuffer.mod.global.TextBuffer.PointCompatible
import typingsSlinky.textBuffer.mod.global.TextBuffer.RangeCompatible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindDisplayMarker extends js.Object {
  /** Only include markers contained in this Range in buffer coordinates. */
  var containedInBufferRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers contained in this Range in screen coordinates. */
  var containedInScreenRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers containing this Point in buffer coordinates. */
  var containsBufferPosition: js.UndefOr[PointCompatible] = js.native
  /** Only include markers containing this Range in buffer coordinates. */
  var containsBufferRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers ending at this Point in buffer coordinates. */
  var endBufferPosition: js.UndefOr[PointCompatible] = js.native
  /** Only include markers ending at this row in buffer coordinates. */
  var endBufferRow: js.UndefOr[Double] = js.native
  /** Only include markers ending at this Point in screen coordinates. */
  var endScreenPosition: js.UndefOr[PointCompatible] = js.native
  /** Only include markers ending at this row in screen coordinates. */
  var endScreenRow: js.UndefOr[Double] = js.native
  /** Only include markers ending inside this Range in buffer coordinates. */
  var endsInBufferRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers ending inside this Range in screen coordinates. */
  var endsInScreenRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers intersecting this Range in buffer coordinates. */
  var intersectsBufferRange: js.UndefOr[RangeCompatible] = js.native
  /**
    *  Only include markers intersecting this Array of [startRow, endRow] in
    *  buffer coordinates.
    */
  var intersectsBufferRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /** Only include markers intersecting this Range in screen coordinates. */
  var intersectsScreenRange: js.UndefOr[RangeCompatible] = js.native
  /**
    *  Only include markers intersecting this Array of [startRow, endRow] in
    *  screen coordinates.
    */
  var intersectsScreenRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /** Only include markers starting at this Point in buffer coordinates. */
  var startBufferPosition: js.UndefOr[PointCompatible] = js.native
  /** Only include markers starting at this row in buffer coordinates. */
  var startBufferRow: js.UndefOr[Double] = js.native
  /** Only include markers starting at this Point in screen coordinates. */
  var startScreenPosition: js.UndefOr[PointCompatible] = js.native
  /** Only include markers starting at this row in screen coordinates. */
  var startScreenRow: js.UndefOr[Double] = js.native
  /** Only include markers starting inside this Range in buffer coordinates. */
  var startsInBufferRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers starting inside this Range in screen coordinates. */
  var startsInScreenRange: js.UndefOr[RangeCompatible] = js.native
}

object FindDisplayMarker {
  @scala.inline
  def apply(): FindDisplayMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindDisplayMarker]
  }
  @scala.inline
  implicit class FindDisplayMarkerOps[Self <: FindDisplayMarker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainedInBufferRange(value: RangeCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containedInBufferRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainedInBufferRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containedInBufferRange")(js.undefined)
        ret
    }
    @scala.inline
    def withContainedInScreenRange(value: RangeCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containedInScreenRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainedInScreenRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containedInScreenRange")(js.undefined)
        ret
    }
    @scala.inline
    def withContainsBufferPosition(value: PointCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsBufferPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsBufferPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsBufferPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withContainsBufferRange(value: RangeCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsBufferRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsBufferRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsBufferRange")(js.undefined)
        ret
    }
    @scala.inline
    def withEndBufferPosition(value: PointCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endBufferPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndBufferPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endBufferPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withEndBufferRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endBufferRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndBufferRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endBufferRow")(js.undefined)
        ret
    }
    @scala.inline
    def withEndScreenPosition(value: PointCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endScreenPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndScreenPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endScreenPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withEndScreenRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endScreenRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndScreenRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endScreenRow")(js.undefined)
        ret
    }
    @scala.inline
    def withEndsInBufferRange(value: RangeCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsInBufferRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndsInBufferRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsInBufferRange")(js.undefined)
        ret
    }
    @scala.inline
    def withEndsInScreenRange(value: RangeCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsInScreenRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndsInScreenRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsInScreenRange")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersectsBufferRange(value: RangeCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsBufferRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersectsBufferRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsBufferRange")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersectsBufferRowRange(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsBufferRowRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersectsBufferRowRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsBufferRowRange")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersectsScreenRange(value: RangeCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsScreenRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersectsScreenRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsScreenRange")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersectsScreenRowRange(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsScreenRowRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersectsScreenRowRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsScreenRowRange")(js.undefined)
        ret
    }
    @scala.inline
    def withStartBufferPosition(value: PointCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startBufferPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartBufferPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startBufferPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withStartBufferRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startBufferRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartBufferRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startBufferRow")(js.undefined)
        ret
    }
    @scala.inline
    def withStartScreenPosition(value: PointCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startScreenPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartScreenPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startScreenPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withStartScreenRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startScreenRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartScreenRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startScreenRow")(js.undefined)
        ret
    }
    @scala.inline
    def withStartsInBufferRange(value: RangeCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsInBufferRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartsInBufferRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsInBufferRange")(js.undefined)
        ret
    }
    @scala.inline
    def withStartsInScreenRange(value: RangeCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsInScreenRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartsInScreenRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsInScreenRange")(js.undefined)
        ret
    }
  }
  
}

