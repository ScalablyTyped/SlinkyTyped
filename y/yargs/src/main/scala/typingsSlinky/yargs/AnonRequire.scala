package typingsSlinky.yargs

import typingsSlinky.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRequire extends js.Object {
  var require: String | `true` = js.native
}

object AnonRequire {
  @scala.inline
  def apply(require: String | `true`): AnonRequire = {
    val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequire]
  }
  @scala.inline
  implicit class AnonRequireOps[Self <: AnonRequire] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequire(value: String | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

