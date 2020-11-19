package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogItemOption")
@js.native
class CatalogItemOption () extends js.Object {
  
  /**
    * The item option's human-readable description.
    * Displayed in the Square Point of Sale app for the seller and in the Online Store or on receipts for the buyer.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The item option's display name for the customer. Searchable.
    */
  var display_name: js.UndefOr[String] = js.native
  
  /**
    * The number of `CatalogItem`s currently associated with this item option.
    * Present only if the `include_counts` was specified in the request. Any count over 100 will be returned as `100`.
    */
  var item_count: js.UndefOr[Double] = js.native
  
  /**
    * The item option's display name for the seller. Must be unique across all item options. Searchable.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If true, display colors for entries in `values` when present.
    */
  var show_colors: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of CatalogObjects containing the `CatalogItemOptionValue`s for this item.
    */
  var values: js.UndefOr[js.Array[CatalogObject]] = js.native
}
