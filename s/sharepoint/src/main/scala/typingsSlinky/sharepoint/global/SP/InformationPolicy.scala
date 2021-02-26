package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InformationPolicy {
  
  @JSGlobal("SP.InformationPolicy.ProjectPolicy")
  @js.native
  class ProjectPolicy protected ()
    extends typingsSlinky.sharepoint.SP.InformationPolicy.ProjectPolicy {
    def this(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      objectPath: typingsSlinky.sharepoint.SP.ObjectPath
    ) = this()
  }
  object ProjectPolicy {
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.applyProjectPolicy")
    @js.native
    def applyProjectPolicy(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      web: typingsSlinky.sharepoint.SP.Web,
      projectPolicy: typingsSlinky.sharepoint.SP.InformationPolicy.ProjectPolicy
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.closeProject")
    @js.native
    def closeProject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.doesProjectHavePolicy")
    @js.native
    def doesProjectHavePolicy(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.BooleanResult = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.getCurrentlyAppliedProject")
    @js.native
    def getCurrentlyAppliedProject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.InformationPolicy.ProjectPolicy = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.getProjectCloseDate")
    @js.native
    def getProjectCloseDate(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.DateTimeResult = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.getProjectExpirationDate")
    @js.native
    def getProjectExpirationDate(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.DateTimeResult = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.getProjectPolicies")
    @js.native
    def getProjectPolicies(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.ClientObjectList[typingsSlinky.sharepoint.SP.InformationPolicy.ProjectPolicy] = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.isProjectClosed")
    @js.native
    def isProjectClosed(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.BooleanResult = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.openProject")
    @js.native
    def openProject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.postponeProject")
    @js.native
    def postponeProject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): Unit = js.native
  }
}
