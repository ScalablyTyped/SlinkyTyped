package typingsSlinky.seneca

import typingsSlinky.seneca.mod.UnknownType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActrouter extends js.Object {
  var actrouter: js.UndefOr[UnknownType] = js.native
  var clientrouter: js.UndefOr[UnknownType] = js.native
  // Close instance on these signals, if true.
  var close_signals: js.UndefOr[AnonSIGBREAK] = js.native
  var subrouter: js.UndefOr[UnknownType] = js.native
}

object AnonActrouter {
  @scala.inline
  def apply(): AnonActrouter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonActrouter]
  }
  @scala.inline
  implicit class AnonActrouterOps[Self <: AnonActrouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActrouter(value: UnknownType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actrouter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActrouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actrouter")(js.undefined)
        ret
    }
    @scala.inline
    def withClientrouter(value: UnknownType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientrouter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientrouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientrouter")(js.undefined)
        ret
    }
    @scala.inline
    def withClose_signals(value: AnonSIGBREAK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close_signals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose_signals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close_signals")(js.undefined)
        ret
    }
    @scala.inline
    def withSubrouter(value: UnknownType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subrouter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubrouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subrouter")(js.undefined)
        ret
    }
  }
  
}

