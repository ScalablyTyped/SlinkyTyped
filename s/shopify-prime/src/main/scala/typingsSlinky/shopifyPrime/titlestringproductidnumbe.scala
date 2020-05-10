package typingsSlinky.shopifyPrime

import typingsSlinky.shopifyPrime.publishedStatusMod.PublishedStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  title ? :string,   product_id ? :number} & shopify-prime.shopify-prime/dist/options.DateOptions & shopify-prime.shopify-prime/dist/options.PublishedOptions */
@js.native
trait titlestringproductidnumbe extends js.Object {
  /**
    * Retrieve only objects that were created before the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var created_at_max: js.UndefOr[String] = js.native
  /**
    * Retrieve only objects that were created after the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var created_at_min: js.UndefOr[String] = js.native
  var product_id: js.UndefOr[Double] = js.native
  /**
    * Filter results to those published before date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_max: js.UndefOr[String] = js.native
  /**
    * Filter results to those published after date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_min: js.UndefOr[String] = js.native
  /**
    * Filter results to those with the given publish status.
    */
  var published_status: js.UndefOr[PublishedStatus] = js.native
  var title: js.UndefOr[String] = js.native
  /**
    * Retrieve only objects that were created before the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var updated_at_max: js.UndefOr[String] = js.native
  /**
    * Retrieve only objects that were created after the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var updated_at_min: js.UndefOr[String] = js.native
}

object titlestringproductidnumbe {
  @scala.inline
  def apply(): titlestringproductidnumbe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[titlestringproductidnumbe]
  }
  @scala.inline
  implicit class titlestringproductidnumbeOps[Self <: titlestringproductidnumbe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at_max(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at_max")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_at_min(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at_min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at_min: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at_min")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_id")(js.undefined)
        ret
    }
    @scala.inline
    def withPublished_at_max(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished_at_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at_max")(js.undefined)
        ret
    }
    @scala.inline
    def withPublished_at_min(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at_min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished_at_min: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at_min")(js.undefined)
        ret
    }
    @scala.inline
    def withPublished_status(value: PublishedStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_status")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at_max(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at_max")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at_min(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at_min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at_min: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at_min")(js.undefined)
        ret
    }
  }
  
}

