package typingsSlinky.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ActionFunction[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typingsSlinky.xstate.typesMod.ActionMeta[TContext, TEvent], 
    js.Any | scala.Unit
  ]
  type ActionFunctionMap[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.std.Record[
    java.lang.String, 
    (typingsSlinky.xstate.typesMod.ActionObject[TContext, TEvent]) | (typingsSlinky.xstate.typesMod.ActionFunction[TContext, TEvent])
  ]
  type ActionType = java.lang.String
  type Actions[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.xstate.typesMod.SingleOrArray[typingsSlinky.xstate.typesMod.Action[TContext, TEvent]]
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
  type ConditionPredicate[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typingsSlinky.xstate.typesMod.GuardMeta[TContext, TEvent], 
    scala.Boolean
  ]
  type ConditionalTransitionConfig[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Array[typingsSlinky.xstate.typesMod.TransitionConfig[TContext, TEvent]]
  type DefaultGuardType = typingsSlinky.xstate.xstateStrings.xstateDotguard
  type DelayExpr[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.xstate.typesMod.ExprWithMeta[TContext, TEvent, scala.Double]
  type DelayFunctionMap[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.std.Record[java.lang.String, typingsSlinky.xstate.typesMod.DelayConfig[TContext, TEvent]]
  type DisposeActivityFunction = js.Function0[scala.Unit]
  type DoneEvent = typingsSlinky.xstate.typesMod.DoneEventObject with java.lang.String
  type EventData = (typingsSlinky.std.Record[java.lang.String, _]) with js.Object
  type EventType = java.lang.String
  type Expr[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */, T] = js.Function2[/* context */ TContext, /* event */ TEvent, T]
  type ExprWithMeta[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */, T] = js.Function3[
    /* context */ TContext, 
    /* event */ TEvent, 
    /* meta */ typingsSlinky.xstate.typesMod.SCXMLEventMeta[TEvent], 
    T
  ]
  type ExtractStateValue[TS /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */, TSS] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TSS ]:? TSS[K] extends {  states  :any}? keyof TSS[K]['states'] : never | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias xstate.xstate/lib/types.ExtractStateValue<TSS[K], TSS[K]['states']> * / object}
    */ typingsSlinky.xstate.xstateStrings.ExtractStateValue with org.scalablytyped.runtime.TopLevel[TSS]
  type InvokeCallback = js.Function2[
    /* callback */ typingsSlinky.xstate.typesMod.Sender[js.Any], 
    /* onReceive */ typingsSlinky.xstate.typesMod.Receiver[typingsSlinky.xstate.typesMod.EventObject], 
    js.Any
  ]
  type InvokeCreator[TContext, TEvent, TFinalContext] = js.Function2[
    /* context */ TContext, 
    /* event */ TEvent, 
    js.Thenable[TFinalContext] | (typingsSlinky.xstate.typesMod.StateMachine[TFinalContext, js.Any, js.Any, js.Any]) | typingsSlinky.xstate.typesMod.Subscribable[js.Any] | typingsSlinky.xstate.typesMod.InvokeCallback
  ]
  type LogExpr[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.xstate.typesMod.ExprWithMeta[TContext, TEvent, js.Any]
  type Mapper[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Function2[/* context */ TContext, /* event */ TEvent, js.Any]
  type MetaObject = typingsSlinky.std.Record[java.lang.String, js.Any]
  type PathMap[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.xstate.typesMod.PathItem[TContext, TEvent]]
  type PathsMap[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.xstate.typesMod.PathsItem[TContext, TEvent]]
  type PropertyAssigner[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TContext ]:? (context : TContext, event : TEvent, meta : xstate.xstate/lib/types.AssignMeta<TContext, TEvent>): TContext[K] | TContext[K]}
    */ typingsSlinky.xstate.xstateStrings.PropertyAssigner with org.scalablytyped.runtime.TopLevel[js.Any]
  type Receiver[TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Function1[/* listener */ js.Function1[/* event */ TEvent, scala.Unit], scala.Unit]
  type SendExpr[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.xstate.typesMod.ExprWithMeta[TContext, TEvent, TEvent]
  type Sender[TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Function1[/* event */ typingsSlinky.xstate.typesMod.Event[TEvent], scala.Unit]
  type StandardMachineConfig[TContext, TStateSchema /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.xstate.typesMod.StateNodeConfig[TContext, TStateSchema, TEvent]
  type StateFrom[TMachine /* <: typingsSlinky.xstate.typesMod.StateMachine[_, _, _, _] */] = typingsSlinky.std.ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: TMachine['transition'] */ js.Any
  ]
  type StateNodesConfig[TContext, TStateSchema /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/StateNode.StateNode<TContext, TStateSchema['states'][K], TEvent, any>}
    */ typingsSlinky.xstate.xstateStrings.StateNodesConfig with org.scalablytyped.runtime.TopLevel[TStateSchema]
  type StatesConfig[TContext, TStateSchema /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeConfig<TContext, TStateSchema['states'][K], TEvent>}
    */ typingsSlinky.xstate.xstateStrings.StatesConfig with org.scalablytyped.runtime.TopLevel[TStateSchema]
  type StatesDefinition[TContext, TStateSchema /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TStateSchema['states'] ]: xstate.xstate/lib/types.StateNodeDefinition<TContext, TStateSchema['states'][K], TEvent>}
    */ typingsSlinky.xstate.xstateStrings.StatesDefinition with org.scalablytyped.runtime.TopLevel[TStateSchema]
  type TransitionDefinitionMap[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]: std.Array<xstate.xstate/lib/types.TransitionDefinition<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type  :K}> : xstate.xstate/lib/types.EventObject>>}
    */ typingsSlinky.xstate.xstateStrings.TransitionDefinitionMap with org.scalablytyped.runtime.TopLevel[TEvent]
  type TransitionTarget[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = typingsSlinky.xstate.typesMod.SingleOrArray[
    java.lang.String | (typingsSlinky.xstate.stateNodeMod.StateNode[TContext, js.Any, TEvent, js.Any])
  ]
  type TransitionTargets[TContext] = js.Array[
    java.lang.String | (typingsSlinky.xstate.stateNodeMod.StateNode[TContext, js.Any, typingsSlinky.xstate.typesMod.EventObject, js.Any])
  ]
  type TransitionsConfigArray[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]: xstate.xstate/lib/types.TransitionConfig<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type  :K}> : xstate.xstate/lib/types.EventObject> & {  event  :K}}[TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*'] */ js.Any
  ]
  type TransitionsConfigMap[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in TEvent['type'] | xstate.xstate/lib/types.ActionTypes.NullEvent | '*' ]:? xstate.xstate/lib/types.SingleOrArray<xstate.xstate/lib/types.TransitionConfigTargetShortcut<TContext, TEvent> | xstate.xstate/lib/types.TransitionConfig<TContext, K extends TEvent['type']? std.Extract<TEvent, {  type  :K}> : xstate.xstate/lib/types.EventObject> & {  event? :undefined}>}
    */ typingsSlinky.xstate.xstateStrings.TransitionsConfigMap with org.scalablytyped.runtime.TopLevel[TEvent]
  type ValueAdjacencyMap[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.std.Record[
      java.lang.String, 
      typingsSlinky.xstate.stateMod.State[TContext, TEvent, js.Any, js.Any]
    ]
  ]
}
