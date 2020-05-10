package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Release extends js.Object {
  /**
    * Gets links to access the release.
    */
  var _links: js.Any = js.native
  /**
    * Gets or sets the list of artifacts.
    */
  var artifacts: js.Array[Artifact] = js.native
  /**
    * Gets or sets comment.
    */
  var comment: String = js.native
  /**
    * Gets or sets the identity who created.
    */
  var createdBy: IdentityRef = js.native
  /**
    * Gets date on which it got created.
    */
  var createdOn: js.Date = js.native
  /**
    * Gets revision number of definition snapshot.
    */
  var definitionSnapshotRevision: Double = js.native
  /**
    * Gets or sets description of release.
    */
  var description: String = js.native
  /**
    * Gets list of environments.
    */
  var environments: js.Array[ReleaseEnvironment] = js.native
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double = js.native
  /**
    * Whether to exclude the release from retention policies.
    */
  var keepForever: Boolean = js.native
  /**
    * Gets logs container url.
    */
  var logsContainerUrl: String = js.native
  /**
    * Gets or sets the identity who modified.
    */
  var modifiedBy: IdentityRef = js.native
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: js.Date = js.native
  /**
    * Gets name.
    */
  var name: String = js.native
  /**
    * Gets pool name.
    */
  var poolName: String = js.native
  /**
    * Gets or sets project reference.
    */
  var projectReference: ProjectReference = js.native
  var properties: js.Any = js.native
  /**
    * Gets reason of release.
    */
  var reason: ReleaseReason = js.native
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which this release is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference = js.native
  /**
    * Gets release name format.
    */
  var releaseNameFormat: String = js.native
  /**
    * Gets status.
    */
  var status: ReleaseStatus = js.native
  /**
    * Gets or sets list of tags.
    */
  var tags: js.Array[String] = js.native
  var triggeringArtifactAlias: String = js.native
  var url: String = js.native
  /**
    * Gets the list of variable groups.
    */
  var variableGroups: js.Array[VariableGroup] = js.native
  /**
    * Gets or sets the dictionary of variables.
    */
  var variables: StringDictionary[ConfigurationVariableValue] = js.native
}

object Release {
  @scala.inline
  def apply(
    _links: js.Any,
    artifacts: js.Array[Artifact],
    comment: String,
    createdBy: IdentityRef,
    createdOn: js.Date,
    definitionSnapshotRevision: Double,
    description: String,
    environments: js.Array[ReleaseEnvironment],
    id: Double,
    keepForever: Boolean,
    logsContainerUrl: String,
    modifiedBy: IdentityRef,
    modifiedOn: js.Date,
    name: String,
    poolName: String,
    projectReference: ProjectReference,
    properties: js.Any,
    reason: ReleaseReason,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseNameFormat: String,
    status: ReleaseStatus,
    tags: js.Array[String],
    triggeringArtifactAlias: String,
    url: String,
    variableGroups: js.Array[VariableGroup],
    variables: StringDictionary[ConfigurationVariableValue]
  ): Release = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], definitionSnapshotRevision = definitionSnapshotRevision.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keepForever = keepForever.asInstanceOf[js.Any], logsContainerUrl = logsContainerUrl.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], poolName = poolName.asInstanceOf[js.Any], projectReference = projectReference.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releaseNameFormat = releaseNameFormat.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggeringArtifactAlias = triggeringArtifactAlias.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], variableGroups = variableGroups.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Release]
  }
  @scala.inline
  implicit class ReleaseOps[Self <: Release] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifacts(value: js.Array[Artifact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionSnapshotRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionSnapshotRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironments(value: js.Array[ReleaseEnvironment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepForever(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepForever")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogsContainerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsContainerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoolName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectReference(value: ProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: ReleaseReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseNameFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseNameFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ReleaseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggeringArtifactAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggeringArtifactAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariableGroups(value: js.Array[VariableGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: StringDictionary[ConfigurationVariableValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

