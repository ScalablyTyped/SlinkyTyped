package typingsSlinky.webpackDevMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Logger = typingsSlinky.loglevel.mod.Logger
  
  type MimeTypeMap = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  
  type Reporter = js.Function2[
    /* middlewareOptions */ typingsSlinky.webpackDevMiddleware.mod.Options, 
    /* reporterOptions */ typingsSlinky.webpackDevMiddleware.mod.ReporterOptions, 
    scala.Unit
  ]
}
