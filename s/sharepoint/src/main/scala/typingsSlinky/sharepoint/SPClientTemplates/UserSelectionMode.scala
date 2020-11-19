package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserSelectionMode extends js.Object
@JSGlobal("SPClientTemplates.UserSelectionMode")
@js.native
object UserSelectionMode extends js.Object {
  
  @js.native
  sealed trait PeopleAndGroups extends UserSelectionMode
  
  @js.native
  sealed trait PeopleOnly extends UserSelectionMode
}
