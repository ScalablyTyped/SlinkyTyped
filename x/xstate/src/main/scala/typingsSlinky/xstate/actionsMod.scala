package typingsSlinky.xstate

import typingsSlinky.std.Record
import typingsSlinky.xstate.anon.ContextTContext
import typingsSlinky.xstate.anon.Id
import typingsSlinky.xstate.anon.Type
import typingsSlinky.xstate.anon.TypeUpdate
import typingsSlinky.xstate.stateMod.State
import typingsSlinky.xstate.stateNodeMod.StateNode
import typingsSlinky.xstate.typesMod.Action
import typingsSlinky.xstate.typesMod.ActionFunction
import typingsSlinky.xstate.typesMod.ActionFunctionMap
import typingsSlinky.xstate.typesMod.ActionObject
import typingsSlinky.xstate.typesMod.ActionType
import typingsSlinky.xstate.typesMod.ActivityActionObject
import typingsSlinky.xstate.typesMod.ActivityDefinition
import typingsSlinky.xstate.typesMod.AnyEventObject
import typingsSlinky.xstate.typesMod.AssignAction
import typingsSlinky.xstate.typesMod.Assigner
import typingsSlinky.xstate.typesMod.CancelAction
import typingsSlinky.xstate.typesMod.ChooseAction
import typingsSlinky.xstate.typesMod.ChooseConditon
import typingsSlinky.xstate.typesMod.DelayFunctionMap
import typingsSlinky.xstate.typesMod.DoneEvent
import typingsSlinky.xstate.typesMod.DoneEventObject
import typingsSlinky.xstate.typesMod.ErrorPlatformEvent
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.Expr
import typingsSlinky.xstate.typesMod.ExprWithMeta
import typingsSlinky.xstate.typesMod.LogAction
import typingsSlinky.xstate.typesMod.LogActionObject
import typingsSlinky.xstate.typesMod.LogExpr
import typingsSlinky.xstate.typesMod.PropertyAssigner
import typingsSlinky.xstate.typesMod.PureAction
import typingsSlinky.xstate.typesMod.RaiseAction
import typingsSlinky.xstate.typesMod.RaiseActionObject
import typingsSlinky.xstate.typesMod.SCXML.Event
import typingsSlinky.xstate.typesMod.SendAction
import typingsSlinky.xstate.typesMod.SendActionObject
import typingsSlinky.xstate.typesMod.SendActionOptions
import typingsSlinky.xstate.typesMod.SendExpr
import typingsSlinky.xstate.typesMod.SingleOrArray
import typingsSlinky.xstate.typesMod.StopAction
import typingsSlinky.xstate.typesMod.StopActionObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  object actionTypes {
    
    @JSImport("xstate/lib/actions", "actionTypes.after")
    @js.native
    val after: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.assign")
    @js.native
    val assign: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.cancel")
    @js.native
    val cancel: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.choose")
    @js.native
    val choose: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.doneState")
    @js.native
    val doneState: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.error")
    @js.native
    val error: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.errorExecution")
    @js.native
    val errorExecution: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.errorPlatform")
    @js.native
    val errorPlatform: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.init")
    @js.native
    val init: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.invoke")
    @js.native
    val invoke: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.log")
    @js.native
    val log: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.nullEvent")
    @js.native
    val nullEvent: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.pure")
    @js.native
    val pure: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.raise")
    @js.native
    val raise: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.send")
    @js.native
    val send: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.start")
    @js.native
    val start: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.stop")
    @js.native
    val stop: String | Double = js.native
    
    @JSImport("xstate/lib/actions", "actionTypes.update")
    @js.native
    val update: String | Double = js.native
  }
  
  @JSImport("xstate/lib/actions", "after")
  @js.native
  def after(delayRef: String): String = js.native
  @JSImport("xstate/lib/actions", "after")
  @js.native
  def after(delayRef: String, id: String): String = js.native
  @JSImport("xstate/lib/actions", "after")
  @js.native
  def after(delayRef: Double): String = js.native
  @JSImport("xstate/lib/actions", "after")
  @js.native
  def after(delayRef: Double, id: String): String = js.native
  
  @JSImport("xstate/lib/actions", "assign")
  @js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  @JSImport("xstate/lib/actions", "assign")
  @js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: PropertyAssigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  
  @JSImport("xstate/lib/actions", "cancel")
  @js.native
  def cancel(sendId: String): CancelAction = js.native
  @JSImport("xstate/lib/actions", "cancel")
  @js.native
  def cancel(sendId: Double): CancelAction = js.native
  
  @JSImport("xstate/lib/actions", "choose")
  @js.native
  def choose[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseConditon[TContext, TEvent]]): ChooseAction[TContext, TEvent] = js.native
  
  @JSImport("xstate/lib/actions", "done")
  @js.native
  def done(id: String): DoneEventObject = js.native
  @JSImport("xstate/lib/actions", "done")
  @js.native
  def done(id: String, data: js.Any): DoneEventObject = js.native
  
  @JSImport("xstate/lib/actions", "doneInvoke")
  @js.native
  def doneInvoke(id: String): DoneEvent = js.native
  @JSImport("xstate/lib/actions", "doneInvoke")
  @js.native
  def doneInvoke(id: String, data: js.Any): DoneEvent = js.native
  
  @JSImport("xstate/lib/actions", "error")
  @js.native
  def error(id: String): ErrorPlatformEvent with String = js.native
  @JSImport("xstate/lib/actions", "error")
  @js.native
  def error(id: String, data: js.Any): ErrorPlatformEvent with String = js.native
  
  @JSImport("xstate/lib/actions", "escalate")
  @js.native
  def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData): SendAction[TContext, TEvent, AnyEventObject] = js.native
  @JSImport("xstate/lib/actions", "escalate")
  @js.native
  def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
  @JSImport("xstate/lib/actions", "escalate")
  @js.native
  def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: ExprWithMeta[TContext, TEvent, TErrorData]): SendAction[TContext, TEvent, AnyEventObject] = js.native
  @JSImport("xstate/lib/actions", "escalate")
  @js.native
  def escalate[TContext, TEvent /* <: EventObject */, TErrorData](
    errorData: ExprWithMeta[TContext, TEvent, TErrorData],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, AnyEventObject] = js.native
  
  @JSImport("xstate/lib/actions", "forwardTo")
  @js.native
  def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
  ): SendAction[TContext, TEvent, AnyEventObject] = js.native
  @JSImport("xstate/lib/actions", "forwardTo")
  @js.native
  def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, AnyEventObject] = js.native
  
  @JSImport("xstate/lib/actions", "getActionFunction")
  @js.native
  def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType): js.UndefOr[(ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])] = js.native
  @JSImport("xstate/lib/actions", "getActionFunction")
  @js.native
  def getActionFunction[TContext, TEvent /* <: EventObject */](actionType: ActionType, actionFunctionMap: ActionFunctionMap[TContext, TEvent]): js.UndefOr[(ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])] = js.native
  
  @JSImport("xstate/lib/actions", "initEvent")
  @js.native
  val initEvent: Event[Type] = js.native
  
  @JSImport("xstate/lib/actions", "isActionObject")
  @js.native
  def isActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): /* is xstate.xstate/lib/types.ActionObject<TContext, TEvent> */ Boolean = js.native
  
  @JSImport("xstate/lib/actions", "log")
  @js.native
  def log[TContext, TEvent /* <: EventObject */](): LogAction[TContext, TEvent] = js.native
  @JSImport("xstate/lib/actions", "log")
  @js.native
  def log[TContext, TEvent /* <: EventObject */](expr: js.UndefOr[scala.Nothing], label: String): LogAction[TContext, TEvent] = js.native
  @JSImport("xstate/lib/actions", "log")
  @js.native
  def log[TContext, TEvent /* <: EventObject */](expr: String): LogAction[TContext, TEvent] = js.native
  @JSImport("xstate/lib/actions", "log")
  @js.native
  def log[TContext, TEvent /* <: EventObject */](expr: String, label: String): LogAction[TContext, TEvent] = js.native
  @JSImport("xstate/lib/actions", "log")
  @js.native
  def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent]): LogAction[TContext, TEvent] = js.native
  @JSImport("xstate/lib/actions", "log")
  @js.native
  def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent], label: String): LogAction[TContext, TEvent] = js.native
  
  @JSImport("xstate/lib/actions", "pure")
  @js.native
  def pure[TContext, TEvent /* <: EventObject */](
    getActions: js.Function2[
      /* context */ TContext, 
      /* event */ TEvent, 
      js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
    ]
  ): PureAction[TContext, TEvent] = js.native
  
  @JSImport("xstate/lib/actions", "raise")
  @js.native
  def raise[TContext, TEvent /* <: EventObject */](event: typingsSlinky.xstate.typesMod.Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, AnyEventObject, TEvent]) = js.native
  
  @JSImport("xstate/lib/actions", "resolveActions")
  @js.native
  def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, _, TEvent, ContextTContext[TContext]],
    currentState: js.UndefOr[scala.Nothing],
    currentContext: TContext,
    _event: Event[TEvent],
    actions: js.Array[ActionObject[TContext, TEvent]]
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = js.native
  @JSImport("xstate/lib/actions", "resolveActions")
  @js.native
  def resolveActions[TContext, TEvent /* <: EventObject */](
    machine: StateNode[TContext, _, TEvent, ContextTContext[TContext]],
    currentState: State[TContext, TEvent, _, ContextTContext[TContext]],
    currentContext: TContext,
    _event: Event[TEvent],
    actions: js.Array[ActionObject[TContext, TEvent]]
  ): js.Tuple2[js.Array[ActionObject[TContext, TEvent]], TContext] = js.native
  
  @JSImport("xstate/lib/actions", "resolveLog")
  @js.native
  def resolveLog[TContext, TEvent /* <: EventObject */](action: LogAction[TContext, TEvent], ctx: TContext, _event: Event[TEvent]): LogActionObject[TContext, TEvent] = js.native
  
  @JSImport("xstate/lib/actions", "resolveRaise")
  @js.native
  def resolveRaise[TEvent /* <: EventObject */](action: RaiseAction[TEvent]): RaiseActionObject[TEvent] = js.native
  
  @JSImport("xstate/lib/actions", "resolveSend")
  @js.native
  def resolveSend[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](action: SendAction[TContext, TEvent, TSentEvent], ctx: TContext, _event: Event[TEvent]): SendActionObject[TContext, TEvent, TSentEvent] = js.native
  @JSImport("xstate/lib/actions", "resolveSend")
  @js.native
  def resolveSend[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    action: SendAction[TContext, TEvent, TSentEvent],
    ctx: TContext,
    _event: Event[TEvent],
    delaysMap: DelayFunctionMap[TContext, TEvent]
  ): SendActionObject[TContext, TEvent, TSentEvent] = js.native
  
  @JSImport("xstate/lib/actions", "resolveStop")
  @js.native
  def resolveStop[TContext, TEvent /* <: EventObject */](action: StopAction[TContext, TEvent], context: TContext, _event: Event[TEvent]): StopActionObject = js.native
  
  @JSImport("xstate/lib/actions", "respond")
  @js.native
  def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typingsSlinky.xstate.typesMod.Event[TEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
  @JSImport("xstate/lib/actions", "respond")
  @js.native
  def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typingsSlinky.xstate.typesMod.Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
  @JSImport("xstate/lib/actions", "respond")
  @js.native
  def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
  @JSImport("xstate/lib/actions", "respond")
  @js.native
  def respond[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, AnyEventObject] = js.native
  
  @JSImport("xstate/lib/actions", "send")
  @js.native
  def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typingsSlinky.xstate.typesMod.Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  @JSImport("xstate/lib/actions", "send")
  @js.native
  def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    event: typingsSlinky.xstate.typesMod.Event[TSentEvent],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, TSentEvent] = js.native
  @JSImport("xstate/lib/actions", "send")
  @js.native
  def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  @JSImport("xstate/lib/actions", "send")
  @js.native
  def send[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  
  @JSImport("xstate/lib/actions", "sendParent")
  @js.native
  def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typingsSlinky.xstate.typesMod.Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  @JSImport("xstate/lib/actions", "sendParent")
  @js.native
  def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    event: typingsSlinky.xstate.typesMod.Event[TSentEvent],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, TSentEvent] = js.native
  @JSImport("xstate/lib/actions", "sendParent")
  @js.native
  def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  @JSImport("xstate/lib/actions", "sendParent")
  @js.native
  def sendParent[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  
  @JSImport("xstate/lib/actions", "sendUpdate")
  @js.native
  def sendUpdate[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent, TypeUpdate] = js.native
  
  @JSImport("xstate/lib/actions", "start")
  @js.native
  def start[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
  @JSImport("xstate/lib/actions", "start")
  @js.native
  def start[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
  
  @JSImport("xstate/lib/actions", "stop")
  @js.native
  def stop[TContext, TEvent /* <: EventObject */](actorRef: String): StopAction[TContext, TEvent] = js.native
  @JSImport("xstate/lib/actions", "stop")
  @js.native
  def stop[TContext, TEvent /* <: EventObject */](actorRef: ActivityDefinition[TContext, TEvent]): StopAction[TContext, TEvent] = js.native
  @JSImport("xstate/lib/actions", "stop")
  @js.native
  def stop[TContext, TEvent /* <: EventObject */](actorRef: Expr[TContext, TEvent, String | Id]): StopAction[TContext, TEvent] = js.native
  
  @JSImport("xstate/lib/actions", "toActionObject")
  @js.native
  def toActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent]): ActionObject[TContext, TEvent] = js.native
  @JSImport("xstate/lib/actions", "toActionObject")
  @js.native
  def toActionObject[TContext, TEvent /* <: EventObject */](action: Action[TContext, TEvent], actionFunctionMap: ActionFunctionMap[TContext, TEvent]): ActionObject[TContext, TEvent] = js.native
  
  @JSImport("xstate/lib/actions", "toActionObjects")
  @js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](): js.Array[ActionObject[TContext, TEvent]] = js.native
  @JSImport("xstate/lib/actions", "toActionObjects")
  @js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: js.UndefOr[scala.Nothing],
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  @JSImport("xstate/lib/actions", "toActionObjects")
  @js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: String): js.Array[ActionObject[TContext, TEvent]] = js.native
  @JSImport("xstate/lib/actions", "toActionObjects")
  @js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: String,
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  @JSImport("xstate/lib/actions", "toActionObjects")
  @js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: js.Array[Action[TContext, TEvent]]): js.Array[ActionObject[TContext, TEvent]] = js.native
  @JSImport("xstate/lib/actions", "toActionObjects")
  @js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: js.Array[Action[TContext, TEvent]],
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  @JSImport("xstate/lib/actions", "toActionObjects")
  @js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: ActionFunction[TContext, TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  @JSImport("xstate/lib/actions", "toActionObjects")
  @js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: ActionFunction[TContext, TEvent],
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  @JSImport("xstate/lib/actions", "toActionObjects")
  @js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](action: ActionObject[TContext, TEvent]): js.Array[ActionObject[TContext, TEvent]] = js.native
  @JSImport("xstate/lib/actions", "toActionObjects")
  @js.native
  def toActionObjects[TContext, TEvent /* <: EventObject */](
    action: ActionObject[TContext, TEvent],
    actionFunctionMap: Record[String, (ActionObject[TContext, TEvent]) | (ActionFunction[TContext, TEvent])]
  ): js.Array[ActionObject[TContext, TEvent]] = js.native
  
  @JSImport("xstate/lib/actions", "toActivityDefinition")
  @js.native
  def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: String): ActivityDefinition[TContext, TEvent] = js.native
  @JSImport("xstate/lib/actions", "toActivityDefinition")
  @js.native
  def toActivityDefinition[TContext, TEvent /* <: EventObject */](action: ActivityDefinition[TContext, TEvent]): ActivityDefinition[TContext, TEvent] = js.native
}
