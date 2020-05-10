package typingsSlinky.semanticUiRating.SemanticUI.Rating.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.SelectorSettings._Impl, 'icon'> & std.Partial<std.Pick<semantic-ui-rating.SemanticUI.Rating.SelectorSettings._Impl, keyof semantic-ui-rating.SemanticUI.Rating.SelectorSettings._Impl>> */
@js.native
trait Param extends js.Object {
  var icon: js.UndefOr[String] = js.native
}

object Param {
  @scala.inline
  def apply(): Param = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Param]
  }
  @scala.inline
  implicit class ParamOps[Self <: Param] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
  }
  
}

