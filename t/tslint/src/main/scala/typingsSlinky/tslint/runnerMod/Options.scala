package typingsSlinky.tslint.runnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Path to a configuration file.
    */
  var config: js.UndefOr[String] = js.native
  /**
    * Exclude globs from path expansion.
    */
  var exclude: js.Array[String] = js.native
  /**
    * File paths to lint.
    */
  var files: js.Array[String] = js.native
  /**
    * Whether to fixes linting errors for select rules. This may overwrite linted files.
    */
  var fix: js.UndefOr[Boolean] = js.native
  /**
    * Whether to return status code 0 even if there are lint errors.
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * Output format.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Formatters directory path.
    */
  var formattersDirectory: js.UndefOr[String] = js.native
  /**
    * Whether to generate a tslint.json config file in the current working directory.
    */
  var init: js.UndefOr[Boolean] = js.native
  /**
    * Output file path.
    */
  var out: js.UndefOr[String] = js.native
  /**
    * Whether to output absolute paths
    */
  var outputAbsolutePaths: js.UndefOr[Boolean] = js.native
  /**
    * Outputs the configuration to be used instead of linting.
    */
  var printConfig: js.UndefOr[Boolean] = js.native
  /**
    * tsconfig.json file.
    */
  var project: js.UndefOr[String] = js.native
  /**
    * Whether to hide warnings
    */
  var quiet: js.UndefOr[Boolean] = js.native
  /**
    * Rules directory paths.
    */
  var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Run the tests in the given directories to ensure a (custom) TSLint rule's output matches the expected output.
    * When this property is `true` the `files` property is used to specify the directories from which the tests should be executed.
    */
  var test: js.UndefOr[Boolean] = js.native
  /**
    * Whether to enable type checking when linting a project.
    */
  var typeCheck: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(exclude: js.Array[String], files: js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: String): Self = {
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
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
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
    def withInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputAbsolutePaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAbsolutePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputAbsolutePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAbsolutePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
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
    @scala.inline
    def withTest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCheck")(js.undefined)
        ret
    }
  }
  
}

