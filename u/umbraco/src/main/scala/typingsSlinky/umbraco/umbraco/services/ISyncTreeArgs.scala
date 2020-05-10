package typingsSlinky.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sync tree args
  */
@js.native
trait ISyncTreeArgs extends js.Object {
  /* optional, specifies whether to set the synced node to be the active node, this will default to true if not specified*/
  var activate: Boolean = js.native
  /* optional, specifies whether to force reload the node data from the server even if it already exists in the tree currently*/
  var forceReload: Boolean = js.native
  /*the path to sync the tree to*/
  var path: String = js.native
  /*the tree alias to sync to*/
  var tree: String = js.native
}

object ISyncTreeArgs {
  @scala.inline
  def apply(activate: Boolean, forceReload: Boolean, path: String, tree: String): ISyncTreeArgs = {
    val __obj = js.Dynamic.literal(activate = activate.asInstanceOf[js.Any], forceReload = forceReload.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyncTreeArgs]
  }
  @scala.inline
  implicit class ISyncTreeArgsOps[Self <: ISyncTreeArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceReload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceReload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

