package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply[TContext, TEvent](
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
  implicit class NodesAndEdgesOps[Self[tcontext, tevent] <: NodesAndEdges[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withEdges(
      value: js.Array[
          Edge[
            TContext, 
            TEvent, 
            /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
          ]
        ]
    ): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: js.Array[StateNode[_, _, EventObject, _]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

