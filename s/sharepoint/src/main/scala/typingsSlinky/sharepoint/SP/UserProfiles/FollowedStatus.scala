package typingsSlinky.sharepoint.SP.UserProfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FollowedStatus extends js.Object
@JSGlobal("SP.UserProfiles.FollowedStatus")
@js.native
object FollowedStatus extends js.Object {
  
  @js.native
  sealed trait followed extends FollowedStatus
  
  @js.native
  sealed trait notFollowable extends FollowedStatus
  
  @js.native
  sealed trait notFollowed extends FollowedStatus
}
