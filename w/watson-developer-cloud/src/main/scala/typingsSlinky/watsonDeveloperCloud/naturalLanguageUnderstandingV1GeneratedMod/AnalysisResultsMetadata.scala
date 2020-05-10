package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Webpage metadata, such as the author and the title of the page. */
@js.native
trait AnalysisResultsMetadata extends js.Object {
  /** The authors of the document. */
  var authors: js.UndefOr[js.Array[Author]] = js.native
  /** RSS/ATOM feeds found on the webpage. */
  var feeds: js.UndefOr[js.Array[Feed]] = js.native
  /** URL of a prominent image on the webpage. */
  var image: js.UndefOr[String] = js.native
  /** The publication date in the format ISO 8601. */
  var publication_date: js.UndefOr[String] = js.native
  /** The title of the document. */
  var title: js.UndefOr[String] = js.native
}

object AnalysisResultsMetadata {
  @scala.inline
  def apply(): AnalysisResultsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisResultsMetadata]
  }
  @scala.inline
  implicit class AnalysisResultsMetadataOps[Self <: AnalysisResultsMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthors(value: js.Array[Author]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors")(js.undefined)
        ret
    }
    @scala.inline
    def withFeeds(value: js.Array[Feed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeeds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feeds")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
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

