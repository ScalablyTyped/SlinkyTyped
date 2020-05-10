package typingsSlinky.shopifyPrime.metaFieldMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.integer
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaField extends ShopifyObject {
  /**
    * The date and time when the metafield was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * Additional information about the metafield.
    */
  var description: String = js.native
  /**
    * Identifier for the metafield (maximum of 30 characters).
    */
  var key: String = js.native
  /**
    * Container for a set of metadata. Namespaces help distinguish between metadata you created and metadata created by another individual with a similar namespace (maximum of 20 characters).
    */
  var namespace: String = js.native
  /**
    * The Id of the Shopify Resource that the metafield is associated with. This value could be the id of things like product, order, variant, collection.
    */
  var owner_id: js.UndefOr[Double] = js.native
  /**
    * The name of the Shopify Resource that the metafield is associated with. This could be things like product, order, variant, collection.
    */
  var owner_resource: String = js.native
  /**
    * The date and time when the metafield was last updated.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * Information to be stored as metadata. Must be either a string or an int.
    */
  var value: String | Double = js.native
  /**
    * States whether the information in the value is stored as a 'string' or 'integer.'
    */
  var value_type: string | integer = js.native
}

object MetaField {
  @scala.inline
  def apply(
    description: String,
    key: String,
    namespace: String,
    owner_resource: String,
    value: String | Double,
    value_type: string | integer
  ): MetaField = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], owner_resource = owner_resource.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], value_type = value_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaField]
  }
  @scala.inline
  implicit class MetaFieldOps[Self <: MetaField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner_resource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner_resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue_type(value: string | integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value_type")(value.asInstanceOf[js.Any])
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
    def withOwner_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner_id")(js.undefined)
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

