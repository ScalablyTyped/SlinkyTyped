package typingsSlinky.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.xstate.typesMod.ActionType
    - typingsSlinky.xstate.typesMod.ActionObject[TContext, TEvent]
    - typingsSlinky.xstate.typesMod.ActionFunction[TContext, TEvent]
    - typingsSlinky.xstate.typesMod.AssignAction[typingsSlinky.std.Required[TContext], TEvent]
    - typingsSlinky.xstate.typesMod.SendAction[TContext, TEvent, typingsSlinky.xstate.typesMod.AnyEventObject]
    - typingsSlinky.xstate.typesMod.RaiseAction[typingsSlinky.xstate.typesMod.AnyEventObject]
    - typingsSlinky.xstate.typesMod.ChooseAction[TContext, TEvent]
  */
  type Action[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = (typingsSlinky.xstate.typesMod._Action[TContext, TEvent]) | (typingsSlinky.xstate.typesMod.AssignAction[typingsSlinky.std.Required[TContext], TEvent]) | (typingsSlinky.xstate.typesMod.SendAction[TContext, TEvent, typingsSlinky.xstate.typesMod.AnyEventObject]) | typingsSlinky.xstate.typesMod.RaiseAction[typingsSlinky.xstate.typesMod.AnyEventObject] | typingsSlinky.xstate.typesMod.ActionType | (typingsSlinky.xstate.typesMod.ActionFunction[TContext, TEvent])
  type ActionFunction[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typingsSlinky.xstate.typesMod.ActionMeta[TContext, TEvent], 
    scala.Unit
  ]
  type ActionFunctionMap[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.std.Record[
    java.lang.String, 
    (typingsSlinky.xstate.typesMod.ActionObject[TContext, TEvent]) | (typingsSlinky.xstate.typesMod.ActionFunction[TContext, TEvent])
  ]
  type ActionType = java.lang.String
  type Actions[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.xstate.typesMod.SingleOrArray[typingsSlinky.xstate.typesMod.Action[TContext, TEvent]]
  type Activity[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = java.lang.String | (typingsSlinky.xstate.typesMod.ActivityDefinition[TContext, TEvent])
  type ActivityConfig[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Function2[
    /* ctx */ TContext, 
    /* activity */ typingsSlinky.xstate.typesMod.ActivityDefinition[TContext, TEvent], 
    typingsSlinky.xstate.typesMod.DisposeActivityFunction | scala.Unit
  ]
  type ActivityMap = org.scalablytyped.runtime.StringDictionary[
    (typingsSlinky.xstate.typesMod.ActivityDefinition[js.Any, js.Any]) | typingsSlinky.xstate.xstateBooleans.`false`
  ]
  type AdjacencyMap = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.std.Record[java.lang.String, typingsSlinky.xstate.typesMod.TransitionMap]
  ]
  type AnyStateNodeDefinition = typingsSlinky.xstate.typesMod.StateNodeDefinition[js.Any, js.Any, js.Any]
  type Assigner[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typingsSlinky.xstate.typesMod.AssignMeta[TContext, TEvent], 
    typingsSlinky.std.Partial[TContext]
  ]
  type Condition[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = java.lang.String | (typingsSlinky.xstate.typesMod.ConditionPredicate[TContext, TEvent]) | (typingsSlinky.xstate.typesMod.Guard[TContext, TEvent])
  type ConditionPredicate[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typingsSlinky.xstate.typesMod.GuardMeta[TContext, TEvent], 
    scala.Boolean
  ]
  type ConditionalTransitionConfig[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Array[typingsSlinky.xstate.typesMod.TransitionConfig[TContext, TEvent]]
  type DefaultContext = js.UndefOr[typingsSlinky.std.Record[java.lang.String, js.Any]]
  type DefaultGuardType = typingsSlinky.xstate.xstateStrings.xstateDotguard
  type DelayConfig[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = scala.Double | (typingsSlinky.xstate.typesMod.DelayExpr[TContext, TEvent])
  type DelayExpr[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.xstate.typesMod.ExprWithMeta[TContext, TEvent, scala.Double]
  type DelayFunctionMap[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.std.Record[java.lang.String, typingsSlinky.xstate.typesMod.DelayConfig[TContext, TEvent]]
  type DelayedTransitions[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = (typingsSlinky.std.Record[
    java.lang.String | scala.Double, 
    java.lang.String | (typingsSlinky.xstate.typesMod.SingleOrArray[typingsSlinky.xstate.typesMod.TransitionConfig[TContext, TEvent]])
  ]) | (js.Array[
    (typingsSlinky.xstate.typesMod.TransitionConfig[TContext, TEvent]) with (typingsSlinky.xstate.anon.Delay[TContext, TEvent])
  ])
  type DisposeActivityFunction = js.Function0[scala.Unit]
  type DoneEvent = typingsSlinky.xstate.typesMod.DoneEventObject with java.lang.String
  type Event[TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | TEvent
  type EventData = (typingsSlinky.std.Record[java.lang.String, _]) with typingsSlinky.xstate.anon.`0`
  type EventType = java.lang.String
  type Expr[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */, T] = js.Function2[/* context */ TContext, /* event */ TEvent, T]
  type ExprWithMeta[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */, T] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typingsSlinky.xstate.typesMod.SCXMLEventMeta[TEvent], 
    T
  ]
  type ExtractStateValue[TS /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */, TSS] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TSS ]:? TSS[K] extends {  states :any}? keyof TSS[K]['states'] : never | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias xstate.xstate/lib/types.ExtractStateValue<TSS[K], TSS[K]['states']> * / object}
    */ typingsSlinky.xstate.xstateStrings.ExtractStateValue with org.scalablytyped.runtime.TopLevel[TSS]
  type Guard[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = (typingsSlinky.xstate.typesMod.GuardPredicate[TContext, TEvent]) | ((typingsSlinky.std.Record[java.lang.String, _]) with typingsSlinky.xstate.anon.TypeString)
  type InvokeCallback = js.Function2[
    /* callback */ typingsSlinky.xstate.typesMod.Sender[js.Any], 
    /* onReceive */ typingsSlinky.xstate.typesMod.Receiver[typingsSlinky.xstate.typesMod.EventObject], 
    js.Any
  ]
  type InvokeCreator[TContext, TEvent, TFinalContext] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typingsSlinky.xstate.typesMod.InvokeMeta, 
    js.Thenable[TFinalContext] | (typingsSlinky.xstate.typesMod.StateMachine[TFinalContext, js.Any, js.Any, js.Any]) | typingsSlinky.xstate.typesMod.Subscribable[js.Any] | typingsSlinky.xstate.typesMod.InvokeCallback
  ]
  type LogExpr[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.xstate.typesMod.ExprWithMeta[TContext, TEvent, js.Any]
  type Mapper[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */, TParams /* <: js.Object */] = js.Function2[/* context */ TContext, /* event */ TEvent, TParams]
  type MetaObject = typingsSlinky.std.Record[java.lang.String, js.Any]
  type PathMap[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.xstate.typesMod.PathItem[TContext, TEvent]]
  type PathsMap[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.xstate.typesMod.PathsItem[TContext, TEvent]]
  type PropertyAssigner[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TContext ]:? (context : TContext, event : TEvent, meta : xstate.xstate/lib/types.AssignMeta<TContext, TEvent>): TContext[K] | TContext[K]}
    */ typingsSlinky.xstate.xstateStrings.PropertyAssigner with org.scalablytyped.runtime.TopLevel[js.Any]
  type PropertyMapper[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */, TParams /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TParams ]:? (context : TContext, event : TEvent): TParams[K] | TParams[K]}
    */ typingsSlinky.xstate.xstateStrings.PropertyMapper with org.scalablytyped.runtime.TopLevel[js.Any]
  type Receiver[TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Function1[/* listener */ js.Function1[/* event */ TEvent, scala.Unit], scala.Unit]
  type SendExpr[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */, TSentEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.xstate.typesMod.ExprWithMeta[TContext, TEvent, TSentEvent]
  type Sender[TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Function1[/* event */ typingsSlinky.xstate.typesMod.Event[TEvent], scala.Unit]
  type ServiceConfig[TContext] = java.lang.String | (typingsSlinky.xstate.typesMod.StateMachine[js.Any, js.Any, js.Any, js.Any]) | (typingsSlinky.xstate.typesMod.InvokeCreator[TContext, typingsSlinky.xstate.typesMod.AnyEventObject, js.Any])
  type SingleOrArray[T] = js.Array[T] | T
  type Spawnable = (typingsSlinky.xstate.typesMod.StateMachine[js.Any, js.Any, js.Any, js.Any]) | js.Promise[js.Any] | typingsSlinky.xstate.typesMod.InvokeCallback | typingsSlinky.xstate.typesMod.Subscribable[js.Any]
  type StandardMachineConfig[TContext, TStateSchema /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.xstate.typesMod.StateNodeConfig[TContext, TStateSchema, TEvent]
  type StateFrom[TMachine /* <: typingsSlinky.xstate.typesMod.StateMachine[_, _, _, _] */] = typingsSlinky.std.ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: TMachine['transition'] */ js.Any
  ]
  type StateKey = java.lang.String | (typingsSlinky.xstate.stateMod.State[
    js.Any, 
    typingsSlinky.xstate.typesMod.EventObject, 
    js.Any, 
    typingsSlinky.xstate.anon.ContextAny
  ])
  type StateNodesConfig[TContext, TStateSchema /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/StateNode.StateNode<TContext, TStateSchema['states'][K], TEvent, any>}
    */ typingsSlinky.xstate.xstateStrings.StateNodesConfig with org.scalablytyped.runtime.TopLevel[TStateSchema]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.xstate.xstateStrings.atomic
    - typingsSlinky.xstate.xstateStrings.compound
    - typingsSlinky.xstate.xstateStrings.parallel
    - typingsSlinky.xstate.xstateStrings.`final`
    - typingsSlinky.xstate.xstateStrings.history
    - java.lang.String
  */
  type StateTypes = typingsSlinky.xstate.typesMod._StateTypes | java.lang.String
  type StateValue = java.lang.String | typingsSlinky.xstate.typesMod.StateValueMap
  type StatesConfig[TContext, TStateSchema /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeConfig<TContext, TStateSchema['states'][K], TEvent>}
    */ typingsSlinky.xstate.xstateStrings.StatesConfig with org.scalablytyped.runtime.TopLevel[TStateSchema]
  type StatesDefinition[TContext, TStateSchema /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeDefinition<TContext, TStateSchema['states'][K], TEvent>}
    */ typingsSlinky.xstate.xstateStrings.StatesDefinition with org.scalablytyped.runtime.TopLevel[TStateSchema]
  type Transition[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = java.lang.String | (typingsSlinky.xstate.typesMod.TransitionConfig[TContext, TEvent]) | (typingsSlinky.xstate.typesMod.ConditionalTransitionConfig[TContext, TEvent])
  type TransitionConfigOrTarget[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.xstate.typesMod.SingleOrArray[
    (typingsSlinky.xstate.typesMod.TransitionConfigTarget[TContext, TEvent]) | (typingsSlinky.xstate.typesMod.TransitionConfig[TContext, TEvent])
  ]
  type TransitionConfigTarget[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.UndefOr[
    java.lang.String | (typingsSlinky.xstate.stateNodeMod.StateNode[TContext, js.Any, TEvent, js.Any])
  ]
  type TransitionDefinitionMap[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]: std.Array<xstate.xstate/lib/types.TransitionDefinition<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type :K}> : xstate.xstate/lib/types.EventObject>>}
    */ typingsSlinky.xstate.xstateStrings.TransitionDefinitionMap with org.scalablytyped.runtime.TopLevel[TEvent]
  type TransitionTarget[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.xstate.typesMod.SingleOrArray[
    java.lang.String | (typingsSlinky.xstate.stateNodeMod.StateNode[TContext, js.Any, TEvent, js.Any])
  ]
  type TransitionTargets[TContext] = js.Array[
    java.lang.String | (typingsSlinky.xstate.stateNodeMod.StateNode[TContext, js.Any, typingsSlinky.xstate.typesMod.EventObject, js.Any])
  ]
  type TransitionsConfig[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = (typingsSlinky.xstate.typesMod.TransitionsConfigMap[TContext, TEvent]) | (typingsSlinky.xstate.typesMod.TransitionsConfigArray[TContext, TEvent])
  type TransitionsConfigArray[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Array[
    (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in TEvent['type'] ]: xstate.xstate/lib/types.TransitionConfig<TContext, TEvent extends {  type :K}? TEvent : never> & {  event :K}}[TEvent['type']] */ js.Any) | ((typingsSlinky.xstate.typesMod.TransitionConfig[TContext, TEvent]) with typingsSlinky.xstate.anon.Event) | ((typingsSlinky.xstate.typesMod.TransitionConfig[TContext, TEvent]) with typingsSlinky.xstate.anon.`2`)
  ]
  type ValueAdjacencyMap[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.std.Record[
      java.lang.String, 
      typingsSlinky.xstate.stateMod.State[TContext, TEvent, js.Any, typingsSlinky.xstate.anon.Context[TContext]]
    ]
  ]
}
