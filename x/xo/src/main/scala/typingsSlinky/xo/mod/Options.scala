package typingsSlinky.xo.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.eslint.mod.Linter.RuleLevel
import typingsSlinky.eslint.mod.Linter.RuleLevelAndOptions
import typingsSlinky.xo.xoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  esnext ? :boolean,   ignores ? :std.Array<string>,   nodeVersion ? :string | boolean,   prettier ? :boolean,   semicolon ? :boolean,   space ? :number | string,   webpack ? :boolean | object} & xo.xo.CLIEngineOptions & xo.xo.ESLintConfig & xo.xo.ESLintOptions */
@js.native
trait Options extends js.Object {
  var baseConfig: js.UndefOr[`false` | StringDictionary[js.Any]] = js.native
  var cwd: js.UndefOr[String] = js.native
  var envs: js.UndefOr[js.Array[String]] = js.native
  /** Enforce ES2015+ rules. Disabling this will make it not enforce ES2015+ syntax and conventions */
  var esnext: js.UndefOr[Boolean] = js.native
  var `extends`: js.UndefOr[String | js.Array[String]] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var filename: js.UndefOr[String] = js.native
  var fix: js.UndefOr[Boolean] = js.native
  var globals: js.UndefOr[js.Array[String]] = js.native
  var ignore: js.UndefOr[Boolean] = js.native
  /** Some paths are ignored by default, including paths in .gitignore and .eslintignore. Additional ignores can be added here */
  var ignores: js.UndefOr[js.Array[String]] = js.native
  /** Enable rules specific to the Node.js versions within the configured range */
  var nodeVersion: js.UndefOr[String | Boolean] = js.native
  var parser: js.UndefOr[String] = js.native
  var plugins: js.UndefOr[js.Array[String]] = js.native
  /** Format code with Prettier */
  var prettier: js.UndefOr[Boolean] = js.native
  var rules: js.UndefOr[StringDictionary[RuleLevel | RuleLevelAndOptions]] = js.native
  /** Set it to false to enforce no-semicolon style. */
  var semicolon: js.UndefOr[Boolean] = js.native
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.native
  /** Set it to true to get 2-space indentation or specify the number of spaces. */
  var space: js.UndefOr[Double | String] = js.native
  /**
    * Use {@link https://github.com/benmosher/eslint-plugin-import/tree/master/resolvers/webpack}
    * to resolve import search paths. This is enabled automatically if a `webpack.config.js` file is found.
    * Set this to a boolean to explicitly enable or disable the resolver.
    * @default false
    */
  var webpack: js.UndefOr[Boolean | js.Object] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseConfig(value: `false` | StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseConfig")(js.undefined)
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
    def withEnvs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envs")(js.undefined)
        ret
    }
    @scala.inline
    def withEsnext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esnext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEsnext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esnext")(js.undefined)
        ret
    }
    @scala.inline
    def withExtends(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
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
    def withGlobals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnores(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignores")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeVersion(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withParser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettier(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettier")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: StringDictionary[RuleLevel | RuleLevelAndOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withSemicolon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemicolon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolon")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
    @scala.inline
    def withWebpack(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebpack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpack")(js.undefined)
        ret
    }
  }
  
}

