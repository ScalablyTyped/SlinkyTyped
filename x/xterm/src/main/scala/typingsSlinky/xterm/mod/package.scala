package typingsSlinky.xterm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.xterm.xtermStrings.normal
    - typingsSlinky.xterm.xtermStrings.bold
    - typingsSlinky.xterm.xtermStrings.`100`
    - typingsSlinky.xterm.xtermStrings.`200`
    - typingsSlinky.xterm.xtermStrings.`300`
    - typingsSlinky.xterm.xtermStrings.`400`
    - typingsSlinky.xterm.xtermStrings.`500`
    - typingsSlinky.xterm.xtermStrings.`600`
    - typingsSlinky.xterm.xtermStrings.`700`
    - typingsSlinky.xterm.xtermStrings.`800`
    - typingsSlinky.xterm.xtermStrings.`900`
    - scala.Double
  */
  type FontWeight = typingsSlinky.xterm.mod._FontWeight | scala.Double
  
  type IEvent[T, U] = js.Function1[
    /* listener */ js.Function2[/* arg1 */ T, /* arg2 */ U, js.Any], 
    typingsSlinky.xterm.mod.IDisposable
  ]
}
