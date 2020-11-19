package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogCustomAttributeDefinition")
@js.native
class CatalogCustomAttributeDefinition () extends js.Object {
  
  /**
    * The set of Catalog Object Types that this Custom Attribute may be applied to.
    * Only `ITEM` and `ITEM_VARIATION` are allowed. See [CatalogObjectType](#type-catalogobjecttype) for possible values.
    */
  var allowed_object_types: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The visibility of a custom attribute to applications other than the application that created the attribute.
    * See [CatalogCustomAttributeDefinitionAppVisibility](#type-catalogcustomattributedefinitionappvisibility) for possible values.
    */
  var app_visibility: js.UndefOr[String] = js.native
  
  /**
    * __Read-only.__ The number of custom attributes that reference this custom attribute definition.
    * Set by the server in response to a ListCatalog request with `include_counts` set to `true`.
    * If the actual count is greater than 100, `custom_attribute_usage_count` will be set to `100`.
    */
  var custom_attribute_usage_count: js.UndefOr[Double] = js.native
  
  /**
    * Seller-oriented description of the meaning of this Custom Attribute, any constraints that the seller should observe, etc.
    * May be displayed as a tooltip in Square UIs.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The name of the desired custom attribute key that can be used to access the custom attribute value on catalog objects.
    * Cannot be modified after the custom attribute definition has been created.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    *  The name of this definition for API and seller-facing UI purposes.
    *  The name must be unique within the (merchant, application_id) pair. Required.
    *  May not be empty and may not exceed 255 characters. Can be modified after creation.
    */
  var name: String = js.native
  
  /**
    * Populated when `type` is set to `SELECTION`, unset otherwise.
    */
  var selection_config: js.UndefOr[CatalogCustomAttributeDefinitionSelectionConfig] = js.native
  
  /**
    * The visibility of a custom attribute in seller-facing UIs (including Square Point of Sale applications and
    * Square Dashboard). May be modified.
    * See [CatalogCustomAttributeDefinitionSellerVisibility](#type-catalogcustomattributedefinitionsellervisibility) for possible values.
    */
  var seller_visibility: js.UndefOr[String] = js.native
  
  /**
    * Contains information about the application that created this custom attribute definition.
    */
  val source_application: js.UndefOr[SourceApplication] = js.native
  
  /**
    * Optionally, populated when `type` = `STRING`, unset otherwise.
    */
  var string_config: js.UndefOr[CatalogCustomAttributeDefinitionStringConfig] = js.native
  
  /**
    * The type of this custom attribute. Cannot be modified after creation. Required.
    * See [CatalogCustomAttributeDefinitionType](#type-catalogcustomattributedefinitiontype) for possible values.
    */
  var `type`: String = js.native
}
