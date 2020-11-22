package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RetrieveTeamMemberResponse")
@js.native
class RetrieveTeamMemberResponse () extends js.Object {
  
  /**
    * The errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The successfully retrieved `TeamMember` object.
    */
  var team_member: js.UndefOr[TeamMember] = js.native
}
