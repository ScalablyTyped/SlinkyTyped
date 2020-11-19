package typingsSlinky.sharepoint.SP.WorkflowServices

import typingsSlinky.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the workflow host configuration states and provides service objects that interact with the workflow */
@js.native
trait WorkflowServicesManager extends ClientObject {
  
  def getWorkflowDeploymentService(): WorkflowDeploymentService = js.native
  
  def getWorkflowInstanceService(): WorkflowInstanceService = js.native
  
  def getWorkflowInteropService(): InteropService = js.native
  
  def getWorkflowSubscriptionService(): WorkflowSubscriptionService = js.native
  
  /** The current application identifier.*/
  def get_appId(): String = js.native
  
  /** Indicates whether this workflow service is actively connected to a workflow host. */
  def get_isConnected(): Boolean = js.native
  
  /** Returns the path of the current scope in the workflow host. */
  def get_scopePath(): String = js.native
}
