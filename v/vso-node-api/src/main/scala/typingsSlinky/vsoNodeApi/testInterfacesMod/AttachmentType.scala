package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttachmentType extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "AttachmentType")
@js.native
object AttachmentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttachmentType with Double] = js.native
  
  @js.native
  sealed trait AfnStrip extends AttachmentType
  /* 1 */ val AfnStrip: typingsSlinky.vsoNodeApi.testInterfacesMod.AttachmentType.AfnStrip with Double = js.native
  
  @js.native
  sealed trait BugFilingData extends AttachmentType
  /* 2 */ val BugFilingData: typingsSlinky.vsoNodeApi.testInterfacesMod.AttachmentType.BugFilingData with Double = js.native
  
  @js.native
  sealed trait CodeCoverage extends AttachmentType
  /* 3 */ val CodeCoverage: typingsSlinky.vsoNodeApi.testInterfacesMod.AttachmentType.CodeCoverage with Double = js.native
  
  @js.native
  sealed trait ConsoleLog extends AttachmentType
  /* 11 */ val ConsoleLog: typingsSlinky.vsoNodeApi.testInterfacesMod.AttachmentType.ConsoleLog with Double = js.native
  
  @js.native
  sealed trait GeneralAttachment extends AttachmentType
  /* 0 */ val GeneralAttachment: typingsSlinky.vsoNodeApi.testInterfacesMod.AttachmentType.GeneralAttachment with Double = js.native
  
  @js.native
  sealed trait IntermediateCollectorData extends AttachmentType
  /* 4 */ val IntermediateCollectorData: typingsSlinky.vsoNodeApi.testInterfacesMod.AttachmentType.IntermediateCollectorData with Double = js.native
  
  @js.native
  sealed trait RunConfig extends AttachmentType
  /* 5 */ val RunConfig: typingsSlinky.vsoNodeApi.testInterfacesMod.AttachmentType.RunConfig with Double = js.native
  
  @js.native
  sealed trait TestImpactDetails extends AttachmentType
  /* 6 */ val TestImpactDetails: typingsSlinky.vsoNodeApi.testInterfacesMod.AttachmentType.TestImpactDetails with Double = js.native
  
  @js.native
  sealed trait TmiTestResultDetail extends AttachmentType
  /* 9 */ val TmiTestResultDetail: typingsSlinky.vsoNodeApi.testInterfacesMod.AttachmentType.TmiTestResultDetail with Double = js.native
  
  @js.native
  sealed trait TmiTestRunDeploymentFiles extends AttachmentType
  /* 7 */ val TmiTestRunDeploymentFiles: typingsSlinky.vsoNodeApi.testInterfacesMod.AttachmentType.TmiTestRunDeploymentFiles with Double = js.native
  
  @js.native
  sealed trait TmiTestRunReverseDeploymentFiles extends AttachmentType
  /* 8 */ val TmiTestRunReverseDeploymentFiles: typingsSlinky.vsoNodeApi.testInterfacesMod.AttachmentType.TmiTestRunReverseDeploymentFiles with Double = js.native
  
  @js.native
  sealed trait TmiTestRunSummary extends AttachmentType
  /* 10 */ val TmiTestRunSummary: typingsSlinky.vsoNodeApi.testInterfacesMod.AttachmentType.TmiTestRunSummary with Double = js.native
}
