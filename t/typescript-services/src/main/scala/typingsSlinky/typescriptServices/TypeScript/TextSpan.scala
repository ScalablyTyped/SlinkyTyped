package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextSpan extends js.Object {
  var _length: js.Any = js.native
  var _start: js.Any = js.native
  def containsPosition(position: Double): Boolean = js.native
  def containsTextSpan(span: TextSpan): Boolean = js.native
  def end(): Double = js.native
  def intersection(span: TextSpan): TextSpan = js.native
  def intersectsWith(start: Double, length: Double): Boolean = js.native
  def intersectsWithPosition(position: Double): Boolean = js.native
  def intersectsWithTextSpan(span: TextSpan): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def length(): Double = js.native
  def overlap(span: TextSpan): TextSpan = js.native
  def overlapsWith(span: TextSpan): Boolean = js.native
  def start(): Double = js.native
}

object TextSpan {
  @scala.inline
  def apply(
    _length: js.Any,
    _start: js.Any,
    containsPosition: Double => Boolean,
    containsTextSpan: TextSpan => Boolean,
    end: () => Double,
    intersection: TextSpan => TextSpan,
    intersectsWith: (Double, Double) => Boolean,
    intersectsWithPosition: Double => Boolean,
    intersectsWithTextSpan: TextSpan => Boolean,
    isEmpty: () => Boolean,
    length: () => Double,
    overlap: TextSpan => TextSpan,
    overlapsWith: TextSpan => Boolean,
    start: () => Double
  ): TextSpan = {
    val __obj = js.Dynamic.literal(_length = _length.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], containsPosition = js.Any.fromFunction1(containsPosition), containsTextSpan = js.Any.fromFunction1(containsTextSpan), end = js.Any.fromFunction0(end), intersection = js.Any.fromFunction1(intersection), intersectsWith = js.Any.fromFunction2(intersectsWith), intersectsWithPosition = js.Any.fromFunction1(intersectsWithPosition), intersectsWithTextSpan = js.Any.fromFunction1(intersectsWithTextSpan), isEmpty = js.Any.fromFunction0(isEmpty), length = js.Any.fromFunction0(length), overlap = js.Any.fromFunction1(overlap), overlapsWith = js.Any.fromFunction1(overlapsWith), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[TextSpan]
  }
  @scala.inline
  implicit class TextSpanOps[Self <: TextSpan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_length(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_start(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainsPosition(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainsTextSpan(value: TextSpan => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsTextSpan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnd(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIntersection(value: TextSpan => TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIntersectsWith(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsWith")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIntersectsWithPosition(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsWithPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIntersectsWithTextSpan(value: TextSpan => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsWithTextSpan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOverlap(value: TextSpan => TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOverlapsWith(value: TextSpan => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapsWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

