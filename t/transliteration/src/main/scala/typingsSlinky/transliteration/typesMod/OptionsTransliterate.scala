package typingsSlinky.transliteration.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsTransliterate extends Options {
  /**
    * Ignore a list of strings untouched
    * @example tr('你好，世界', { ignore: ['你'] }) // 你 Hao , Shi Jie
    */
  var ignore: js.UndefOr[js.Array[String]] = js.native
  /**
    * Replace a list of string / regex in the source string into the provided target string before transliteration
    * The option can either be an array or an object
    * @example tr('你好，世界', { replace: {你: 'You'} }) // You Hao , Shi Jie
    * @example tr('你好，世界', { replace: [['你', 'You']] }) // You Hao , Shi Jie
    * @example tr('你好，世界', { replace: [[/你/g, 'You']] }) // You Hao , Shi Jie
    */
  var replace: js.UndefOr[OptionReplaceCombined] = js.native
  /**
    * Same as `replace` but after transliteration
    */
  var replaceAfter: js.UndefOr[OptionReplaceCombined] = js.native
  /**
    * Decides whether or not to trim the result string after transliteration
    * @default false
    */
  var trim: js.UndefOr[Boolean] = js.native
  /**
    * Any characters not known by this library will be replaced by a specific string `unknown`
    * @default ''
    */
  var unknown: js.UndefOr[String] = js.native
}

object OptionsTransliterate {
  @scala.inline
  def apply(): OptionsTransliterate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTransliterate]
  }
  @scala.inline
  implicit class OptionsTransliterateOps[Self <: OptionsTransliterate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnore(value: js.Array[String]): Self = {
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
    def withReplace(value: OptionReplaceCombined): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceAfter(value: OptionReplaceCombined): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(js.undefined)
        ret
    }
  }
  
}

