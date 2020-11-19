package typingsSlinky.sharepoint.SP.UserProfiles

import typingsSlinky.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an alternate entry point to user profiles rather than calling methods directly. */
@js.native
trait ProfileLoader extends ClientObject {
  
  def getUserProfile(): UserProfile = js.native
}
