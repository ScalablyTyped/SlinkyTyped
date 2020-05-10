package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DocumentCounts. */
@js.native
trait DocumentCounts extends js.Object {
  /** The total number of available documents in the collection. */
  var available: js.UndefOr[Double] = js.native
  /** The number of documents in the collection that failed to be ingested. */
  var failed: js.UndefOr[Double] = js.native
  /** The number of documents that have been uploaded to the collection, but have not yet started processing. */
  var pending: js.UndefOr[Double] = js.native
  /** The number of documents in the collection that are currently being processed. */
  var processing: js.UndefOr[Double] = js.native
}

object DocumentCounts {
  @scala.inline
  def apply(): DocumentCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentCounts]
  }
  @scala.inline
  implicit class DocumentCountsOps[Self <: DocumentCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(js.undefined)
        ret
    }
    @scala.inline
    def withFailed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(js.undefined)
        ret
    }
    @scala.inline
    def withPending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(js.undefined)
        ret
    }
  }
  
}

