package typingsSlinky.swaggerTools

import typingsSlinky.swaggerTools.mod.OperationParameter
import typingsSlinky.swaggerTools.mod.Swagger20Operation
import typingsSlinky.swaggerTools.mod.SwaggerRequestParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApiPath[P /* <: SwaggerRequestParameters */] extends js.Object {
  var apiPath: String = js.native
  var operation: js.UndefOr[Swagger20Operation] = js.native
  var operationParameters: js.UndefOr[js.Array[OperationParameter]] = js.native
  var operationPath: js.UndefOr[js.Array[String]] = js.native
  var params: P = js.native
  var path: js.Any = js.native
  var security: js.Array[_] = js.native
  var swaggerObject: js.Any = js.native
  var swaggerVersion: String = js.native
  var useStubs: js.UndefOr[Boolean] = js.native
}

object AnonApiPath {
  @scala.inline
  def apply[P](
    apiPath: String,
    params: P,
    path: js.Any,
    security: js.Array[_],
    swaggerObject: js.Any,
    swaggerVersion: String
  ): AnonApiPath[P] = {
    val __obj = js.Dynamic.literal(apiPath = apiPath.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], swaggerObject = swaggerObject.asInstanceOf[js.Any], swaggerVersion = swaggerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApiPath[P]]
  }
  @scala.inline
  implicit class AnonApiPathOps[Self[p] <: AnonApiPath[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withApiPath(value: String): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Any): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurity(value: js.Array[_]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwaggerObject(value: js.Any): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwaggerVersion(value: String): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: Swagger20Operation): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationParameters(value: js.Array[OperationParameter]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationParameters: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationPath(value: js.Array[String]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationPath: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationPath")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStubs(value: Boolean): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStubs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStubs: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStubs")(js.undefined)
        ret
    }
  }
  
}

