package typingsSlinky.swaggerNodeRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    *  Path to app
    */
  var appRoot: String = js.native
  /**
    * Used for Bagpipes library
    *
    * @se @link{https://github.com/apigee-127/bagpipes|Github Source}
    */
  var bagpipes: js.UndefOr[js.Any] = js.native
  /**
    *  Sets `NODE_CONFIG_DIR` env if not set yet
    */
  var configDir: js.UndefOr[String] = js.native
  /**
    * Swagger controller directories
    *
    * default is array with `/api/controllers` relative to `appRoot`
    */
  var controllersDirs: js.UndefOr[js.Array[String]] = js.native
  /**
    *  default is `null`
    */
  var defaultPipe: js.UndefOr[String] = js.native
  /**
    * Used for Bagpipes library
    *
    * default is `[api/fittings]`
    */
  var fittingsDirs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Swagger mock controller directories
    *
    * default is array with `/api/mocks` relative to `appRoot`
    */
  var mockControllersDirs: js.UndefOr[js.Array[String]] = js.native
  /**
    * If `true` API is in mock mode
    *
    * default is `false`
    */
  var mockMode: js.UndefOr[Boolean] = js.native
  /**
    * default is `swagger_controllers`
    */
  var swaggerControllerPipe: js.UndefOr[String] = js.native
  /**
    * Absolute path to swagger.yml file, if not set default value is used.
    */
  var swaggerFile: js.UndefOr[String] = js.native
  /**
    * Define Middleware for using Swagger security information to authenticate requests. Part of _swagger-tools_
    *
    * default is `undefined`
    * @see {@link https://github.com/apigee-127/swagger-tools/blob/master/middleware/swagger-security.js|Github Source}
    */
  var swaggerSecurityHandlers: js.UndefOr[SwaggerSecurityHandlers] = js.native
  /**
    * If `true` resonse is validated
    *
    * default is `true`
    */
  var validateResponse: js.UndefOr[Boolean] = js.native
}

object Config {
  @scala.inline
  def apply(appRoot: String): Config = {
    val __obj = js.Dynamic.literal(appRoot = appRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBagpipes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bagpipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBagpipes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bagpipes")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configDir")(js.undefined)
        ret
    }
    @scala.inline
    def withControllersDirs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllersDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControllersDirs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllersDirs")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPipe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPipe")(js.undefined)
        ret
    }
    @scala.inline
    def withFittingsDirs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fittingsDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFittingsDirs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fittingsDirs")(js.undefined)
        ret
    }
    @scala.inline
    def withMockControllersDirs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockControllersDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMockControllersDirs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockControllersDirs")(js.undefined)
        ret
    }
    @scala.inline
    def withMockMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMockMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSwaggerControllerPipe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerControllerPipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwaggerControllerPipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerControllerPipe")(js.undefined)
        ret
    }
    @scala.inline
    def withSwaggerFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwaggerFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSwaggerSecurityHandlers(value: SwaggerSecurityHandlers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerSecurityHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwaggerSecurityHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerSecurityHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateResponse")(js.undefined)
        ret
    }
  }
  
}

