package typingsSlinky.swaggerTools

import typingsSlinky.swaggerTools.mod.SwaggerRequestParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApi extends js.Object {
  var api: js.Any = js.native
  var apiDeclaration: js.Any = js.native
  var apiIndex: Double = js.native
  var authorizations: js.UndefOr[js.Any] = js.native
  var operation: js.UndefOr[js.Any] = js.native
  var operationPath: js.UndefOr[js.Array[String]] = js.native
  var params: SwaggerRequestParameters = js.native
  var resourceIndex: Double = js.native
  var resourceListing: js.Any = js.native
  var swaggerVersion: String = js.native
  var useStubs: js.UndefOr[Boolean] = js.native
}

object AnonApi {
  @scala.inline
  def apply(
    api: js.Any,
    apiDeclaration: js.Any,
    apiIndex: Double,
    params: SwaggerRequestParameters,
    resourceIndex: Double,
    resourceListing: js.Any,
    swaggerVersion: String
  ): AnonApi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], apiDeclaration = apiDeclaration.asInstanceOf[js.Any], apiIndex = apiIndex.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], resourceIndex = resourceIndex.asInstanceOf[js.Any], resourceListing = resourceListing.asInstanceOf[js.Any], swaggerVersion = swaggerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApi]
  }
  @scala.inline
  implicit class AnonApiOps[Self <: AnonApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiDeclaration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: SwaggerRequestParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceListing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceListing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwaggerVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorizations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizations")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationPath(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationPath")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStubs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStubs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStubs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStubs")(js.undefined)
        ret
    }
  }
  
}

