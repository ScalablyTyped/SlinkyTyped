package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestRunSubstate extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestRunSubstate")
@js.native
object TestRunSubstate extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunSubstate with Double] = js.native
  
  @js.native
  sealed trait AbortedBySystem extends TestRunSubstate
  /* 4 */ val AbortedBySystem: typingsSlinky.vsoNodeApi.testInterfacesMod.TestRunSubstate.AbortedBySystem with Double = js.native
  
  @js.native
  sealed trait Analyzed extends TestRunSubstate
  /* 7 */ val Analyzed: typingsSlinky.vsoNodeApi.testInterfacesMod.TestRunSubstate.Analyzed with Double = js.native
  
  @js.native
  sealed trait CanceledByUser extends TestRunSubstate
  /* 3 */ val CanceledByUser: typingsSlinky.vsoNodeApi.testInterfacesMod.TestRunSubstate.CanceledByUser with Double = js.native
  
  @js.native
  sealed trait CancellationInProgress extends TestRunSubstate
  /* 8 */ val CancellationInProgress: typingsSlinky.vsoNodeApi.testInterfacesMod.TestRunSubstate.CancellationInProgress with Double = js.native
  
  @js.native
  sealed trait CreatingEnvironment extends TestRunSubstate
  /* 1 */ val CreatingEnvironment: typingsSlinky.vsoNodeApi.testInterfacesMod.TestRunSubstate.CreatingEnvironment with Double = js.native
  
  @js.native
  sealed trait None extends TestRunSubstate
  /* 0 */ val None: typingsSlinky.vsoNodeApi.testInterfacesMod.TestRunSubstate.None with Double = js.native
  
  @js.native
  sealed trait PendingAnalysis extends TestRunSubstate
  /* 6 */ val PendingAnalysis: typingsSlinky.vsoNodeApi.testInterfacesMod.TestRunSubstate.PendingAnalysis with Double = js.native
  
  @js.native
  sealed trait RunningTests extends TestRunSubstate
  /* 2 */ val RunningTests: typingsSlinky.vsoNodeApi.testInterfacesMod.TestRunSubstate.RunningTests with Double = js.native
  
  @js.native
  sealed trait TimedOut extends TestRunSubstate
  /* 5 */ val TimedOut: typingsSlinky.vsoNodeApi.testInterfacesMod.TestRunSubstate.TimedOut with Double = js.native
}
