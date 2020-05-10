package typingsSlinky.shopifyPrime.themeMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.demo
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.main
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.unpublished
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends ShopifyObject {
  /**
    * The date and time (ISO 8601 format) when the theme was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The name of the theme.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether the theme can currently be previewed.
    */
  var previewable: js.UndefOr[Boolean] = js.native
  /**
    * Whether files are still being copied into place for this theme.
    */
  var processing: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how the theme is being used within the shop. Valid values:
    * * main: The theme is published. Customers see it when they visit the online store.
    * * unpublished: The theme is unpublished. Customers can't see it.
    * * demo: The theme is installed on the store as a demo. The theme can't be published until the merchant buys the full version.
    */
  var role: js.UndefOr[main | unpublished | demo] = js.native
  /**
    * A unique identifier applied to Shopify-made themes that are installed from the Shopify Theme Store Theme Store. Not all themes available in the Theme Store are developed by Shopify. Returns null if the store's theme isn't made by Shopify, or if it wasn't installed from the Theme Store.
    */
  var theme_store_id: js.UndefOr[Double | Null] = js.native
  /**
    * The date and time ( ISO 8601 format) when the theme was last updated.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object Theme {
  @scala.inline
  def apply(): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewable")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: main | unpublished | demo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme_store_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_store_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme_store_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_store_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme_store_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_store_id")(null)
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(js.undefined)
        ret
    }
  }
  
}

