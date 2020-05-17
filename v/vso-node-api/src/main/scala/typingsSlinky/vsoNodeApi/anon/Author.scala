package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Author extends js.Object {
  var author: scala.Double = js.native
  var averageRating: scala.Double = js.native
  var installCount: scala.Double = js.native
  var lastUpdatedDate: scala.Double = js.native
  var publishedDate: scala.Double = js.native
  var publisher: scala.Double = js.native
  var releaseDate: scala.Double = js.native
  var relevance: scala.Double = js.native
  var title: scala.Double = js.native
  var trendingDaily: scala.Double = js.native
  var trendingMonthly: scala.Double = js.native
  var trendingWeekly: scala.Double = js.native
  var weightedRating: scala.Double = js.native
}

object Author {
  @scala.inline
  def apply(
    author: scala.Double,
    averageRating: scala.Double,
    installCount: scala.Double,
    lastUpdatedDate: scala.Double,
    publishedDate: scala.Double,
    publisher: scala.Double,
    releaseDate: scala.Double,
    relevance: scala.Double,
    title: scala.Double,
    trendingDaily: scala.Double,
    trendingMonthly: scala.Double,
    trendingWeekly: scala.Double,
    weightedRating: scala.Double
  ): Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], averageRating = averageRating.asInstanceOf[js.Any], installCount = installCount.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trendingDaily = trendingDaily.asInstanceOf[js.Any], trendingMonthly = trendingMonthly.asInstanceOf[js.Any], trendingWeekly = trendingWeekly.asInstanceOf[js.Any], weightedRating = weightedRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  @scala.inline
  implicit class AuthorOps[Self <: Author] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAverageRating(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallCount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedDate(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishedDate(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisher(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDate(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelevance(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrendingDaily(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendingDaily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrendingMonthly(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendingMonthly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrendingWeekly(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendingWeekly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeightedRating(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedRating")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

