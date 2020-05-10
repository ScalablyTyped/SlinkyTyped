package typingsSlinky.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tree State
  */
@js.native
trait ITreeState extends js.Object {
  //The currently loaded root node reference - depending on the section loaded this could be a section root or a normal root.
  //We keep this reference so we can lookup nodes to interact with in the UI via the tree service
  var currentRootNode: js.Any = js.native
  //The currently selected node
  var selectedNode: js.Any = js.native
}

object ITreeState {
  @scala.inline
  def apply(currentRootNode: js.Any, selectedNode: js.Any): ITreeState = {
    val __obj = js.Dynamic.literal(currentRootNode = currentRootNode.asInstanceOf[js.Any], selectedNode = selectedNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeState]
  }
  @scala.inline
  implicit class ITreeStateOps[Self <: ITreeState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentRootNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRootNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

