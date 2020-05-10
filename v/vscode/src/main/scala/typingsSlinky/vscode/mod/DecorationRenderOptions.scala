package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorationRenderOptions extends ThemableDecorationRenderOptions {
  /**
  		 * Overwrite options for dark themes.
  		 */
  var dark: js.UndefOr[ThemableDecorationRenderOptions] = js.native
  /**
  		 * Should the decoration be rendered also on the whitespace after the line text.
  		 * Defaults to `false`.
  		 */
  var isWholeLine: js.UndefOr[Boolean] = js.native
  /**
  		 * Overwrite options for light themes.
  		 */
  var light: js.UndefOr[ThemableDecorationRenderOptions] = js.native
  /**
  		 * The position in the overview ruler where the decoration should be rendered.
  		 */
  var overviewRulerLane: js.UndefOr[OverviewRulerLane] = js.native
  /**
  		 * Customize the growing behavior of the decoration when edits occur at the edges of the decoration's range.
  		 * Defaults to `DecorationRangeBehavior.OpenOpen`.
  		 */
  var rangeBehavior: js.UndefOr[DecorationRangeBehavior] = js.native
}

object DecorationRenderOptions {
  @scala.inline
  def apply(): DecorationRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationRenderOptions]
  }
  @scala.inline
  implicit class DecorationRenderOptionsOps[Self <: DecorationRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDark(value: ThemableDecorationRenderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWholeLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWholeLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWholeLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWholeLine")(js.undefined)
        ret
    }
    @scala.inline
    def withLight(value: ThemableDecorationRenderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(js.undefined)
        ret
    }
    @scala.inline
    def withOverviewRulerLane(value: OverviewRulerLane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerLane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverviewRulerLane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerLane")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeBehavior(value: DecorationRangeBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeBehavior")(js.undefined)
        ret
    }
  }
  
}

