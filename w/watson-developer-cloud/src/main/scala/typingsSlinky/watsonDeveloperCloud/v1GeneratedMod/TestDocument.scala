package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TestDocument. */
@js.native
trait TestDocument extends js.Object {
  /** The unique identifier for the configuration. */
  var configuration_id: js.UndefOr[String] = js.native
  /** The number of 10-kB chunks of field data that were enriched. This can be used to estimate the cost of running a real ingestion. */
  var enriched_field_units: js.UndefOr[Double] = js.native
  /** An array of notice messages about the preview operation. */
  var notices: js.UndefOr[js.Array[Notice]] = js.native
  /** Format of the test document. */
  var original_media_type: js.UndefOr[String] = js.native
  /** An array of objects that describe each step in the preview process. */
  var snapshots: js.UndefOr[js.Array[DocumentSnapshot]] = js.native
  /** Status of the preview operation. */
  var status: js.UndefOr[String] = js.native
}

object TestDocument {
  @scala.inline
  def apply(): TestDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestDocument]
  }
  @scala.inline
  implicit class TestDocumentOps[Self <: TestDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration_id")(js.undefined)
        ret
    }
    @scala.inline
    def withEnriched_field_units(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enriched_field_units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnriched_field_units: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enriched_field_units")(js.undefined)
        ret
    }
    @scala.inline
    def withNotices(value: js.Array[Notice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notices")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginal_media_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_media_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginal_media_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_media_type")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshots(value: js.Array[DocumentSnapshot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshots")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

