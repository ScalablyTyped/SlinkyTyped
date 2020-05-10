package typingsSlinky.seamlessImmutable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceConfig extends js.Object {
  var deep: Boolean = js.native
}

object ReplaceConfig {
  @scala.inline
  def apply(deep: Boolean): ReplaceConfig = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceConfig]
  }
  @scala.inline
  implicit class ReplaceConfigOps[Self <: ReplaceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

