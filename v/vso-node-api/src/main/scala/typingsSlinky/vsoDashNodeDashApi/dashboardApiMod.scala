package typingsSlinky.vsoDashNodeDashApi

import typingsSlinky.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typingsSlinky.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamContext
import typingsSlinky.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.Dashboard
import typingsSlinky.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.DashboardGroup
import typingsSlinky.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.Widget
import typingsSlinky.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.WidgetMetadataResponse
import typingsSlinky.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.WidgetScope
import typingsSlinky.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.WidgetTypesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/DashboardApi", JSImport.Namespace)
@js.native
object dashboardApiMod extends js.Object {
  @js.native
  class DashboardApi protected () extends IDashboardApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait IDashboardApi extends ClientApiBase {
    def createDashboard(dashboard: Dashboard, teamContext: TeamContext): js.Promise[Dashboard] = js.native
    def createWidget(widget: Widget, teamContext: TeamContext, dashboardId: String): js.Promise[Widget] = js.native
    def deleteDashboard(teamContext: TeamContext, dashboardId: String): js.Promise[Unit] = js.native
    def deleteWidget(teamContext: TeamContext, dashboardId: String, widgetId: String): js.Promise[Dashboard] = js.native
    def getDashboard(teamContext: TeamContext, dashboardId: String): js.Promise[Dashboard] = js.native
    def getDashboards(teamContext: TeamContext): js.Promise[DashboardGroup] = js.native
    def getWidget(teamContext: TeamContext, dashboardId: String, widgetId: String): js.Promise[Widget] = js.native
    def getWidgetMetadata(contributionId: String): js.Promise[WidgetMetadataResponse] = js.native
    def getWidgetTypes(scope: WidgetScope): js.Promise[WidgetTypesResponse] = js.native
    def replaceDashboard(dashboard: Dashboard, teamContext: TeamContext, dashboardId: String): js.Promise[Dashboard] = js.native
    def replaceDashboards(group: DashboardGroup, teamContext: TeamContext): js.Promise[DashboardGroup] = js.native
    def replaceWidget(widget: Widget, teamContext: TeamContext, dashboardId: String, widgetId: String): js.Promise[Widget] = js.native
    def updateWidget(widget: Widget, teamContext: TeamContext, dashboardId: String, widgetId: String): js.Promise[Widget] = js.native
  }
  
}

