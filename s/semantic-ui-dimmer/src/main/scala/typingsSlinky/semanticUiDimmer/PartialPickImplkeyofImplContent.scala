package typingsSlinky.semanticUiDimmer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplContent extends js.Object {
  var content: js.UndefOr[String] = js.native
  var dimmable: js.UndefOr[String] = js.native
  var dimmer: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplContent {
  @scala.inline
  def apply(): PartialPickImplkeyofImplContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplContent]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplContentOps[Self <: PartialPickImplkeyofImplContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDimmable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimmable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmable")(js.undefined)
        ret
    }
    @scala.inline
    def withDimmer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimmer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmer")(js.undefined)
        ret
    }
  }
  
}

