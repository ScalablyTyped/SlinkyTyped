package typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldUsage extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "FieldUsage")
@js.native
object FieldUsage extends js.Object {
  /**
    * Empty usage.
    */
  @js.native
  sealed trait None extends FieldUsage
  
  /**
    * Treenode field usage.
    */
  @js.native
  sealed trait Tree extends FieldUsage
  
  /**
    * Work item field usage.
    */
  @js.native
  sealed trait WorkItem extends FieldUsage
  
  /**
    * Work item link field usage.
    */
  @js.native
  sealed trait WorkItemLink extends FieldUsage
  
  /**
    * Work Item Type Extension usage.
    */
  @js.native
  sealed trait WorkItemTypeExtension extends FieldUsage
  
  /* 0 */ val None: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldUsage.None with Double = js.native
  /* 3 */ val Tree: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldUsage.Tree with Double = js.native
  /* 1 */ val WorkItem: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldUsage.WorkItem with Double = js.native
  /* 2 */ val WorkItemLink: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldUsage.WorkItemLink with Double = js.native
  /* 4 */ val WorkItemTypeExtension: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldUsage.WorkItemTypeExtension with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldUsage with Double] = js.native
}

