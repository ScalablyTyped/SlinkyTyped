package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanoramaGraphNode extends js.Object {
  def getConnectedPanorama(): js.Promise[IPanorama] = js.native
}

object IPanoramaGraphNode {
  @scala.inline
  def apply(getConnectedPanorama: () => js.Promise[IPanorama]): IPanoramaGraphNode = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = js.Any.fromFunction0(getConnectedPanorama))
    __obj.asInstanceOf[IPanoramaGraphNode]
  }
  @scala.inline
  implicit class IPanoramaGraphNodeOps[Self <: IPanoramaGraphNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetConnectedPanorama(value: () => js.Promise[IPanorama]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectedPanorama")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

