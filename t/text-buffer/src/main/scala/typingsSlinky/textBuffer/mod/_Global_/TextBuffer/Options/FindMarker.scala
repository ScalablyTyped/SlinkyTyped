package typingsSlinky.textBuffer.mod._Global_.TextBuffer.Options

import typingsSlinky.textBuffer.mod._Global_.TextBuffer.PointCompatible
import typingsSlinky.textBuffer.mod._Global_.TextBuffer.RangeCompatible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindMarker extends js.Object {
  /** Only include markers that contain the given Point, inclusive. */
  var containsPoint: js.UndefOr[PointCompatible] = js.native
  /** Only include markers that contain the given Range, inclusive. */
  var containsRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers that end at the given Point. */
  var endPosition: js.UndefOr[PointCompatible] = js.native
  /** Only include markers that end at the given row number. */
  var endRow: js.UndefOr[Double] = js.native
  /** Only include markers that end inside the given Range. */
  var endsInRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers that intersect the given row number. */
  var intersectsRow: js.UndefOr[Double] = js.native
  /** Only include markers that start at the given Point. */
  var startPosition: js.UndefOr[PointCompatible] = js.native
  /** Only include markers that start at the given row number. */
  var startRow: js.UndefOr[Double] = js.native
  /** Only include markers that start inside the given Range. */
  var startsInRange: js.UndefOr[RangeCompatible] = js.native
}

object FindMarker {
  @scala.inline
  def apply(): FindMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindMarker]
  }
  @scala.inline
  implicit class FindMarkerOps[Self <: FindMarker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsPoint(value: PointCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withContainsRange(value: RangeCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsRange")(js.undefined)
        ret
    }
    @scala.inline
    def withEndPosition(value: PointCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withEndRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRow")(js.undefined)
        ret
    }
    @scala.inline
    def withEndsInRange(value: RangeCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsInRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndsInRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsInRange")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersectsRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersectsRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsRow")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPosition(value: PointCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(js.undefined)
        ret
    }
    @scala.inline
    def withStartsInRange(value: RangeCompatible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsInRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartsInRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsInRange")(js.undefined)
        ret
    }
  }
  
}

