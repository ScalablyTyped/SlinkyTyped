package typingsSlinky.stripe.mod.taxRates

import typingsSlinky.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaxRateCreationOptions extends js.Object {
  /**
    * Flag determining whether the tax rate is active or inactive. Inactive tax rates continue to work where they are currently applied however they cannot be used for new applications.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * An arbitrary string attached to the tax rate for your internal use only. It will not be visible to your customers.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The display name of the tax rate, which will be shown to users.
    */
  var display_name: String = js.native
  /**
    * This specifies if the tax rate is inclusive or exclusive.
    */
  var inclusive: Boolean = js.native
  /**
    * The jurisdiction for the tax rate.
    */
  var jurisdiction: js.UndefOr[String] = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    * Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * This represents the tax rate percent out of 100.
    */
  var percentage: Double = js.native
}

object ITaxRateCreationOptions {
  @scala.inline
  def apply(display_name: String, inclusive: Boolean, percentage: Double): ITaxRateCreationOptions = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaxRateCreationOptions]
  }
  @scala.inline
  implicit class ITaxRateCreationOptionsOps[Self <: ITaxRateCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(value.asInstanceOf[js.Any])
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withJurisdiction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jurisdiction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJurisdiction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jurisdiction")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: IOptionsMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

