package typingsSlinky.xstate

import typingsSlinky.std.Map
import typingsSlinky.xstate.mod.StateNode
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/stateUtils", JSImport.Namespace)
@js.native
object stateUtilsMod extends js.Object {
  
  def getAdjList[TC, TE /* <: EventObject */](configuration: js.Iterable[StateNode[TC, js.Any, TE, js.Any]]): AdjList[TC, TE] = js.native
  
  def getAllStateNodes[TC, TE /* <: EventObject */](stateNode: StateNode[TC, _, TE, _]): js.Array[StateNode[TC, _, TE, _]] = js.native
  
  def getChildren[TC, TE /* <: EventObject */](stateNode: StateNode[TC, _, TE, _]): js.Array[StateNode[TC, _, TE, _]] = js.native
  
  def getConfiguration[TC, TE /* <: EventObject */](
    prevStateNodes: js.Iterable[StateNode[TC, _, TE, _]],
    stateNodes: js.Iterable[StateNode[TC, _, TE, _]]
  ): js.Iterable[StateNode[TC, _, TE, _]] = js.native
  
  def getValue[TC, TE /* <: EventObject */](rootNode: StateNode[TC, _, TE, _], configuration: js.Iterable[StateNode[TC, js.Any, TE, js.Any]]): StateValue = js.native
  
  def has[T](iterable: js.Iterable[T], item: T): Boolean = js.native
  
  def isInFinalState[TC, TE /* <: EventObject */](configuration: js.Array[StateNode[TC, _, TE, _]], stateNode: StateNode[TC, _, TE, _]): Boolean = js.native
  
  def isLeafNode(stateNode: StateNode[_, _, _, _]): Boolean = js.native
  
  def nextEvents[TC, TE /* <: EventObject */](configuration: js.Array[StateNode[TC, _, TE, _]]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TE['type'] */ js.Any
  ] = js.native
  
  type AdjList[TC, TE /* <: EventObject */] = Map[StateNode[TC, js.Any, TE, js.Any], js.Array[StateNode[TC, js.Any, TE, js.Any]]]
  
  type Configuration[TC, TE /* <: EventObject */] = js.Iterable[StateNode[TC, js.Any, TE, js.Any]]
}
