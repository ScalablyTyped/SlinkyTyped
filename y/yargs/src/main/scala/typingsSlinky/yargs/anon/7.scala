package typingsSlinky.yargs.anon

import typingsSlinky.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `7` extends js.Object {
  var normalize: `true` = js.native
}

object `7` {
  @scala.inline
  def apply(normalize: `true`): `7` = {
    val __obj = js.Dynamic.literal(normalize = normalize.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  @scala.inline
  implicit class `7Ops`[Self <: `7`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalize(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

