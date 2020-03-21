package typingsSlinky.vsoNodeApi

import typingsSlinky.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamContext
import typingsSlinky.vsoNodeApi.dashboardInterfacesMod.Dashboard
import typingsSlinky.vsoNodeApi.dashboardInterfacesMod.DashboardGroup
import typingsSlinky.vsoNodeApi.dashboardInterfacesMod.Widget
import typingsSlinky.vsoNodeApi.dashboardInterfacesMod.WidgetMetadataResponse
import typingsSlinky.vsoNodeApi.dashboardInterfacesMod.WidgetScope
import typingsSlinky.vsoNodeApi.dashboardInterfacesMod.WidgetTypesResponse
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
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

