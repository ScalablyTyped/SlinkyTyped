package typingsSlinky.yargs

import typingsSlinky.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArrayNormalize extends js.Object {
  var array: `true` = js.native
  var normalize: `true` = js.native
}

object AnonArrayNormalize {
  @scala.inline
  def apply(array: `true`, normalize: `true`): AnonArrayNormalize = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], normalize = normalize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrayNormalize]
  }
  @scala.inline
  implicit class AnonArrayNormalizeOps[Self <: AnonArrayNormalize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalize(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

