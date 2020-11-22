package typingsSlinky.squareConnect.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BulkCreateTeamMembersRequest")
@js.native
class BulkCreateTeamMembersRequest () extends js.Object {
  
  /**
    * The data which will be used to create the `TeamMember` objects.
    * Each key is the `idempotency_key` that maps to the `CreateTeamMemberRequest`.
    */
  var team_members: Record[String, CreateTeamMemberRequest] = js.native
}
