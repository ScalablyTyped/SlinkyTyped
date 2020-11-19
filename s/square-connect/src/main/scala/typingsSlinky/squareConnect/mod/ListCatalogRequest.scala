package typingsSlinky.squareConnect.mod

import typingsSlinky.squareConnect.squareConnectStrings.CATEGORY
import typingsSlinky.squareConnect.squareConnectStrings.DISCOUNT
import typingsSlinky.squareConnect.squareConnectStrings.IMAGE
import typingsSlinky.squareConnect.squareConnectStrings.ITEM
import typingsSlinky.squareConnect.squareConnectStrings.ITEM_VARIATION
import typingsSlinky.squareConnect.squareConnectStrings.MODIFIER
import typingsSlinky.squareConnect.squareConnectStrings.MODIFIER_LIST
import typingsSlinky.squareConnect.squareConnectStrings.TAX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListCatalogRequest")
@js.native
class ListCatalogRequest () extends js.Object {
  
  /**
    * TThe pagination cursor returned in the previous response. Leave unset for an initial request.
    * See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * An optional case-insensitive, comma-separated list of object types to retrieve, for example `ITEM,ITEM_VARIATION,CATEGORY,IMAGE`.
    */
  var types: js.UndefOr[
    ITEM | ITEM_VARIATION | CATEGORY | DISCOUNT | TAX | MODIFIER | MODIFIER_LIST | IMAGE
  ] = js.native
}
