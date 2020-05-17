package typingsSlinky.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  var block: Parse = js.native
  var configure: js.Any = js.native
  var core: Process = js.native
  var disable: js.Any = js.native
  var enable: js.Any = js.native
  var helpers: ParseLinkDestination = js.native
  var `inline`: Ruler = js.native
  var linkify: Add = js.native
  var normalizeLink: js.Any = js.native
  var normalizeLinkText: js.Any = js.native
  var options: Breaks = js.native
  var parse: js.Any = js.native
  var parseInline: js.Any = js.native
  var render: js.Any = js.native
  var renderInline: js.Any = js.native
  var renderer: Render = js.native
  var set: js.Any = js.native
  var use: js.Any = js.native
  var utils: ArrayReplaceAt = js.native
  var validateLink: js.Any = js.native
}

object Block {
  @scala.inline
  def apply(
    block: Parse,
    configure: js.Any,
    core: Process,
    disable: js.Any,
    enable: js.Any,
    helpers: ParseLinkDestination,
    `inline`: Ruler,
    linkify: Add,
    normalizeLink: js.Any,
    normalizeLinkText: js.Any,
    options: Breaks,
    parse: js.Any,
    parseInline: js.Any,
    render: js.Any,
    renderInline: js.Any,
    renderer: Render,
    set: js.Any,
    use: js.Any,
    utils: ArrayReplaceAt,
    validateLink: js.Any
  ): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], configure = configure.asInstanceOf[js.Any], core = core.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], linkify = linkify.asInstanceOf[js.Any], normalizeLink = normalizeLink.asInstanceOf[js.Any], normalizeLinkText = normalizeLinkText.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], parseInline = parseInline.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], renderInline = renderInline.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], validateLink = validateLink.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: Parse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigure(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCore(value: Process): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("core")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpers(value: ParseLinkDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInline(value: Ruler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkify(value: Add): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalizeLink(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalizeLinkText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeLinkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Breaks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseInline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderInline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderer(value: Render): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtils(value: ArrayReplaceAt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateLink(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateLink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

