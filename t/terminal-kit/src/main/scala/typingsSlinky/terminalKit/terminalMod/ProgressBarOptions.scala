package typingsSlinky.terminalKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressBarOptions extends js.Object {
  var barBracketStyle: js.UndefOr[CTerminal] = js.native
  var barChar: js.UndefOr[String] = js.native
  var barHeadChar: js.UndefOr[String] = js.native
  var barStyle: js.UndefOr[CTerminal] = js.native
  var eta: js.UndefOr[Boolean] = js.native
  var etaStyle: js.UndefOr[CTerminal] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var itemSize: js.UndefOr[Double] = js.native
  var itemStyle: js.UndefOr[CTerminal] = js.native
  var items: js.UndefOr[Double] = js.native
  var maxRefreshTime: js.UndefOr[Double] = js.native
  var minRefreshTime: js.UndefOr[Double] = js.native
  var percent: js.UndefOr[Boolean] = js.native
  var percentStyle: js.UndefOr[CTerminal] = js.native
  var syncMode: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var titleSize: js.UndefOr[Double] = js.native
  var titleStyle: js.UndefOr[CTerminal] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ProgressBarOptions {
  @scala.inline
  def apply(): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarOptions]
  }
  @scala.inline
  implicit class ProgressBarOptionsOps[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarBracketStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBracketStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarBracketStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBracketStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBarChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barChar")(js.undefined)
        ret
    }
    @scala.inline
    def withBarHeadChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barHeadChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarHeadChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barHeadChar")(js.undefined)
        ret
    }
    @scala.inline
    def withBarStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eta")(js.undefined)
        ret
    }
    @scala.inline
    def withEtaStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etaStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtaStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etaStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSize")(js.undefined)
        ret
    }
    @scala.inline
    def withItemStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRefreshTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRefreshTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRefreshTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRefreshTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRefreshTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRefreshTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRefreshTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRefreshTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPercent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
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
    @scala.inline
    def withTitleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

