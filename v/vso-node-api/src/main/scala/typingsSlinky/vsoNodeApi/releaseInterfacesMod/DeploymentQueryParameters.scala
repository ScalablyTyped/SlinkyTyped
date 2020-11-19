package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentQueryParameters extends js.Object {
  
  var artifactSourceId: String = js.native
  
  var artifactTypeId: String = js.native
  
  var artifactVersions: js.Array[String] = js.native
  
  var deploymentStatus: DeploymentStatus = js.native
  
  var deploymentsPerEnvironment: Double = js.native
  
  var environments: js.Array[DefinitionEnvironmentReference] = js.native
  
  var expands: DeploymentExpands = js.native
  
  var isDeleted: Boolean = js.native
  
  var latestDeploymentsOnly: Boolean = js.native
  
  var maxDeploymentsPerEnvironment: Double = js.native
  
  var maxModifiedTime: js.Date = js.native
  
  var minModifiedTime: js.Date = js.native
  
  var operationStatus: DeploymentOperationStatus = js.native
  
  var queryOrder: ReleaseQueryOrder = js.native
  
  var queryType: DeploymentsQueryType = js.native
  
  var sourceBranch: String = js.native
}
object DeploymentQueryParameters {
  
  @scala.inline
  def apply(
    artifactSourceId: String,
    artifactTypeId: String,
    artifactVersions: js.Array[String],
    deploymentStatus: DeploymentStatus,
    deploymentsPerEnvironment: Double,
    environments: js.Array[DefinitionEnvironmentReference],
    expands: DeploymentExpands,
    isDeleted: Boolean,
    latestDeploymentsOnly: Boolean,
    maxDeploymentsPerEnvironment: Double,
    maxModifiedTime: js.Date,
    minModifiedTime: js.Date,
    operationStatus: DeploymentOperationStatus,
    queryOrder: ReleaseQueryOrder,
    queryType: DeploymentsQueryType,
    sourceBranch: String
  ): DeploymentQueryParameters = {
    val __obj = js.Dynamic.literal(artifactSourceId = artifactSourceId.asInstanceOf[js.Any], artifactTypeId = artifactTypeId.asInstanceOf[js.Any], artifactVersions = artifactVersions.asInstanceOf[js.Any], deploymentStatus = deploymentStatus.asInstanceOf[js.Any], deploymentsPerEnvironment = deploymentsPerEnvironment.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], expands = expands.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], latestDeploymentsOnly = latestDeploymentsOnly.asInstanceOf[js.Any], maxDeploymentsPerEnvironment = maxDeploymentsPerEnvironment.asInstanceOf[js.Any], maxModifiedTime = maxModifiedTime.asInstanceOf[js.Any], minModifiedTime = minModifiedTime.asInstanceOf[js.Any], operationStatus = operationStatus.asInstanceOf[js.Any], queryOrder = queryOrder.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], sourceBranch = sourceBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentQueryParameters]
  }
  
  @scala.inline
  implicit class DeploymentQueryParametersOps[Self <: DeploymentQueryParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArtifactSourceId(value: String): Self = this.set("artifactSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactTypeId(value: String): Self = this.set("artifactTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactVersionsVarargs(value: String*): Self = this.set("artifactVersions", js.Array(value :_*))
    
    @scala.inline
    def setArtifactVersions(value: js.Array[String]): Self = this.set("artifactVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentStatus(value: DeploymentStatus): Self = this.set("deploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentsPerEnvironment(value: Double): Self = this.set("deploymentsPerEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentsVarargs(value: DefinitionEnvironmentReference*): Self = this.set("environments", js.Array(value :_*))
    
    @scala.inline
    def setEnvironments(value: js.Array[DefinitionEnvironmentReference]): Self = this.set("environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpands(value: DeploymentExpands): Self = this.set("expands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestDeploymentsOnly(value: Boolean): Self = this.set("latestDeploymentsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeploymentsPerEnvironment(value: Double): Self = this.set("maxDeploymentsPerEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxModifiedTime(value: js.Date): Self = this.set("maxModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinModifiedTime(value: js.Date): Self = this.set("minModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStatus(value: DeploymentOperationStatus): Self = this.set("operationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryOrder(value: ReleaseQueryOrder): Self = this.set("queryOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryType(value: DeploymentsQueryType): Self = this.set("queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBranch(value: String): Self = this.set("sourceBranch", value.asInstanceOf[js.Any])
  }
}
