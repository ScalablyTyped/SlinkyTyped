package typingsSlinky.vegaTypings.legendMod

import typingsSlinky.vegaTypings.encodeMod.GroupEncodeEntry
import typingsSlinky.vegaTypings.encodeMod.RectEncodeEntry
import typingsSlinky.vegaTypings.encodeMod.SymbolEncodeEntry
import typingsSlinky.vegaTypings.encodeMod.TextEncodeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendEncode extends js.Object {
  var entries: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.native
  var gradient: js.UndefOr[GuideEncodeEntry[RectEncodeEntry]] = js.native
  var labels: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.native
  var legend: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.native
  var symbols: js.UndefOr[GuideEncodeEntry[SymbolEncodeEntry]] = js.native
  var title: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.native
}

object LegendEncode {
  @scala.inline
  def apply(): LegendEncode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendEncode]
  }
  @scala.inline
  implicit class LegendEncodeOps[Self <: LegendEncode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: GuideEncodeEntry[GroupEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.undefined)
        ret
    }
    @scala.inline
    def withGradient(value: GuideEncodeEntry[RectEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: GuideEncodeEntry[TextEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: GuideEncodeEntry[GroupEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbols(value: GuideEncodeEntry[SymbolEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: GuideEncodeEntry[TextEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

