package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deployment extends StObject {
  
  /**
    * Gets links to access the deployment.
    */
  var _links: js.Any = js.native
  
  /**
    * Gets attempt number.
    */
  var attempt: Double = js.native
  
  /**
    * Gets the date on which deployment is complete.
    */
  var completedOn: js.Date = js.native
  
  /**
    * Gets the list of condition associated with deployment.
    */
  var conditions: js.Array[Condition] = js.native
  
  /**
    * Gets release definition environment id.
    */
  var definitionEnvironmentId: Double = js.native
  
  /**
    * Gets status of the deployment.
    */
  var deploymentStatus: DeploymentStatus = js.native
  
  /**
    * Gets the unique identifier for deployment.
    */
  var id: Double = js.native
  
  /**
    * Gets the identity who last modified the deployment.
    */
  var lastModifiedBy: IdentityRef = js.native
  
  /**
    * Gets the date on which deployment is last modified.
    */
  var lastModifiedOn: js.Date = js.native
  
  /**
    * Gets operation status of deployment.
    */
  var operationStatus: DeploymentOperationStatus = js.native
  
  /**
    * Gets list of PostDeployApprovals.
    */
  var postDeployApprovals: js.Array[ReleaseApproval] = js.native
  
  /**
    * Gets list of PreDeployApprovals.
    */
  var preDeployApprovals: js.Array[ReleaseApproval] = js.native
  
  /**
    * Gets the date on which deployment is queued.
    */
  var queuedOn: js.Date = js.native
  
  /**
    * Gets reason of deployment.
    */
  var reason: DeploymentReason = js.native
  
  /**
    * Gets the reference of release.
    */
  var release: ReleaseReference = js.native
  
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which the deployment is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference = js.native
  
  /**
    * Gets releaseEnvironmentReference which specifies the reference of the release environment to which the deployment is associated.
    */
  var releaseEnvironment: ReleaseEnvironmentShallowReference = js.native
  
  /**
    * Gets the identity who requested.
    */
  var requestedBy: IdentityRef = js.native
  
  /**
    * Gets the identity for whom deployment is requested.
    */
  var requestedFor: IdentityRef = js.native
  
  /**
    * Gets the date on which deployment is scheduled.
    */
  var scheduledDeploymentTime: js.Date = js.native
  
  /**
    * Gets the date on which deployment is started.
    */
  var startedOn: js.Date = js.native
}
object Deployment {
  
  @scala.inline
  def apply(
    _links: js.Any,
    attempt: Double,
    completedOn: js.Date,
    conditions: js.Array[Condition],
    definitionEnvironmentId: Double,
    deploymentStatus: DeploymentStatus,
    id: Double,
    lastModifiedBy: IdentityRef,
    lastModifiedOn: js.Date,
    operationStatus: DeploymentOperationStatus,
    postDeployApprovals: js.Array[ReleaseApproval],
    preDeployApprovals: js.Array[ReleaseApproval],
    queuedOn: js.Date,
    reason: DeploymentReason,
    release: ReleaseReference,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseEnvironment: ReleaseEnvironmentShallowReference,
    requestedBy: IdentityRef,
    requestedFor: IdentityRef,
    scheduledDeploymentTime: js.Date,
    startedOn: js.Date
  ): Deployment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], attempt = attempt.asInstanceOf[js.Any], completedOn = completedOn.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], definitionEnvironmentId = definitionEnvironmentId.asInstanceOf[js.Any], deploymentStatus = deploymentStatus.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedOn = lastModifiedOn.asInstanceOf[js.Any], operationStatus = operationStatus.asInstanceOf[js.Any], postDeployApprovals = postDeployApprovals.asInstanceOf[js.Any], preDeployApprovals = preDeployApprovals.asInstanceOf[js.Any], queuedOn = queuedOn.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releaseEnvironment = releaseEnvironment.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], scheduledDeploymentTime = scheduledDeploymentTime.asInstanceOf[js.Any], startedOn = startedOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttempt(value: Double): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedOn(value: js.Date): Self = StObject.set(x, "completedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setDefinitionEnvironmentId(value: Double): Self = StObject.set(x, "definitionEnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "deploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedBy(value: IdentityRef): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedOn(value: js.Date): Self = StObject.set(x, "lastModifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStatus(value: DeploymentOperationStatus): Self = StObject.set(x, "operationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDeployApprovals(value: js.Array[ReleaseApproval]): Self = StObject.set(x, "postDeployApprovals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDeployApprovalsVarargs(value: ReleaseApproval*): Self = StObject.set(x, "postDeployApprovals", js.Array(value :_*))
    
    @scala.inline
    def setPreDeployApprovals(value: js.Array[ReleaseApproval]): Self = StObject.set(x, "preDeployApprovals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreDeployApprovalsVarargs(value: ReleaseApproval*): Self = StObject.set(x, "preDeployApprovals", js.Array(value :_*))
    
    @scala.inline
    def setQueuedOn(value: js.Date): Self = StObject.set(x, "queuedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: DeploymentReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: ReleaseReference): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = StObject.set(x, "releaseDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseEnvironment(value: ReleaseEnvironmentShallowReference): Self = StObject.set(x, "releaseEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedBy(value: IdentityRef): Self = StObject.set(x, "requestedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedFor(value: IdentityRef): Self = StObject.set(x, "requestedFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledDeploymentTime(value: js.Date): Self = StObject.set(x, "scheduledDeploymentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedOn(value: js.Date): Self = StObject.set(x, "startedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
