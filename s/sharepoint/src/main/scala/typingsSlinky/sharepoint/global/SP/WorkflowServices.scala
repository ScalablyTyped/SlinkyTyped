package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkflowServices {
  
  // TODO: comments, types
  @JSGlobal("SP.WorkflowServices.InteropService")
  @js.native
  class InteropService protected ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.InteropService {
    def this(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      objectPath: typingsSlinky.sharepoint.SP.ObjectPathStaticProperty
    ) = this()
  }
  object InteropService {
    
    /* static member */
    @JSGlobal("SP.WorkflowServices.InteropService.getCurrent")
    @js.native
    def getCurrent(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.WorkflowServices.InteropService = js.native
  }
  
  /** Represents a workflow definition and associated properties. */
  @JSGlobal("SP.WorkflowServices.WorkflowDefinition")
  @js.native
  class WorkflowDefinition protected ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowDefinition {
    def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext) = this()
  }
  
  /** Manages workflow definitions and workflow activity authoring. */
  @JSGlobal("SP.WorkflowServices.WorkflowDeploymentService")
  @js.native
  class WorkflowDeploymentService ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowDeploymentService
  
  /** Represents an instance of a workflow association that performs on a list item the process that is defined in a workflow template */
  @JSGlobal("SP.WorkflowServices.WorkflowInstance")
  @js.native
  class WorkflowInstance ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowInstance
  
  /** Reads the SharePoint workflow instances from the external workflow host and manages the instance execution. */
  @JSGlobal("SP.WorkflowServices.WorkflowInstanceService")
  @js.native
  class WorkflowInstanceService ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowInstanceService
  
  /** Describes the workflow host configuration states and provides service objects that interact with the workflow */
  @JSGlobal("SP.WorkflowServices.WorkflowServicesManager")
  @js.native
  class WorkflowServicesManager protected ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowServicesManager {
    def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web) = this()
  }
  object WorkflowServicesManager {
    
    /* static member */
    @JSGlobal("SP.WorkflowServices.WorkflowServicesManager.newObject")
    @js.native
    def newObject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowServicesManager = js.native
  }
  
  @JSGlobal("SP.WorkflowServices.WorkflowStatus")
  @js.native
  object WorkflowStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus with Double] = js.native
    
    /* 4 */ val canceled: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.canceled with Double = js.native
    
    /* 3 */ val canceling: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.canceling with Double = js.native
    
    /* 6 */ val completed: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.completed with Double = js.native
    
    /* 8 */ val invalid: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.invalid with Double = js.native
    
    /* 7 */ val notSpecified: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.notSpecified with Double = js.native
    
    /* 0 */ val notStarted: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.notStarted with Double = js.native
    
    /* 1 */ val started: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.started with Double = js.native
    
    /* 2 */ val suspended: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.suspended with Double = js.native
    
    /* 5 */ val terminated: typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowStatus.terminated with Double = js.native
  }
  
  /** Base class representing subscriptions for the external workflow host. */
  @JSGlobal("SP.WorkflowServices.WorkflowSubscription")
  @js.native
  class WorkflowSubscription ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowSubscription
  
  @JSGlobal("SP.WorkflowServices.WorkflowSubscriptionService")
  @js.native
  class WorkflowSubscriptionService protected ()
    extends typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowSubscriptionService {
    def this(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      objectPath: typingsSlinky.sharepoint.SP.ObjectPathStaticProperty
    ) = this()
  }
  object WorkflowSubscriptionService {
    
    /* static member */
    @JSGlobal("SP.WorkflowServices.WorkflowSubscriptionService.getCurrent")
    @js.native
    def getCurrent(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.WorkflowServices.WorkflowSubscriptionService = js.native
  }
}
