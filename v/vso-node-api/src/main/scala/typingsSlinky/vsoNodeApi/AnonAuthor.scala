package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthor extends js.Object {
  var author: Double = js.native
  var averageRating: Double = js.native
  var installCount: Double = js.native
  var lastUpdatedDate: Double = js.native
  var publishedDate: Double = js.native
  var publisher: Double = js.native
  var releaseDate: Double = js.native
  var relevance: Double = js.native
  var title: Double = js.native
  var trendingDaily: Double = js.native
  var trendingMonthly: Double = js.native
  var trendingWeekly: Double = js.native
  var weightedRating: Double = js.native
}

object AnonAuthor {
  @scala.inline
  def apply(
    author: Double,
    averageRating: Double,
    installCount: Double,
    lastUpdatedDate: Double,
    publishedDate: Double,
    publisher: Double,
    releaseDate: Double,
    relevance: Double,
    title: Double,
    trendingDaily: Double,
    trendingMonthly: Double,
    trendingWeekly: Double,
    weightedRating: Double
  ): AnonAuthor = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], averageRating = averageRating.asInstanceOf[js.Any], installCount = installCount.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trendingDaily = trendingDaily.asInstanceOf[js.Any], trendingMonthly = trendingMonthly.asInstanceOf[js.Any], trendingWeekly = trendingWeekly.asInstanceOf[js.Any], weightedRating = weightedRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthor]
  }
  @scala.inline
  implicit class AnonAuthorOps[Self <: AnonAuthor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAverageRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishedDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisher(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelevance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrendingDaily(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendingDaily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrendingMonthly(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendingMonthly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrendingWeekly(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendingWeekly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeightedRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedRating")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

