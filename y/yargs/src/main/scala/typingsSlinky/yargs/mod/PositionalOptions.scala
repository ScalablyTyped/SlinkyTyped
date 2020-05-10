package typingsSlinky.yargs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionalOptions extends js.Object {
  /** string or array of strings, see `alias()` */
  var alias: js.UndefOr[String | js.Array[String]] = js.native
  /** boolean, interpret option as an array, see `array()` */
  var array: js.UndefOr[Boolean] = js.native
  /** value or array of values, limit valid option arguments to a predefined set, see `choices()` */
  var choices: js.UndefOr[Choices] = js.native
  /** function, coerce or transform parsed command line values into another value, see `coerce()` */
  var coerce: js.UndefOr[js.Function1[/* arg */ js.Any, _]] = js.native
  /** string or object, require certain keys not to be set, see `conflicts()` */
  var conflicts: js.UndefOr[String | js.Array[String] | (StringDictionary[String | js.Array[String]])] = js.native
  /** value, set a default value for the option, see `default()` */
  var default: js.UndefOr[js.Any] = js.native
  /** boolean or string, demand the option be given, with optional error message, see `demandOption()` */
  var demandOption: js.UndefOr[Boolean | String] = js.native
  /** string, the option description for help content, see `describe()` */
  var desc: js.UndefOr[String] = js.native
  /** string, the option description for help content, see `describe()` */
  var describe: js.UndefOr[String] = js.native
  /** string, the option description for help content, see `describe()` */
  var description: js.UndefOr[String] = js.native
  /** string or object, require certain keys to be set, see `implies()` */
  var implies: js.UndefOr[String | js.Array[String] | (StringDictionary[String | js.Array[String]])] = js.native
  /** boolean, apply path.normalize() to the option, see normalize() */
  var normalize: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[PositionalOptionsType] = js.native
}

object PositionalOptions {
  @scala.inline
  def apply(): PositionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionalOptions]
  }
  @scala.inline
  implicit class PositionalOptionsOps[Self <: PositionalOptions] (val x: Self) extends AnyVal {
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
    def withType(value: PositionalOptionsType): Self = {
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

