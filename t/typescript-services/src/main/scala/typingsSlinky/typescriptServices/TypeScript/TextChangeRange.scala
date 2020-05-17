package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextChangeRange extends js.Object {
  var _newLength: js.Any = js.native
  var _span: js.Any = js.native
  def isUnchanged(): Boolean = js.native
  def newLength(): Double = js.native
  def newSpan(): TextSpan = js.native
  def span(): TextSpan = js.native
}

object TextChangeRange {
  @scala.inline
  def apply(
    _newLength: js.Any,
    _span: js.Any,
    isUnchanged: () => Boolean,
    newLength: () => Double,
    newSpan: () => TextSpan,
    span: () => TextSpan
  ): TextChangeRange = {
    val __obj = js.Dynamic.literal(_newLength = _newLength.asInstanceOf[js.Any], _span = _span.asInstanceOf[js.Any], isUnchanged = js.Any.fromFunction0(isUnchanged), newLength = js.Any.fromFunction0(newLength), newSpan = js.Any.fromFunction0(newSpan), span = js.Any.fromFunction0(span))
    __obj.asInstanceOf[TextChangeRange]
  }
  @scala.inline
  implicit class TextChangeRangeOps[Self <: TextChangeRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_newLength(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_newLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_span(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUnchanged(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnchanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSpan(value: () => TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSpan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSpan(value: () => TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

