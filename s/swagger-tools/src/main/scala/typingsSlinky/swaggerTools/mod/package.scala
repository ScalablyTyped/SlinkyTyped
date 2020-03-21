package typingsSlinky.swaggerTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InitializeMiddlewareCallback12 = js.Function1[/* middleware */ typingsSlinky.swaggerTools.mod.Middleware12, scala.Unit]
  type InitializeMiddlewareCallback20 = js.Function1[/* middleware */ typingsSlinky.swaggerTools.mod.Middleware20, scala.Unit]
  type Swagger20Security = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SwaggerRequestParameters = org.scalablytyped.runtime.StringDictionary[js.UndefOr[typingsSlinky.swaggerTools.mod.SwaggerRequestParameter[js.Any]]]
  type SwaggerRouter12HandlerFunction = js.Function3[
    /* req */ typingsSlinky.swaggerTools.mod.Swagger12Request, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  type SwaggerRouter12OptionsControllers = org.scalablytyped.runtime.StringDictionary[typingsSlinky.swaggerTools.mod.SwaggerRouter12HandlerFunction]
  type SwaggerRouter20HandlerFunction = js.Function3[
    /* req */ typingsSlinky.swaggerTools.mod.Swagger20Request[js.Any], 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    /* next */ js.Function1[/* arg */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  type SwaggerRouter20OptionsControllers = org.scalablytyped.runtime.StringDictionary[typingsSlinky.swaggerTools.mod.SwaggerRouter20HandlerFunction]
  type SwaggerSecurityCallback = js.Function1[
    /* err */ js.UndefOr[typingsSlinky.swaggerTools.mod.SwaggerSecurityError], 
    scala.Unit
  ]
  type SwaggerSecurityHandler = js.Function4[
    /* request */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* securityDefinition */ js.Any, 
    /* scopes */ java.lang.String | js.Array[java.lang.String], 
    /* callback */ typingsSlinky.swaggerTools.mod.SwaggerSecurityCallback, 
    scala.Unit
  ]
  type SwaggerSecurityOptions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.swaggerTools.mod.SwaggerSecurityHandler]
  type SwaggerUi12ApiDeclarations = org.scalablytyped.runtime.StringDictionary[js.Any]
}
