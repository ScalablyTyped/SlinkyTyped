package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `deleteTrainingExample` operation. */
@js.native
trait DeleteTrainingExampleParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String = js.native
  /** The ID of the environment. */
  var environment_id: String = js.native
  /** The ID of the document as it is indexed. */
  var example_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The ID of the query used for training. */
  var query_id: String = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object DeleteTrainingExampleParams {
  @scala.inline
  def apply(collection_id: String, environment_id: String, example_id: String, query_id: String): DeleteTrainingExampleParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], example_id = example_id.asInstanceOf[js.Any], query_id = query_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrainingExampleParams]
  }
  @scala.inline
  implicit class DeleteTrainingExampleParamsOps[Self <: DeleteTrainingExampleParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExample_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("example_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_id")(value.asInstanceOf[js.Any])
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

