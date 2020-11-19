package typingsSlinky.sha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CheckCallback[R] = js.Function1[/* err */ js.Error | scala.Null, R]
  
  type GetCallback = js.Function2[/* err */ js.Error | scala.Null, /* actual */ java.lang.String, scala.Unit]
}
