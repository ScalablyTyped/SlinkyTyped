package typingsSlinky.sharp.mod

import typingsSlinky.sharp.anon.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailableFormatInfo extends js.Object {
  var id: String = js.native
  var input: Buffer = js.native
  var output: Buffer = js.native
}

object AvailableFormatInfo {
  @scala.inline
  def apply(id: String, input: Buffer, output: Buffer): AvailableFormatInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableFormatInfo]
  }
  @scala.inline
  implicit class AvailableFormatInfoOps[Self <: AvailableFormatInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

