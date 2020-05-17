package typingsSlinky.tstl.iforwardcontainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IForwardContainer {
  type ValueType[Container /* <: js.Array[_] | typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer[_] */] = typingsSlinky.tstl.ipointerMod.IPointer.ValueType[
    typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer.IteratorType[Container]
  ]
}
