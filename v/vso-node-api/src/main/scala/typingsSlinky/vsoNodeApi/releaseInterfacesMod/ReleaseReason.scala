package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseReason extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseReason")
@js.native
object ReleaseReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseReason with Double] = js.native
  
  @js.native
  sealed trait ContinuousIntegration extends ReleaseReason
  /* 2 */ val ContinuousIntegration: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseReason.ContinuousIntegration with Double = js.native
  
  @js.native
  sealed trait Manual extends ReleaseReason
  /* 1 */ val Manual: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseReason.Manual with Double = js.native
  
  @js.native
  sealed trait None extends ReleaseReason
  /* 0 */ val None: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseReason.None with Double = js.native
  
  @js.native
  sealed trait Schedule extends ReleaseReason
  /* 3 */ val Schedule: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseReason.Schedule with Double = js.native
}
