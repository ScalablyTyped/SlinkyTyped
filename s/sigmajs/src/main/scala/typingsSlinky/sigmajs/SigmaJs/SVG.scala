package typingsSlinky.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sigmajs.anon.DictrenderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVG extends js.Object {
  var edges: DictrenderType = js.native
  var labels: StringDictionary[SVGObject[Node]] = js.native
  var nodes: StringDictionary[SVGObject[Node]] = js.native
}

object SVG {
  @scala.inline
  def apply(
    edges: DictrenderType,
    labels: StringDictionary[SVGObject[Node]],
    nodes: StringDictionary[SVGObject[Node]]
  ): SVG = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVG]
  }
  @scala.inline
  implicit class SVGOps[Self <: SVG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdges(value: DictrenderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[SVGObject[Node]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: StringDictionary[SVGObject[Node]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

