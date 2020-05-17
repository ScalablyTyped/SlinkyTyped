package typingsSlinky.webrtc

import typingsSlinky.webrtc.W3C.ConstrainBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstrainBooleanParameters extends ConstrainBoolean {
  var exact: js.UndefOr[Boolean] = js.native
  var ideal: js.UndefOr[Boolean] = js.native
}

object ConstrainBooleanParameters {
  @scala.inline
  def apply(): ConstrainBooleanParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainBooleanParameters]
  }
  @scala.inline
  implicit class ConstrainBooleanParametersOps[Self <: ConstrainBooleanParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExact(value: Boolean): Self = {
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
    def withIdeal(value: Boolean): Self = {
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

