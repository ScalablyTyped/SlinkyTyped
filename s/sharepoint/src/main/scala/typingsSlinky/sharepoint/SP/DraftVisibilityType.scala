package typingsSlinky.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DraftVisibilityType extends StObject
@JSGlobal("SP.DraftVisibilityType")
@js.native
object DraftVisibilityType extends StObject {
  
  @js.native
  sealed trait approver extends DraftVisibilityType
  
  @js.native
  sealed trait author extends DraftVisibilityType
  
  @js.native
  sealed trait reader extends DraftVisibilityType
}
