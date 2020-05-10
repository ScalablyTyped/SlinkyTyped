package typingsSlinky.signale.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignaleConfig extends js.Object {
  /** Display the badge of the logger. */
  var displayBadge: js.UndefOr[Boolean] = js.native
  /** Display the current local date in `YYYY-MM-DD` format. */
  var displayDate: js.UndefOr[Boolean] = js.native
  /** Display the name of the file that the logger is reporting from. */
  var displayFilename: js.UndefOr[Boolean] = js.native
  /** Display the label of the logger. */
  var displayLabel: js.UndefOr[Boolean] = js.native
  /** Display the scope name of the logger. */
  var displayScope: js.UndefOr[Boolean] = js.native
  /** Display the current local time in `HH:MM:SS` format. */
  var displayTimestamp: js.UndefOr[Boolean] = js.native
  /** Underline the logger label. */
  var underlineLabel: js.UndefOr[Boolean] = js.native
  /** Underline the logger message. */
  var underlineMessage: js.UndefOr[Boolean] = js.native
  var underlinePrefix: js.UndefOr[Boolean] = js.native
  var underlineSuffix: js.UndefOr[Boolean] = js.native
  var uppercaseLabel: js.UndefOr[Boolean] = js.native
}

object SignaleConfig {
  @scala.inline
  def apply(): SignaleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignaleConfig]
  }
  @scala.inline
  implicit class SignaleConfigOps[Self <: SignaleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayBadge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayBadge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayBadge")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayFilename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayScope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayScope")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayTimestamp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlinePrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlinePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlinePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlinePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineSuffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withUppercaseLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercaseLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUppercaseLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercaseLabel")(js.undefined)
        ret
    }
  }
  
}

