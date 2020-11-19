package typingsSlinky.vinylPaths

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function1[/* path */ java.lang.String, js.Any]
  
  type PathsStatic = js.Function1[
    /* callback */ js.UndefOr[typingsSlinky.vinylPaths.mod.Callback], 
    typingsSlinky.vinylPaths.mod.Paths
  ]
}
