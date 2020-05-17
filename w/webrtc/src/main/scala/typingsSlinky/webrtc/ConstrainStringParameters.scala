package typingsSlinky.webrtc

import typingsSlinky.webrtc.W3C.ConstrainString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstrainStringParameters extends ConstrainString {
  var exact: js.UndefOr[String | js.Array[String]] = js.native
  var ideal: js.UndefOr[String | js.Array[String]] = js.native
}

object ConstrainStringParameters {
  @scala.inline
  def apply(): ConstrainStringParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainStringParameters]
  }
  @scala.inline
  implicit class ConstrainStringParametersOps[Self <: ConstrainStringParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExact(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(js.undefined)
        ret
    }
    @scala.inline
    def withIdeal(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdeal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(js.undefined)
        ret
    }
  }
  
}

