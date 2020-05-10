package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Description of evidence location supporting Knoweldge Graph query result. */
@js.native
trait QueryEvidence extends js.Object {
  /** The docuemnt ID (as indexed in Discovery) of the evidence location. */
  var document_id: js.UndefOr[String] = js.native
  /** The end location of the evidence in the identified field. This value is inclusive. */
  var end_offset: js.UndefOr[Double] = js.native
  /** An array of entity objects that show evidence of the result. */
  var entities: js.UndefOr[js.Array[QueryEvidenceEntity]] = js.native
  /** The field of the document where the supporting evidence was identified. */
  var field: js.UndefOr[String] = js.native
  /** The start location of the evidence in the identified field. This value is inclusive. */
  var start_offset: js.UndefOr[Double] = js.native
}

object QueryEvidence {
  @scala.inline
  def apply(): QueryEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEvidence]
  }
  @scala.inline
  implicit class QueryEvidenceOps[Self <: QueryEvidence] (val x: Self) extends AnyVal {
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
    def withEntities(value: js.Array[QueryEvidenceEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.undefined)
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

