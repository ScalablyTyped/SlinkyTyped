package typingsSlinky.tabris

import typingsSlinky.tabris.mod.ConstraintLikeObject
import typingsSlinky.tabris.mod.Offset
import typingsSlinky.tabris.mod.PercentValue
import typingsSlinky.tabris.mod.SiblingReferenceValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOffset extends ConstraintLikeObject {
  var offset: js.UndefOr[Offset] = js.native
  var reference: SiblingReferenceValue | PercentValue = js.native
}

object AnonOffset {
  @scala.inline
  def apply(reference: SiblingReferenceValue | PercentValue): AnonOffset = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffset]
  }
  @scala.inline
  implicit class AnonOffsetOps[Self <: AnonOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReference(value: SiblingReferenceValue | PercentValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

