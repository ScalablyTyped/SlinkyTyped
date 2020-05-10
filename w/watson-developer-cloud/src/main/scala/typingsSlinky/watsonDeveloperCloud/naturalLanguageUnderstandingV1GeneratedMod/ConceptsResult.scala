package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The general concepts referenced or alluded to in the analyzed text. */
@js.native
trait ConceptsResult extends js.Object {
  /** Link to the corresponding DBpedia resource. */
  var dbpedia_resource: js.UndefOr[String] = js.native
  /** Relevance score between 0 and 1. Higher scores indicate greater relevance. */
  var relevance: js.UndefOr[Double] = js.native
  /** Name of the concept. */
  var text: js.UndefOr[String] = js.native
}

object ConceptsResult {
  @scala.inline
  def apply(): ConceptsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConceptsResult]
  }
  @scala.inline
  implicit class ConceptsResultOps[Self <: ConceptsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbpedia_resource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbpedia_resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbpedia_resource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbpedia_resource")(js.undefined)
        ret
    }
    @scala.inline
    def withRelevance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelevance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevance")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

