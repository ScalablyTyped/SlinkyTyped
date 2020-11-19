package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesAndEdges[TContext, TEvent /* <: EventObject */] extends js.Object {
  
  var edges: js.Array[
    Edge[
      TContext, 
      TEvent, 
      /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
    ]
  ] = js.native
  
  var nodes: js.Array[StateNode[_, _, EventObject, _]] = js.native
}
object NodesAndEdges {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    edges: js.Array[
      Edge[
        TContext, 
        TEvent, 
        /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
      ]
    ],
    nodes: js.Array[StateNode[_, _, EventObject, _]]
  ): NodesAndEdges[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesAndEdges[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class NodesAndEdgesOps[Self <: NodesAndEdges[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (NodesAndEdges[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEdgesVarargs(
      value: (Edge[
          TContext, 
          TEvent, 
          /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
        ])*
    ): Self = this.set("edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(
      value: js.Array[
          Edge[
            TContext, 
            TEvent, 
            /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
          ]
        ]
    ): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: (StateNode[js.Any, js.Any, EventObject, js.Any])*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[StateNode[_, _, EventObject, _]]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
}
