package typingsSlinky.sugar.sugarjs.Array

import typingsSlinky.sugar.Function
import typingsSlinky.sugar.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayOptions extends js.Object {
  var sortCollate: js.UndefOr[Function] = js.native
  var sortEquivalents: js.UndefOr[js.Object] = js.native
  var sortIgnore: js.UndefOr[RegExp] = js.native
  var sortIgnoreCase: js.UndefOr[Boolean] = js.native
  var sortNatural: js.UndefOr[Boolean] = js.native
  var sortOrder: js.UndefOr[String] = js.native
}

object ArrayOptions {
  @scala.inline
  def apply(): ArrayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayOptions]
  }
  @scala.inline
  implicit class ArrayOptionsOps[Self <: ArrayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSortCollate(value: Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCollate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortCollate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCollate")(js.undefined)
        ret
    }
    @scala.inline
    def withSortEquivalents(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortEquivalents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortEquivalents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortEquivalents")(js.undefined)
        ret
    }
    @scala.inline
    def withSortIgnore(value: RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIgnore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIgnore")(js.undefined)
        ret
    }
    @scala.inline
    def withSortIgnoreCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIgnoreCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortIgnoreCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIgnoreCase")(js.undefined)
        ret
    }
    @scala.inline
    def withSortNatural(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortNatural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortNatural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortNatural")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
  }
  
}

