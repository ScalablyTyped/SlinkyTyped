package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemsResourceCandidate extends js.Object {
  /** The ResourceCandidate objects in the set that start at startIndex. */ var items: ResourceCandidate = js.native
  /** The number of ResourceCandidate objects returned. */ var returnValue: Double = js.native
}

object AnonItemsResourceCandidate {
  @scala.inline
  def apply(items: ResourceCandidate, returnValue: Double): AnonItemsResourceCandidate = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsResourceCandidate]
  }
  @scala.inline
  implicit class AnonItemsResourceCandidateOps[Self <: AnonItemsResourceCandidate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: ResourceCandidate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

