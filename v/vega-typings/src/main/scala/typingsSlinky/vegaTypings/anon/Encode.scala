package typingsSlinky.vegaTypings.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encode extends js.Object {
  var encode: String = js.native
}

object Encode {
  @scala.inline
  def apply(encode: String): Encode = {
    val __obj = js.Dynamic.literal(encode = encode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encode]
  }
  @scala.inline
  implicit class EncodeOps[Self <: Encode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

