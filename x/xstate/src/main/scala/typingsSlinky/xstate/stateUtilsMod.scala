package typingsSlinky.xstate

import typingsSlinky.std.Map
import typingsSlinky.xstate.anon.Context
import typingsSlinky.xstate.anon.ContextAny
import typingsSlinky.xstate.mod.StateNode
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.StateValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateUtilsMod {
  
  @JSImport("xstate/lib/stateUtils", "getAdjList")
  @js.native
  def getAdjList[TC, TE /* <: EventObject */](configuration: js.Iterable[StateNode[TC, js.Any, TE, Context[TC]]]): AdjList[TC, TE] = js.native
  
  @JSImport("xstate/lib/stateUtils", "getAllStateNodes")
  @js.native
  def getAllStateNodes[TC, TE /* <: EventObject */](stateNode: StateNode[TC, _, TE, Context[TC]]): js.Array[StateNode[TC, _, TE, Context[TC]]] = js.native
  
  @JSImport("xstate/lib/stateUtils", "getChildren")
  @js.native
  def getChildren[TC, TE /* <: EventObject */](stateNode: StateNode[TC, _, TE, Context[TC]]): js.Array[StateNode[TC, _, TE, Context[TC]]] = js.native
  
  @JSImport("xstate/lib/stateUtils", "getConfiguration")
  @js.native
  def getConfiguration[TC, TE /* <: EventObject */](
    prevStateNodes: js.Iterable[StateNode[TC, _, TE, Context[TC]]],
    stateNodes: js.Iterable[StateNode[TC, _, TE, Context[TC]]]
  ): js.Iterable[StateNode[TC, _, TE, Context[TC]]] = js.native
  
  @JSImport("xstate/lib/stateUtils", "getValue")
  @js.native
  def getValue[TC, TE /* <: EventObject */](
    rootNode: StateNode[TC, _, TE, Context[TC]],
    configuration: js.Iterable[StateNode[TC, js.Any, TE, Context[TC]]]
  ): StateValue = js.native
  
  @JSImport("xstate/lib/stateUtils", "has")
  @js.native
  def has[T](iterable: js.Iterable[T], item: T): Boolean = js.native
  
  @JSImport("xstate/lib/stateUtils", "isInFinalState")
  @js.native
  def isInFinalState[TC, TE /* <: EventObject */](
    configuration: js.Array[StateNode[TC, _, TE, Context[TC]]],
    stateNode: StateNode[TC, _, TE, Context[TC]]
  ): Boolean = js.native
  
  @JSImport("xstate/lib/stateUtils", "isLeafNode")
  @js.native
  def isLeafNode(stateNode: StateNode[_, _, _, ContextAny]): Boolean = js.native
  
  @JSImport("xstate/lib/stateUtils", "nextEvents")
  @js.native
  def nextEvents[TC, TE /* <: EventObject */](configuration: js.Array[StateNode[TC, _, TE, Context[TC]]]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TE['type'] */ js.Any
  ] = js.native
  
  type AdjList[TC, TE /* <: EventObject */] = Map[
    StateNode[TC, js.Any, TE, Context[TC]], 
    js.Array[StateNode[TC, js.Any, TE, Context[TC]]]
  ]
  
  type Configuration[TC, TE /* <: EventObject */] = js.Iterable[StateNode[TC, js.Any, TE, Context[TC]]]
}
