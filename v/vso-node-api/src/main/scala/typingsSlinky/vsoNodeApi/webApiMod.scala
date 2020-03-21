package typingsSlinky.vsoNodeApi

import typingsSlinky.typedRestClient.restClientMod.RestClient
import typingsSlinky.vsoNodeApi.buildApiMod.IBuildApi
import typingsSlinky.vsoNodeApi.coreApiMod.ICoreApi
import typingsSlinky.vsoNodeApi.dashboardApiMod.IDashboardApi
import typingsSlinky.vsoNodeApi.extensionManagementApiMod.IExtensionManagementApi
import typingsSlinky.vsoNodeApi.featureManagementApiMod.IFeatureManagementApi
import typingsSlinky.vsoNodeApi.fileContainerApiMod.IFileContainerApi
import typingsSlinky.vsoNodeApi.gitApiMod.IGitApi
import typingsSlinky.vsoNodeApi.locationsApiMod.ILocationsApi
import typingsSlinky.vsoNodeApi.locationsInterfacesMod.ConnectionData
import typingsSlinky.vsoNodeApi.notificationApiMod.INotificationApi
import typingsSlinky.vsoNodeApi.policyApiMod.IPolicyApi
import typingsSlinky.vsoNodeApi.profileApiMod.IProfileApi
import typingsSlinky.vsoNodeApi.projectAnalysisApiMod.IProjectAnalysisApi
import typingsSlinky.vsoNodeApi.releaseApiMod.IReleaseApi
import typingsSlinky.vsoNodeApi.securityRolesApiMod.ISecurityRolesApi
import typingsSlinky.vsoNodeApi.taskAgentApiMod.ITaskAgentApi
import typingsSlinky.vsoNodeApi.taskApiMod.ITaskApi
import typingsSlinky.vsoNodeApi.testApiMod.ITestApi
import typingsSlinky.vsoNodeApi.tfvcApiMod.ITfvcApi
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typingsSlinky.vsoNodeApi.vsoClientMod.VsoClient
import typingsSlinky.vsoNodeApi.workApiMod.IWorkApi
import typingsSlinky.vsoNodeApi.workItemTrackingApiMod.IWorkItemTrackingApi
import typingsSlinky.vsoNodeApi.workItemTrackingProcessApiMod.IWorkItemTrackingProcessApi
import typingsSlinky.vsoNodeApi.workItemTrackingProcessDefinitionsApiMod.IWorkItemTrackingProcessDefinitionsApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/WebApi", JSImport.Namespace)
@js.native
object webApiMod extends js.Object {
  @js.native
  class WebApi protected () extends js.Object {
    def this(defaultUrl: String, authHandler: IRequestHandler) = this()
    def this(defaultUrl: String, authHandler: IRequestHandler, options: IRequestOptions) = this()
    var _resourceAreas: js.Any = js.native
    var authHandler: IRequestHandler = js.native
    var options: IRequestOptions = js.native
    var rest: RestClient = js.native
    var serverUrl: String = js.native
    var vsoClient: VsoClient = js.native
    /* private */ def _getResourceAreaUrl(serverUrl: js.Any, resourceId: js.Any): js.Any = js.native
    /* private */ def _getResourceAreas(): js.Any = js.native
    /* private */ def _readTaskLibSecrets(lookupKey: js.Any): js.Any = js.native
    def connect(): js.Promise[ConnectionData] = js.native
    /**
      * Each factory method can take a serverUrl and a list of handlers
      * if these aren't provided, the default url and auth handler given to the constructor for this class will be used
      */
    def getBuildApi(): js.Promise[IBuildApi] = js.native
    def getBuildApi(serverUrl: String): js.Promise[IBuildApi] = js.native
    def getBuildApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IBuildApi] = js.native
    def getCoreApi(): js.Promise[ICoreApi] = js.native
    def getCoreApi(serverUrl: String): js.Promise[ICoreApi] = js.native
    def getCoreApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ICoreApi] = js.native
    def getDashboardApi(): js.Promise[IDashboardApi] = js.native
    def getDashboardApi(serverUrl: String): js.Promise[IDashboardApi] = js.native
    def getDashboardApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IDashboardApi] = js.native
    def getExtensionManagementApi(): js.Promise[IExtensionManagementApi] = js.native
    def getExtensionManagementApi(serverUrl: String): js.Promise[IExtensionManagementApi] = js.native
    def getExtensionManagementApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IExtensionManagementApi] = js.native
    def getFeatureManagementApi(): js.Promise[IFeatureManagementApi] = js.native
    def getFeatureManagementApi(serverUrl: String): js.Promise[IFeatureManagementApi] = js.native
    def getFeatureManagementApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IFeatureManagementApi] = js.native
    def getFileContainerApi(): js.Promise[IFileContainerApi] = js.native
    def getFileContainerApi(serverUrl: String): js.Promise[IFileContainerApi] = js.native
    def getFileContainerApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IFileContainerApi] = js.native
    def getGitApi(): js.Promise[IGitApi] = js.native
    def getGitApi(serverUrl: String): js.Promise[IGitApi] = js.native
    def getGitApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IGitApi] = js.native
    def getLocationsApi(): js.Promise[ILocationsApi] = js.native
    def getLocationsApi(serverUrl: String): js.Promise[ILocationsApi] = js.native
    def getLocationsApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ILocationsApi] = js.native
    def getNotificationApi(): js.Promise[INotificationApi] = js.native
    def getNotificationApi(serverUrl: String): js.Promise[INotificationApi] = js.native
    def getNotificationApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[INotificationApi] = js.native
    def getPolicyApi(): js.Promise[IPolicyApi] = js.native
    def getPolicyApi(serverUrl: String): js.Promise[IPolicyApi] = js.native
    def getPolicyApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IPolicyApi] = js.native
    def getProfileApi(): js.Promise[IProfileApi] = js.native
    def getProfileApi(serverUrl: String): js.Promise[IProfileApi] = js.native
    def getProfileApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IProfileApi] = js.native
    def getProjectAnalysisApi(): js.Promise[IProjectAnalysisApi] = js.native
    def getProjectAnalysisApi(serverUrl: String): js.Promise[IProjectAnalysisApi] = js.native
    def getProjectAnalysisApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IProjectAnalysisApi] = js.native
    def getReleaseApi(): js.Promise[IReleaseApi] = js.native
    def getReleaseApi(serverUrl: String): js.Promise[IReleaseApi] = js.native
    def getReleaseApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IReleaseApi] = js.native
    def getSecurityRolesApi(): js.Promise[ISecurityRolesApi] = js.native
    def getSecurityRolesApi(serverUrl: String): js.Promise[ISecurityRolesApi] = js.native
    def getSecurityRolesApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ISecurityRolesApi] = js.native
    def getTaskAgentApi(): js.Promise[ITaskAgentApi] = js.native
    def getTaskAgentApi(serverUrl: String): js.Promise[ITaskAgentApi] = js.native
    def getTaskAgentApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ITaskAgentApi] = js.native
    def getTaskApi(): js.Promise[ITaskApi] = js.native
    def getTaskApi(serverUrl: String): js.Promise[ITaskApi] = js.native
    def getTaskApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ITaskApi] = js.native
    def getTestApi(): js.Promise[ITestApi] = js.native
    def getTestApi(serverUrl: String): js.Promise[ITestApi] = js.native
    def getTestApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ITestApi] = js.native
    def getTfvcApi(): js.Promise[ITfvcApi] = js.native
    def getTfvcApi(serverUrl: String): js.Promise[ITfvcApi] = js.native
    def getTfvcApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ITfvcApi] = js.native
    def getWorkApi(): js.Promise[IWorkApi] = js.native
    def getWorkApi(serverUrl: String): js.Promise[IWorkApi] = js.native
    def getWorkApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IWorkApi] = js.native
    def getWorkItemTrackingApi(): js.Promise[IWorkItemTrackingApi] = js.native
    def getWorkItemTrackingApi(serverUrl: String): js.Promise[IWorkItemTrackingApi] = js.native
    def getWorkItemTrackingApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IWorkItemTrackingApi] = js.native
    def getWorkItemTrackingProcessApi(): js.Promise[IWorkItemTrackingProcessApi] = js.native
    def getWorkItemTrackingProcessApi(serverUrl: String): js.Promise[IWorkItemTrackingProcessApi] = js.native
    def getWorkItemTrackingProcessApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IWorkItemTrackingProcessApi] = js.native
    def getWorkItemTrackingProcessDefinitionApi(): js.Promise[IWorkItemTrackingProcessDefinitionsApi] = js.native
    def getWorkItemTrackingProcessDefinitionApi(serverUrl: String): js.Promise[IWorkItemTrackingProcessDefinitionsApi] = js.native
    def getWorkItemTrackingProcessDefinitionApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IWorkItemTrackingProcessDefinitionsApi] = js.native
  }
  
  def getBasicHandler(username: String, password: String): IRequestHandler = js.native
  def getBearerHandler(token: String): IRequestHandler = js.native
  def getHandlerFromToken(token: String): IRequestHandler = js.native
  def getNtlmHandler(username: String, password: String): IRequestHandler = js.native
  def getNtlmHandler(username: String, password: String, workstation: String): IRequestHandler = js.native
  def getNtlmHandler(username: String, password: String, workstation: String, domain: String): IRequestHandler = js.native
  def getPersonalAccessTokenHandler(token: String): IRequestHandler = js.native
  /* static members */
  @js.native
  object WebApi extends js.Object {
    /**
      *  Convenience factory to create with a bearer token.
      * @param defaultServerUrl default server url to use when creating new apis from factory methods
      * @param defaultAuthHandler default authentication credentials to use when creating new apis from factory methods
      */
    def createWithBearerToken(defaultUrl: String, token: String): WebApi = js.native
    def createWithBearerToken(defaultUrl: String, token: String, options: IRequestOptions): WebApi = js.native
  }
  
}

