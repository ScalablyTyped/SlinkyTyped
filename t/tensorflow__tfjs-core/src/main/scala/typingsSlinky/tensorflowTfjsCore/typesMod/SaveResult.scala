package typingsSlinky.tensorflowTfjsCore.typesMod

import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveResult extends js.Object {
  /**
    * Error messages and related data (if any).
    */
  var errors: js.UndefOr[js.Array[js.Object | String]] = js.native
  /**
    * Information about the model artifacts saved.
    */
  var modelArtifactsInfo: ModelArtifactsInfo = js.native
  /**
    * HTTP responses from the server that handled the model-saving request (if
    * any). This is applicable only to server-based saving routes.
    */
  var responses: js.UndefOr[js.Array[Response]] = js.native
}

object SaveResult {
  @scala.inline
  def apply(modelArtifactsInfo: ModelArtifactsInfo): SaveResult = {
    val __obj = js.Dynamic.literal(modelArtifactsInfo = modelArtifactsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResult]
  }
  @scala.inline
  implicit class SaveResultOps[Self <: SaveResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModelArtifactsInfo(value: ModelArtifactsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelArtifactsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[js.Object | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withResponses(value: js.Array[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(js.undefined)
        ret
    }
  }
  
}

