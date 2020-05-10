package typingsSlinky.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCodeblock extends js.Object {
  var code_block: js.Any = js.native
  var code_inline: js.Any = js.native
  var fence: js.Any = js.native
  var hardbreak: js.Any = js.native
  var html_block: js.Any = js.native
  var html_inline: js.Any = js.native
  var image: js.Any = js.native
  var softbreak: js.Any = js.native
  var text: js.Any = js.native
}

object AnonCodeblock {
  @scala.inline
  def apply(
    code_block: js.Any,
    code_inline: js.Any,
    fence: js.Any,
    hardbreak: js.Any,
    html_block: js.Any,
    html_inline: js.Any,
    image: js.Any,
    softbreak: js.Any,
    text: js.Any
  ): AnonCodeblock = {
    val __obj = js.Dynamic.literal(code_block = code_block.asInstanceOf[js.Any], code_inline = code_inline.asInstanceOf[js.Any], fence = fence.asInstanceOf[js.Any], hardbreak = hardbreak.asInstanceOf[js.Any], html_block = html_block.asInstanceOf[js.Any], html_inline = html_inline.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], softbreak = softbreak.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodeblock]
  }
  @scala.inline
  implicit class AnonCodeblockOps[Self <: AnonCodeblock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode_block(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode_inline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFence(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHardbreak(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardbreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_block(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_inline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftbreak(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softbreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

