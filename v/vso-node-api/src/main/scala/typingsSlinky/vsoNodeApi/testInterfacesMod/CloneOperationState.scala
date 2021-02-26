package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CloneOperationState extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "CloneOperationState")
@js.native
object CloneOperationState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloneOperationState with Double] = js.native
  
  @js.native
  sealed trait Failed extends CloneOperationState
  /* 2 */ val Failed: typingsSlinky.vsoNodeApi.testInterfacesMod.CloneOperationState.Failed with Double = js.native
  
  @js.native
  sealed trait InProgress extends CloneOperationState
  /* 1 */ val InProgress: typingsSlinky.vsoNodeApi.testInterfacesMod.CloneOperationState.InProgress with Double = js.native
  
  @js.native
  sealed trait Queued extends CloneOperationState
  /* 0 */ val Queued: typingsSlinky.vsoNodeApi.testInterfacesMod.CloneOperationState.Queued with Double = js.native
  
  @js.native
  sealed trait Succeeded extends CloneOperationState
  /* 3 */ val Succeeded: typingsSlinky.vsoNodeApi.testInterfacesMod.CloneOperationState.Succeeded with Double = js.native
}
