package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuditAction extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "AuditAction")
@js.native
object AuditAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuditAction with Double] = js.native
  
  @js.native
  sealed trait Add extends AuditAction
  /* 1 */ val Add: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.AuditAction.Add with Double = js.native
  
  @js.native
  sealed trait Delete extends AuditAction
  /* 3 */ val Delete: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.AuditAction.Delete with Double = js.native
  
  @js.native
  sealed trait Update extends AuditAction
  /* 2 */ val Update: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.AuditAction.Update with Double = js.native
}
