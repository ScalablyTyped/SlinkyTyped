package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuditAction extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AuditAction")
@js.native
object AuditAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuditAction with Double] = js.native
  
  @js.native
  sealed trait Add extends AuditAction
  /* 1 */ val Add: typingsSlinky.vsoNodeApi.releaseInterfacesMod.AuditAction.Add with Double = js.native
  
  @js.native
  sealed trait Delete extends AuditAction
  /* 3 */ val Delete: typingsSlinky.vsoNodeApi.releaseInterfacesMod.AuditAction.Delete with Double = js.native
  
  @js.native
  sealed trait Undelete extends AuditAction
  /* 4 */ val Undelete: typingsSlinky.vsoNodeApi.releaseInterfacesMod.AuditAction.Undelete with Double = js.native
  
  @js.native
  sealed trait Update extends AuditAction
  /* 2 */ val Update: typingsSlinky.vsoNodeApi.releaseInterfacesMod.AuditAction.Update with Double = js.native
}
