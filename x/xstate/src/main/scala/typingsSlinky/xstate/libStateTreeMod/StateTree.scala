package typingsSlinky.xstate.libStateTreeMod

import typingsSlinky.std.Record
import typingsSlinky.std.Set
import typingsSlinky.xstate.libStateNodeMod.StateNode
import typingsSlinky.xstate.libTypesMod.EntryExitStateArrays
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.EventType
import typingsSlinky.xstate.libTypesMod.OmniEventObject
import typingsSlinky.xstate.libTypesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/StateTree", "StateTree")
@js.native
class StateTree protected () extends js.Object {
  def this(stateNode: StateNode[_, _, OmniEventObject[EventObject]]) = this()
  def this(stateNode: StateNode[_, _, OmniEventObject[EventObject]], stateValue: StateValue) = this()
  def this(
    stateNode: StateNode[_, _, OmniEventObject[EventObject]],
    stateValue: js.UndefOr[StateValue],
    options: StateTreeOptions
  ) = this()
  def this(
    stateNode: StateNode[_, _, OmniEventObject[EventObject]],
    stateValue: js.UndefOr[StateValue],
    options: StateTreeOptions,
    parent: StateTree
  ) = this()
  val absolute: StateTree = js.native
  val atomicNodes: js.Array[StateNode[_, _, OmniEventObject[EventObject]]] = js.native
  val done: Boolean = js.native
  var isResolved: Boolean = js.native
  val nextEvents: js.Array[EventType] = js.native
  var nodes: Record[String, StateTree] = js.native
  var parent: js.UndefOr[StateTree] = js.native
  val paths: js.Array[js.Array[String]] = js.native
  var reentryNodes: js.Any = js.native
  val resolved: StateTree = js.native
  var root: StateTree = js.native
  var stateNode: StateNode[_, _, OmniEventObject[EventObject]] = js.native
  var stateValue: js.UndefOr[StateValue] = js.native
  val value: StateValue = js.native
  def addReentryNode(reentryNode: StateNode[_, _, OmniEventObject[EventObject]]): Unit = js.native
  def combine(tree: StateTree): StateTree = js.native
  def getDoneData[TContext](context: TContext, event: EventObject): js.Any = js.native
  def getDoneEvents(): js.Array[EventObject] = js.native
  def getDoneEvents(entryStateNodes: Set[StateNode[_, _, OmniEventObject[EventObject]]]): js.Array[EventObject] = js.native
  def getEntryExitStates(): EntryExitStateArrays[_] = js.native
  def getEntryExitStates(prevTree: StateTree): EntryExitStateArrays[_] = js.native
  def getEntryStates(): js.Array[StateNode[_, _, OmniEventObject[EventObject]]] = js.native
  def getExitStates(): js.Array[StateNode[_, _, OmniEventObject[EventObject]]] = js.native
  def matches(parentValue: StateValue): Boolean = js.native
}

