package typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueuePriority extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "QueuePriority")
@js.native
object QueuePriority extends js.Object {
  /**
    * Above normal priority.
    */
  @js.native
  sealed trait AboveNormal extends QueuePriority
  
  /**
    * Below normal priority.
    */
  @js.native
  sealed trait BelowNormal extends QueuePriority
  
  /**
    * High priority.
    */
  @js.native
  sealed trait High extends QueuePriority
  
  /**
    * Low priority.
    */
  @js.native
  sealed trait Low extends QueuePriority
  
  /**
    * Normal priority.
    */
  @js.native
  sealed trait Normal extends QueuePriority
  
  /* 2 */ val AboveNormal: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueuePriority.AboveNormal with Double = js.native
  /* 4 */ val BelowNormal: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueuePriority.BelowNormal with Double = js.native
  /* 1 */ val High: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueuePriority.High with Double = js.native
  /* 5 */ val Low: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueuePriority.Low with Double = js.native
  /* 3 */ val Normal: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueuePriority.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueuePriority with Double] = js.native
}

