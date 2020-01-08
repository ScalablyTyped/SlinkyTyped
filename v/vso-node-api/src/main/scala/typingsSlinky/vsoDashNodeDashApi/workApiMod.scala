package typingsSlinky.vsoDashNodeDashApi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typingsSlinky.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamContext
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BacklogConfiguration
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.Board
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardCardRuleSettings
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardCardSettings
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardChart
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardChartReference
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardColumn
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardReference
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardRow
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardSuggestedValue
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardUserSettings
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.CapacityPatch
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.CreatePlan
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.DeliveryViewData
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.ParentChildWIMap
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.Plan
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.ProcessConfiguration
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamFieldValues
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamFieldValuesPatch
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamMemberCapacity
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamSetting
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamSettingsDaysOff
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamSettingsDaysOffPatch
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamSettingsIteration
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TeamSettingsPatch
import typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.UpdatePlan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/WorkApi", JSImport.Namespace)
@js.native
object workApiMod extends js.Object {
  @js.native
  trait IWorkApi extends ClientApiBase {
    def createPlan(postedPlan: CreatePlan, project: String): js.Promise[Plan] = js.native
    def deletePlan(project: String, id: String): js.Promise[Unit] = js.native
    def deleteTeamIteration(teamContext: TeamContext, id: String): js.Promise[Unit] = js.native
    def getBacklogConfigurations(teamContext: TeamContext): js.Promise[BacklogConfiguration] = js.native
    def getBoard(teamContext: TeamContext, id: String): js.Promise[Board] = js.native
    def getBoardCardRuleSettings(teamContext: TeamContext, board: String): js.Promise[BoardCardRuleSettings] = js.native
    def getBoardCardSettings(teamContext: TeamContext, board: String): js.Promise[BoardCardSettings] = js.native
    def getBoardChart(teamContext: TeamContext, board: String, name: String): js.Promise[BoardChart] = js.native
    def getBoardCharts(teamContext: TeamContext, board: String): js.Promise[js.Array[BoardChartReference]] = js.native
    def getBoardColumns(teamContext: TeamContext, board: String): js.Promise[js.Array[BoardColumn]] = js.native
    def getBoardMappingParentItems(
      teamContext: TeamContext,
      childBacklogContextCategoryRefName: String,
      workitemIds: js.Array[Double]
    ): js.Promise[js.Array[ParentChildWIMap]] = js.native
    def getBoardRows(teamContext: TeamContext, board: String): js.Promise[js.Array[BoardRow]] = js.native
    def getBoardUserSettings(teamContext: TeamContext, board: String): js.Promise[BoardUserSettings] = js.native
    def getBoards(teamContext: TeamContext): js.Promise[js.Array[BoardReference]] = js.native
    def getCapacities(teamContext: TeamContext, iterationId: String): js.Promise[js.Array[TeamMemberCapacity]] = js.native
    def getCapacity(teamContext: TeamContext, iterationId: String, teamMemberId: String): js.Promise[TeamMemberCapacity] = js.native
    def getColumnSuggestedValues(): js.Promise[js.Array[BoardSuggestedValue]] = js.native
    def getColumnSuggestedValues(project: String): js.Promise[js.Array[BoardSuggestedValue]] = js.native
    def getDeliveryTimelineData(project: String, id: String): js.Promise[DeliveryViewData] = js.native
    def getDeliveryTimelineData(project: String, id: String, revision: Double): js.Promise[DeliveryViewData] = js.native
    def getDeliveryTimelineData(project: String, id: String, revision: Double, startDate: js.Date): js.Promise[DeliveryViewData] = js.native
    def getDeliveryTimelineData(project: String, id: String, revision: Double, startDate: js.Date, endDate: js.Date): js.Promise[DeliveryViewData] = js.native
    def getPlan(project: String, id: String): js.Promise[Plan] = js.native
    def getPlans(project: String): js.Promise[js.Array[Plan]] = js.native
    def getProcessConfiguration(project: String): js.Promise[ProcessConfiguration] = js.native
    def getRowSuggestedValues(): js.Promise[js.Array[BoardSuggestedValue]] = js.native
    def getRowSuggestedValues(project: String): js.Promise[js.Array[BoardSuggestedValue]] = js.native
    def getTeamDaysOff(teamContext: TeamContext, iterationId: String): js.Promise[TeamSettingsDaysOff] = js.native
    def getTeamFieldValues(teamContext: TeamContext): js.Promise[TeamFieldValues] = js.native
    def getTeamIteration(teamContext: TeamContext, id: String): js.Promise[TeamSettingsIteration] = js.native
    def getTeamIterations(teamContext: TeamContext): js.Promise[js.Array[TeamSettingsIteration]] = js.native
    def getTeamIterations(teamContext: TeamContext, timeframe: String): js.Promise[js.Array[TeamSettingsIteration]] = js.native
    def getTeamSettings(teamContext: TeamContext): js.Promise[TeamSetting] = js.native
    def postTeamIteration(iteration: TeamSettingsIteration, teamContext: TeamContext): js.Promise[TeamSettingsIteration] = js.native
    def replaceCapacities(capacities: js.Array[TeamMemberCapacity], teamContext: TeamContext, iterationId: String): js.Promise[js.Array[TeamMemberCapacity]] = js.native
    def setBoardOptions(options: StringDictionary[String], teamContext: TeamContext, id: String): js.Promise[StringDictionary[String]] = js.native
    def updateBoardCardRuleSettings(boardCardRuleSettings: BoardCardRuleSettings, teamContext: TeamContext, board: String): js.Promise[BoardCardRuleSettings] = js.native
    def updateBoardCardSettings(boardCardSettingsToSave: BoardCardSettings, teamContext: TeamContext, board: String): js.Promise[BoardCardSettings] = js.native
    def updateBoardChart(chart: BoardChart, teamContext: TeamContext, board: String, name: String): js.Promise[BoardChart] = js.native
    def updateBoardColumns(boardColumns: js.Array[BoardColumn], teamContext: TeamContext, board: String): js.Promise[js.Array[BoardColumn]] = js.native
    def updateBoardRows(boardRows: js.Array[BoardRow], teamContext: TeamContext, board: String): js.Promise[js.Array[BoardRow]] = js.native
    def updateBoardUserSettings(boardUserSettings: StringDictionary[String], teamContext: TeamContext, board: String): js.Promise[BoardUserSettings] = js.native
    def updateCapacity(patch: CapacityPatch, teamContext: TeamContext, iterationId: String, teamMemberId: String): js.Promise[TeamMemberCapacity] = js.native
    def updatePlan(updatedPlan: UpdatePlan, project: String, id: String): js.Promise[Plan] = js.native
    def updateTeamDaysOff(daysOffPatch: TeamSettingsDaysOffPatch, teamContext: TeamContext, iterationId: String): js.Promise[TeamSettingsDaysOff] = js.native
    def updateTeamFieldValues(patch: TeamFieldValuesPatch, teamContext: TeamContext): js.Promise[TeamFieldValues] = js.native
    def updateTeamSettings(teamSettingsPatch: TeamSettingsPatch, teamContext: TeamContext): js.Promise[TeamSetting] = js.native
  }
  
  @js.native
  class WorkApi protected () extends IWorkApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
}

