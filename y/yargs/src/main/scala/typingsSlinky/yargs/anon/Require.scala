package typingsSlinky.yargs.anon

import typingsSlinky.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Require extends js.Object {
  var require: java.lang.String | `true` = js.native
}

object Require {
  @scala.inline
  def apply(require: java.lang.String | `true`): Require = {
    val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
    __obj.asInstanceOf[Require]
  }
  @scala.inline
  implicit class RequireOps[Self <: Require] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequire(value: java.lang.String | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

