package typingsSlinky.stylelint

import typingsSlinky.stylelint.mod.FormatterType
import typingsSlinky.stylelint.mod.LintResult
import typingsSlinky.stylelint.mod.SyntaxType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<stylelint.stylelint.LinterOptions> */
@js.native
trait PartialLinterOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var cacheLocation: js.UndefOr[String] = js.native
  var code: js.UndefOr[String] = js.native
  var codeFilename: js.UndefOr[String] = js.native
  var config: js.UndefOr[PartialConfiguration] = js.native
  var configBasedir: js.UndefOr[String] = js.native
  var configFile: js.UndefOr[String] = js.native
  var configOverrides: js.UndefOr[PartialConfiguration] = js.native
  var customSyntax: js.UndefOr[String] = js.native
  var disableDefaultIgnores: js.UndefOr[Boolean] = js.native
  var files: js.UndefOr[String | js.Array[String]] = js.native
  var fix: js.UndefOr[Boolean] = js.native
  var formatter: js.UndefOr[FormatterType] = js.native
  var ignoreDisables: js.UndefOr[Boolean] = js.native
  var ignorePath: js.UndefOr[String] = js.native
  var maxWarnings: js.UndefOr[Double] = js.native
  var reportNeedlessDisables: js.UndefOr[Boolean] = js.native
  var syntax: js.UndefOr[SyntaxType] = js.native
}

object PartialLinterOptions {
  @scala.inline
  def apply(): PartialLinterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLinterOptions]
  }
  @scala.inline
  implicit class PartialLinterOptionsOps[Self <: PartialLinterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: PartialConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigBasedir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configBasedir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigBasedir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configBasedir")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFile")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigOverrides(value: PartialConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSyntax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSyntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSyntax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSyntax")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDefaultIgnores(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDefaultIgnores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDefaultIgnores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDefaultIgnores")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withFix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterFunction1(value: /* results */ js.Array[LintResult] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatter(value: FormatterType): Self = {
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
    def withIgnoreDisables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDisables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDisables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDisables")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWarnings(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def withReportNeedlessDisables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportNeedlessDisables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportNeedlessDisables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportNeedlessDisables")(js.undefined)
        ret
    }
    @scala.inline
    def withSyntax(value: SyntaxType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyntax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(js.undefined)
        ret
    }
  }
  
}

