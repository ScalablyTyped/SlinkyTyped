package typingsSlinky.walkSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Optionalize[T, K /* <: /* keyof T */ java.lang.String */] = (typingsSlinky.std.Omit[T, K]) with (typingsSlinky.std.Partial[typingsSlinky.std.Pick[T, K]])
}
