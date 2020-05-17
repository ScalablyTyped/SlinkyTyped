package typingsSlinky.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorAttributes extends js.Object {
  var anchorAttributes: Default = js.native
  var breaks: Type = js.native
  var emoji: Type = js.native
  var highlight: Type = js.native
  var html: Type = js.native
  var langPrefix: DefaultType = js.native
  var linkify: Type = js.native
  var postrender: Default = js.native
  var prerender: Default = js.native
  var quotes: DefaultType = js.native
  var show: Type = js.native
  var source: DefaultType = js.native
  var tableClass: DefaultType = js.native
  var taskLists: Type = js.native
  var toc: Type = js.native
  var tocAnchorClass: DefaultType = js.native
  var tocAnchorLink: Type = js.native
  var tocAnchorLinkClass: DefaultType = js.native
  var tocAnchorLinkSpace: Type = js.native
  var tocAnchorLinkSymbol: DefaultType = js.native
  var tocClass: DefaultType = js.native
  var tocFirstLevel: DefaultNumber = js.native
  var tocId: TypeAny = js.native
  var tocLastLevel: TypeAny = js.native
  var typographer: Type = js.native
  var watches: Default = js.native
  var xhtmlOut: Type = js.native
}

object AnchorAttributes {
  @scala.inline
  def apply(
    anchorAttributes: Default,
    breaks: Type,
    emoji: Type,
    highlight: Type,
    html: Type,
    langPrefix: DefaultType,
    linkify: Type,
    postrender: Default,
    prerender: Default,
    quotes: DefaultType,
    show: Type,
    source: DefaultType,
    tableClass: DefaultType,
    taskLists: Type,
    toc: Type,
    tocAnchorClass: DefaultType,
    tocAnchorLink: Type,
    tocAnchorLinkClass: DefaultType,
    tocAnchorLinkSpace: Type,
    tocAnchorLinkSymbol: DefaultType,
    tocClass: DefaultType,
    tocFirstLevel: DefaultNumber,
    tocId: TypeAny,
    tocLastLevel: TypeAny,
    typographer: Type,
    watches: Default,
    xhtmlOut: Type
  ): AnchorAttributes = {
    val __obj = js.Dynamic.literal(anchorAttributes = anchorAttributes.asInstanceOf[js.Any], breaks = breaks.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], langPrefix = langPrefix.asInstanceOf[js.Any], linkify = linkify.asInstanceOf[js.Any], postrender = postrender.asInstanceOf[js.Any], prerender = prerender.asInstanceOf[js.Any], quotes = quotes.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tableClass = tableClass.asInstanceOf[js.Any], taskLists = taskLists.asInstanceOf[js.Any], toc = toc.asInstanceOf[js.Any], tocAnchorClass = tocAnchorClass.asInstanceOf[js.Any], tocAnchorLink = tocAnchorLink.asInstanceOf[js.Any], tocAnchorLinkClass = tocAnchorLinkClass.asInstanceOf[js.Any], tocAnchorLinkSpace = tocAnchorLinkSpace.asInstanceOf[js.Any], tocAnchorLinkSymbol = tocAnchorLinkSymbol.asInstanceOf[js.Any], tocClass = tocClass.asInstanceOf[js.Any], tocFirstLevel = tocFirstLevel.asInstanceOf[js.Any], tocId = tocId.asInstanceOf[js.Any], tocLastLevel = tocLastLevel.asInstanceOf[js.Any], typographer = typographer.asInstanceOf[js.Any], watches = watches.asInstanceOf[js.Any], xhtmlOut = xhtmlOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorAttributes]
  }
  @scala.inline
  implicit class AnchorAttributesOps[Self <: AnchorAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorAttributes(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreaks(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmoji(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLangPrefix(value: DefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkify(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostrender(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postrender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrerender(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuotes(value: DefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: DefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableClass(value: DefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskLists(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToc(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocAnchorClass(value: DefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocAnchorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocAnchorLink(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocAnchorLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocAnchorLinkClass(value: DefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocAnchorLinkClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocAnchorLinkSpace(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocAnchorLinkSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocAnchorLinkSymbol(value: DefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocAnchorLinkSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocClass(value: DefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocFirstLevel(value: DefaultNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocFirstLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocId(value: TypeAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocLastLevel(value: TypeAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocLastLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypographer(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typographer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatches(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXhtmlOut(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhtmlOut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

