package typingsSlinky.stylelint.mod

import typingsSlinky.stylelint.anon.PartialConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinterOptions extends js.Object {
  var cache: Boolean = js.native
  var cacheLocation: String = js.native
  var code: String = js.native
  var codeFilename: String = js.native
  var config: PartialConfiguration = js.native
  var configBasedir: String = js.native
  var configFile: String = js.native
  var configOverrides: PartialConfiguration = js.native
  var customSyntax: String = js.native
  var disableDefaultIgnores: Boolean = js.native
  var files: String | js.Array[String] = js.native
  var fix: Boolean = js.native
  var formatter: FormatterType = js.native
  var ignoreDisables: Boolean = js.native
  var ignorePath: String = js.native
  var maxWarnings: Double = js.native
  var reportNeedlessDisables: Boolean = js.native
  var syntax: SyntaxType = js.native
}

object LinterOptions {
  @scala.inline
  def apply(
    cache: Boolean,
    cacheLocation: String,
    code: String,
    codeFilename: String,
    config: PartialConfiguration,
    configBasedir: String,
    configFile: String,
    configOverrides: PartialConfiguration,
    customSyntax: String,
    disableDefaultIgnores: Boolean,
    files: String | js.Array[String],
    fix: Boolean,
    formatter: FormatterType,
    ignoreDisables: Boolean,
    ignorePath: String,
    maxWarnings: Double,
    reportNeedlessDisables: Boolean,
    syntax: SyntaxType
  ): LinterOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], cacheLocation = cacheLocation.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], codeFilename = codeFilename.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configBasedir = configBasedir.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], configOverrides = configOverrides.asInstanceOf[js.Any], customSyntax = customSyntax.asInstanceOf[js.Any], disableDefaultIgnores = disableDefaultIgnores.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], ignoreDisables = ignoreDisables.asInstanceOf[js.Any], ignorePath = ignorePath.asInstanceOf[js.Any], maxWarnings = maxWarnings.asInstanceOf[js.Any], reportNeedlessDisables = reportNeedlessDisables.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinterOptions]
  }
  @scala.inline
  implicit class LinterOptionsOps[Self <: LinterOptions] (val x: Self) extends AnyVal {
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
    def withCacheLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: PartialConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigBasedir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configBasedir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigOverrides(value: PartialConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomSyntax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSyntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableDefaultIgnores(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDefaultIgnores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(value.asInstanceOf[js.Any])
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
    def withIgnoreDisables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDisables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnorePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxWarnings(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportNeedlessDisables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportNeedlessDisables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyntax(value: SyntaxType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

