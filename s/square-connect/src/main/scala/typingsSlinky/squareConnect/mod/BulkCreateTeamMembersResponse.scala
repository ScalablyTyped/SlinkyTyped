package typingsSlinky.squareConnect.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BulkCreateTeamMembersResponse")
@js.native
class BulkCreateTeamMembersResponse () extends js.Object {
  
  /**
    * The errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The successfully created `TeamMember` objects. Each key is the `idempotency_key` that maps to the `CreateTeamMemberRequest`.
    */
  var team_members: Record[String, CreateTeamMemberResponse] = js.native
}
