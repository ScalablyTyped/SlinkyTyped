package typingsSlinky.standardEngine.mod

import typingsSlinky.standardEngine.Typeofeslint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinterOptions extends js.Object {
  var bugs: js.UndefOr[String] = js.native
  var cmd: String = js.native
  /** @default process.cwd() */
  var cwd: js.UndefOr[String] = js.native
  var eslint: Typeofeslint = js.native
  var eslintConfig: js.UndefOr[ESLintConfig] = js.native
  var homepage: js.UndefOr[String] = js.native
  /**
    * This function is called with the current options object (opts),
    * any options extracted from the project's package.json (packageOpts),
    * and the directory that contained that package.json file
    * (rootDir, equivalent to opts.cwd if no file was found).
    * Modify and return opts, or return a new object with the options that are to be used.
    */
  var parseOpts: js.UndefOr[
    js.Function3[/* opts */ ParseOptions, /* packageOpts */ js.Any, /* rootDir */ String, ParseOptions]
  ] = js.native
  var tagline: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object LinterOptions {
  @scala.inline
  def apply(cmd: String, eslint: Typeofeslint): LinterOptions = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], eslint = eslint.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinterOptions]
  }
  @scala.inline
  implicit class LinterOptionsOps[Self <: LinterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEslint(value: Typeofeslint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBugs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bugs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBugs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bugs")(js.undefined)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withEslintConfig(value: ESLintConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslintConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEslintConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslintConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withHomepage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomepage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage")(js.undefined)
        ret
    }
    @scala.inline
    def withParseOpts(value: (/* opts */ ParseOptions, /* packageOpts */ js.Any, /* rootDir */ String) => ParseOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOpts")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutParseOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withTagline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagline")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

