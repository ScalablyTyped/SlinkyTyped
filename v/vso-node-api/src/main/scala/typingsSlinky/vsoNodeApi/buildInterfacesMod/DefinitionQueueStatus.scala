package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefinitionQueueStatus extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionQueueStatus")
@js.native
object DefinitionQueueStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionQueueStatus with Double] = js.native
  
  /**
    * When disabled the definition queue will not allow builds to be queued by users and the system will not queue scheduled, gated or continuous integration builds. Builds already in the queue will not be started by the system.
    */
  @js.native
  sealed trait Disabled extends DefinitionQueueStatus
  /* 2 */ val Disabled: typingsSlinky.vsoNodeApi.buildInterfacesMod.DefinitionQueueStatus.Disabled with Double = js.native
  
  /**
    * When enabled the definition queue allows builds to be queued by users, the system will queue scheduled, gated and continuous integration builds, and the queued builds will be started by the system.
    */
  @js.native
  sealed trait Enabled extends DefinitionQueueStatus
  /* 0 */ val Enabled: typingsSlinky.vsoNodeApi.buildInterfacesMod.DefinitionQueueStatus.Enabled with Double = js.native
  
  /**
    * When paused the definition queue allows builds to be queued by users and the system will queue scheduled, gated and continuous integration builds. Builds in the queue will not be started by the system.
    */
  @js.native
  sealed trait Paused extends DefinitionQueueStatus
  /* 1 */ val Paused: typingsSlinky.vsoNodeApi.buildInterfacesMod.DefinitionQueueStatus.Paused with Double = js.native
}
