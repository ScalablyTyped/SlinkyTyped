package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinition extends js.Object {
  var agentExecution: TaskExecution = js.native
  var author: String = js.native
  var category: String = js.native
  var contentsUploaded: Boolean = js.native
  var contributionIdentifier: String = js.native
  var contributionVersion: String = js.native
  var dataSourceBindings: js.Array[DataSourceBinding] = js.native
  var definitionType: String = js.native
  var demands: js.Array[_] = js.native
  var description: String = js.native
  var disabled: Boolean = js.native
  var execution: StringDictionary[js.Any] = js.native
  var friendlyName: String = js.native
  var groups: js.Array[TaskGroupDefinition] = js.native
  var helpMarkDown: String = js.native
  var hostType: String = js.native
  var iconUrl: String = js.native
  var id: String = js.native
  var inputs: js.Array[TaskInputDefinition] = js.native
  var instanceNameFormat: String = js.native
  var minimumAgentVersion: String = js.native
  var name: String = js.native
  var packageLocation: String = js.native
  var packageType: String = js.native
  var preview: Boolean = js.native
  var releaseNotes: String = js.native
  var runsOn: js.Array[String] = js.native
  var serverOwned: Boolean = js.native
  var sourceDefinitions: js.Array[TaskSourceDefinition] = js.native
  var sourceLocation: String = js.native
  var version: TaskVersion = js.native
  var visibility: js.Array[String] = js.native
}

object TaskDefinition {
  @scala.inline
  def apply(
    agentExecution: TaskExecution,
    author: String,
    category: String,
    contentsUploaded: Boolean,
    contributionIdentifier: String,
    contributionVersion: String,
    dataSourceBindings: js.Array[DataSourceBinding],
    definitionType: String,
    demands: js.Array[_],
    description: String,
    disabled: Boolean,
    execution: StringDictionary[js.Any],
    friendlyName: String,
    groups: js.Array[TaskGroupDefinition],
    helpMarkDown: String,
    hostType: String,
    iconUrl: String,
    id: String,
    inputs: js.Array[TaskInputDefinition],
    instanceNameFormat: String,
    minimumAgentVersion: String,
    name: String,
    packageLocation: String,
    packageType: String,
    preview: Boolean,
    releaseNotes: String,
    runsOn: js.Array[String],
    serverOwned: Boolean,
    sourceDefinitions: js.Array[TaskSourceDefinition],
    sourceLocation: String,
    version: TaskVersion,
    visibility: js.Array[String]
  ): TaskDefinition = {
    val __obj = js.Dynamic.literal(agentExecution = agentExecution.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], contentsUploaded = contentsUploaded.asInstanceOf[js.Any], contributionIdentifier = contributionIdentifier.asInstanceOf[js.Any], contributionVersion = contributionVersion.asInstanceOf[js.Any], dataSourceBindings = dataSourceBindings.asInstanceOf[js.Any], definitionType = definitionType.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], helpMarkDown = helpMarkDown.asInstanceOf[js.Any], hostType = hostType.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], instanceNameFormat = instanceNameFormat.asInstanceOf[js.Any], minimumAgentVersion = minimumAgentVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], packageLocation = packageLocation.asInstanceOf[js.Any], packageType = packageType.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], releaseNotes = releaseNotes.asInstanceOf[js.Any], runsOn = runsOn.asInstanceOf[js.Any], serverOwned = serverOwned.asInstanceOf[js.Any], sourceDefinitions = sourceDefinitions.asInstanceOf[js.Any], sourceLocation = sourceLocation.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinition]
  }
  @scala.inline
  implicit class TaskDefinitionOps[Self <: TaskDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentExecution(value: TaskExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentsUploaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsUploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContributionIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributionIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContributionVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributionVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSourceBindings(value: js.Array[DataSourceBinding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDemands(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecution(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[TaskGroupDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpMarkDown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpMarkDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[TaskInputDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceNameFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceNameFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumAgentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumAgentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunsOn(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runsOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerOwned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverOwned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDefinitions(value: js.Array[TaskSourceDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: TaskVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibility(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

