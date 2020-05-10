package typingsSlinky.uirouterCore.viewInterfaceMod

import typingsSlinky.uirouterCore.pathNodeMod.PathNode
import typingsSlinky.uirouterCore.stateInterfaceMod.ViewDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewConfig extends js.Object {
  @JSName("$id")
  var $id: Double = js.native
  var loaded: Boolean = js.native
  /** The node the ViewConfig is bound to */
  var path: js.Array[PathNode] = js.native
  /** The normalized view declaration from [[State.views]] */
  var viewDecl: ViewDeclaration = js.native
  /** Fetches templates, runs dynamic (controller|template)Provider code, lazy loads Components, etc */
  def load(): js.Promise[ViewConfig] = js.native
}

object ViewConfig {
  @scala.inline
  def apply(
    $id: Double,
    load: () => js.Promise[ViewConfig],
    loaded: Boolean,
    path: js.Array[PathNode],
    viewDecl: ViewDeclaration
  ): ViewConfig = {
    val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loaded = loaded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], viewDecl = viewDecl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewConfig]
  }
  @scala.inline
  implicit class ViewConfigOps[Self <: ViewConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: () => js.Promise[ViewConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[PathNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewDecl(value: ViewDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDecl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

