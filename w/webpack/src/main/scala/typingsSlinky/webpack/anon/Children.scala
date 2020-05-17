package typingsSlinky.webpack.anon

import typingsSlinky.std.Record
import typingsSlinky.webpack.mod.Stats.FnModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var children: js.Array[Double] = js.native
  var childrenByOrder: Record[String, js.Array[Double]] = js.native
  var entry: Boolean = js.native
  var files: js.Array[String] = js.native
  var filteredModules: js.UndefOr[Double] = js.native
  var hash: js.UndefOr[String] = js.native
  var id: Double | String = js.native
  var initial: Boolean = js.native
  var modules: js.UndefOr[js.Array[FnModules]] = js.native
  var names: js.Array[String] = js.native
  var origins: js.UndefOr[js.Array[Loc]] = js.native
  var parents: js.Array[Double] = js.native
  var reason: js.UndefOr[String] = js.native
  var recorded: js.UndefOr[Boolean] = js.native
  var rendered: Boolean = js.native
  var siblings: js.Array[Double] = js.native
  var size: Double = js.native
}

object Children {
  @scala.inline
  def apply(
    children: js.Array[Double],
    childrenByOrder: Record[String, js.Array[Double]],
    entry: Boolean,
    files: js.Array[String],
    id: Double | String,
    initial: Boolean,
    names: js.Array[String],
    parents: js.Array[Double],
    rendered: Boolean,
    siblings: js.Array[Double],
    size: Double
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], childrenByOrder = childrenByOrder.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], siblings = siblings.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenByOrder(value: Record[String, js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenByOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParents(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiblings(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilteredModules(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredModules")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: js.Array[FnModules]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigins(value: js.Array[Loc]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withRecorded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecorded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorded")(js.undefined)
        ret
    }
  }
  
}

