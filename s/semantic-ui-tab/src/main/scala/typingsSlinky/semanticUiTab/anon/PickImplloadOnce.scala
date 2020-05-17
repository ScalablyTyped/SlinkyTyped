package typingsSlinky.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'loadOnce'> */
@js.native
trait PickImplloadOnce extends js.Object {
  var loadOnce: Boolean = js.native
}

object PickImplloadOnce {
  @scala.inline
  def apply(loadOnce: Boolean): PickImplloadOnce = {
    val __obj = js.Dynamic.literal(loadOnce = loadOnce.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplloadOnce]
  }
  @scala.inline
  implicit class PickImplloadOnceOps[Self <: PickImplloadOnce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnce")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

