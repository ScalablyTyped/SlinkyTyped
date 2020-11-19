package typingsSlinky.swaggerNodeRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExpressMiddleware = typingsSlinky.swaggerNodeRunner.mod.ConnectMiddleware
  
  type SwaggerSecurityHandlers = org.scalablytyped.runtime.StringDictionary[typingsSlinky.swaggerNodeRunner.mod.SwaggerToolsSecurityHandler]
  
  type SwaggerToolsMiddleware = js.Function3[/* req */ js.Any, /* res */ js.Any, /* next */ js.Any, js.Any]
  
  type SwaggerToolsSecurityHandler = js.Function4[
    /* request */ js.Any, 
    /* securityDefinition */ js.Any, 
    /* scopes */ js.Any, 
    /* callback */ js.Function2[
      /* err */ js.UndefOr[
        js.Error | typingsSlinky.swaggerNodeRunner.mod.SwaggerToolsSecurityHandlerCallbackError
      ], 
      /* result */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
