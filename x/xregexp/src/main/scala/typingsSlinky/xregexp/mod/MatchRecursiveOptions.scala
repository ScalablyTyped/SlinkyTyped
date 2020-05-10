package typingsSlinky.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for when doing recursive matching.
  */
@js.native
trait MatchRecursiveOptions extends js.Object {
  /**
    * The escape character to use.
    *
    * **Must be exactly one character long.**
    */
  var escapeChar: js.UndefOr[String | Null] = js.native
  /**
    * The value names to associate with the matches.
    *
    * Specifying a value here will cause the `XRegExp.matchRecursive` method to
    * return and array of `XRegExp.MatchRecursiveValueNameMatch`
    */
  var valueNames: js.UndefOr[MatchRecursiveValueNames | Null] = js.native
}

object MatchRecursiveOptions {
  @scala.inline
  def apply(): MatchRecursiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchRecursiveOptions]
  }
  @scala.inline
  implicit class MatchRecursiveOptionsOps[Self <: MatchRecursiveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscapeChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeChar")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeCharNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeChar")(null)
        ret
    }
    @scala.inline
    def withValueNames(value: MatchRecursiveValueNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueNames")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNamesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueNames")(null)
        ret
    }
  }
  
}

