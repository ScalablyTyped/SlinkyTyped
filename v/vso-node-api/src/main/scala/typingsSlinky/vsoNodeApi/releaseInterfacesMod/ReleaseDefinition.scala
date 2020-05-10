package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinition extends js.Object {
  /**
    * Gets links to access the release definition.
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
    * Gets or sets the description.
    */
  var description: String = js.native
  /**
    * Gets or sets the list of environments.
    */
  var environments: js.Array[ReleaseDefinitionEnvironment] = js.native
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double = js.native
  /**
    * Whether release definition is deleted.
    */
  var isDeleted: Boolean = js.native
  /**
    * Gets the reference of last release.
    */
  var lastRelease: ReleaseReference = js.native
  /**
    * Gets or sets the identity who modified.
    */
  var modifiedBy: IdentityRef = js.native
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: js.Date = js.native
  /**
    * Gets or sets the name.
    */
  var name: String = js.native
  /**
    * Gets or sets the path.
    */
  var path: String = js.native
  /**
    * Gets or sets pipeline process.
    */
  var pipelineProcess: PipelineProcess = js.native
  /**
    * Gets or sets properties.
    */
  var properties: js.Any = js.native
  /**
    * Gets or sets the release name format.
    */
  var releaseNameFormat: String = js.native
  var retentionPolicy: RetentionPolicy = js.native
  /**
    * Gets the revision number.
    */
  var revision: Double = js.native
  /**
    * Gets or sets source of release definition.
    */
  var source: ReleaseDefinitionSource = js.native
  /**
    * Gets or sets list of tags.
    */
  var tags: js.Array[String] = js.native
  /**
    * Gets or sets the list of triggers.
    */
  var triggers: js.Array[ReleaseTriggerBase] = js.native
  /**
    * Gets url to access the release definition.
    */
  var url: String = js.native
  /**
    * Gets or sets the list of variable groups.
    */
  var variableGroups: js.Array[Double] = js.native
  /**
    * Gets or sets the dictionary of variables.
    */
  var variables: StringDictionary[ConfigurationVariableValue] = js.native
}

object ReleaseDefinition {
  @scala.inline
  def apply(
    _links: js.Any,
    artifacts: js.Array[Artifact],
    comment: String,
    createdBy: IdentityRef,
    createdOn: js.Date,
    description: String,
    environments: js.Array[ReleaseDefinitionEnvironment],
    id: Double,
    isDeleted: Boolean,
    lastRelease: ReleaseReference,
    modifiedBy: IdentityRef,
    modifiedOn: js.Date,
    name: String,
    path: String,
    pipelineProcess: PipelineProcess,
    properties: js.Any,
    releaseNameFormat: String,
    retentionPolicy: RetentionPolicy,
    revision: Double,
    source: ReleaseDefinitionSource,
    tags: js.Array[String],
    triggers: js.Array[ReleaseTriggerBase],
    url: String,
    variableGroups: js.Array[Double],
    variables: StringDictionary[ConfigurationVariableValue]
  ): ReleaseDefinition = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], lastRelease = lastRelease.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pipelineProcess = pipelineProcess.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], releaseNameFormat = releaseNameFormat.asInstanceOf[js.Any], retentionPolicy = retentionPolicy.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], variableGroups = variableGroups.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinition]
  }
  @scala.inline
  implicit class ReleaseDefinitionOps[Self <: ReleaseDefinition] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironments(value: js.Array[ReleaseDefinitionEnvironment]): Self = {
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
    def withIsDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastRelease(value: ReleaseReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRelease")(value.asInstanceOf[js.Any])
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipelineProcess(value: PipelineProcess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseNameFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseNameFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetentionPolicy(value: RetentionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: ReleaseDefinitionSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggers(value: js.Array[ReleaseTriggerBase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariableGroups(value: js.Array[Double]): Self = {
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

