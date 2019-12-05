package typingsSlinky.xstate

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Record
import typingsSlinky.xstate.libTypesMod.Action
import typingsSlinky.xstate.libTypesMod.ActionObject
import typingsSlinky.xstate.libTypesMod.ActionType
import typingsSlinky.xstate.libTypesMod.AssignAction
import typingsSlinky.xstate.libTypesMod.Condition
import typingsSlinky.xstate.libTypesMod.ConditionPredicate
import typingsSlinky.xstate.libTypesMod.Event
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.EventType
import typingsSlinky.xstate.libTypesMod.Guard
import typingsSlinky.xstate.libTypesMod.HistoryValue
import typingsSlinky.xstate.libTypesMod.Mapper
import typingsSlinky.xstate.libTypesMod.OmniEventObject
import typingsSlinky.xstate.libTypesMod.PropertyMapper
import typingsSlinky.xstate.libTypesMod.StateInterface
import typingsSlinky.xstate.libTypesMod.StateValue
import typingsSlinky.xstate.libTypesMod.Subscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  var warn: js.Function2[/* condition */ Boolean | js.Error, /* message */ String, Unit] = js.native
  def bindActionToState[TC, TE /* <: EventObject */](action: ActionObject[TC, TE], state: StateInterface[TC, TE]): ActionObject[TC, TE] = js.native
  def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  def getActionType(action: Action[_, _]): ActionType = js.native
  def getEventType[TEvent /* <: EventObject */](event: Event[TEvent]): /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any = js.native
  def isArray(value: js.Any): /* is std.Array<any> */ Boolean = js.native
  def isBuiltInEvent(eventType: EventType): Boolean = js.native
  def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  def isMachine(value: js.Any): /* is xstate.xstate/lib/types.StateMachine<any, any, any> */ Boolean = js.native
  def isObservable[T](value: js.Any): /* is xstate.xstate/lib/types.Subscribable<T> */ Boolean = js.native
  def isObservable[T](value: Subscribable[T]): /* is xstate.xstate/lib/types.Subscribable<T> */ Boolean = js.native
  def isPromiseLike(value: js.Any): /* is std.PromiseLike<any> */ Boolean = js.native
  def isString(value: js.Any): /* is string */ Boolean = js.native
  def keys[T /* <: js.Object */](value: T): js.Array[String] = js.native
  def mapContext[TContext, TEvent /* <: EventObject */](mapper: Mapper[TContext, TEvent], context: TContext, event: TEvent): js.Any = js.native
  def mapContext[TContext, TEvent /* <: EventObject */](mapper: PropertyMapper[TContext, TEvent], context: TContext, event: TEvent): js.Any = js.native
  def mapFilterValues[T, P](
    collection: StringDictionary[T],
    iteratee: js.Function3[/* item */ T, /* key */ String, /* collection */ StringDictionary[T], P],
    predicate: js.Function1[/* item */ T, Boolean]
  ): StringDictionary[P] = js.native
  def mapValues[T, P](
    collection: StringDictionary[T],
    iteratee: js.Function4[/* item */ T, /* key */ String, /* collection */ StringDictionary[T], /* i */ Double, P]
  ): StringDictionary[P] = js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue): Boolean = js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue, delimiter: String): Boolean = js.native
  def nestedPath[T /* <: Record[String, _] */](props: js.Array[String], accessorProp: String): js.Function1[/* object */ T, T] = js.native
  def partition[T, A /* <: T */, B /* <: T */](items: js.Array[T], predicate: js.Function1[/* item */ T, /* is A */ Boolean]): js.Tuple2[js.Array[A], js.Array[B]] = js.native
  def path[T /* <: Record[String, _] */](props: js.Array[String]): js.Any = js.native
  def pathToStateValue(statePath: js.Array[String]): StateValue = js.native
  def pathsToStateValue(paths: js.Array[js.Array[String]]): StateValue = js.native
  def toArray[T](): js.Array[T] = js.native
  def toArray[T](value: T): js.Array[T] = js.native
  def toArray[T](value: js.Array[T]): js.Array[T] = js.native
  def toGuard[TContext, TEvent /* <: EventObject */](): js.UndefOr[Guard[TContext, TEvent]] = js.native
  def toGuard[TContext, TEvent /* <: EventObject */](condition: Condition[TContext, TEvent]): js.UndefOr[Guard[TContext, TEvent]] = js.native
  def toGuard[TContext, TEvent /* <: EventObject */](
    condition: Condition[TContext, TEvent],
    guardMap: Record[String, ConditionPredicate[TContext, TEvent]]
  ): js.UndefOr[Guard[TContext, TEvent]] = js.native
  def toStatePath(stateId: String, delimiter: String): js.Array[String] = js.native
  def toStatePath(stateId: js.Array[String], delimiter: String): js.Array[String] = js.native
  def toStatePaths(): js.Array[js.Array[String]] = js.native
  def toStatePaths(stateValue: StateValue): js.Array[js.Array[String]] = js.native
  def toStateValue(stateValue: js.Array[String], delimiter: String): StateValue = js.native
  def toStateValue(stateValue: StateInterface[_, EventObject], delimiter: String): StateValue = js.native
  def toStateValue(stateValue: StateValue, delimiter: String): StateValue = js.native
  def uniqueId(): String = js.native
  def updateContext[TContext, TEvent /* <: EventObject */](
    context: TContext,
    event: OmniEventObject[TEvent],
    assignActions: js.Array[AssignAction[TContext, TEvent]]
  ): TContext = js.native
  def updateHistoryStates(hist: HistoryValue, stateValue: StateValue): Record[String, js.UndefOr[HistoryValue]] = js.native
  def updateHistoryValue(hist: HistoryValue, stateValue: StateValue): HistoryValue = js.native
}

