package typingsSlinky.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRender extends js.Object {
  var render: js.Any = js.native
  var renderAttrs: js.Any = js.native
  var renderInline: js.Any = js.native
  var renderInlineAsText: js.Any = js.native
  var renderToken: js.Any = js.native
  var rules: AnonCodeblock = js.native
}

object AnonRender {
  @scala.inline
  def apply(
    render: js.Any,
    renderAttrs: js.Any,
    renderInline: js.Any,
    renderInlineAsText: js.Any,
    renderToken: js.Any,
    rules: AnonCodeblock
  ): AnonRender = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], renderAttrs = renderAttrs.asInstanceOf[js.Any], renderInline = renderInline.asInstanceOf[js.Any], renderInlineAsText = renderInlineAsText.asInstanceOf[js.Any], renderToken = renderToken.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRender]
  }
  @scala.inline
  implicit class AnonRenderOps[Self <: AnonRender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRender(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderAttrs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderInline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderInlineAsText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderInlineAsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderToken(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: AnonCodeblock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

