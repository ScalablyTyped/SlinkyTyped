package typingsSlinky.useCallbackRef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type RefCallback[T] = js.Function1[/* newValue */ T | scala.Null, scala.Unit]
  type RefObject[T] = typingsSlinky.react.mod.MutableRefObject[T | scala.Null]
}
