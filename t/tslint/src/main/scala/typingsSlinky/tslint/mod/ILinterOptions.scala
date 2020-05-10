package typingsSlinky.tslint.mod

import typingsSlinky.tslint.formatterMod.FormatterConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILinterOptions extends js.Object {
  var fix: Boolean = js.native
  var formatter: js.UndefOr[String | FormatterConstructor] = js.native
  var formattersDirectory: js.UndefOr[String] = js.native
  var quiet: js.UndefOr[Boolean] = js.native
  var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.native
}

object ILinterOptions {
  @scala.inline
  def apply(fix: Boolean): ILinterOptions = {
    val __obj = js.Dynamic.literal(fix = fix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinterOptions]
  }
  @scala.inline
  implicit class ILinterOptionsOps[Self <: ILinterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatter(value: String | FormatterConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattersDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattersDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattersDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattersDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withQuiet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuiet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(js.undefined)
        ret
    }
    @scala.inline
    def withRulesDirectory(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulesDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesDirectory")(js.undefined)
        ret
    }
  }
  
}

