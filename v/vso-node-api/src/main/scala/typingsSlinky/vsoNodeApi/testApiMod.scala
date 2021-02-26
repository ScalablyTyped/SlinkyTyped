package typingsSlinky.vsoNodeApi

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamContext
import typingsSlinky.vsoNodeApi.testInterfacesMod.AggregatedDataForResultTrend
import typingsSlinky.vsoNodeApi.testInterfacesMod.BuildCoverage
import typingsSlinky.vsoNodeApi.testInterfacesMod.BuildReference
import typingsSlinky.vsoNodeApi.testInterfacesMod.CloneOperationInformation
import typingsSlinky.vsoNodeApi.testInterfacesMod.CodeCoverageData
import typingsSlinky.vsoNodeApi.testInterfacesMod.CodeCoverageSummary
import typingsSlinky.vsoNodeApi.testInterfacesMod.CustomTestFieldDefinition
import typingsSlinky.vsoNodeApi.testInterfacesMod.CustomTestFieldScope
import typingsSlinky.vsoNodeApi.testInterfacesMod.LinkedWorkItemsQuery
import typingsSlinky.vsoNodeApi.testInterfacesMod.LinkedWorkItemsQueryResult
import typingsSlinky.vsoNodeApi.testInterfacesMod.PlanUpdateModel
import typingsSlinky.vsoNodeApi.testInterfacesMod.PointUpdateModel
import typingsSlinky.vsoNodeApi.testInterfacesMod.ReleaseReference
import typingsSlinky.vsoNodeApi.testInterfacesMod.ResultDetails
import typingsSlinky.vsoNodeApi.testInterfacesMod.ResultRetentionSettings
import typingsSlinky.vsoNodeApi.testInterfacesMod.ResultsFilter
import typingsSlinky.vsoNodeApi.testInterfacesMod.RunCreateModel
import typingsSlinky.vsoNodeApi.testInterfacesMod.RunUpdateModel
import typingsSlinky.vsoNodeApi.testInterfacesMod.SuiteCreateModel
import typingsSlinky.vsoNodeApi.testInterfacesMod.SuiteEntry
import typingsSlinky.vsoNodeApi.testInterfacesMod.SuiteEntryUpdateModel
import typingsSlinky.vsoNodeApi.testInterfacesMod.SuiteTestCase
import typingsSlinky.vsoNodeApi.testInterfacesMod.SuiteUpdateModel
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestActionResultModel
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestAttachment
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestAttachmentReference
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestAttachmentRequestModel
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestCaseResult
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestConfiguration
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestIterationDetailsModel
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestMessageLogDetails
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestOutcome
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestPlan
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestPlanCloneRequest
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestPoint
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestPointsQuery
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestResultDocument
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestResultHistory
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestResultParameterModel
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestResultSummary
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestResultTrendFilter
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestResultsContext
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestResultsDetails
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestResultsGroupsForBuild
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestResultsGroupsForRelease
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestResultsQuery
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestRun
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestRunCoverage
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestRunPublishContext
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestRunState
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestRunStatistic
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestSession
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestSessionSource
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestSettings
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestSuite
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestSuiteCloneRequest
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestSummaryForWorkItem
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestToWorkItemLinks
import typingsSlinky.vsoNodeApi.testInterfacesMod.TestVariable
import typingsSlinky.vsoNodeApi.testInterfacesMod.WorkItemReference
import typingsSlinky.vsoNodeApi.testInterfacesMod.WorkItemToTestLinks
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testApiMod {
  
  @JSImport("vso-node-api/TestApi", "TestApi")
  @js.native
  class TestApi protected () extends ITestApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait ITestApi extends ClientApiBase {
    
    def addCustomFields(newFields: js.Array[CustomTestFieldDefinition], project: String): js.Promise[js.Array[CustomTestFieldDefinition]] = js.native
    
    def addTestCasesToSuite(project: String, planId: Double, suiteId: Double, testCaseIds: String): js.Promise[js.Array[SuiteTestCase]] = js.native
    
    def addTestResultsToTestRun(results: js.Array[TestCaseResult], project: String, runId: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    
    def addWorkItemToTestLinks(workItemToTestLinks: WorkItemToTestLinks, project: String): js.Promise[WorkItemToTestLinks] = js.native
    
    def cloneTestPlan(cloneRequestBody: TestPlanCloneRequest, project: String, planId: Double): js.Promise[CloneOperationInformation] = js.native
    
    def cloneTestSuite(cloneRequestBody: TestSuiteCloneRequest, project: String, planId: Double, sourceSuiteId: Double): js.Promise[CloneOperationInformation] = js.native
    
    def createTestConfiguration(testConfiguration: TestConfiguration, project: String): js.Promise[TestConfiguration] = js.native
    
    def createTestIterationResultAttachment(
      attachmentRequestModel: TestAttachmentRequestModel,
      project: String,
      runId: Double,
      testCaseResultId: Double,
      iterationId: Double
    ): js.Promise[TestAttachmentReference] = js.native
    def createTestIterationResultAttachment(
      attachmentRequestModel: TestAttachmentRequestModel,
      project: String,
      runId: Double,
      testCaseResultId: Double,
      iterationId: Double,
      actionPath: String
    ): js.Promise[TestAttachmentReference] = js.native
    
    def createTestPlan(testPlan: PlanUpdateModel, project: String): js.Promise[TestPlan] = js.native
    
    def createTestResultAttachment(
      attachmentRequestModel: TestAttachmentRequestModel,
      project: String,
      runId: Double,
      testCaseResultId: Double
    ): js.Promise[TestAttachmentReference] = js.native
    
    def createTestRun(testRun: RunCreateModel, project: String): js.Promise[TestRun] = js.native
    
    def createTestRunAttachment(attachmentRequestModel: TestAttachmentRequestModel, project: String, runId: Double): js.Promise[TestAttachmentReference] = js.native
    
    def createTestSession(testSession: TestSession, teamContext: TeamContext): js.Promise[TestSession] = js.native
    
    def createTestSettings(testSettings: TestSettings, project: String): js.Promise[Double] = js.native
    
    def createTestSuite(testSuite: SuiteCreateModel, project: String, planId: Double, suiteId: Double): js.Promise[js.Array[TestSuite]] = js.native
    
    def createTestVariable(testVariable: TestVariable, project: String): js.Promise[TestVariable] = js.native
    
    def deleteSharedParameter(project: String, sharedParameterId: Double): js.Promise[Unit] = js.native
    
    def deleteSharedStep(project: String, sharedStepId: Double): js.Promise[Unit] = js.native
    
    def deleteTestCase(project: String, testCaseId: Double): js.Promise[Unit] = js.native
    
    def deleteTestConfiguration(project: String, testConfigurationId: Double): js.Promise[Unit] = js.native
    
    def deleteTestMethodToWorkItemLink(project: String, testName: String, workItemId: Double): js.Promise[Boolean] = js.native
    
    def deleteTestPlan(project: String, planId: Double): js.Promise[Unit] = js.native
    
    def deleteTestRun(project: String, runId: Double): js.Promise[Unit] = js.native
    
    def deleteTestSettings(project: String, testSettingsId: Double): js.Promise[Unit] = js.native
    
    def deleteTestSuite(project: String, planId: Double, suiteId: Double): js.Promise[Unit] = js.native
    
    def deleteTestVariable(project: String, testVariableId: Double): js.Promise[Unit] = js.native
    
    def getActionResults(project: String, runId: Double, testCaseResultId: Double, iterationId: Double): js.Promise[js.Array[TestActionResultModel]] = js.native
    def getActionResults(project: String, runId: Double, testCaseResultId: Double, iterationId: Double, actionPath: String): js.Promise[js.Array[TestActionResultModel]] = js.native
    
    def getBugsLinkedToTestResult(project: String, runId: Double, testCaseResultId: Double): js.Promise[js.Array[WorkItemReference]] = js.native
    
    def getBuildCodeCoverage(project: String, buildId: Double, flags: Double): js.Promise[js.Array[BuildCoverage]] = js.native
    
    def getCloneInformation(project: String, cloneOperationId: Double): js.Promise[CloneOperationInformation] = js.native
    def getCloneInformation(project: String, cloneOperationId: Double, includeDetails: Boolean): js.Promise[CloneOperationInformation] = js.native
    
    def getCodeCoverageSummary(project: String, buildId: Double): js.Promise[CodeCoverageSummary] = js.native
    def getCodeCoverageSummary(project: String, buildId: Double, deltaBuildId: Double): js.Promise[CodeCoverageSummary] = js.native
    
    def getLinkedWorkItemsByQuery(workItemQuery: LinkedWorkItemsQuery, project: String): js.Promise[js.Array[LinkedWorkItemsQueryResult]] = js.native
    
    def getPlanById(project: String, planId: Double): js.Promise[TestPlan] = js.native
    
    def getPlans(project: String): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      includePlanDetails: js.UndefOr[scala.Nothing],
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      includePlanDetails: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: js.UndefOr[scala.Nothing], skip: js.UndefOr[scala.Nothing], top: Double): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      top: Double,
      includePlanDetails: js.UndefOr[scala.Nothing],
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      top: Double,
      includePlanDetails: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      top: Double,
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: js.UndefOr[scala.Nothing], skip: Double): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: js.UndefOr[scala.Nothing],
      skip: Double,
      top: js.UndefOr[scala.Nothing],
      includePlanDetails: js.UndefOr[scala.Nothing],
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: js.UndefOr[scala.Nothing],
      skip: Double,
      top: js.UndefOr[scala.Nothing],
      includePlanDetails: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: js.UndefOr[scala.Nothing],
      skip: Double,
      top: js.UndefOr[scala.Nothing],
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: js.UndefOr[scala.Nothing], skip: Double, top: Double): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: js.UndefOr[scala.Nothing],
      skip: Double,
      top: Double,
      includePlanDetails: js.UndefOr[scala.Nothing],
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: js.UndefOr[scala.Nothing],
      skip: Double,
      top: Double,
      includePlanDetails: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: js.UndefOr[scala.Nothing],
      skip: Double,
      top: Double,
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: String): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      includePlanDetails: js.UndefOr[scala.Nothing],
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      includePlanDetails: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: String, skip: js.UndefOr[scala.Nothing], top: Double): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: js.UndefOr[scala.Nothing],
      top: Double,
      includePlanDetails: js.UndefOr[scala.Nothing],
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: js.UndefOr[scala.Nothing],
      top: Double,
      includePlanDetails: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: js.UndefOr[scala.Nothing],
      top: Double,
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: String, skip: Double): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: Double,
      top: js.UndefOr[scala.Nothing],
      includePlanDetails: js.UndefOr[scala.Nothing],
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: Double,
      top: js.UndefOr[scala.Nothing],
      includePlanDetails: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: Double,
      top: js.UndefOr[scala.Nothing],
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: String, skip: Double, top: Double): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: Double,
      top: Double,
      includePlanDetails: js.UndefOr[scala.Nothing],
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: String, skip: Double, top: Double, includePlanDetails: Boolean): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: Double,
      top: Double,
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    
    def getPoint(project: String, planId: Double, suiteId: Double, pointIds: Double): js.Promise[TestPoint] = js.native
    def getPoint(project: String, planId: Double, suiteId: Double, pointIds: Double, witFields: String): js.Promise[TestPoint] = js.native
    
    def getPoints(
      project: String,
      planId: Double,
      suiteId: Double,
      witFields: js.UndefOr[String],
      configurationId: js.UndefOr[String],
      testCaseId: js.UndefOr[String],
      testPointIds: js.UndefOr[String],
      includePointDetails: js.UndefOr[Boolean],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double]
    ): js.Promise[js.Array[TestPoint]] = js.native
    
    def getPointsByQuery(query: TestPointsQuery, project: String): js.Promise[TestPointsQuery] = js.native
    def getPointsByQuery(query: TestPointsQuery, project: String, skip: js.UndefOr[scala.Nothing], top: Double): js.Promise[TestPointsQuery] = js.native
    def getPointsByQuery(query: TestPointsQuery, project: String, skip: Double): js.Promise[TestPointsQuery] = js.native
    def getPointsByQuery(query: TestPointsQuery, project: String, skip: Double, top: Double): js.Promise[TestPointsQuery] = js.native
    
    def getResultGroupsByBuild(project: String, buildId: Double, publishContext: String): js.Promise[TestResultsGroupsForBuild] = js.native
    def getResultGroupsByBuild(project: String, buildId: Double, publishContext: String, fields: js.Array[String]): js.Promise[TestResultsGroupsForBuild] = js.native
    
    def getResultGroupsByRelease(project: String, releaseId: Double, publishContext: String): js.Promise[TestResultsGroupsForRelease] = js.native
    def getResultGroupsByRelease(
      project: String,
      releaseId: Double,
      publishContext: String,
      releaseEnvId: js.UndefOr[scala.Nothing],
      fields: js.Array[String]
    ): js.Promise[TestResultsGroupsForRelease] = js.native
    def getResultGroupsByRelease(project: String, releaseId: Double, publishContext: String, releaseEnvId: Double): js.Promise[TestResultsGroupsForRelease] = js.native
    def getResultGroupsByRelease(
      project: String,
      releaseId: Double,
      publishContext: String,
      releaseEnvId: Double,
      fields: js.Array[String]
    ): js.Promise[TestResultsGroupsForRelease] = js.native
    
    def getResultParameters(project: String, runId: Double, testCaseResultId: Double, iterationId: Double): js.Promise[js.Array[TestResultParameterModel]] = js.native
    def getResultParameters(project: String, runId: Double, testCaseResultId: Double, iterationId: Double, paramName: String): js.Promise[js.Array[TestResultParameterModel]] = js.native
    
    def getResultRetentionSettings(project: String): js.Promise[ResultRetentionSettings] = js.native
    
    def getSuiteEntries(project: String, suiteId: Double): js.Promise[js.Array[SuiteEntry]] = js.native
    
    def getSuitesByTestCaseId(testCaseId: Double): js.Promise[js.Array[TestSuite]] = js.native
    
    def getTestCaseById(project: String, planId: Double, suiteId: Double, testCaseIds: Double): js.Promise[SuiteTestCase] = js.native
    
    def getTestCases(project: String, planId: Double, suiteId: Double): js.Promise[js.Array[SuiteTestCase]] = js.native
    
    def getTestConfigurationById(project: String, testConfigurationId: Double): js.Promise[TestConfiguration] = js.native
    
    def getTestConfigurations(project: String): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(
      project: String,
      skip: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      continuationToken: js.UndefOr[scala.Nothing],
      includeAllProperties: Boolean
    ): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(
      project: String,
      skip: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      continuationToken: String
    ): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(
      project: String,
      skip: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      continuationToken: String,
      includeAllProperties: Boolean
    ): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: js.UndefOr[scala.Nothing], top: Double): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(
      project: String,
      skip: js.UndefOr[scala.Nothing],
      top: Double,
      continuationToken: js.UndefOr[scala.Nothing],
      includeAllProperties: Boolean
    ): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: js.UndefOr[scala.Nothing], top: Double, continuationToken: String): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(
      project: String,
      skip: js.UndefOr[scala.Nothing],
      top: Double,
      continuationToken: String,
      includeAllProperties: Boolean
    ): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Double): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(
      project: String,
      skip: Double,
      top: js.UndefOr[scala.Nothing],
      continuationToken: js.UndefOr[scala.Nothing],
      includeAllProperties: Boolean
    ): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Double, top: js.UndefOr[scala.Nothing], continuationToken: String): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(
      project: String,
      skip: Double,
      top: js.UndefOr[scala.Nothing],
      continuationToken: String,
      includeAllProperties: Boolean
    ): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Double, top: Double): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(
      project: String,
      skip: Double,
      top: Double,
      continuationToken: js.UndefOr[scala.Nothing],
      includeAllProperties: Boolean
    ): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Double, top: Double, continuationToken: String): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(
      project: String,
      skip: Double,
      top: Double,
      continuationToken: String,
      includeAllProperties: Boolean
    ): js.Promise[js.Array[TestConfiguration]] = js.native
    
    def getTestIteration(project: String, runId: Double, testCaseResultId: Double, iterationId: Double): js.Promise[TestIterationDetailsModel] = js.native
    def getTestIteration(
      project: String,
      runId: Double,
      testCaseResultId: Double,
      iterationId: Double,
      includeActionResults: Boolean
    ): js.Promise[TestIterationDetailsModel] = js.native
    
    def getTestIterations(project: String, runId: Double, testCaseResultId: Double): js.Promise[js.Array[TestIterationDetailsModel]] = js.native
    def getTestIterations(project: String, runId: Double, testCaseResultId: Double, includeActionResults: Boolean): js.Promise[js.Array[TestIterationDetailsModel]] = js.native
    
    def getTestResultAttachmentContent(project: String, runId: Double, testCaseResultId: Double, attachmentId: Double): js.Promise[ReadableStream] = js.native
    
    def getTestResultAttachmentZip(project: String, runId: Double, testCaseResultId: Double, attachmentId: Double): js.Promise[ReadableStream] = js.native
    
    def getTestResultAttachments(project: String, runId: Double, testCaseResultId: Double): js.Promise[js.Array[TestAttachment]] = js.native
    
    def getTestResultById(project: String, runId: Double, testCaseResultId: Double): js.Promise[TestCaseResult] = js.native
    def getTestResultById(project: String, runId: Double, testCaseResultId: Double, detailsToInclude: ResultDetails): js.Promise[TestCaseResult] = js.native
    
    def getTestResultDetailsForBuild(project: String, buildId: Double): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      groupBy: js.UndefOr[scala.Nothing],
      filter: js.UndefOr[scala.Nothing],
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      groupBy: js.UndefOr[scala.Nothing],
      filter: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      groupBy: js.UndefOr[scala.Nothing],
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(project: String, buildId: Double, publishContext: js.UndefOr[scala.Nothing], groupBy: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      groupBy: String,
      filter: js.UndefOr[scala.Nothing],
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      groupBy: String,
      filter: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      groupBy: String,
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(project: String, buildId: Double, publishContext: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: String,
      groupBy: js.UndefOr[scala.Nothing],
      filter: js.UndefOr[scala.Nothing],
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: String,
      groupBy: js.UndefOr[scala.Nothing],
      filter: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: String,
      groupBy: js.UndefOr[scala.Nothing],
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(project: String, buildId: Double, publishContext: String, groupBy: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: String,
      groupBy: String,
      filter: js.UndefOr[scala.Nothing],
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(project: String, buildId: Double, publishContext: String, groupBy: String, filter: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: String,
      groupBy: String,
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    
    def getTestResultDetailsForRelease(project: String, releaseId: Double, releaseEnvId: Double): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      groupBy: js.UndefOr[scala.Nothing],
      filter: js.UndefOr[scala.Nothing],
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      groupBy: js.UndefOr[scala.Nothing],
      filter: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      groupBy: js.UndefOr[scala.Nothing],
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      groupBy: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      groupBy: String,
      filter: js.UndefOr[scala.Nothing],
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      groupBy: String,
      filter: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      groupBy: String,
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(project: String, releaseId: Double, releaseEnvId: Double, publishContext: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      groupBy: js.UndefOr[scala.Nothing],
      filter: js.UndefOr[scala.Nothing],
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      groupBy: js.UndefOr[scala.Nothing],
      filter: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      groupBy: js.UndefOr[scala.Nothing],
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(project: String, releaseId: Double, releaseEnvId: Double, publishContext: String, groupBy: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      groupBy: String,
      filter: js.UndefOr[scala.Nothing],
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      groupBy: String,
      filter: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      groupBy: String,
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    
    def getTestResults(project: String, runId: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      top: Double
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      top: Double,
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(project: String, runId: Double, detailsToInclude: js.UndefOr[scala.Nothing], skip: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: js.UndefOr[scala.Nothing],
      skip: Double,
      top: js.UndefOr[scala.Nothing],
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: js.UndefOr[scala.Nothing],
      skip: Double,
      top: Double
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: js.UndefOr[scala.Nothing],
      skip: Double,
      top: Double,
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(project: String, runId: Double, detailsToInclude: ResultDetails): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: ResultDetails,
      skip: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: ResultDetails,
      skip: js.UndefOr[scala.Nothing],
      top: Double
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: ResultDetails,
      skip: js.UndefOr[scala.Nothing],
      top: Double,
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(project: String, runId: Double, detailsToInclude: ResultDetails, skip: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: ResultDetails,
      skip: Double,
      top: js.UndefOr[scala.Nothing],
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(project: String, runId: Double, detailsToInclude: ResultDetails, skip: Double, top: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: ResultDetails,
      skip: Double,
      top: Double,
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    
    def getTestResultsByQuery(query: TestResultsQuery, project: String): js.Promise[TestResultsQuery] = js.native
    
    def getTestRunAttachmentContent(project: String, runId: Double, attachmentId: Double): js.Promise[ReadableStream] = js.native
    
    def getTestRunAttachmentZip(project: String, runId: Double, attachmentId: Double): js.Promise[ReadableStream] = js.native
    
    def getTestRunAttachments(project: String, runId: Double): js.Promise[js.Array[TestAttachment]] = js.native
    
    def getTestRunById(project: String, runId: Double): js.Promise[TestRun] = js.native
    
    def getTestRunCodeCoverage(project: String, runId: Double, flags: Double): js.Promise[js.Array[TestRunCoverage]] = js.native
    
    def getTestRunLogs(project: String, runId: Double): js.Promise[js.Array[TestMessageLogDetails]] = js.native
    
    def getTestRunStatistics(project: String, runId: Double): js.Promise[TestRunStatistic] = js.native
    
    def getTestRuns(
      project: String,
      buildUri: js.UndefOr[String],
      owner: js.UndefOr[String],
      tmiRunId: js.UndefOr[String],
      planId: js.UndefOr[Double],
      includeRunDetails: js.UndefOr[Boolean],
      automated: js.UndefOr[Boolean],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double]
    ): js.Promise[js.Array[TestRun]] = js.native
    
    def getTestSessions(teamContext: TeamContext): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: js.UndefOr[scala.Nothing],
      source: js.UndefOr[scala.Nothing],
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: js.UndefOr[scala.Nothing],
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: js.UndefOr[scala.Nothing],
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: Boolean,
      source: js.UndefOr[scala.Nothing],
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: Boolean,
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: Boolean,
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(teamContext: TeamContext, period: js.UndefOr[scala.Nothing], allSessions: Boolean): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: Boolean,
      includeAllProperties: js.UndefOr[scala.Nothing],
      source: js.UndefOr[scala.Nothing],
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: Boolean,
      includeAllProperties: js.UndefOr[scala.Nothing],
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: Boolean,
      includeAllProperties: js.UndefOr[scala.Nothing],
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: Boolean,
      includeAllProperties: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: Boolean,
      includeAllProperties: Boolean,
      source: js.UndefOr[scala.Nothing],
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: Boolean,
      includeAllProperties: Boolean,
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: js.UndefOr[scala.Nothing],
      allSessions: Boolean,
      includeAllProperties: Boolean,
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(teamContext: TeamContext, period: Double): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: js.UndefOr[scala.Nothing],
      source: js.UndefOr[scala.Nothing],
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: js.UndefOr[scala.Nothing],
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: js.UndefOr[scala.Nothing],
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: Boolean,
      source: js.UndefOr[scala.Nothing],
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: Boolean,
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: js.UndefOr[scala.Nothing],
      includeAllProperties: Boolean,
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(teamContext: TeamContext, period: Double, allSessions: Boolean): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Boolean,
      includeAllProperties: js.UndefOr[scala.Nothing],
      source: js.UndefOr[scala.Nothing],
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Boolean,
      includeAllProperties: js.UndefOr[scala.Nothing],
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Boolean,
      includeAllProperties: js.UndefOr[scala.Nothing],
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(teamContext: TeamContext, period: Double, allSessions: Boolean, includeAllProperties: Boolean): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Boolean,
      includeAllProperties: Boolean,
      source: js.UndefOr[scala.Nothing],
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Boolean,
      includeAllProperties: Boolean,
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Boolean,
      includeAllProperties: Boolean,
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    
    def getTestSettingsById(project: String, testSettingsId: Double): js.Promise[TestSettings] = js.native
    
    def getTestSuiteById(project: String, planId: Double, suiteId: Double): js.Promise[TestSuite] = js.native
    def getTestSuiteById(project: String, planId: Double, suiteId: Double, includeChildSuites: Boolean): js.Promise[TestSuite] = js.native
    
    def getTestSuitesForPlan(project: String, planId: Double): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      asTreeView: Boolean
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      top: Double
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      top: Double,
      asTreeView: Boolean
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: js.UndefOr[scala.Nothing], skip: Double): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: js.UndefOr[scala.Nothing],
      skip: Double,
      top: js.UndefOr[scala.Nothing],
      asTreeView: Boolean
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: js.UndefOr[scala.Nothing],
      skip: Double,
      top: Double
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: js.UndefOr[scala.Nothing],
      skip: Double,
      top: Double,
      asTreeView: Boolean
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: Boolean): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: Boolean,
      skip: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      asTreeView: Boolean
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: Boolean,
      skip: js.UndefOr[scala.Nothing],
      top: Double
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: Boolean,
      skip: js.UndefOr[scala.Nothing],
      top: Double,
      asTreeView: Boolean
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: Boolean, skip: Double): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: Boolean,
      skip: Double,
      top: js.UndefOr[scala.Nothing],
      asTreeView: Boolean
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: Boolean, skip: Double, top: Double): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: Boolean,
      skip: Double,
      top: Double,
      asTreeView: Boolean
    ): js.Promise[js.Array[TestSuite]] = js.native
    
    def getTestVariableById(project: String, testVariableId: Double): js.Promise[TestVariable] = js.native
    
    def getTestVariables(project: String): js.Promise[js.Array[TestVariable]] = js.native
    def getTestVariables(project: String, skip: js.UndefOr[scala.Nothing], top: Double): js.Promise[js.Array[TestVariable]] = js.native
    def getTestVariables(project: String, skip: Double): js.Promise[js.Array[TestVariable]] = js.native
    def getTestVariables(project: String, skip: Double, top: Double): js.Promise[js.Array[TestVariable]] = js.native
    
    def publishTestResultDocument(document: TestResultDocument, project: String, runId: Double): js.Promise[TestResultDocument] = js.native
    
    def queryCustomFields(project: String, scopeFilter: CustomTestFieldScope): js.Promise[js.Array[CustomTestFieldDefinition]] = js.native
    
    def queryResultTrendForBuild(filter: TestResultTrendFilter, project: String): js.Promise[js.Array[AggregatedDataForResultTrend]] = js.native
    
    def queryResultTrendForRelease(filter: TestResultTrendFilter, project: String): js.Promise[js.Array[AggregatedDataForResultTrend]] = js.native
    
    def queryTestMethodLinkedWorkItems(project: String, testName: String): js.Promise[TestToWorkItemLinks] = js.native
    
    def queryTestResultHistory(filter: ResultsFilter, project: String): js.Promise[TestResultHistory] = js.native
    
    def queryTestResultWorkItems(project: String, workItemCategory: String): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.UndefOr[scala.Nothing],
      days: js.UndefOr[scala.Nothing],
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.UndefOr[scala.Nothing],
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.UndefOr[scala.Nothing],
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.Date
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.Date,
      days: js.UndefOr[scala.Nothing],
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.Date,
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.Date,
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: Double,
      maxCompleteDate: js.UndefOr[scala.Nothing],
      days: js.UndefOr[scala.Nothing],
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: Double,
      maxCompleteDate: js.UndefOr[scala.Nothing],
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: Double,
      maxCompleteDate: js.UndefOr[scala.Nothing],
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: Double,
      maxCompleteDate: js.Date
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: Double,
      maxCompleteDate: js.Date,
      days: js.UndefOr[scala.Nothing],
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: Double,
      maxCompleteDate: js.Date,
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: js.UndefOr[scala.Nothing],
      testCaseId: Double,
      maxCompleteDate: js.Date,
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(project: String, workItemCategory: String, automatedTestName: String): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.UndefOr[scala.Nothing],
      days: js.UndefOr[scala.Nothing],
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.UndefOr[scala.Nothing],
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.UndefOr[scala.Nothing],
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.Date
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.Date,
      days: js.UndefOr[scala.Nothing],
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.Date,
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: js.UndefOr[scala.Nothing],
      maxCompleteDate: js.Date,
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(project: String, workItemCategory: String, automatedTestName: String, testCaseId: Double): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: js.UndefOr[scala.Nothing],
      days: js.UndefOr[scala.Nothing],
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: js.UndefOr[scala.Nothing],
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: js.UndefOr[scala.Nothing],
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: js.Date
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: js.Date,
      days: js.UndefOr[scala.Nothing],
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: js.Date,
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: js.Date,
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    
    def queryTestResultsReportForBuild(project: String, buildId: Double): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForBuild(
      project: String,
      buildId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      includeFailureDetails: js.UndefOr[scala.Nothing],
      buildToCompare: BuildReference
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForBuild(
      project: String,
      buildId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      includeFailureDetails: Boolean
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForBuild(
      project: String,
      buildId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      includeFailureDetails: Boolean,
      buildToCompare: BuildReference
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForBuild(project: String, buildId: Double, publishContext: String): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForBuild(
      project: String,
      buildId: Double,
      publishContext: String,
      includeFailureDetails: js.UndefOr[scala.Nothing],
      buildToCompare: BuildReference
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForBuild(project: String, buildId: Double, publishContext: String, includeFailureDetails: Boolean): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForBuild(
      project: String,
      buildId: Double,
      publishContext: String,
      includeFailureDetails: Boolean,
      buildToCompare: BuildReference
    ): js.Promise[TestResultSummary] = js.native
    
    def queryTestResultsReportForRelease(project: String, releaseId: Double, releaseEnvId: Double): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      includeFailureDetails: js.UndefOr[scala.Nothing],
      releaseToCompare: ReleaseReference
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      includeFailureDetails: Boolean
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: js.UndefOr[scala.Nothing],
      includeFailureDetails: Boolean,
      releaseToCompare: ReleaseReference
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(project: String, releaseId: Double, releaseEnvId: Double, publishContext: String): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      includeFailureDetails: js.UndefOr[scala.Nothing],
      releaseToCompare: ReleaseReference
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      includeFailureDetails: Boolean
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      includeFailureDetails: Boolean,
      releaseToCompare: ReleaseReference
    ): js.Promise[TestResultSummary] = js.native
    
    def queryTestResultsSummaryForReleases(releases: js.Array[ReleaseReference], project: String): js.Promise[js.Array[TestResultSummary]] = js.native
    
    def queryTestRuns(
      project: String,
      minLastUpdatedDate: js.Date,
      maxLastUpdatedDate: js.Date,
      state: js.UndefOr[TestRunState],
      planIds: js.UndefOr[js.Array[Double]],
      isAutomated: js.UndefOr[Boolean],
      publishContext: js.UndefOr[TestRunPublishContext],
      buildIds: js.UndefOr[js.Array[Double]],
      buildDefIds: js.UndefOr[js.Array[Double]],
      branchName: js.UndefOr[String],
      releaseIds: js.UndefOr[js.Array[Double]],
      releaseDefIds: js.UndefOr[js.Array[Double]],
      releaseEnvIds: js.UndefOr[js.Array[Double]],
      releaseEnvDefIds: js.UndefOr[js.Array[Double]],
      runTitle: js.UndefOr[String],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[String]
    ): js.Promise[js.Array[TestRun]] = js.native
    
    def queryTestSummaryByRequirement(resultsContext: TestResultsContext, project: String): js.Promise[js.Array[TestSummaryForWorkItem]] = js.native
    def queryTestSummaryByRequirement(resultsContext: TestResultsContext, project: String, workItemIds: js.Array[Double]): js.Promise[js.Array[TestSummaryForWorkItem]] = js.native
    
    def removeTestCasesFromSuiteUrl(project: String, planId: Double, suiteId: Double, testCaseIds: String): js.Promise[Unit] = js.native
    
    def reorderSuiteEntries(suiteEntries: js.Array[SuiteEntryUpdateModel], project: String, suiteId: Double): js.Promise[js.Array[SuiteEntry]] = js.native
    
    def updateCodeCoverageSummary(coverageData: CodeCoverageData, project: String, buildId: Double): js.Promise[Unit] = js.native
    
    def updateResultRetentionSettings(retentionSettings: ResultRetentionSettings, project: String): js.Promise[ResultRetentionSettings] = js.native
    
    def updateTestConfiguration(testConfiguration: TestConfiguration, project: String, testConfigurationId: Double): js.Promise[TestConfiguration] = js.native
    
    def updateTestPlan(planUpdateModel: PlanUpdateModel, project: String, planId: Double): js.Promise[TestPlan] = js.native
    
    def updateTestPoints(
      pointUpdateModel: PointUpdateModel,
      project: String,
      planId: Double,
      suiteId: Double,
      pointIds: String
    ): js.Promise[js.Array[TestPoint]] = js.native
    
    def updateTestResults(results: js.Array[TestCaseResult], project: String, runId: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    
    def updateTestRun(runUpdateModel: RunUpdateModel, project: String, runId: Double): js.Promise[TestRun] = js.native
    
    def updateTestSession(testSession: TestSession, teamContext: TeamContext): js.Promise[TestSession] = js.native
    
    def updateTestSuite(suiteUpdateModel: SuiteUpdateModel, project: String, planId: Double, suiteId: Double): js.Promise[TestSuite] = js.native
    
    def updateTestVariable(testVariable: TestVariable, project: String, testVariableId: Double): js.Promise[TestVariable] = js.native
  }
}
