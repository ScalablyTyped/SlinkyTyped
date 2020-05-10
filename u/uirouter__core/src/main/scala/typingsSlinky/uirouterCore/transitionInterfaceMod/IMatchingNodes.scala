package typingsSlinky.uirouterCore.transitionInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uirouterCore.pathNodeMod.PathNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMatchingNodes
  extends /* key */ StringDictionary[js.Array[PathNode]] {
  var entering: js.Array[PathNode] = js.native
  var exiting: js.Array[PathNode] = js.native
  var from: js.Array[PathNode] = js.native
  var retained: js.Array[PathNode] = js.native
  var to: js.Array[PathNode] = js.native
}

object IMatchingNodes {
  @scala.inline
  def apply(
    entering: js.Array[PathNode],
    exiting: js.Array[PathNode],
    from: js.Array[PathNode],
    retained: js.Array[PathNode],
    to: js.Array[PathNode]
  ): IMatchingNodes = {
    val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], retained = retained.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMatchingNodes]
  }
  @scala.inline
  implicit class IMatchingNodesOps[Self <: IMatchingNodes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntering(value: js.Array[PathNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExiting(value: js.Array[PathNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exiting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: js.Array[PathNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetained(value: js.Array[PathNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: js.Array[PathNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

