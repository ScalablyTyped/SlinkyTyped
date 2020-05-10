package typingsSlinky.tooltipster.JQueryTooltipster

import typingsSlinky.tooltipster.AnonFixedLineage
import typingsSlinky.tooltipster.AnonScroll
import typingsSlinky.tooltipster.AnonSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipsterGeoHelper extends js.Object {
  var document: AnonSize = js.native
  var origin: AnonFixedLineage = js.native
  var window: AnonScroll = js.native
}

object ITooltipsterGeoHelper {
  @scala.inline
  def apply(document: AnonSize, origin: AnonFixedLineage, window: AnonScroll): ITooltipsterGeoHelper = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipsterGeoHelper]
  }
  @scala.inline
  implicit class ITooltipsterGeoHelperOps[Self <: ITooltipsterGeoHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: AnonSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: AnonFixedLineage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindow(value: AnonScroll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

