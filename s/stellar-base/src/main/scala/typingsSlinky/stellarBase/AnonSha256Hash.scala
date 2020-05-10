package typingsSlinky.stellarBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSha256Hash extends js.Object {
  var sha256Hash: js.Any = js.native
}

object AnonSha256Hash {
  @scala.inline
  def apply(sha256Hash: js.Any): AnonSha256Hash = {
    val __obj = js.Dynamic.literal(sha256Hash = sha256Hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSha256Hash]
  }
  @scala.inline
  implicit class AnonSha256HashOps[Self <: AnonSha256Hash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSha256Hash(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256Hash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

