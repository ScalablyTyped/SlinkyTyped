package typingsSlinky.umbraco.umbraco.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.treeResource
  * @description Loads in data for trees
  **/
@js.native
trait ITreeResource extends js.Object {
  /** Loads in the data to display the nodes for an application */
  def loadApplication(options: js.Any): Unit = js.native
  /** Loads in the data to display the nodes menu */
  def loadMenu(node: js.Any): Unit = js.native
  /** Loads in the data to display the child nodes for a given node */
  def loadNodes(options: js.Any): Unit = js.native
}

object ITreeResource {
  @scala.inline
  def apply(loadApplication: js.Any => Unit, loadMenu: js.Any => Unit, loadNodes: js.Any => Unit): ITreeResource = {
    val __obj = js.Dynamic.literal(loadApplication = js.Any.fromFunction1(loadApplication), loadMenu = js.Any.fromFunction1(loadMenu), loadNodes = js.Any.fromFunction1(loadNodes))
    __obj.asInstanceOf[ITreeResource]
  }
  @scala.inline
  implicit class ITreeResourceOps[Self <: ITreeResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadApplication(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadApplication")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadMenu(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadNodes(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadNodes")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

