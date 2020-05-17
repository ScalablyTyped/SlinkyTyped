package typingsSlinky.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breaks extends js.Object {
  var breaks: Boolean = js.native
  var highlight: js.Any = js.native
  var html: Boolean = js.native
  var langPrefix: String = js.native
  var linkify: Boolean = js.native
  var maxNesting: Double = js.native
  var quotes: String = js.native
  var typographer: Boolean = js.native
  var xhtmlOut: Boolean = js.native
}

object Breaks {
  @scala.inline
  def apply(
    breaks: Boolean,
    highlight: js.Any,
    html: Boolean,
    langPrefix: String,
    linkify: Boolean,
    maxNesting: Double,
    quotes: String,
    typographer: Boolean,
    xhtmlOut: Boolean
  ): Breaks = {
    val __obj = js.Dynamic.literal(breaks = breaks.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], langPrefix = langPrefix.asInstanceOf[js.Any], linkify = linkify.asInstanceOf[js.Any], maxNesting = maxNesting.asInstanceOf[js.Any], quotes = quotes.asInstanceOf[js.Any], typographer = typographer.asInstanceOf[js.Any], xhtmlOut = xhtmlOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breaks]
  }
  @scala.inline
  implicit class BreaksOps[Self <: Breaks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLangPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxNesting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNesting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypographer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typographer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXhtmlOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhtmlOut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

