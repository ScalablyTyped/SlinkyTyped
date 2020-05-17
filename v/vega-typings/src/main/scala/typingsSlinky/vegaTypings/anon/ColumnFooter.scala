package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.layoutMod.LayoutOffset
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnFooter extends LayoutOffset {
  var columnFooter: js.UndefOr[Double | SignalRef] = js.native
  var columnHeader: js.UndefOr[Double | SignalRef] = js.native
  var columnTitle: js.UndefOr[Double | SignalRef] = js.native
  var rowFooter: js.UndefOr[Double | SignalRef] = js.native
  var rowHeader: js.UndefOr[Double | SignalRef] = js.native
  var rowTitle: js.UndefOr[Double | SignalRef] = js.native
}

object ColumnFooter {
  @scala.inline
  def apply(): ColumnFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFooter]
  }
  @scala.inline
  implicit class ColumnFooterOps[Self <: ColumnFooter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnFooter(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeader(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnTitle(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withRowFooter(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeader(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withRowTitle(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTitle")(js.undefined)
        ret
    }
  }
  
}

