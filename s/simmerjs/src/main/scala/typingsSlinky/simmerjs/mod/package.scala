package typingsSlinky.simmerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type QueryEngine = js.Function2[
    /* selector */ java.lang.String, 
    /* onError */ js.Function1[/* error */ js.Any, scala.Unit], 
    typingsSlinky.std.ArrayLike[org.scalajs.dom.raw.Element]
  ]
}
