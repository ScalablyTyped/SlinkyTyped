package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskGroup extends TaskDefinition {
  
  var comment: String = js.native
  
  var createdBy: IdentityRef = js.native
  
  var createdOn: js.Date = js.native
  
  var modifiedBy: IdentityRef = js.native
  
  var modifiedOn: js.Date = js.native
  
  var owner: String = js.native
  
  var revision: Double = js.native
  
  var tasks: js.Array[TaskGroupStep] = js.native
}
object TaskGroup {
  
  @scala.inline
  def apply(
    agentExecution: TaskExecution,
    author: String,
    category: String,
    comment: String,
    contentsUploaded: Boolean,
    contributionIdentifier: String,
    contributionVersion: String,
    createdBy: IdentityRef,
    createdOn: js.Date,
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
    modifiedBy: IdentityRef,
    modifiedOn: js.Date,
    name: String,
    owner: String,
    packageLocation: String,
    packageType: String,
    preview: Boolean,
    releaseNotes: String,
    revision: Double,
    runsOn: js.Array[String],
    serverOwned: Boolean,
    sourceDefinitions: js.Array[TaskSourceDefinition],
    sourceLocation: String,
    tasks: js.Array[TaskGroupStep],
    version: TaskVersion,
    visibility: js.Array[String]
  ): TaskGroup = {
    val __obj = js.Dynamic.literal(agentExecution = agentExecution.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], contentsUploaded = contentsUploaded.asInstanceOf[js.Any], contributionIdentifier = contributionIdentifier.asInstanceOf[js.Any], contributionVersion = contributionVersion.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], dataSourceBindings = dataSourceBindings.asInstanceOf[js.Any], definitionType = definitionType.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], helpMarkDown = helpMarkDown.asInstanceOf[js.Any], hostType = hostType.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], instanceNameFormat = instanceNameFormat.asInstanceOf[js.Any], minimumAgentVersion = minimumAgentVersion.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], packageLocation = packageLocation.asInstanceOf[js.Any], packageType = packageType.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], releaseNotes = releaseNotes.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], runsOn = runsOn.asInstanceOf[js.Any], serverOwned = serverOwned.asInstanceOf[js.Any], sourceDefinitions = sourceDefinitions.asInstanceOf[js.Any], sourceLocation = sourceLocation.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskGroup]
  }
  
  @scala.inline
  implicit class TaskGroupMutableBuilder[Self <: TaskGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedBy(value: IdentityRef): Self = StObject.set(x, "modifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedOn(value: js.Date): Self = StObject.set(x, "modifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasks(value: js.Array[TaskGroupStep]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: TaskGroupStep*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
