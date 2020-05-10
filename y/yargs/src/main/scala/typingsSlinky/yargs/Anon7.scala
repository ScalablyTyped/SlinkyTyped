package typingsSlinky.yargs

import typingsSlinky.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon7 extends js.Object {
  var normalize: `true` = js.native
}

object Anon7 {
  @scala.inline
  def apply(normalize: `true`): Anon7 = {
    val __obj = js.Dynamic.literal(normalize = normalize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon7]
  }
  @scala.inline
  implicit class Anon7Ops[Self <: Anon7] (val x: Self) extends AnyVal {
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

