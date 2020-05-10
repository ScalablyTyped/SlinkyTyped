package typingsSlinky.xregexp.mod

import typingsSlinky.xregexp.xregexpStrings.none
import typingsSlinky.xregexp.xregexpStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional options for when doing a RegExp union.
  */
@js.native
trait UnionOptions extends js.Object {
  /**
    * The conjunction to use for the union. Default is `none`.
    */
  var conjunction: js.UndefOr[or | none | Null] = js.native
}

object UnionOptions {
  @scala.inline
  def apply(): UnionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnionOptions]
  }
  @scala.inline
  implicit class UnionOptionsOps[Self <: UnionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConjunction(value: or | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConjunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjunction")(js.undefined)
        ret
    }
    @scala.inline
    def withConjunctionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjunction")(null)
        ret
    }
  }
  
}

