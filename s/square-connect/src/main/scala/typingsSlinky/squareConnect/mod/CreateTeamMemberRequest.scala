package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateTeamMemberRequest")
@js.native
class CreateTeamMemberRequest () extends js.Object {
  
  /**
    * A unique string that identifies this CreateTeamMember request.
    * Keys can be any valid string but must be unique for every request.
    * See [Idempotency keys](https://developer.squareup.com/docs/basics/api101/idempotency) for more information.
    * <br> <b>Min Length 1 Max Length 45</b>
    */
  var idempotency_key: js.UndefOr[String] = js.native
  
  /**
    * The data which will be used to create the `TeamMember` object.
    */
  var team_member: TeamMember = js.native
}
