package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlanListOptions extends IListOptionsCreated {
  /**
    * Only return plans that are active or inactive (e.g., pass false to list all inactive products).
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Only return plans for the given product.
    */
  var product: js.UndefOr[String] = js.native
}

object IPlanListOptions {
  @scala.inline
  def apply(): IPlanListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlanListOptions]
  }
  @scala.inline
  implicit class IPlanListOptionsOps[Self <: IPlanListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
  }
  
}

