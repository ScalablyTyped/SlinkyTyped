package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GateStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "GateStatus")
@js.native
object GateStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GateStatus with Double] = js.native
  
  @js.native
  sealed trait Failed extends GateStatus
  /* 8 */ val Failed: typingsSlinky.vsoNodeApi.releaseInterfacesMod.GateStatus.Failed with Double = js.native
  
  @js.native
  sealed trait InProgress extends GateStatus
  /* 2 */ val InProgress: typingsSlinky.vsoNodeApi.releaseInterfacesMod.GateStatus.InProgress with Double = js.native
  
  @js.native
  sealed trait None extends GateStatus
  /* 0 */ val None: typingsSlinky.vsoNodeApi.releaseInterfacesMod.GateStatus.None with Double = js.native
  
  @js.native
  sealed trait Pending extends GateStatus
  /* 1 */ val Pending: typingsSlinky.vsoNodeApi.releaseInterfacesMod.GateStatus.Pending with Double = js.native
  
  @js.native
  sealed trait Succeeded extends GateStatus
  /* 4 */ val Succeeded: typingsSlinky.vsoNodeApi.releaseInterfacesMod.GateStatus.Succeeded with Double = js.native
}
