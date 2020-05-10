package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanoramaGraphEdge extends js.Object {
  def getEndNodes(): js.Array[IPanoramaGraphNode] = js.native
}

object IPanoramaGraphEdge {
  @scala.inline
  def apply(getEndNodes: () => js.Array[IPanoramaGraphNode]): IPanoramaGraphEdge = {
    val __obj = js.Dynamic.literal(getEndNodes = js.Any.fromFunction0(getEndNodes))
    __obj.asInstanceOf[IPanoramaGraphEdge]
  }
  @scala.inline
  implicit class IPanoramaGraphEdgeOps[Self <: IPanoramaGraphEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEndNodes(value: () => js.Array[IPanoramaGraphNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndNodes")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

