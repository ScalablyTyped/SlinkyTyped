package typingsSlinky.twilioChat.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSortingOptions extends js.Object {
  var criteria: ChannelSortingCriteria = js.native
  var order: js.UndefOr[ChannelSortingOrder] = js.native
}

object ChannelSortingOptions {
  @scala.inline
  def apply(criteria: ChannelSortingCriteria): ChannelSortingOptions = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSortingOptions]
  }
  @scala.inline
  implicit class ChannelSortingOptionsOps[Self <: ChannelSortingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCriteria(value: ChannelSortingCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: ChannelSortingOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
  }
  
}

