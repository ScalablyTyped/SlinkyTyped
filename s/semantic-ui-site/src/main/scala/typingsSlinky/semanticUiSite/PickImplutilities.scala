package typingsSlinky.semanticUiSite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, 'utilities'> */
@js.native
trait PickImplutilities extends js.Object {
  var utilities: js.Any = js.native
}

object PickImplutilities {
  @scala.inline
  def apply(utilities: js.Any): PickImplutilities = {
    val __obj = js.Dynamic.literal(utilities = utilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplutilities]
  }
  @scala.inline
  implicit class PickImplutilitiesOps[Self <: PickImplutilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUtilities(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utilities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

