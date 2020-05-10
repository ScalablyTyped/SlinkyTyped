package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTML converted from an input document. */
@js.native
trait HTMLReturn extends js.Object {
  /** The author of the input document, if identified. */
  var author: js.UndefOr[String] = js.native
  /** The HTML version of the input document. */
  var html: js.UndefOr[String] = js.native
  /** The number of pages in the input document. */
  var num_pages: js.UndefOr[String] = js.native
  /** The publication date of the input document, if identified. */
  var publication_date: js.UndefOr[String] = js.native
  /** The title of the input document, if identified. */
  var title: js.UndefOr[String] = js.native
}

object HTMLReturn {
  @scala.inline
  def apply(): HTMLReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLReturn]
  }
  @scala.inline
  implicit class HTMLReturnOps[Self <: HTMLReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withNum_pages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNum_pages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_pages")(js.undefined)
        ret
    }
    @scala.inline
    def withPublication_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publication_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublication_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publication_date")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

