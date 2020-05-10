package typingsSlinky.semanticUiEmbed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplIframe extends js.Object {
  var iframe: js.UndefOr[js.Function2[/* url */ String, /* parameters */ String, String]] = js.native
  var placeholder: js.UndefOr[js.Function2[/* image */ String, /* icon */ String, String]] = js.native
}

object PartialPickImplkeyofImplIframe {
  @scala.inline
  def apply(): PartialPickImplkeyofImplIframe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplIframe]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplIframeOps[Self <: PartialPickImplkeyofImplIframe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIframe(value: (/* url */ String, /* parameters */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: (/* image */ String, /* icon */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
  }
  
}

