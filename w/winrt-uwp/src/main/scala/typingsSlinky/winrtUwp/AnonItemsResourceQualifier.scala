package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemsResourceQualifier extends js.Object {
  /** The objects in the view that start at startIndex. */ var items: ResourceQualifier = js.native
  /** The number of objects returned. */ var returnValue: Double = js.native
}

object AnonItemsResourceQualifier {
  @scala.inline
  def apply(items: ResourceQualifier, returnValue: Double): AnonItemsResourceQualifier = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsResourceQualifier]
  }
  @scala.inline
  implicit class AnonItemsResourceQualifierOps[Self <: AnonItemsResourceQualifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: ResourceQualifier): Self = {
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

