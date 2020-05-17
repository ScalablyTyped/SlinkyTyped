package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WorkflowServices")
@js.native
object WorkflowServices extends js.Object {
  // TODO: comments, types
  @js.native
  class InteropService protected ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.InteropService {
    def this(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      objectPath: typingsSlinky.sharepoint.SP.ObjectPathStaticProperty
    ) = this()
  }
  
  /** Represents a workflow definition and associated properties. */
  @js.native
  class WorkflowDefinition protected ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowDefinition {
    def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext) = this()
  }
  
  /** Manages workflow definitions and workflow activity authoring. */
  @js.native
  class WorkflowDeploymentService ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowDeploymentService
  
  /** Represents an instance of a workflow association that performs on a list item the process that is defined in a workflow template */
  @js.native
  class WorkflowInstance ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowInstance
  
  /** Reads the SharePoint workflow instances from the external workflow host and manages the instance execution. */
  @js.native
  class WorkflowInstanceService ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowInstanceService
  
  /** Describes the workflow host configuration states and provides service objects that interact with the workflow */
  @js.native
  class WorkflowServicesManager protected ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowServicesManager {
    def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web) = this()
  }
  
  /** Base class representing subscriptions for the external workflow host. */
  @js.native
  class WorkflowSubscription ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowSubscription
  
  @js.native
  class WorkflowSubscriptionService protected ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowSubscriptionService {
    def this(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      objectPath: typingsSlinky.sharepoint.SP.ObjectPathStaticProperty
    ) = this()
  }
  
  /* static members */
  @js.native
  object InteropService extends js.Object {
    def getCurrent(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.WorkflowServices.InteropService = js.native
  }
  
  /* static members */
  @js.native
  object WorkflowServicesManager extends js.Object {
    def newObject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowServicesManager = js.native
  }
  
  @js.native
  object WorkflowStatus extends js.Object {
    /* 4 */ val canceled: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.canceled with Double = js.native
    /* 3 */ val canceling: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.canceling with Double = js.native
    /* 6 */ val completed: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.completed with Double = js.native
    /* 8 */ val invalid: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.invalid with Double = js.native
    /* 7 */ val notSpecified: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.notSpecified with Double = js.native
    /* 0 */ val notStarted: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.notStarted with Double = js.native
    /* 1 */ val started: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.started with Double = js.native
    /* 2 */ val suspended: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.suspended with Double = js.native
    /* 5 */ val terminated: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.terminated with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus with Double] = js.native
  }
  
  /* static members */
  @js.native
  object WorkflowSubscriptionService extends js.Object {
    def getCurrent(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowSubscriptionService = js.native
  }
  
}

