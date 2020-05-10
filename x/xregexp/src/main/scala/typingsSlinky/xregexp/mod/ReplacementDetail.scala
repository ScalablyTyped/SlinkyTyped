package typingsSlinky.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replacement details used in and array for replacing multiple items.
  */
@js.native
trait ReplacementDetail extends js.Object {
  /**
    * What to search for.
    */
  var `0`: Pattern = js.native
  /**
    * The replacement string or function
    */
  var `1`: ReplacementValue = js.native
  /**
    * Replacement scope. If not explicitly specified and `regex` uses flag g,
    * `scope` is 'all'.
    */
  var `2`: js.UndefOr[MatchScope | Null] = js.native
}

object ReplacementDetail {
  @scala.inline
  def apply(`0`: Pattern, `1`: ReplacementValue): ReplacementDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplacementDetail]
  }
  @scala.inline
  implicit class ReplacementDetailOps[Self <: ReplacementDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with0RegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with0(value: Pattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with1Function2(
      value: (/* substring */ MatchSubString, /* repeated */ String | Double | NamedGroupsArray) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with1(value: ReplacementValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with2(value: MatchScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(js.undefined)
        ret
    }
    @scala.inline
    def with2Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(null)
        ret
    }
  }
  
}

