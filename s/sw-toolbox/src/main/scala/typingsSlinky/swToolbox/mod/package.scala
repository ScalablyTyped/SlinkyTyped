package typingsSlinky.swToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Handler = js.Function1[
    /* request */ typingsSlinky.swToolbox.mod.Request, 
    js.Promise[typingsSlinky.swToolbox.mod.Response]
  ]
  
  type PrecacheURL = typingsSlinky.swToolbox.mod.Request | java.lang.String
  
  type PrecacheURLs = js.Promise[js.Array[typingsSlinky.swToolbox.mod.PrecacheURL]] | js.Array[typingsSlinky.swToolbox.mod.PrecacheURL]
  
  type URLPattern = java.lang.String | js.RegExp
}
