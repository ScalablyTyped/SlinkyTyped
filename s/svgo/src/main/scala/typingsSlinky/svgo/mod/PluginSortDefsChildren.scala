package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginSortDefsChildren extends PluginConfig {
  /** sort children of <defs> in order to improve compression */
  var sortDefsChildren: Boolean | js.Object = js.native
}

object PluginSortDefsChildren {
  @scala.inline
  def apply(sortDefsChildren: Boolean | js.Object): PluginSortDefsChildren = {
    val __obj = js.Dynamic.literal(sortDefsChildren = sortDefsChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSortDefsChildren]
  }
  @scala.inline
  implicit class PluginSortDefsChildrenOps[Self <: PluginSortDefsChildren] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSortDefsChildren(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDefsChildren")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

