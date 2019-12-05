package typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TestOutcome extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "TestOutcome")
@js.native
object TestOutcome extends js.Object {
  /**
    * Test was aborted. This was not caused by a user gesture, but rather by a framework decision.
    */
  @js.native
  sealed trait Aborted extends TestOutcome
  
  /**
    * Test had it chance for been executed but was not, as ITestElement.IsRunnable == false.
    */
  @js.native
  sealed trait Blocked extends TestOutcome
  
  /**
    * There was a system error while we were trying to execute a test.
    */
  @js.native
  sealed trait Error extends TestOutcome
  
  /**
    * Test was executed, but there were issues. Issues may involve exceptions or failed assertions.
    */
  @js.native
  sealed trait Failed extends TestOutcome
  
  /**
    * Test is currently executing. Added this for TCM charts
    */
  @js.native
  sealed trait InProgress extends TestOutcome
  
  /**
    * Test has completed, but we can't say if it passed or failed. May be used for aborted tests...
    */
  @js.native
  sealed trait Inconclusive extends TestOutcome
  
  @js.native
  sealed trait MaxValue extends TestOutcome
  
  /**
    * Test has not been completed, or the test type does not report pass/failure.
    */
  @js.native
  sealed trait None extends TestOutcome
  
  /**
    * Test is Not Applicable for execution.
    */
  @js.native
  sealed trait NotApplicable extends TestOutcome
  
  /**
    * Test was not executed. This was caused by a user gesture - e.g. user hit stop button.
    */
  @js.native
  sealed trait NotExecuted extends TestOutcome
  
  /**
    * Test is not impacted. Added fot TIA.
    */
  @js.native
  sealed trait NotImpacted extends TestOutcome
  
  /**
    * Test was executed w/o any issues.
    */
  @js.native
  sealed trait Passed extends TestOutcome
  
  /**
    * Test is paused.
    */
  @js.native
  sealed trait Paused extends TestOutcome
  
  /**
    * The test timed out
    */
  @js.native
  sealed trait Timeout extends TestOutcome
  
  /**
    * Only used during an update to preserve the existing value.
    */
  @js.native
  sealed trait Unspecified extends TestOutcome
  
  /**
    * To be used by Run level results. This is not a failure.
    */
  @js.native
  sealed trait Warning extends TestOutcome
  
  /* 6 */ val Aborted: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.Aborted with Double = js.native
  /* 7 */ val Blocked: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.Blocked with Double = js.native
  /* 10 */ val Error: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.Error with Double = js.native
  /* 3 */ val Failed: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.Failed with Double = js.native
  /* 13 */ val InProgress: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.InProgress with Double = js.native
  /* 4 */ val Inconclusive: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.Inconclusive with Double = js.native
  /* 14 */ val MaxValue: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.MaxValue with Double = js.native
  /* 1 */ val None: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.None with Double = js.native
  /* 11 */ val NotApplicable: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.NotApplicable with Double = js.native
  /* 8 */ val NotExecuted: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.NotExecuted with Double = js.native
  /* 14 */ val NotImpacted: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.NotImpacted with Double = js.native
  /* 2 */ val Passed: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.Passed with Double = js.native
  /* 12 */ val Paused: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.Paused with Double = js.native
  /* 5 */ val Timeout: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.Timeout with Double = js.native
  /* 0 */ val Unspecified: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.Unspecified with Double = js.native
  /* 9 */ val Warning: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestOutcome with Double] = js.native
}

