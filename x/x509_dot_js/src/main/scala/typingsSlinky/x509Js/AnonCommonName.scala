package typingsSlinky.x509Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommonName extends js.Object {
  var commonName: String = js.native
}

object AnonCommonName {
  @scala.inline
  def apply(commonName: String): AnonCommonName = {
    val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommonName]
  }
  @scala.inline
  implicit class AnonCommonNameOps[Self <: AnonCommonName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

