package typingsSlinky.semanticUiVisibility.anon

import typingsSlinky.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.fixed
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'type'> */
@js.native
trait PickImpltype extends js.Object {
  var `type`: `false` | image | fixed = js.native
}

object PickImpltype {
  @scala.inline
  def apply(`type`: `false` | image | fixed): PickImpltype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltype]
  }
  @scala.inline
  implicit class PickImpltypeOps[Self <: PickImpltype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `false` | image | fixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

