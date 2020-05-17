package typingsSlinky.tabris.anon

import typingsSlinky.tabris.mod.ConstraintLikeObject
import typingsSlinky.tabris.mod.PercentValue
import typingsSlinky.tabris.mod.SiblingReferenceValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends ConstraintLikeObject {
  var offset: typingsSlinky.tabris.mod.Offset = js.native
  var reference: js.UndefOr[SiblingReferenceValue | PercentValue] = js.native
}

object Reference {
  @scala.inline
  def apply(offset: typingsSlinky.tabris.mod.Offset): Reference = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  @scala.inline
  implicit class ReferenceOps[Self <: Reference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: typingsSlinky.tabris.mod.Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: SiblingReferenceValue | PercentValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(js.undefined)
        ret
    }
  }
  
}

