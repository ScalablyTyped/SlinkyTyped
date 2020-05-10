package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryPassages. */
@js.native
trait QueryPassages extends js.Object {
  /** The unique identifier of the document from which the passage has been extracted. */
  var document_id: js.UndefOr[String] = js.native
  /** The position of the last character of the extracted passage in the originating field. */
  var end_offset: js.UndefOr[Double] = js.native
  /** The label of the field from which the passage has been extracted. */
  var field: js.UndefOr[String] = js.native
  /** The confidence score of the passages's analysis. A higher score indicates greater confidence. */
  var passage_score: js.UndefOr[Double] = js.native
  /** The content of the extracted passage. */
  var passage_text: js.UndefOr[String] = js.native
  /** The position of the first character of the extracted passage in the originating field. */
  var start_offset: js.UndefOr[Double] = js.native
}

object QueryPassages {
  @scala.inline
  def apply(): QueryPassages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryPassages]
  }
  @scala.inline
  implicit class QueryPassagesOps[Self <: QueryPassages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_id")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_offset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_offset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_offset")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withPassage_score(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passage_score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassage_score: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passage_score")(js.undefined)
        ret
    }
    @scala.inline
    def withPassage_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passage_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassage_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passage_text")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_offset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_offset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_offset")(js.undefined)
        ret
    }
  }
  
}

