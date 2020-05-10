package typingsSlinky.xrm.Xrm.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type to hold Labels as part of the EntityMetadata
  */
@js.native
trait Label extends js.Object {
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var LocalizedLabels: js.Array[LocalizedLabel] = js.native
  var UserLocalizedLabel: LocalizedLabel = js.native
}

object Label {
  @scala.inline
  def apply(LocalizedLabels: js.Array[LocalizedLabel], UserLocalizedLabel: LocalizedLabel): Label = {
    val __obj = js.Dynamic.literal(LocalizedLabels = LocalizedLabels.asInstanceOf[js.Any], UserLocalizedLabel = UserLocalizedLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalizedLabels(value: js.Array[LocalizedLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalizedLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserLocalizedLabel(value: LocalizedLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserLocalizedLabel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

