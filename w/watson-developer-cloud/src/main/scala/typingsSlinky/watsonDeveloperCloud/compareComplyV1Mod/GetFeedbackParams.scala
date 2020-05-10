package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.GetFeedbackConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getFeedback` operation. */
@js.native
trait GetFeedbackParams extends js.Object {
  /** A string that specifies the feedback entry to be included in the output. */
  var feedback_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object GetFeedbackParams {
  @scala.inline
  def apply(feedback_id: String): GetFeedbackParams = {
    val __obj = js.Dynamic.literal(feedback_id = feedback_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFeedbackParams]
  }
  @scala.inline
  implicit class GetFeedbackParamsOps[Self <: GetFeedbackParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeedback_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_id")(value.asInstanceOf[js.Any])
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

