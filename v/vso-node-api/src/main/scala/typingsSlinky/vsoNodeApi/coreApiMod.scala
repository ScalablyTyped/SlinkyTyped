package typingsSlinky.vsoNodeApi

import typingsSlinky.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsSlinky.vsoNodeApi.coreInterfacesMod.ConnectedServiceKind
import typingsSlinky.vsoNodeApi.coreInterfacesMod.IdentityData
import typingsSlinky.vsoNodeApi.coreInterfacesMod.Process
import typingsSlinky.vsoNodeApi.coreInterfacesMod.ProjectInfo
import typingsSlinky.vsoNodeApi.coreInterfacesMod.ProjectProperty
import typingsSlinky.vsoNodeApi.coreInterfacesMod.Proxy
import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProject
import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectCollection
import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectCollectionReference
import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typingsSlinky.vsoNodeApi.coreInterfacesMod.WebApiConnectedService
import typingsSlinky.vsoNodeApi.coreInterfacesMod.WebApiConnectedServiceDetails
import typingsSlinky.vsoNodeApi.coreInterfacesMod.WebApiTeam
import typingsSlinky.vsoNodeApi.operationsInterfacesMod.OperationReference
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import typingsSlinky.vsoNodeApi.vssinterfacesMod.JsonPatchDocument
import typingsSlinky.vsoNodeApi.vssinterfacesMod.TeamMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreApiMod {
  
  @JSImport("vso-node-api/CoreApi", "CoreApi")
  @js.native
  class CoreApi protected () extends ICoreApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  /* static members */
  object CoreApi {
    
    @JSImport("vso-node-api/CoreApi", "CoreApi.RESOURCE_AREA_ID")
    @js.native
    val RESOURCE_AREA_ID: String = js.native
  }
  
  @js.native
  trait ICoreApi extends ClientApiBase {
    
    def createConnectedService(connectedServiceCreationData: WebApiConnectedServiceDetails, projectId: String): js.Promise[WebApiConnectedService] = js.native
    
    def createIdentityMru(mruData: IdentityData, mruName: String): js.Promise[Unit] = js.native
    
    def createOrUpdateProxy(proxy: Proxy): js.Promise[Proxy] = js.native
    
    def createTeam(team: WebApiTeam, projectId: String): js.Promise[WebApiTeam] = js.native
    
    def deleteIdentityMru(mruData: IdentityData, mruName: String): js.Promise[Unit] = js.native
    
    def deleteProxy(proxyUrl: String): js.Promise[Unit] = js.native
    def deleteProxy(proxyUrl: String, site: String): js.Promise[Unit] = js.native
    
    def deleteTeam(projectId: String, teamId: String): js.Promise[Unit] = js.native
    
    def getAllTeams(): js.Promise[js.Array[WebApiTeam]] = js.native
    def getAllTeams(mine: js.UndefOr[scala.Nothing], top: js.UndefOr[scala.Nothing], skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getAllTeams(mine: js.UndefOr[scala.Nothing], top: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getAllTeams(mine: js.UndefOr[scala.Nothing], top: Double, skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getAllTeams(mine: Boolean): js.Promise[js.Array[WebApiTeam]] = js.native
    def getAllTeams(mine: Boolean, top: js.UndefOr[scala.Nothing], skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getAllTeams(mine: Boolean, top: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getAllTeams(mine: Boolean, top: Double, skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    
    def getConnectedServiceDetails(projectId: String, name: String): js.Promise[WebApiConnectedServiceDetails] = js.native
    
    def getConnectedServices(projectId: String): js.Promise[js.Array[WebApiConnectedService]] = js.native
    def getConnectedServices(projectId: String, kind: ConnectedServiceKind): js.Promise[js.Array[WebApiConnectedService]] = js.native
    
    def getIdentityMru(mruName: String): js.Promise[js.Array[IdentityRef]] = js.native
    
    def getProcessById(processId: String): js.Promise[Process] = js.native
    
    def getProcesses(): js.Promise[js.Array[Process]] = js.native
    
    def getProject(projectId: String): js.Promise[TeamProject] = js.native
    def getProject(projectId: String, includeCapabilities: js.UndefOr[scala.Nothing], includeHistory: Boolean): js.Promise[TeamProject] = js.native
    def getProject(projectId: String, includeCapabilities: Boolean): js.Promise[TeamProject] = js.native
    def getProject(projectId: String, includeCapabilities: Boolean, includeHistory: Boolean): js.Promise[TeamProject] = js.native
    
    def getProjectCollection(collectionId: String): js.Promise[TeamProjectCollection] = js.native
    
    def getProjectCollections(): js.Promise[js.Array[TeamProjectCollectionReference]] = js.native
    def getProjectCollections(top: js.UndefOr[scala.Nothing], skip: Double): js.Promise[js.Array[TeamProjectCollectionReference]] = js.native
    def getProjectCollections(top: Double): js.Promise[js.Array[TeamProjectCollectionReference]] = js.native
    def getProjectCollections(top: Double, skip: Double): js.Promise[js.Array[TeamProjectCollectionReference]] = js.native
    
    def getProjectHistoryEntries(): js.Promise[js.Array[ProjectInfo]] = js.native
    def getProjectHistoryEntries(minRevision: Double): js.Promise[js.Array[ProjectInfo]] = js.native
    
    def getProjectProperties(projectId: String): js.Promise[js.Array[ProjectProperty]] = js.native
    def getProjectProperties(projectId: String, keys: js.Array[String]): js.Promise[js.Array[ProjectProperty]] = js.native
    
    def getProjects(): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(
      stateFilter: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      continuationToken: String
    ): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.UndefOr[scala.Nothing], top: js.UndefOr[scala.Nothing], skip: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(
      stateFilter: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      skip: Double,
      continuationToken: String
    ): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.UndefOr[scala.Nothing], top: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(
      stateFilter: js.UndefOr[scala.Nothing],
      top: Double,
      skip: js.UndefOr[scala.Nothing],
      continuationToken: String
    ): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.UndefOr[scala.Nothing], top: Double, skip: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.UndefOr[scala.Nothing], top: Double, skip: Double, continuationToken: String): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.Any): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(
      stateFilter: js.Any,
      top: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      continuationToken: String
    ): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.Any, top: js.UndefOr[scala.Nothing], skip: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.Any, top: js.UndefOr[scala.Nothing], skip: Double, continuationToken: String): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.Any, top: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.Any, top: Double, skip: js.UndefOr[scala.Nothing], continuationToken: String): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.Any, top: Double, skip: Double): js.Promise[js.Array[TeamProjectReference]] = js.native
    def getProjects(stateFilter: js.Any, top: Double, skip: Double, continuationToken: String): js.Promise[js.Array[TeamProjectReference]] = js.native
    
    def getProxies(): js.Promise[js.Array[Proxy]] = js.native
    def getProxies(proxyUrl: String): js.Promise[js.Array[Proxy]] = js.native
    
    def getTeam(projectId: String, teamId: String): js.Promise[WebApiTeam] = js.native
    
    def getTeamMembersWithExtendedProperties(projectId: String, teamId: String): js.Promise[js.Array[TeamMember]] = js.native
    def getTeamMembersWithExtendedProperties(projectId: String, teamId: String, top: js.UndefOr[scala.Nothing], skip: Double): js.Promise[js.Array[TeamMember]] = js.native
    def getTeamMembersWithExtendedProperties(projectId: String, teamId: String, top: Double): js.Promise[js.Array[TeamMember]] = js.native
    def getTeamMembersWithExtendedProperties(projectId: String, teamId: String, top: Double, skip: Double): js.Promise[js.Array[TeamMember]] = js.native
    
    def getTeams(projectId: String): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: js.UndefOr[scala.Nothing], top: js.UndefOr[scala.Nothing], skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: js.UndefOr[scala.Nothing], top: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: js.UndefOr[scala.Nothing], top: Double, skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Boolean): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Boolean, top: js.UndefOr[scala.Nothing], skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Boolean, top: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    def getTeams(projectId: String, mine: Boolean, top: Double, skip: Double): js.Promise[js.Array[WebApiTeam]] = js.native
    
    def queueCreateProject(projectToCreate: TeamProject): js.Promise[OperationReference] = js.native
    
    def queueDeleteProject(projectId: String): js.Promise[OperationReference] = js.native
    
    def setProjectProperties(customHeaders: js.Any, projectId: String, patchDocument: JsonPatchDocument): js.Promise[Unit] = js.native
    
    def updateIdentityMru(mruData: IdentityData, mruName: String): js.Promise[Unit] = js.native
    
    def updateProject(projectUpdate: TeamProject, projectId: String): js.Promise[OperationReference] = js.native
    
    def updateTeam(teamData: WebApiTeam, projectId: String, teamId: String): js.Promise[WebApiTeam] = js.native
  }
}
