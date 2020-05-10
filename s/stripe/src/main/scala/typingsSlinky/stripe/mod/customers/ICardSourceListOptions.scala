package typingsSlinky.stripe.mod.customers

import typingsSlinky.stripe.mod.IListOptions
import typingsSlinky.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardSourceListOptions extends IListOptions {
  var `object`: card = js.native
}

object ICardSourceListOptions {
  @scala.inline
  def apply(`object`: card): ICardSourceListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardSourceListOptions]
  }
  @scala.inline
  implicit class ICardSourceListOptionsOps[Self <: ICardSourceListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObject(value: card): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

