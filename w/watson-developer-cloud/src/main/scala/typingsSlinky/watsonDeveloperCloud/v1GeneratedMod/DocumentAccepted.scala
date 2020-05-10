package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DocumentAccepted. */
@js.native
trait DocumentAccepted extends js.Object {
  /** The unique identifier of the ingested document. */
  var document_id: js.UndefOr[String] = js.native
  /** Array of notices produced by the document-ingestion process. */
  var notices: js.UndefOr[js.Array[Notice]] = js.native
  /** Status of the document in the ingestion process. A status of `processing` is returned for documents that are ingested with a *version* date before `2019-01-01`. The `pending` status is returned for all others. */
  var status: js.UndefOr[String] = js.native
}

object DocumentAccepted {
  @scala.inline
  def apply(): DocumentAccepted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAccepted]
  }
  @scala.inline
  implicit class DocumentAcceptedOps[Self <: DocumentAccepted] (val x: Self) extends AnyVal {
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

