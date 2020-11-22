package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchTeamMembersRequest")
@js.native
class SearchTeamMembersRequest () extends js.Object {
  
  /**
    * The opaque cursor for fetching the next page.
    * Read about [pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination) with Square APIs for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of `TeamMember` objects in a page (25 by default).
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The query parameters.
    */
  var query: js.UndefOr[SearchTeamMembersQuery] = js.native
}
