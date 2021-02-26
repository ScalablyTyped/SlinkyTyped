package typingsSlinky.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeTypes extends StObject
/** Specifies types of changes made in the user profile store. */
@JSGlobal("SP.UserProfiles.ChangeTypes")
@js.native
object ChangeTypes extends StObject {
  
  /** An object was added */
  @js.native
  sealed trait add extends ChangeTypes
  
  /** Multiple operations were performed on an object */
  @js.native
  sealed trait all extends ChangeTypes
  
  /** The metadata of an object was modified */
  @js.native
  sealed trait metadata extends ChangeTypes
  
  /** An object was modified */
  @js.native
  sealed trait modify extends ChangeTypes
  
  /** No change was made */
  @js.native
  sealed trait none extends ChangeTypes
  
  /** An object was removed */
  @js.native
  sealed trait remove extends ChangeTypes
}
