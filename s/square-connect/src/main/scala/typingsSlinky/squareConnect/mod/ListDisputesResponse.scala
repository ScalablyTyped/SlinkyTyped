package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListDisputesResponse")
@js.native
class ListDisputesResponse () extends StObject {
  
  /**
    * The pagination cursor to be used in a subsequent request. If unset, this is the final response.
    * For more information, see [Paginating](https://developer.squareup.com/docs/basics/api101/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The list of Disputes.
    */
  var disputes: js.UndefOr[js.Array[Dispute]] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
