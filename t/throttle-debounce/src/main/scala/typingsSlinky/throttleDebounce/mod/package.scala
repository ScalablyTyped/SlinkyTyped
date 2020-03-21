package typingsSlinky.throttleDebounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type debounce[T] = typingsSlinky.throttleDebounce.mod.throttle[T]
  type throttle[T] = T with typingsSlinky.throttleDebounce.mod.Cancel
}
