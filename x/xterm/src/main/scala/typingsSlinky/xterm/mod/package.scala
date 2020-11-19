package typingsSlinky.xterm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IEvent[T, U] = js.Function1[
    /* listener */ js.Function2[/* arg1 */ T, /* arg2 */ U, js.Any], 
    typingsSlinky.xterm.mod.IDisposable
  ]
}
