package typingsSlinky.semanticUiAccordion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl, keyof semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplAccordion extends js.Object {
  var accordion: js.UndefOr[String] = js.native
  var content: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var trigger: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplAccordion {
  @scala.inline
  def apply(): PartialPickImplkeyofImplAccordion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplAccordion]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplAccordionOps[Self <: PartialPickImplkeyofImplAccordion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccordion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccordion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordion")(js.undefined)
        ret
    }
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
  }
  
}

