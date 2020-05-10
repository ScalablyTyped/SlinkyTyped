package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIgnoreConstraints extends js.Object {
  var ignoreConstraints: Double = js.native
  var includeAll: Double = js.native
  var includeChildren: Double = js.native
  var includeSelf: Double = js.native
  var includeSubTree: Double = js.native
  var none: Double = js.native
}

object AnonIgnoreConstraints {
  @scala.inline
  def apply(
    ignoreConstraints: Double,
    includeAll: Double,
    includeChildren: Double,
    includeSelf: Double,
    includeSubTree: Double,
    none: Double
  ): AnonIgnoreConstraints = {
    val __obj = js.Dynamic.literal(ignoreConstraints = ignoreConstraints.asInstanceOf[js.Any], includeAll = includeAll.asInstanceOf[js.Any], includeChildren = includeChildren.asInstanceOf[js.Any], includeSelf = includeSelf.asInstanceOf[js.Any], includeSubTree = includeSubTree.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreConstraints]
  }
  @scala.inline
  implicit class AnonIgnoreConstraintsOps[Self <: AnonIgnoreConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreConstraints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeAll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeChildren(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeSelf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeSubTree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSubTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

