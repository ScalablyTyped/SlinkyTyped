package typingsSlinky.xstate

import typingsSlinky.std.Record
import typingsSlinky.std.Required
import typingsSlinky.xstate.libTypesMod.Action
import typingsSlinky.xstate.libTypesMod.ActionFunction
import typingsSlinky.xstate.libTypesMod.ActionFunctionMap
import typingsSlinky.xstate.libTypesMod.ActionObject
import typingsSlinky.xstate.libTypesMod.ActionType
import typingsSlinky.xstate.libTypesMod.ActivityActionObject
import typingsSlinky.xstate.libTypesMod.ActivityDefinition
import typingsSlinky.xstate.libTypesMod.AssignAction
import typingsSlinky.xstate.libTypesMod.Assigner
import typingsSlinky.xstate.libTypesMod.CancelAction
import typingsSlinky.xstate.libTypesMod.DelayFunctionMap
import typingsSlinky.xstate.libTypesMod.DoneEvent
import typingsSlinky.xstate.libTypesMod.DoneEventObject
import typingsSlinky.xstate.libTypesMod.ErrorPlatformEvent
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.LogAction
import typingsSlinky.xstate.libTypesMod.LogActionObject
import typingsSlinky.xstate.libTypesMod.LogExpr
import typingsSlinky.xstate.libTypesMod.PropertyAssigner
import typingsSlinky.xstate.libTypesMod.PureAction
import typingsSlinky.xstate.libTypesMod.RaiseAction
import typingsSlinky.xstate.libTypesMod.RaiseActionObject
import typingsSlinky.xstate.libTypesMod.SCXML.Event
import typingsSlinky.xstate.libTypesMod.SendAction
import typingsSlinky.xstate.libTypesMod.SendActionObject
import typingsSlinky.xstate.libTypesMod.SendActionOptions
import typingsSlinky.xstate.libTypesMod.SendExpr
import typingsSlinky.xstate.libTypesMod.SingleOrArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/actions", JSImport.Namespace)
@js.native
object libActionsMod extends js.Object {
  val initEvent: Event[Anon_Type] = js.native
  def after(delayRef: String): String = js.native
  def after(delayRef: String, id: String): String = js.native
  def after(delayRef: Double): String = js.native
  def after(delayRef: Double, id: String): String = js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: PropertyAssigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  def cancel(sendId: String): CancelAction = js.native
  def cancel(sendId: Double): CancelAction = js.native
  def done(id: String): DoneEventObject = js.native
  def done(id: String, data: js.Any): DoneEventObject = js.native
  def doneInvoke(id: String): DoneEvent = js.native
  def doneInvoke(id: String, data: js.Any): DoneEvent = js.native
  def error(id: String): ErrorPlatformEvent with String = js.native
  def error(id: String, data: js.Any): ErrorPlatformEvent with String = js.native
  def escalate[TContext, TEvent /* <: EventObject */](errorData: js.Any): SendAction[TContext, TEvent] = js.native
  def escalate[TContext, TEvent /* <: EventObject */](errorData: js.Any, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  @JSName("forwardTo")
  def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
  ): SendAction[TContext, TEvent] = js.native
  @JSName("forwardTo")
  def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent] = js.native
  def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType): js.UndefOr[(ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])] = js.native
  def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType, actionFunctionMap: ActionFunctionMap[TContext, TEvent]): js.UndefOr[(ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])] = js.native
  def isActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): /* is xstate.xstate/lib/types.ActionObject<TContext, TEvent> */ Boolean = js.native
  def log[TContext, TEvent /* <: EventObject */](): LogAction[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: String): LogAction[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: String, label: String): LogAction[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent]): LogAction[TContext, TEvent] = js.native
  def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent], label: String): LogAction[TContext, TEvent] = js.native
  def pure[TContext, TEvent /* <: EventObject */](
    getActions: js.Function2[
      /* context */ TContext, 
      /* event */ TEvent, 
      js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
    ]
  ): PureAction[TContext, TEvent] = js.native
  def raise[TContext, TEvent /* <: EventObject */](event: typingsSlinky.xstate.libTypesMod.Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, TEvent]) = js.native
  def resolveLog[TContext, TEvent /* <: EventObject */](action: LogAction[TContext, TEvent], ctx: TContext, _event: Event[TEvent]): LogActionObject[TContext, TEvent] = js.native
  def resolveRaise[TEvent /* <: EventObject */](action: RaiseAction[TEvent]): RaiseActionObject[TEvent] = js.native
  def resolveSend[TContext, TEvent /* <: EventObject */](action: SendAction[TContext, TEvent], ctx: TContext, _event: Event[TEvent]): SendActionObject[TContext, TEvent] = js.native
  def resolveSend[TContext, TEvent /* <: EventObject */](
    action: SendAction[TContext, TEvent],
    ctx: TContext,
    _event: Event[TEvent],
    delaysMap: DelayFunctionMap[TContext, TEvent]
  ): SendActionObject[TContext, TEvent] = js.native
  def respond[TContext, TEvent /* <: EventObject */](event: typingsSlinky.xstate.libTypesMod.Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def respond[TContext, TEvent /* <: EventObject */](
    event: typingsSlinky.xstate.libTypesMod.Event[TEvent],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent] = js.native
  def respond[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def respond[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: typingsSlinky.xstate.libTypesMod.Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](
    event: typingsSlinky.xstate.libTypesMod.Event[TEvent],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: typingsSlinky.xstate.libTypesMod.Event[_]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: typingsSlinky.xstate.libTypesMod.Event[_], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendUpdate[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
  def start[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
  def stop[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
  def toActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): ActionObject[TContext, TEvent] = js.native
  def toActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent], actionFunctionMap: ActionFunctionMap[TContext, TEvent]): ActionObject[TContext, TEvent] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: js.UndefOr[scala.Nothing],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: String): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: String,
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: js.Array[Action[TContext, TEvent]]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: js.Array[Action[TContext, TEvent]],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: ActionFunction[TContext, TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: ActionFunction[TContext, TEvent],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: ActionObject[TContext, TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: ActionObject[TContext, TEvent],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: AssignAction[Required[TContext], TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: AssignAction[Required[TContext], TEvent],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: RaiseAction[TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: RaiseAction[TEvent],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: SendAction[TContext, TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: SendAction[TContext, TEvent],
    actionFunctionMap: Record[String, (ActionFunction[TContext, TEvent]) | (ActionObject[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: String): ActivityDefinition[TContext, TEvent] = js.native
  def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: ActivityDefinition[TContext, TEvent]): ActivityDefinition[TContext, TEvent] = js.native
  @js.native
  object actionTypes extends js.Object {
    val after: String | Double = js.native
    val assign: String | Double = js.native
    val cancel: String | Double = js.native
    val doneState: String | Double = js.native
    val error: String | Double = js.native
    val errorExecution: String | Double = js.native
    val errorPlatform: String | Double = js.native
    val init: String | Double = js.native
    val invoke: String | Double = js.native
    val log: String | Double = js.native
    val nullEvent: String | Double = js.native
    val pure: String | Double = js.native
    val raise: String | Double = js.native
    val send: String | Double = js.native
    val start: String | Double = js.native
    val stop: String | Double = js.native
    val update: String | Double = js.native
  }
  
}

