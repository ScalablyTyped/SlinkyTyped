package typingsSlinky.semanticUiDimmer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'useCSS'> */
@js.native
trait PickImpluseCSS extends js.Object {
  var useCSS: Boolean = js.native
}

object PickImpluseCSS {
  @scala.inline
  def apply(useCSS: Boolean): PickImpluseCSS = {
    val __obj = js.Dynamic.literal(useCSS = useCSS.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpluseCSS]
  }
  @scala.inline
  implicit class PickImpluseCSSOps[Self <: PickImpluseCSS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCSS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

