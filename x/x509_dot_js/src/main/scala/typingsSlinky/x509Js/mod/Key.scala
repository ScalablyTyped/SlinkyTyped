package typingsSlinky.x509Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  var publicExponent: String = js.native
  var publicModulus: String = js.native
}

object Key {
  @scala.inline
  def apply(publicExponent: String, publicModulus: String): Key = {
    val __obj = js.Dynamic.literal(publicExponent = publicExponent.asInstanceOf[js.Any], publicModulus = publicModulus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublicExponent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicExponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicModulus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicModulus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

