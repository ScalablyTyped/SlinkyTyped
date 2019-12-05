package typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemTypeFieldsExpandLevel extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemTypeFieldsExpandLevel")
@js.native
object WorkItemTypeFieldsExpandLevel extends js.Object {
  /**
    * Includes allowed values and dependent fields of the field.
    */
  @js.native
  sealed trait All extends WorkItemTypeFieldsExpandLevel
  
  /**
    * Includes allowed values for the field.
    */
  @js.native
  sealed trait AllowedValues extends WorkItemTypeFieldsExpandLevel
  
  /**
    * Includes dependent fields of the field.
    */
  @js.native
  sealed trait DependentFields extends WorkItemTypeFieldsExpandLevel
  
  /**
    * Includes only basic properties of the field.
    */
  @js.native
  sealed trait None extends WorkItemTypeFieldsExpandLevel
  
  /* 3 */ val All: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel.All with Double = js.native
  /* 1 */ val AllowedValues: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel.AllowedValues with Double = js.native
  /* 2 */ val DependentFields: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel.DependentFields with Double = js.native
  /* 0 */ val None: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemTypeFieldsExpandLevel with Double] = js.native
}

