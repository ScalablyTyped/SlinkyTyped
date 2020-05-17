package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.InformationPolicy")
@js.native
object InformationPolicy extends js.Object {
  @js.native
  class ProjectPolicy protected ()
    extends typingsSlinky.sharepoint.SP.InformationPolicy.ProjectPolicy {
    def this(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      objectPath: typingsSlinky.sharepoint.SP.ObjectPath
    ) = this()
  }
  
  /* static members */
  @js.native
  object ProjectPolicy extends js.Object {
    def applyProjectPolicy(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      web: typingsSlinky.sharepoint.SP.Web,
      projectPolicy: typingsSlinky.sharepoint.SP.InformationPolicy.ProjectPolicy
    ): Unit = js.native
    def closeProject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): Unit = js.native
    def doesProjectHavePolicy(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.BooleanResult = js.native
    def getCurrentlyAppliedProject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.InformationPolicy.ProjectPolicy = js.native
    def getProjectCloseDate(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.DateTimeResult = js.native
    def getProjectExpirationDate(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.DateTimeResult = js.native
    def getProjectPolicies(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.ClientObjectList[typingsSlinky.sharepoint.SP.InformationPolicy.ProjectPolicy] = js.native
    def isProjectClosed(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.BooleanResult = js.native
    def openProject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): Unit = js.native
    def postponeProject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): Unit = js.native
  }
  
}

