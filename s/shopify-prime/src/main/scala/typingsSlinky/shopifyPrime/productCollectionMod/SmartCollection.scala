package typingsSlinky.shopifyPrime.productCollectionMod

import typingsSlinky.shopifyPrime.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartCollection extends ProductCollection {
  /**
    * If false, products must match all of the rules to be included in the collection. If true, products can only match one of the rules.
    */
  var disjunctive: js.UndefOr[Boolean] = js.native
  /**
    * The list of rules that define what products go into the smart collection. Each rule has the following properties:
    *
    * relation:
    * The relationship between the column choice, and the condition.
    * Number relations:
    *
    * greater_than: column value is greater than the condition.
    * less_than: column value is less than the condition.
    * equals: column value is equal to the condition.
    * not_equals: column value is not equal to the condition.
    * Text relations:
    *
    * equals: column value is equal to the condition.
    * not_equals: column value is not equal to the condition.
    * starts_with: column value starts with the condition.
    * ends_with: column value ends with the condition.
    * contains: column value contains the condition.
    * not_contains: column value does not contain the condition.
    * condition:
    * Select products for a collection using a condition. Conditions are either strings or numbers, depending on the relation.
    * column:
    * The properties of a product that can be used to populate a collection.
    *
    * The following columns are restricted to text relations:
    *
    * title: product title.
    * type: product type.
    * vendor: product vendor.
    * variant_title: variant's title.
    * The following columns are restricted to number relations:
    *
    * variant_compare_at_price: compare at price.
    * variant_weight: weight.
    * variant_inventory: inventory stock. Exception: not_equals does not work on variant_inventory.
    * variant_price: product price.
    * The following column is restricted to the equals relation:
    *
    * tag: product tag.
    */
  var rules: js.UndefOr[js.Array[Column]] = js.native
}

object SmartCollection {
  @scala.inline
  def apply(): SmartCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartCollection]
  }
  @scala.inline
  implicit class SmartCollectionOps[Self <: SmartCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisjunctive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disjunctive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisjunctive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disjunctive")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}

