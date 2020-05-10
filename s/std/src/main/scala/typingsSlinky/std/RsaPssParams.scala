package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RsaPssParams extends Algorithm {
  var saltLength: Double = js.native
}

object RsaPssParams {
  @scala.inline
  def apply(name: java.lang.String, saltLength: Double): RsaPssParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPssParams]
  }
  @scala.inline
  implicit class RsaPssParamsOps[Self <: org.scalajs.dom.crypto.RsaPssParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSaltLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

