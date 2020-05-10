package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceControlResourceDecorations extends SourceControlResourceThemableDecorations {
  /**
  		 * The dark theme decorations.
  		 */
  val dark: js.UndefOr[SourceControlResourceThemableDecorations] = js.native
  /**
  		 * Whether the [source control resource state](#SourceControlResourceState) should
  		 * be faded in the UI.
  		 */
  val faded: js.UndefOr[Boolean] = js.native
  /**
  		 * The light theme decorations.
  		 */
  val light: js.UndefOr[SourceControlResourceThemableDecorations] = js.native
  /**
  		 * Whether the [source control resource state](#SourceControlResourceState) should
  		 * be striked-through in the UI.
  		 */
  val strikeThrough: js.UndefOr[Boolean] = js.native
  /**
  		 * The title for a specific
  		 * [source control resource state](#SourceControlResourceState).
  		 */
  val tooltip: js.UndefOr[String] = js.native
}

object SourceControlResourceDecorations {
  @scala.inline
  def apply(): SourceControlResourceDecorations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceControlResourceDecorations]
  }
  @scala.inline
  implicit class SourceControlResourceDecorationsOps[Self <: SourceControlResourceDecorations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDark(value: SourceControlResourceThemableDecorations): Self = {
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
    def withFaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faded")(js.undefined)
        ret
    }
    @scala.inline
    def withLight(value: SourceControlResourceThemableDecorations): Self = {
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
    def withStrikeThrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikeThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrikeThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikeThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

