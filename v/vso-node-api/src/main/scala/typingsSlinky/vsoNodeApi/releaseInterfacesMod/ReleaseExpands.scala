package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseExpands extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseExpands")
@js.native
object ReleaseExpands extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseExpands with Double] = js.native
  
  @js.native
  sealed trait Approvals extends ReleaseExpands
  /* 8 */ val Approvals: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.Approvals with Double = js.native
  
  @js.native
  sealed trait Artifacts extends ReleaseExpands
  /* 4 */ val Artifacts: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.Artifacts with Double = js.native
  
  @js.native
  sealed trait Environments extends ReleaseExpands
  /* 2 */ val Environments: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.Environments with Double = js.native
  
  @js.native
  sealed trait ManualInterventions extends ReleaseExpands
  /* 16 */ val ManualInterventions: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.ManualInterventions with Double = js.native
  
  @js.native
  sealed trait None extends ReleaseExpands
  /* 0 */ val None: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.None with Double = js.native
  
  @js.native
  sealed trait Tags extends ReleaseExpands
  /* 64 */ val Tags: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.Tags with Double = js.native
  
  @js.native
  sealed trait Variables extends ReleaseExpands
  /* 32 */ val Variables: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.Variables with Double = js.native
}
