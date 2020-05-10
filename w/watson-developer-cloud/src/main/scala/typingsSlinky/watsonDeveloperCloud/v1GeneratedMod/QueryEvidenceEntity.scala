package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Entity description and location within evidence field. */
@js.native
trait QueryEvidenceEntity extends js.Object {
  /** The end location of the entity text in the identified field. This value is exclusive. */
  var end_offset: js.UndefOr[Double] = js.native
  /** The start location of the entity text in the identified field. This value is inclusive. */
  var start_offset: js.UndefOr[Double] = js.native
  /** The original text of this entity as found in the evidence field. */
  var text: js.UndefOr[String] = js.native
  /** The entity type for this entity. Possible types vary based on model used. */
  var `type`: js.UndefOr[String] = js.native
}

object QueryEvidenceEntity {
  @scala.inline
  def apply(): QueryEvidenceEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEvidenceEntity]
  }
  @scala.inline
  implicit class QueryEvidenceEntityOps[Self <: QueryEvidenceEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

