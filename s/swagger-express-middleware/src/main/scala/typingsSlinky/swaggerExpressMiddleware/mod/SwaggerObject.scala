package typingsSlinky.swaggerExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerObject extends js.Object {
  var basePath: js.UndefOr[String] = js.native
  var consumes: js.UndefOr[MimeTypes] = js.native
  var definitions: js.UndefOr[DefinitionsObject] = js.native
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.native
  var host: js.UndefOr[String] = js.native
  var info: InfoObject = js.native
  var parameters: js.UndefOr[ParametersDefinitionsObject] = js.native
  var paths: PathsObject = js.native
  var produces: js.UndefOr[MimeTypes] = js.native
  var responses: js.UndefOr[ResponsesDefinitionsObject] = js.native
  var schemes: js.UndefOr[js.Array[String]] = js.native
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.native
  var securityDefinitions: js.UndefOr[SecurityDefinitionsObject] = js.native
  var swagger: String = js.native
  var tags: js.UndefOr[js.Array[TagObject]] = js.native
}

object SwaggerObject {
  @scala.inline
  def apply(info: InfoObject, paths: PathsObject, swagger: String): SwaggerObject = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], swagger = swagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerObject]
  }
  @scala.inline
  implicit class SwaggerObjectOps[Self <: SwaggerObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: InfoObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaths(value: PathsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwagger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swagger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumes(value: MimeTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumes")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinitions(value: DefinitionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalDocs(value: ExternalDocumentationObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalDocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDocs")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: ParametersDefinitionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withProduces(value: MimeTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("produces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("produces")(js.undefined)
        ret
    }
    @scala.inline
    def withResponses(value: ResponsesDefinitionsObject): Self = {
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
    @scala.inline
    def withSchemes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemes")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurity(value: js.Array[SecurityRequirementObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityDefinitions(value: SecurityDefinitionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[TagObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

