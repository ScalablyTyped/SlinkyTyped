package typingsSlinky.slug

import typingsSlinky.slug.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPretty extends js.Object {
  var pretty: Mode = js.native
  var rfc3986: Mode = js.native
}

object AnonPretty {
  @scala.inline
  def apply(pretty: Mode, rfc3986: Mode): AnonPretty = {
    val __obj = js.Dynamic.literal(pretty = pretty.asInstanceOf[js.Any], rfc3986 = rfc3986.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPretty]
  }
  @scala.inline
  implicit class AnonPrettyOps[Self <: AnonPretty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPretty(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRfc3986(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rfc3986")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

