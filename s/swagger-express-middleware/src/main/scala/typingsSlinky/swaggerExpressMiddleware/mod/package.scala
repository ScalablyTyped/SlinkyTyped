package typingsSlinky.swaggerExpressMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CORSSignature = js.Function0[
    typingsSlinky.express.mod.RequestHandler[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary]
  ]
  type DefinitionsObject = org.scalablytyped.runtime.StringDictionary[typingsSlinky.swaggerExpressMiddleware.mod.SchemaObject]
  type ExampleObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type HeaderObject = typingsSlinky.swaggerExpressMiddleware.mod.ItemsObject
  type HeadersObject = org.scalablytyped.runtime.StringDictionary[typingsSlinky.swaggerExpressMiddleware.mod.HeaderObject]
  type MetadataSignature = js.Function1[
    /* router */ js.UndefOr[typingsSlinky.express.mod.Application_ | typingsSlinky.express.mod.Router], 
    typingsSlinky.express.mod.RequestHandler[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary]
  ]
  type MimeTypes = js.Array[java.lang.String]
  type MockSignature = js.Function2[
    /* router */ js.UndefOr[typingsSlinky.express.mod.Application_ | typingsSlinky.express.mod.Router], 
    /* datastore */ js.UndefOr[js.Any], 
    typingsSlinky.express.mod.RequestHandler[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary]
  ]
  type Parameters = js.Array[
    typingsSlinky.swaggerExpressMiddleware.mod.ParameterObject | typingsSlinky.swaggerExpressMiddleware.mod.ReferenceObject
  ]
  type ParametersDefinitionsObject = org.scalablytyped.runtime.StringDictionary[typingsSlinky.swaggerExpressMiddleware.mod.ParameterObject]
  type PathsObject = org.scalablytyped.runtime.StringDictionary[typingsSlinky.swaggerExpressMiddleware.mod.PathItemObject | js.Any]
  type ResponsesDefinitionsObject = org.scalablytyped.runtime.StringDictionary[typingsSlinky.swaggerExpressMiddleware.mod.ResponseObject]
  type ScopesObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SecurityDefinitionsObject = org.scalablytyped.runtime.StringDictionary[typingsSlinky.swaggerExpressMiddleware.mod.SecuritySchemeObject]
  type SecurityRequirementObject = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type SwaggerMiddlewareConstructor = js.Function3[
    /* apiDefinitionPathOrObject */ java.lang.String | typingsSlinky.swaggerExpressMiddleware.mod.SwaggerObject, 
    /* appOrRouter */ typingsSlinky.express.mod.Application_ | typingsSlinky.express.mod.Router, 
    /* cb */ typingsSlinky.swaggerExpressMiddleware.mod.SwaggerMiddlewareConstructorCallback, 
    typingsSlinky.swaggerExpressMiddleware.mod.SwaggerMiddleware
  ]
  type SwaggerMiddlewareConstructorCallback = js.Function4[
    /* err */ js.Any, 
    /* middleware */ typingsSlinky.swaggerExpressMiddleware.mod.SwaggerMiddleware, 
    /* api */ typingsSlinky.swaggerExpressMiddleware.mod.SwaggerObject, 
    /* parser */ typingsSlinky.swaggerParser.mod.^, 
    scala.Unit
  ]
}
