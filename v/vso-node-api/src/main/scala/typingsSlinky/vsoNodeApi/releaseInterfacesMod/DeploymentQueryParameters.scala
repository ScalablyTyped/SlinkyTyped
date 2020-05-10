package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withArtifactSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactVersions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentStatus(value: DeploymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentsPerEnvironment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentsPerEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironments(value: js.Array[DefinitionEnvironmentReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpands(value: DeploymentExpands): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestDeploymentsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestDeploymentsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDeploymentsPerEnvironment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeploymentsPerEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationStatus(value: DeploymentOperationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryOrder(value: ReleaseQueryOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryType(value: DeploymentsQueryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceBranch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

