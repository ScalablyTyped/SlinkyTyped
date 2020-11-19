package typingsSlinky.throttleDebounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type debounce[T] = typingsSlinky.throttleDebounce.mod.throttle[T]
  
  type throttle[T] = T with typingsSlinky.throttleDebounce.mod.Cancel
}
