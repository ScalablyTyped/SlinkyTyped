package typingsSlinky.shopifyPrime.shopMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shop extends ShopifyObject {
  /**
    * The shop's street address.
    */
  var address1: js.UndefOr[String] = js.native
  /**
    * The second line of the shop's street address.
    */
  var address2: js.UndefOr[String] = js.native
  /**
    * The city in which the shop is located.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * The shop's country (by default equal to the two-letter country code).
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The two-letter country code corresponding to the shop's country.
    */
  var country_code: js.UndefOr[String] = js.native
  /**
    * The shop's normalized country name.
    */
  var country_name: js.UndefOr[String] = js.native
  /**
    * The setting for whether the shop is applying taxes on a per-county basis or not (US-only). Valid values are: "true" or "null."
    */
  var county_taxes: js.UndefOr[Boolean] = js.native
  /**
    * The date and time when the shop was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The three-letter code for the currency that the shop accepts.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The customer's email.
    */
  var customer_email: js.UndefOr[String] = js.native
  /**
    * The shop's description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The display name of the Shopify plan the shop is on.
    */
  var display_plan_name: js.UndefOr[String] = js.native
  /**
    * The shop's domain.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * The contact email address for the shop.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Indicates whether the shop forces requests made to its resources to be made over SSL, using the HTTPS protocol. If true, HTTP requests will be redirected to HTTPS.
    */
  var force_ssl: js.UndefOr[Boolean] = js.native
  /**
    * Present when a shop has a google app domain. It will be returned as a URL, else null.
    */
  var google_apps_domain: js.UndefOr[String] = js.native
  /**
    * Present if a shop has google apps enabled. Those shops with this feature will be able to login to the google apps login.
    */
  var google_apps_login_enabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the shop supports the Discounts api
    */
  var has_discounts: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the shop supports the Gift Cards api
    */
  var has_gift_cards: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the shop has web-based storefront or not.
    */
  var has_storefront: js.UndefOr[Boolean] = js.native
  /**
    * The named timezone assigned by the IANA.
    */
  var iana_timezone: js.UndefOr[String] = js.native
  /**
    * Geographic coordinate specifying the north/south location of a shop.
    */
  var latitude: js.UndefOr[String] = js.native
  /**
    * Geographic coordinate specifying the east/west location of a shop.
    */
  var longitude: js.UndefOr[String] = js.native
  /**
    * A string representing the way currency is formatted when the currency isn't specified.
    */
  var money_format: js.UndefOr[String] = js.native
  /**
    * A string representing the way currency is formatted when the currency is specified.
    */
  var money_with_currency_format: js.UndefOr[String] = js.native
  /**
    * The shop's 'myshopify.com' domain.
    */
  var myshopify_domain: js.UndefOr[String] = js.native
  /**
    * The name of the shop.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indicates whether the Storefront password protection is enabled.
    */
  var password_enabled: js.UndefOr[Boolean] = js.native
  /**
    * The contact phone number for the shop.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * The name of the Shopify plan the shop is on.
    */
  var plan_name: js.UndefOr[String] = js.native
  /**
    * The shop's primary locale.
    */
  var primary_locale: js.UndefOr[String] = js.native
  /**
    * The shop's normalized province or state name.
    */
  var province: js.UndefOr[String] = js.native
  /**
    * The two-letter code for the shop's province or state.
    */
  var province_code: js.UndefOr[String] = js.native
  /**
    * Indicates whether the shop has any outstanding setup steps or not.
    */
  var setup_required: js.UndefOr[Boolean] = js.native
  /**
    * A list of countries the shop ships products to, separated by a comma.
    */
  var ships_to_countries: js.UndefOr[String] = js.native
  /**
    * The username of the shop owner.
    */
  var shop_owner: js.UndefOr[String] = js.native
  /**
    * Unkown. Shopify documentation does not currently indicate what this property actually is.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Specifies whether or not taxes were charged for shipping. Although the Shopify docs don't indicate this, it's possible for the value to be null.
    */
  var tax_shipping: js.UndefOr[Boolean] = js.native
  /**
    * The setting for whether applicable taxes are included in product prices.
    */
  var taxes_included: js.UndefOr[Boolean] = js.native
  /**
    * The name of the timezone the shop is in.
    */
  var timezone: js.UndefOr[String] = js.native
  /**
    * The zip or postal code of the shop's address.
    */
  var zip: js.UndefOr[String] = js.native
}

object Shop {
  @scala.inline
  def apply(): Shop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shop]
  }
  @scala.inline
  implicit class ShopOps[Self <: Shop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address1")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address2")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_name")(js.undefined)
        ret
    }
    @scala.inline
    def withCounty_taxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("county_taxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounty_taxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("county_taxes")(js.undefined)
        ret
    }
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
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_email")(js.undefined)
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
    def withDisplay_plan_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_plan_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_plan_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_plan_name")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withForce_ssl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce_ssl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogle_apps_domain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google_apps_domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogle_apps_domain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google_apps_domain")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogle_apps_login_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google_apps_login_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogle_apps_login_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google_apps_login_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_discounts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_discounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_discounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_discounts")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_gift_cards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_gift_cards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_gift_cards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_gift_cards")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_storefront(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_storefront")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_storefront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_storefront")(js.undefined)
        ret
    }
    @scala.inline
    def withIana_timezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iana_timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIana_timezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iana_timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withLatitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withMoney_format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("money_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoney_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("money_format")(js.undefined)
        ret
    }
    @scala.inline
    def withMoney_with_currency_format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("money_with_currency_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoney_with_currency_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("money_with_currency_format")(js.undefined)
        ret
    }
    @scala.inline
    def withMyshopify_domain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("myshopify_domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMyshopify_domain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("myshopify_domain")(js.undefined)
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
    def withPassword_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withPlan_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlan_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan_name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary_locale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary_locale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_locale")(js.undefined)
        ret
    }
    @scala.inline
    def withProvince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(js.undefined)
        ret
    }
    @scala.inline
    def withProvince_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvince_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province_code")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup_required(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup_required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetup_required: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup_required")(js.undefined)
        ret
    }
    @scala.inline
    def withShips_to_countries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ships_to_countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShips_to_countries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ships_to_countries")(js.undefined)
        ret
    }
    @scala.inline
    def withShop_owner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shop_owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShop_owner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shop_owner")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTax_shipping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_shipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_shipping")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxes_included(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxes_included")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxes_included: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxes_included")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withZip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(js.undefined)
        ret
    }
  }
  
}

