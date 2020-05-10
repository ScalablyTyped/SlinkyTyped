package typingsSlinky.semanticUiEmbed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplEmbed extends js.Object {
  var embed: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var play: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplEmbed {
  @scala.inline
  def apply(): PartialPickImplkeyofImplEmbed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplEmbed]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplEmbedOps[Self <: PartialPickImplkeyofImplEmbed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPlay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.undefined)
        ret
    }
  }
  
}

