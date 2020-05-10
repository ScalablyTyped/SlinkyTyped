package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Action
import typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateBatch` operation. */
@js.native
trait UpdateBatchParams extends js.Object {
  /** The action you want to perform on the specified batch-processing job. */
  var action: Action | String = js.native
  /** The ID of the batch-processing job you want to update. */
  var batch_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object UpdateBatchParams {
  @scala.inline
  def apply(action: Action | String, batch_id: String): UpdateBatchParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBatchParams]
  }
  @scala.inline
  implicit class UpdateBatchParamsOps[Self <: UpdateBatchParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: Action | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatch_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: Model | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_response(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(js.undefined)
        ret
    }
  }
  
}

