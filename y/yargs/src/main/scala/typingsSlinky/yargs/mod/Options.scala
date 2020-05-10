package typingsSlinky.yargs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.yargs.yargsStrings.array
import typingsSlinky.yargs.yargsStrings.count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** string or array of strings, alias(es) for the canonical option key, see `alias()` */
  var alias: js.UndefOr[String | js.Array[String]] = js.native
  /** boolean, interpret option as an array, see `array()` */
  var array: js.UndefOr[Boolean] = js.native
  /**  boolean, interpret option as a boolean flag, see `boolean()` */
  var boolean: js.UndefOr[Boolean] = js.native
  /** value or array of values, limit valid option arguments to a predefined set, see `choices()` */
  var choices: js.UndefOr[Choices] = js.native
  /** function, coerce or transform parsed command line values into another value, see `coerce()` */
  var coerce: js.UndefOr[js.Function1[/* arg */ js.Any, _]] = js.native
  /** boolean, interpret option as a path to a JSON config file, see `config()` */
  var config: js.UndefOr[Boolean] = js.native
  /** function, provide a custom config parsing function, see `config()` */
  var configParser: js.UndefOr[js.Function1[/* configPath */ String, js.Object]] = js.native
  /** string or object, require certain keys not to be set, see `conflicts()` */
  var conflicts: js.UndefOr[String | js.Array[String] | (StringDictionary[String | js.Array[String]])] = js.native
  /** boolean, interpret option as a count of boolean flags, see `count()` */
  var count: js.UndefOr[Boolean] = js.native
  /** value, set a default value for the option, see `default()` */
  var default: js.UndefOr[js.Any] = js.native
  /** string, use this description for the default value in help content, see `default()` */
  var defaultDescription: js.UndefOr[String] = js.native
  /**
    *  @deprecated since version 6.6.0
    *  Use 'demandOption' instead
    */
  var demand: js.UndefOr[Boolean | String] = js.native
  /** boolean or string, demand the option be given, with optional error message, see `demandOption()` */
  var demandOption: js.UndefOr[Boolean | String] = js.native
  /** string, the option description for help content, see `describe()` */
  var desc: js.UndefOr[String] = js.native
  /** string, the option description for help content, see `describe()` */
  var describe: js.UndefOr[String] = js.native
  /** string, the option description for help content, see `describe()` */
  var description: js.UndefOr[String] = js.native
  /** boolean, indicate that this key should not be reset when a command is invoked, see `global()` */
  var global: js.UndefOr[Boolean] = js.native
  /** string, when displaying usage instructions place the option under an alternative group heading, see `group()` */
  var group: js.UndefOr[String] = js.native
  /** don't display option in help output. */
  var hidden: js.UndefOr[Boolean] = js.native
  /**  string or object, require certain keys to be set, see `implies()` */
  var implies: js.UndefOr[String | js.Array[String] | (StringDictionary[String | js.Array[String]])] = js.native
  /** number, specify how many arguments should be consumed for the option, see `nargs()` */
  var nargs: js.UndefOr[Double] = js.native
  /** boolean, apply path.normalize() to the option, see `normalize()` */
  var normalize: js.UndefOr[Boolean] = js.native
  /** boolean, interpret option as a number, `number()` */
  var number: js.UndefOr[Boolean] = js.native
  /**
    *  @deprecated since version 6.6.0
    *  Use 'demandOption' instead
    */
  var require: js.UndefOr[Boolean | String] = js.native
  /**
    *  @deprecated since version 6.6.0
    *  Use 'demandOption' instead
    */
  var required: js.UndefOr[Boolean | String] = js.native
  /** boolean, require the option be specified with a value, see `requiresArg()` */
  var requiresArg: js.UndefOr[Boolean] = js.native
  /** boolean, skips validation if the option is present, see `skipValidation()` */
  var skipValidation: js.UndefOr[Boolean] = js.native
  /** boolean, interpret option as a string, see `string()` */
  var string: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[array | count | PositionalOptionsType] = js.native
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
    def withAlias(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(js.undefined)
        ret
    }
    @scala.inline
    def withBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.undefined)
        ret
    }
    @scala.inline
    def withChoices(value: Choices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChoices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(js.undefined)
        ret
    }
    @scala.inline
    def withCoerce(value: /* arg */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCoerce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: Boolean): Self = {
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
    def withConfigParser(value: /* configPath */ String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configParser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConfigParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configParser")(js.undefined)
        ret
    }
    @scala.inline
    def withConflicts(value: String | js.Array[String] | (StringDictionary[String | js.Array[String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflicts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withDemand(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDemand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demand")(js.undefined)
        ret
    }
    @scala.inline
    def withDemandOption(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demandOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDemandOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demandOption")(js.undefined)
        ret
    }
    @scala.inline
    def withDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
        ret
    }
    @scala.inline
    def withDescribe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describe")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withImplies(value: String | js.Array[String] | (StringDictionary[String | js.Array[String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implies")(js.undefined)
        ret
    }
    @scala.inline
    def withNargs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nargs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNargs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nargs")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiresArg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresArg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresArg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresArg")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: array | count | PositionalOptionsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

