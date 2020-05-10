package typingsSlinky.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlock extends js.Object {
  var block: AnonParse = js.native
  var configure: js.Any = js.native
  var core: AnonProcess = js.native
  var disable: js.Any = js.native
  var enable: js.Any = js.native
  var helpers: AnonParseLinkDestination = js.native
  var `inline`: AnonRuler = js.native
  var linkify: AnonAdd = js.native
  var normalizeLink: js.Any = js.native
  var normalizeLinkText: js.Any = js.native
  var options: AnonBreaks = js.native
  var parse: js.Any = js.native
  var parseInline: js.Any = js.native
  var render: js.Any = js.native
  var renderInline: js.Any = js.native
  var renderer: AnonRender = js.native
  var set: js.Any = js.native
  var use: js.Any = js.native
  var utils: AnonArrayReplaceAt = js.native
  var validateLink: js.Any = js.native
}

object AnonBlock {
  @scala.inline
  def apply(
    block: AnonParse,
    configure: js.Any,
    core: AnonProcess,
    disable: js.Any,
    enable: js.Any,
    helpers: AnonParseLinkDestination,
    `inline`: AnonRuler,
    linkify: AnonAdd,
    normalizeLink: js.Any,
    normalizeLinkText: js.Any,
    options: AnonBreaks,
    parse: js.Any,
    parseInline: js.Any,
    render: js.Any,
    renderInline: js.Any,
    renderer: AnonRender,
    set: js.Any,
    use: js.Any,
    utils: AnonArrayReplaceAt,
    validateLink: js.Any
  ): AnonBlock = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], configure = configure.asInstanceOf[js.Any], core = core.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], linkify = linkify.asInstanceOf[js.Any], normalizeLink = normalizeLink.asInstanceOf[js.Any], normalizeLinkText = normalizeLinkText.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], parseInline = parseInline.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], renderInline = renderInline.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], validateLink = validateLink.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlock]
  }
  @scala.inline
  implicit class AnonBlockOps[Self <: AnonBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: AnonParse): Self = {
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
    def withCore(value: AnonProcess): Self = {
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
    def withHelpers(value: AnonParseLinkDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInline(value: AnonRuler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkify(value: AnonAdd): Self = {
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
    def withOptions(value: AnonBreaks): Self = {
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
    def withRenderer(value: AnonRender): Self = {
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
    def withUtils(value: AnonArrayReplaceAt): Self = {
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

