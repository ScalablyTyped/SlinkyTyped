package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TopHitsResults. */
@js.native
trait TopHitsResults extends js.Object {
  /** Top results returned by the aggregation. */
  var hits: js.UndefOr[js.Array[QueryResult]] = js.native
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
}

object TopHitsResults {
  @scala.inline
  def apply(): TopHitsResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopHitsResults]
  }
  @scala.inline
  implicit class TopHitsResultsOps[Self <: TopHitsResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHits(value: js.Array[QueryResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hits")(js.undefined)
        ret
    }
    @scala.inline
    def withMatching_results(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matching_results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatching_results: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matching_results")(js.undefined)
        ret
    }
  }
  
}

