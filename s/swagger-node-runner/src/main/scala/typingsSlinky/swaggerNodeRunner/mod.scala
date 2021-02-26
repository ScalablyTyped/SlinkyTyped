package typingsSlinky.swaggerNodeRunner

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.global.Express.Application
import typingsSlinky.expressServeStaticCore.mod.global.Express.Request
import typingsSlinky.expressServeStaticCore.mod.global.Express.Response
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.restify.mod.Server
import typingsSlinky.swaggerNodeRunner.anon.Register
import typingsSlinky.swaggerNodeRunner.anon.Swagger
import typingsSlinky.swaggerNodeRunner.anon.SwaggerMetadata
import typingsSlinky.swaggerSchemaOfficial.mod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-node-runner", "create")
  @js.native
  def create(config: Config, cb: js.Function2[/* err */ js.UndefOr[js.Error], /* runner */ Runner, Unit]): Unit = js.native
  
  @js.native
  trait Config extends StObject {
    
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
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppRoot(value: String): Self = StObject.set(x, "appRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBagpipes(value: js.Any): Self = StObject.set(x, "bagpipes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBagpipesUndefined: Self = StObject.set(x, "bagpipes", js.undefined)
      
      @scala.inline
      def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigDirUndefined: Self = StObject.set(x, "configDir", js.undefined)
      
      @scala.inline
      def setControllersDirs(value: js.Array[String]): Self = StObject.set(x, "controllersDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllersDirsUndefined: Self = StObject.set(x, "controllersDirs", js.undefined)
      
      @scala.inline
      def setControllersDirsVarargs(value: String*): Self = StObject.set(x, "controllersDirs", js.Array(value :_*))
      
      @scala.inline
      def setDefaultPipe(value: String): Self = StObject.set(x, "defaultPipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPipeUndefined: Self = StObject.set(x, "defaultPipe", js.undefined)
      
      @scala.inline
      def setFittingsDirs(value: js.Array[String]): Self = StObject.set(x, "fittingsDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFittingsDirsUndefined: Self = StObject.set(x, "fittingsDirs", js.undefined)
      
      @scala.inline
      def setFittingsDirsVarargs(value: String*): Self = StObject.set(x, "fittingsDirs", js.Array(value :_*))
      
      @scala.inline
      def setMockControllersDirs(value: js.Array[String]): Self = StObject.set(x, "mockControllersDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMockControllersDirsUndefined: Self = StObject.set(x, "mockControllersDirs", js.undefined)
      
      @scala.inline
      def setMockControllersDirsVarargs(value: String*): Self = StObject.set(x, "mockControllersDirs", js.Array(value :_*))
      
      @scala.inline
      def setMockMode(value: Boolean): Self = StObject.set(x, "mockMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMockModeUndefined: Self = StObject.set(x, "mockMode", js.undefined)
      
      @scala.inline
      def setSwaggerControllerPipe(value: String): Self = StObject.set(x, "swaggerControllerPipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerControllerPipeUndefined: Self = StObject.set(x, "swaggerControllerPipe", js.undefined)
      
      @scala.inline
      def setSwaggerFile(value: String): Self = StObject.set(x, "swaggerFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerFileUndefined: Self = StObject.set(x, "swaggerFile", js.undefined)
      
      @scala.inline
      def setSwaggerSecurityHandlers(value: SwaggerSecurityHandlers): Self = StObject.set(x, "swaggerSecurityHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerSecurityHandlersUndefined: Self = StObject.set(x, "swaggerSecurityHandlers", js.undefined)
      
      @scala.inline
      def setValidateResponse(value: Boolean): Self = StObject.set(x, "validateResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateResponseUndefined: Self = StObject.set(x, "validateResponse", js.undefined)
    }
  }
  
  @js.native
  trait ConfigInternal extends StObject {
    
    /** Config of SwaggerNodeRunner  */
    var swagger: js.UndefOr[Config] = js.native
  }
  object ConfigInternal {
    
    @scala.inline
    def apply(): ConfigInternal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigInternal]
    }
    
    @scala.inline
    implicit class ConfigInternalMutableBuilder[Self <: ConfigInternal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSwagger(value: Config): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerUndefined: Self = StObject.set(x, "swagger", js.undefined)
    }
  }
  
  @js.native
  trait ConnectMiddleware extends Middleware {
    
    def middleware(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
    
    /** Register this Middleware with `app`  */
    def register(app: Application): Unit = js.native
  }
  object ConnectMiddleware {
    
    @scala.inline
    def apply(
      middleware: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit],
      register: Application => Unit,
      runner: Runner
    ): ConnectMiddleware = {
      val __obj = js.Dynamic.literal(middleware = js.Any.fromFunction0(middleware), register = js.Any.fromFunction1(register), runner = runner.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectMiddleware]
    }
    
    @scala.inline
    implicit class ConnectMiddlewareMutableBuilder[Self <: ConnectMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMiddleware(value: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]): Self = StObject.set(x, "middleware", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegister(value: Application => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    }
  }
  
  type ExpressMiddleware = ConnectMiddleware
  
  @js.native
  trait HapiMiddleware extends Middleware {
    
    /** Back-reference to Config object of `Runner` that has created this middleware */
    var config: ConfigInternal = js.native
    
    /** Hapi Plugin */
    var plugin: Register = js.native
  }
  object HapiMiddleware {
    
    @scala.inline
    def apply(config: ConfigInternal, plugin: Register, runner: Runner): HapiMiddleware = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any])
      __obj.asInstanceOf[HapiMiddleware]
    }
    
    @scala.inline
    implicit class HapiMiddlewareMutableBuilder[Self <: HapiMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: ConfigInternal): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: Register): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Middleware extends StObject {
    
    /** Back-reference to `swagger-node-runner`s `Runner` that has created this middleware */
    var runner: Runner = js.native
  }
  object Middleware {
    
    @scala.inline
    def apply(runner: Runner): Middleware = {
      val __obj = js.Dynamic.literal(runner = runner.asInstanceOf[js.Any])
      __obj.asInstanceOf[Middleware]
    }
    
    @scala.inline
    implicit class MiddlewareMutableBuilder[Self <: Middleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRunner(value: Runner): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RestifyMiddleware extends Middleware {
    
    /** Register this Middleware with `app`  */
    def register(app: Server): Unit = js.native
  }
  object RestifyMiddleware {
    
    @scala.inline
    def apply(register: Server => Unit, runner: Runner): RestifyMiddleware = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), runner = runner.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestifyMiddleware]
    }
    
    @scala.inline
    implicit class RestifyMiddlewareMutableBuilder[Self <: RestifyMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegister(value: Server => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Runner extends EventEmitter {
    
    /**
      * Nested Key Value description for _backpipes_ module
      * @see {@link https://github.com/apigee-127/bagpipes#pipes|Github Source}
      */
    var bagpipes: StringDictionary[js.Any] = js.native
    
    var config: ConfigInternal = js.native
    
    /** Create new Connect middleware */
    def connectMiddleware(): ConnectMiddleware = js.native
    
    def defaultErrorHandler(): js.Any = js.native
    
    /** Create new Express middleware */
    def expressMiddleware(): ExpressMiddleware = js.native
    
    /** Fetch a _bagpipe_ pipe */
    def getPipe(req: Swagger): js.Any = js.native
    
    /** Create new Hapi middleware */
    def hapiMiddleware(): HapiMiddleware = js.native
    
    /** Resolves path (relative to `config.appRoot`) */
    def resolveAppPath(to: js.Any*): String = js.native
    
    /** Create new Restify middleware */
    def restifyMiddleware(): RestifyMiddleware = js.native
    
    /** Create new Sails middleware */
    def sailsMiddleware(): SailsMiddleware = js.native
    
    /**
      * Current OpenAPI Specification (formaly known as Swagger RESTful API Documentation Specification)
      * @see {@link http://swagger.io/specification/|Swagger Specs}
      */
    var swagger: Spec = js.native
    
    var swaggerSecurityHandlers: js.UndefOr[SwaggerSecurityHandlers] = js.native
    
    /**
      * References to Swagger Tools Midleware (from _swagger-tools_ module)     *
      * @see {@link https://github.com/apigee-127/swagger-tools|Github Source}
      */
    var swaggerTools: SwaggerMetadata = js.native
  }
  
  @js.native
  trait SailsMiddleware extends Middleware {
    
    /** Express style middleware */
    def chain(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
  }
  object SailsMiddleware {
    
    @scala.inline
    def apply(
      chain: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit],
      runner: Runner
    ): SailsMiddleware = {
      val __obj = js.Dynamic.literal(chain = js.Any.fromFunction0(chain), runner = runner.asInstanceOf[js.Any])
      __obj.asInstanceOf[SailsMiddleware]
    }
    
    @scala.inline
    implicit class SailsMiddlewareMutableBuilder[Self <: SailsMiddleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChain(value: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]): Self = StObject.set(x, "chain", js.Any.fromFunction0(value))
    }
  }
  
  type SwaggerSecurityHandlers = StringDictionary[SwaggerToolsSecurityHandler]
  
  type SwaggerToolsMiddleware = js.Function3[/* req */ js.Any, /* res */ js.Any, /* next */ js.Any, js.Any]
  
  type SwaggerToolsSecurityHandler = js.Function4[
    /* request */ js.Any, 
    /* securityDefinition */ js.Any, 
    /* scopes */ js.Any, 
    /* callback */ js.Function2[
      /* err */ js.UndefOr[js.Error | SwaggerToolsSecurityHandlerCallbackError], 
      /* result */ js.UndefOr[js.Any], 
      Unit
    ], 
    Unit
  ]
  
  @js.native
  trait SwaggerToolsSecurityHandlerCallbackError extends StObject {
    
    var code: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
  }
  object SwaggerToolsSecurityHandlerCallbackError {
    
    @scala.inline
    def apply(): SwaggerToolsSecurityHandlerCallbackError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerToolsSecurityHandlerCallbackError]
    }
    
    @scala.inline
    implicit class SwaggerToolsSecurityHandlerCallbackErrorMutableBuilder[Self <: SwaggerToolsSecurityHandlerCallbackError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
}
