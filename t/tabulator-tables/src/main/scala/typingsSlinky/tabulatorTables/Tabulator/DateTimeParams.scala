package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeParams extends _FormatterParams {
  // datetime
  var inputFormat: js.UndefOr[String] = js.native
  var invalidPlaceholder: js.UndefOr[`true` | String | Double | ValueStringCallback] = js.native
  var outputFormat: js.UndefOr[String] = js.native
}

object DateTimeParams {
  @scala.inline
  def apply(): DateTimeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeParams]
  }
  @scala.inline
  implicit class DateTimeParamsOps[Self <: DateTimeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidPlaceholderFunction1(value: /* value */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidPlaceholder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInvalidPlaceholder(value: `true` | String | Double | ValueStringCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(js.undefined)
        ret
    }
  }
  
}

