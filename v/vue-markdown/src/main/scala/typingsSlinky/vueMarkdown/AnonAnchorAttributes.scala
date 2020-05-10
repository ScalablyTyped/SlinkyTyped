package typingsSlinky.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnchorAttributes extends js.Object {
  var anchorAttributes: AnonDefault = js.native
  var breaks: AnonType = js.native
  var emoji: AnonType = js.native
  var highlight: AnonType = js.native
  var html: AnonType = js.native
  var langPrefix: AnonDefaultType = js.native
  var linkify: AnonType = js.native
  var postrender: AnonDefault = js.native
  var prerender: AnonDefault = js.native
  var quotes: AnonDefaultType = js.native
  var show: AnonType = js.native
  var source: AnonDefaultType = js.native
  var tableClass: AnonDefaultType = js.native
  var taskLists: AnonType = js.native
  var toc: AnonType = js.native
  var tocAnchorClass: AnonDefaultType = js.native
  var tocAnchorLink: AnonType = js.native
  var tocAnchorLinkClass: AnonDefaultType = js.native
  var tocAnchorLinkSpace: AnonType = js.native
  var tocAnchorLinkSymbol: AnonDefaultType = js.native
  var tocClass: AnonDefaultType = js.native
  var tocFirstLevel: AnonDefaultNumber = js.native
  var tocId: AnonTypeAny = js.native
  var tocLastLevel: AnonTypeAny = js.native
  var typographer: AnonType = js.native
  var watches: AnonDefault = js.native
  var xhtmlOut: AnonType = js.native
}

object AnonAnchorAttributes {
  @scala.inline
  def apply(
    anchorAttributes: AnonDefault,
    breaks: AnonType,
    emoji: AnonType,
    highlight: AnonType,
    html: AnonType,
    langPrefix: AnonDefaultType,
    linkify: AnonType,
    postrender: AnonDefault,
    prerender: AnonDefault,
    quotes: AnonDefaultType,
    show: AnonType,
    source: AnonDefaultType,
    tableClass: AnonDefaultType,
    taskLists: AnonType,
    toc: AnonType,
    tocAnchorClass: AnonDefaultType,
    tocAnchorLink: AnonType,
    tocAnchorLinkClass: AnonDefaultType,
    tocAnchorLinkSpace: AnonType,
    tocAnchorLinkSymbol: AnonDefaultType,
    tocClass: AnonDefaultType,
    tocFirstLevel: AnonDefaultNumber,
    tocId: AnonTypeAny,
    tocLastLevel: AnonTypeAny,
    typographer: AnonType,
    watches: AnonDefault,
    xhtmlOut: AnonType
  ): AnonAnchorAttributes = {
    val __obj = js.Dynamic.literal(anchorAttributes = anchorAttributes.asInstanceOf[js.Any], breaks = breaks.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], langPrefix = langPrefix.asInstanceOf[js.Any], linkify = linkify.asInstanceOf[js.Any], postrender = postrender.asInstanceOf[js.Any], prerender = prerender.asInstanceOf[js.Any], quotes = quotes.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tableClass = tableClass.asInstanceOf[js.Any], taskLists = taskLists.asInstanceOf[js.Any], toc = toc.asInstanceOf[js.Any], tocAnchorClass = tocAnchorClass.asInstanceOf[js.Any], tocAnchorLink = tocAnchorLink.asInstanceOf[js.Any], tocAnchorLinkClass = tocAnchorLinkClass.asInstanceOf[js.Any], tocAnchorLinkSpace = tocAnchorLinkSpace.asInstanceOf[js.Any], tocAnchorLinkSymbol = tocAnchorLinkSymbol.asInstanceOf[js.Any], tocClass = tocClass.asInstanceOf[js.Any], tocFirstLevel = tocFirstLevel.asInstanceOf[js.Any], tocId = tocId.asInstanceOf[js.Any], tocLastLevel = tocLastLevel.asInstanceOf[js.Any], typographer = typographer.asInstanceOf[js.Any], watches = watches.asInstanceOf[js.Any], xhtmlOut = xhtmlOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnchorAttributes]
  }
  @scala.inline
  implicit class AnonAnchorAttributesOps[Self <: AnonAnchorAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorAttributes(value: AnonDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreaks(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmoji(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLangPrefix(value: AnonDefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkify(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostrender(value: AnonDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postrender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrerender(value: AnonDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuotes(value: AnonDefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: AnonDefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableClass(value: AnonDefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskLists(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToc(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocAnchorClass(value: AnonDefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocAnchorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocAnchorLink(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocAnchorLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocAnchorLinkClass(value: AnonDefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocAnchorLinkClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocAnchorLinkSpace(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocAnchorLinkSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocAnchorLinkSymbol(value: AnonDefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocAnchorLinkSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocClass(value: AnonDefaultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocFirstLevel(value: AnonDefaultNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocFirstLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocId(value: AnonTypeAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTocLastLevel(value: AnonTypeAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocLastLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypographer(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typographer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatches(value: AnonDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXhtmlOut(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhtmlOut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

