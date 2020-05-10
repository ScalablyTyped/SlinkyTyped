package typingsSlinky.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Value names for recursive matching parts.
  */
@js.native
trait MatchRecursiveValueNames extends js.Object {
  /**
    * Name for the unmatched portion of string leading up to `left` delimiter.
    */
  var `0`: String | Null = js.native
  /**
    * Name for the `left` delimiter.
    */
  var `1`: String | Null = js.native
  /**
    * Name for the portion of the string inside the `left` and `right` delimiters.
    */
  var `2`: String | Null = js.native
  /**
    * Name for the `right` delimiter.
    */
  var `3`: String | Null = js.native
}

object MatchRecursiveValueNames {
  @scala.inline
  def apply(): MatchRecursiveValueNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchRecursiveValueNames]
  }
  @scala.inline
  implicit class MatchRecursiveValueNamesOps[Self <: MatchRecursiveValueNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with0(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with0Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(null)
        ret
    }
    @scala.inline
    def with1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with1Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(null)
        ret
    }
    @scala.inline
    def with2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with2Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(null)
        ret
    }
    @scala.inline
    def with3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with3Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(null)
        ret
    }
  }
  
}

