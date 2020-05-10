package typingsSlinky.textBuffer.mod._Global_.TextBuffer.Events

import typingsSlinky.textBuffer.mod._Global_.TextBuffer.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerChanged extends js.Object {
  /** Boolean indicating whether the marker had a tail before the change. */
  var hadTail: Boolean = js.native
  /** Boolean indicating whether the marker now has a tail. */
  var hasTail: Boolean = js.native
  /** Boolean indicating whether the marker is now valid. */
  var isValid: Boolean = js.native
  /** Point representing the new head position. */
  var newHeadPosition: Point = js.native
  /**
    *  Object containing the marker's custom properties after the change.
    *  @deprecated
    */
  var newProperties: js.Object = js.native
  /** Point representing the new tail position. */
  var newTailPosition: Point = js.native
  /** Point representing the former head position. */
  var oldHeadPosition: Point = js.native
  /**
    *  Object containing the marker's custom properties before the change.
    *  @deprecated
    */
  var oldProperties: js.Object = js.native
  /** Point representing the former tail position. */
  var oldTailPosition: Point = js.native
  /**
    *  Boolean indicating whether this change was caused by a textual
    *  change to the buffer or whether the marker was manipulated directly
    *  via its public API.
    */
  var textChanged: Boolean = js.native
  /** Boolean indicating whether the marker was valid before the change. */
  var wasValid: Boolean = js.native
}

object MarkerChanged {
  @scala.inline
  def apply(
    hadTail: Boolean,
    hasTail: Boolean,
    isValid: Boolean,
    newHeadPosition: Point,
    newProperties: js.Object,
    newTailPosition: Point,
    oldHeadPosition: Point,
    oldProperties: js.Object,
    oldTailPosition: Point,
    textChanged: Boolean,
    wasValid: Boolean
  ): MarkerChanged = {
    val __obj = js.Dynamic.literal(hadTail = hadTail.asInstanceOf[js.Any], hasTail = hasTail.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], newHeadPosition = newHeadPosition.asInstanceOf[js.Any], newProperties = newProperties.asInstanceOf[js.Any], newTailPosition = newTailPosition.asInstanceOf[js.Any], oldHeadPosition = oldHeadPosition.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any], oldTailPosition = oldTailPosition.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], wasValid = wasValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerChanged]
  }
  @scala.inline
  implicit class MarkerChangedOps[Self <: MarkerChanged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHadTail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hadTail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasTail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewHeadPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHeadPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewTailPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTailPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldHeadPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldHeadPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldTailPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldTailPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWasValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasValid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

