package typingsSlinky.summernote.mod._Global_.Summernote

import typingsSlinky.jquery.JQuery_.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HintOptions extends js.Object {
  var content: js.UndefOr[js.Function1[/* item */ String, htmlElement | Node]] = js.native
  var `match`: js.RegExp = js.native
  var mentions: js.UndefOr[js.Array[String]] = js.native
  var template: js.UndefOr[js.Function1[/* item */ String, htmlElement]] = js.native
  var words: js.UndefOr[js.Array[String]] = js.native
  def search(keyword: String, callback: js.Function1[/* plausibleItems */ js.Array[String], Unit]): Unit = js.native
}

object HintOptions {
  @scala.inline
  def apply(
    `match`: js.RegExp,
    search: (String, js.Function1[/* plausibleItems */ js.Array[String], Unit]) => Unit
  ): HintOptions = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction2(search))
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HintOptions]
  }
  @scala.inline
  implicit class HintOptionsOps[Self <: HintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatch(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: (String, js.Function1[/* plausibleItems */ js.Array[String], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withContent(value: /* item */ String => htmlElement | Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withMentions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMentions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: /* item */ String => htmlElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withWords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(js.undefined)
        ret
    }
  }
  
}

