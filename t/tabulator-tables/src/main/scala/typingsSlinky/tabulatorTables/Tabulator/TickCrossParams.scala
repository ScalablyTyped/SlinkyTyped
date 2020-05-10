package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TickCrossParams extends _FormatterParams {
  // Tick Cross
  var allowEmpty: js.UndefOr[Boolean] = js.native
  var allowTruthy: js.UndefOr[Boolean] = js.native
  var crossElement: js.UndefOr[Boolean | String] = js.native
  var tickElement: js.UndefOr[Boolean | String] = js.native
}

object TickCrossParams {
  @scala.inline
  def apply(): TickCrossParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickCrossParams]
  }
  @scala.inline
  implicit class TickCrossParamsOps[Self <: TickCrossParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTruthy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTruthy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTruthy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTruthy")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossElement(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossElement")(js.undefined)
        ret
    }
    @scala.inline
    def withTickElement(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickElement")(js.undefined)
        ret
    }
  }
  
}

