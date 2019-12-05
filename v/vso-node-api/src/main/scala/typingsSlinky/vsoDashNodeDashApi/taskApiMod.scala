package typingsSlinky.vsoDashNodeDashApi

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.VssJsonCollectionWrapperV
import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.PlanGroupStatusFilter
import typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAttachment
import typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskLog
import typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlan
import typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationQueuedPlanGroup
import typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.Timeline
import typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TimelineRecord
import typingsSlinky.vsoDashNodeDashApi.taskApiMod.ITaskApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/TaskApi", JSImport.Namespace)
@js.native
object taskApiMod extends js.Object {
  @js.native
  trait ITaskApi extends ClientApiBase {
    def appendLogContent(
      customHeaders: js.Any,
      contentStream: ReadableStream,
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      logId: Double
    ): js.Promise[TaskLog] = js.native
    def appendTimelineRecordFeed(
      lines: VssJsonCollectionWrapperV[js.Array[String]],
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String,
      recordId: String
    ): js.Promise[Unit] = js.native
    def createAttachment(
      customHeaders: js.Any,
      contentStream: ReadableStream,
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String,
      recordId: String,
      `type`: String,
      name: String
    ): js.Promise[TaskAttachment] = js.native
    def createLog(log: TaskLog, scopeIdentifier: String, hubName: String, planId: String): js.Promise[TaskLog] = js.native
    def createTimeline(timeline: Timeline, scopeIdentifier: String, hubName: String, planId: String): js.Promise[Timeline] = js.native
    def deleteTimeline(scopeIdentifier: String, hubName: String, planId: String, timelineId: String): js.Promise[Unit] = js.native
    def getAttachment(
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String,
      recordId: String,
      `type`: String,
      name: String
    ): js.Promise[TaskAttachment] = js.native
    def getAttachmentContent(
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String,
      recordId: String,
      `type`: String,
      name: String
    ): js.Promise[ReadableStream] = js.native
    def getAttachments(
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String,
      recordId: String,
      `type`: String
    ): js.Promise[js.Array[TaskAttachment]] = js.native
    def getLog(scopeIdentifier: String, hubName: String, planId: String, logId: Double): js.Promise[js.Array[String]] = js.native
    def getLog(scopeIdentifier: String, hubName: String, planId: String, logId: Double, startLine: Double): js.Promise[js.Array[String]] = js.native
    def getLog(
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      logId: Double,
      startLine: Double,
      endLine: Double
    ): js.Promise[js.Array[String]] = js.native
    def getLogs(scopeIdentifier: String, hubName: String, planId: String): js.Promise[js.Array[TaskLog]] = js.native
    def getPlan(scopeIdentifier: String, hubName: String, planId: String): js.Promise[TaskOrchestrationPlan] = js.native
    def getPlanAttachments(scopeIdentifier: String, hubName: String, planId: String, `type`: String): js.Promise[js.Array[TaskAttachment]] = js.native
    def getQueuedPlanGroups(scopeIdentifier: String, hubName: String): js.Promise[js.Array[TaskOrchestrationQueuedPlanGroup]] = js.native
    def getQueuedPlanGroups(scopeIdentifier: String, hubName: String, statusFilter: PlanGroupStatusFilter): js.Promise[js.Array[TaskOrchestrationQueuedPlanGroup]] = js.native
    def getQueuedPlanGroups(scopeIdentifier: String, hubName: String, statusFilter: PlanGroupStatusFilter, count: Double): js.Promise[js.Array[TaskOrchestrationQueuedPlanGroup]] = js.native
    def getRecords(scopeIdentifier: String, hubName: String, planId: String, timelineId: String): js.Promise[js.Array[TimelineRecord]] = js.native
    def getRecords(scopeIdentifier: String, hubName: String, planId: String, timelineId: String, changeId: Double): js.Promise[js.Array[TimelineRecord]] = js.native
    def getTimeline(scopeIdentifier: String, hubName: String, planId: String, timelineId: String): js.Promise[Timeline] = js.native
    def getTimeline(scopeIdentifier: String, hubName: String, planId: String, timelineId: String, changeId: Double): js.Promise[Timeline] = js.native
    def getTimeline(
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String,
      changeId: Double,
      includeRecords: Boolean
    ): js.Promise[Timeline] = js.native
    def getTimelines(scopeIdentifier: String, hubName: String, planId: String): js.Promise[js.Array[Timeline]] = js.native
    def updateRecords(
      records: VssJsonCollectionWrapperV[js.Array[TimelineRecord]],
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String
    ): js.Promise[js.Array[TimelineRecord]] = js.native
  }
  
  @js.native
  class TaskApi protected () extends ITaskApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
}

