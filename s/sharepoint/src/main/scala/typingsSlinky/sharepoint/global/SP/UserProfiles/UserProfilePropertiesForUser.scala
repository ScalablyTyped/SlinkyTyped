package typingsSlinky.sharepoint.global.SP.UserProfiles

import typingsSlinky.sharepoint.SP.ClientContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a set of user profile properties for a specified user. */
@JSGlobal("SP.UserProfiles.UserProfilePropertiesForUser")
@js.native
class UserProfilePropertiesForUser protected ()
  extends typingsSlinky.sharepoint.SP.UserProfiles.UserProfilePropertiesForUser {
  /** Creates new UserProfilePropertiesForUser object
    @param context Specifies the client context to use.
    @param accountName Specifies the user by account name.
    @param propertyNames Specifies an array of strings that specify the properties to retrieve. */
  def this(context: ClientContext, accountName: String, propertyNames: js.Array[String]) = this()
}
