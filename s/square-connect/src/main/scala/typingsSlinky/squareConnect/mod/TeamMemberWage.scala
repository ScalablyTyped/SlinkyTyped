package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "TeamMemberWage")
@js.native
class TeamMemberWage () extends js.Object {
  
  /**
    * Can be a custom-set hourly wage or the calculated effective hourly wage based on annual wage and hours worked per week.
    */
  var hourly_rate: js.UndefOr[Money] = js.native
  
  /**
    * UUID for this object.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The `Team Member` that this wage is assigned to.
    */
  var team_member_id: js.UndefOr[String] = js.native
  
  /**
    * The job title that this wage relates to.
    */
  var title: js.UndefOr[String] = js.native
}
