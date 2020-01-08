package typingsSlinky.vsoDashNodeDashApi

import typingsSlinky.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typingsSlinky.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.AggregationType
import typingsSlinky.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.ProjectActivityMetrics
import typingsSlinky.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.ProjectLanguageAnalytics
import typingsSlinky.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.RepositoryActivityMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/ProjectAnalysisApi", JSImport.Namespace)
@js.native
object projectAnalysisApiMod extends js.Object {
  @js.native
  trait IProjectAnalysisApi extends ClientApiBase {
    def getGitRepositoriesActivityMetrics(project: String, fromDate: js.Date, aggregationType: AggregationType, skip: Double, top: Double): js.Promise[js.Array[RepositoryActivityMetrics]] = js.native
    def getProjectActivityMetrics(project: String, fromDate: js.Date, aggregationType: AggregationType): js.Promise[ProjectActivityMetrics] = js.native
    def getProjectLanguageAnalytics(project: String): js.Promise[ProjectLanguageAnalytics] = js.native
    def getRepositoryActivityMetrics(project: String, repositoryId: String, fromDate: js.Date, aggregationType: AggregationType): js.Promise[RepositoryActivityMetrics] = js.native
  }
  
  @js.native
  class ProjectAnalysisApi protected () extends IProjectAnalysisApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
}

