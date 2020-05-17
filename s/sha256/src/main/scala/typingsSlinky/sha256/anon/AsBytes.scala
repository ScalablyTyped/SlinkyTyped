package typingsSlinky.sha256.anon

import typingsSlinky.sha256.sha256Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsBytes extends js.Object {
  var asBytes: `true` = js.native
}

object AsBytes {
  @scala.inline
  def apply(asBytes: `true`): AsBytes = {
    val __obj = js.Dynamic.literal(asBytes = asBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsBytes]
  }
  @scala.inline
  implicit class AsBytesOps[Self <: AsBytes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsBytes(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

