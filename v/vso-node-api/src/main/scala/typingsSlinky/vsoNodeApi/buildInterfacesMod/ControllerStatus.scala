package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControllerStatus extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ControllerStatus")
@js.native
object ControllerStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControllerStatus with Double] = js.native
  
  /**
    * Indicates that the build controller is currently available.
    */
  @js.native
  sealed trait Available extends ControllerStatus
  /* 1 */ val Available: typingsSlinky.vsoNodeApi.buildInterfacesMod.ControllerStatus.Available with Double = js.native
  
  /**
    * Indicates that the build controller has taken itself offline.
    */
  @js.native
  sealed trait Offline extends ControllerStatus
  /* 2 */ val Offline: typingsSlinky.vsoNodeApi.buildInterfacesMod.ControllerStatus.Offline with Double = js.native
  
  /**
    * Indicates that the build controller cannot be contacted.
    */
  @js.native
  sealed trait Unavailable extends ControllerStatus
  /* 0 */ val Unavailable: typingsSlinky.vsoNodeApi.buildInterfacesMod.ControllerStatus.Unavailable with Double = js.native
}
