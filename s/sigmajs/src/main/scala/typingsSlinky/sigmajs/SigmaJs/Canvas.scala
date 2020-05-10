package typingsSlinky.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canvas extends js.Object {
  var edges: StringDictionary[
    js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */ js.Any, Unit]
  ] = js.native
  var labels: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]] = js.native
  var nodes: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]] = js.native
}

object Canvas {
  @scala.inline
  def apply(
    edges: StringDictionary[
      js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */ js.Any, Unit]
    ],
    labels: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]],
    nodes: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]]
  ): Canvas = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  @scala.inline
  implicit class CanvasOps[Self <: Canvas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdges(
      value: StringDictionary[
          js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */ js.Any, Unit]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

