package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreConstraints extends js.Object {
  var ignoreConstraints: scala.Double = js.native
  var includeAll: scala.Double = js.native
  var includeChildren: scala.Double = js.native
  var includeSelf: scala.Double = js.native
  var includeSubTree: scala.Double = js.native
  var none: scala.Double = js.native
}

object IgnoreConstraints {
  @scala.inline
  def apply(
    ignoreConstraints: scala.Double,
    includeAll: scala.Double,
    includeChildren: scala.Double,
    includeSelf: scala.Double,
    includeSubTree: scala.Double,
    none: scala.Double
  ): IgnoreConstraints = {
    val __obj = js.Dynamic.literal(ignoreConstraints = ignoreConstraints.asInstanceOf[js.Any], includeAll = includeAll.asInstanceOf[js.Any], includeChildren = includeChildren.asInstanceOf[js.Any], includeSelf = includeSelf.asInstanceOf[js.Any], includeSubTree = includeSubTree.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreConstraints]
  }
  @scala.inline
  implicit class IgnoreConstraintsOps[Self <: IgnoreConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreConstraints(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeAll(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeChildren(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeSelf(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeSubTree(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSubTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

