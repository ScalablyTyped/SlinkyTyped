package typingsSlinky.yargsParser.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.yargsParser.anon.Boolean
import typingsSlinky.yargsParser.anon.PartialConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** An object representing the set of aliases for a key: `{ alias: { foo: ['f']} }`. */
  var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  /**
    * Indicate that keys should be parsed as an array: `{ array: ['foo', 'bar'] }`.
    * Indicate that keys should be parsed as an array and coerced to booleans / numbers:
    * { array: [ { key: 'foo', boolean: true }, {key: 'bar', number: true} ] }`.
    */
  var array: js.UndefOr[js.Array[Boolean | String]] = js.native
  /** Arguments should be parsed as booleans: `{ boolean: ['x', 'y'] }`. */
  var boolean: js.UndefOr[js.Array[String]] = js.native
  /**
    * Provide a custom synchronous function that returns a coerced value from the argument provided (or throws an error), e.g.
    * `{ coerce: { foo: function (arg) { return modifiedArg } } }`.
    */
  var coerce: js.UndefOr[StringDictionary[js.Function1[/* arg */ js.Any, _]]] = js.native
  /** Indicate a key that represents a path to a configuration file (this file will be loaded and parsed). */
  var config: js.UndefOr[String | js.Array[String] | StringDictionary[scala.Boolean]] = js.native
  /** Provide configuration options to the yargs-parser. */
  var configuration: js.UndefOr[PartialConfiguration] = js.native
  /** Indicate a key that should be used as a counter, e.g., `-vvv = {v: 3}`. */
  var count: js.UndefOr[js.Array[String]] = js.native
  /** Provide default values for keys: `{ default: { x: 33, y: 'hello world!' } }`. */
  var default: js.UndefOr[StringDictionary[js.Any]] = js.native
  /** Environment variables (`process.env`) with the prefix provided should be parsed. */
  var envPrefix: js.UndefOr[String] = js.native
  /** Specify that a key requires n arguments: `{ narg: {x: 2} }`. */
  var narg: js.UndefOr[StringDictionary[Double]] = js.native
  /** `path.normalize()` will be applied to values set to this key. */
  var normalize: js.UndefOr[js.Array[String]] = js.native
  /** Keys should be treated as numbers. */
  var number: js.UndefOr[js.Array[String]] = js.native
  /** Keys should be treated as strings (even if they resemble a number `-x 33`). */
  var string: js.UndefOr[js.Array[String]] = js.native
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
    def withAlias(value: StringDictionary[String | js.Array[String]]): Self = {
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
    def withArray(value: js.Array[Boolean | String]): Self = {
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
    def withBoolean(value: js.Array[String]): Self = {
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
    def withCoerce(value: StringDictionary[js.Function1[/* arg */ js.Any, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoerce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: String | js.Array[String] | StringDictionary[scala.Boolean]): Self = {
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
    def withConfiguration(value: PartialConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: js.Array[String]): Self = {
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
    def withDefault(value: StringDictionary[js.Any]): Self = {
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
    def withEnvPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withNarg(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNarg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narg")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: js.Array[String]): Self = {
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
    def withNumber(value: js.Array[String]): Self = {
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
    def withString(value: js.Array[String]): Self = {
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
  }
  
}

