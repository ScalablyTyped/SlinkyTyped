package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results of a successful `GET /v1/batches` request. */
@js.native
trait Batches extends js.Object {
  /** A list of the status of all batch requests. */
  var batches: js.UndefOr[js.Array[BatchStatus]] = js.native
}

object Batches {
  @scala.inline
  def apply(): Batches = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Batches]
  }
  @scala.inline
  implicit class BatchesOps[Self <: Batches] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatches(value: js.Array[BatchStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batches")(js.undefined)
        ret
    }
  }
  
}

