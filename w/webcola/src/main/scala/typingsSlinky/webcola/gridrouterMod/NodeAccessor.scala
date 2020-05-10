package typingsSlinky.webcola.gridrouterMod

import typingsSlinky.webcola.rectangleMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeAccessor[Node] extends js.Object {
  def getBounds(v: Node): Rectangle = js.native
  def getChildren(v: Node): js.Array[Double] = js.native
}

object NodeAccessor {
  @scala.inline
  def apply[Node](getBounds: Node => Rectangle, getChildren: Node => js.Array[Double]): NodeAccessor[Node] = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction1(getBounds), getChildren = js.Any.fromFunction1(getChildren))
    __obj.asInstanceOf[NodeAccessor[Node]]
  }
  @scala.inline
  implicit class NodeAccessorOps[Self[node] <: NodeAccessor[node], Node] (val x: Self[Node]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Node] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Node]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Node] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Node] with Other]
    @scala.inline
    def withGetBounds(value: Node => Rectangle): Self[Node] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBounds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChildren(value: Node => js.Array[Double]): Self[Node] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildren")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

