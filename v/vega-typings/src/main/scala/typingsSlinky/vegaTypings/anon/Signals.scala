package typingsSlinky.vegaTypings.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signals extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var signals: js.UndefOr[js.Any] = js.native
}

object Signals {
  @scala.inline
  def apply(): Signals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Signals]
  }
  @scala.inline
  implicit class SignalsOps[Self <: Signals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withSignals(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signals")(js.undefined)
        ret
    }
  }
  
}

