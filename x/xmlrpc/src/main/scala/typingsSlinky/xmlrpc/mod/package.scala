package typingsSlinky.xmlrpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type ServerFunction = js.Function3[
    /* error */ js.Any, 
    /* params */ js.Any, 
    /* callback */ js.Function2[/* error */ js.Any, /* value */ js.Any, scala.Unit], 
    scala.Unit
  ]
  
  type ServerNotFoundFunction = js.Function2[/* methodName */ java.lang.String, /* params */ js.Array[js.Any], scala.Unit]
}
