package typingsSlinky.stripe.mod.taxRates

import typingsSlinky.stripe.mod.IDateFilter
import typingsSlinky.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItaxRateSearchOptions extends IListOptions {
  /**
    * Optional flag to filter by tax rates that are either active or not active (archived)
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * A filter on the list based on the object created field.
    */
  var created: js.UndefOr[String | IDateFilter] = js.native
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make
    * a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in
    * order to fetch the previous page of the list.
    */
  var inclusive: js.UndefOr[Boolean] = js.native
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    */
  @JSName("limit")
  var limit_ItaxRateSearchOptions: Double = js.native
}

object ItaxRateSearchOptions {
  @scala.inline
  def apply(limit: Double): ItaxRateSearchOptions = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItaxRateSearchOptions]
  }
  @scala.inline
  implicit class ItaxRateSearchOptionsOps[Self <: ItaxRateSearchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withCreated(value: String | IDateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withInclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive")(js.undefined)
        ret
    }
  }
  
}

