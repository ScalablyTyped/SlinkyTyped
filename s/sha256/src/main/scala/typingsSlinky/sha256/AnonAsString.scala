package typingsSlinky.sha256

import typingsSlinky.sha256.sha256Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsString extends js.Object {
  var asString: `true` = js.native
}

object AnonAsString {
  @scala.inline
  def apply(asString: `true`): AnonAsString = {
    val __obj = js.Dynamic.literal(asString = asString.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsString]
  }
  @scala.inline
  implicit class AnonAsStringOps[Self <: AnonAsString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsString(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asString")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

