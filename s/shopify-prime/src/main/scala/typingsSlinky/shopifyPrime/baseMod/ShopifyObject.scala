package typingsSlinky.shopifyPrime.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShopifyObject extends js.Object {
  /**
    * To help with migrating from our REST to the GraphQL, REST responses now include the GraphQL Admin API ID field, admin_graphql_api_id,. The ID in this field can be used to query the object directly using the GraphQL Admin API.
    */
  var admin_graphql_api_id: js.UndefOr[String] = js.native
  /**
    * The object's unique id.
    */
  var id: js.UndefOr[Double] = js.native
}

object ShopifyObject {
  @scala.inline
  def apply(): ShopifyObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShopifyObject]
  }
  @scala.inline
  implicit class ShopifyObjectOps[Self <: ShopifyObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmin_graphql_api_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin_graphql_api_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdmin_graphql_api_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin_graphql_api_id")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

