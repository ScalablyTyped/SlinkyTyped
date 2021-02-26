package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.anon.ContextTContext
import typingsSlinky.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathsItem[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var paths: js.Array[js.Array[Segment[TContext, TEvent]]] = js.native
  
  var state: State[TContext, TEvent, _, ContextTContext[TContext]] = js.native
}
object PathsItem {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    paths: js.Array[js.Array[Segment[TContext, TEvent]]],
    state: State[TContext, TEvent, _, ContextTContext[TContext]]
  ): PathsItem[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathsItem[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class PathsItemMutableBuilder[Self <: PathsItem[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (PathsItem[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setPaths(value: js.Array[js.Array[Segment[TContext, TEvent]]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsVarargs(value: (js.Array[Segment[TContext, TEvent]])*): Self = StObject.set(x, "paths", js.Array(value :_*))
    
    @scala.inline
    def setState(value: State[TContext, TEvent, _, ContextTContext[TContext]]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
