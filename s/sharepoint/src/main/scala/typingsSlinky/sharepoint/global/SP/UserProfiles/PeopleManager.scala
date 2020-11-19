package typingsSlinky.sharepoint.global.SP.UserProfiles

import typingsSlinky.sharepoint.SP.BooleanResult
import typingsSlinky.sharepoint.SP.ClientRuntimeContext
import typingsSlinky.sharepoint.SP.UserProfiles.HashTagCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods for operations related to people.
  Note: The SocialFollowingManager object is the recommended object for performing Following People and Following Content tasks.
  However, PeopleManager provides some methods that SocialFollowingManager doesn't. */
@JSGlobal("SP.UserProfiles.PeopleManager")
@js.native
class PeopleManager protected ()
  extends typingsSlinky.sharepoint.SP.UserProfiles.PeopleManager {
  def this(context: ClientRuntimeContext) = this()
}
/* static members */
@JSGlobal("SP.UserProfiles.PeopleManager")
@js.native
object PeopleManager extends js.Object {
  
  def getTrendingTags(context: ClientRuntimeContext): HashTagCollection = js.native
  
  /** Checks whether the first user is following the second user. */
  def isFollowing(
    context: ClientRuntimeContext,
    possibleFollowerAccountName: String,
    possibleFolloweeAccountName: String
  ): BooleanResult = js.native
}
