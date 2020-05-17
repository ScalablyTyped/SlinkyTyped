package typingsSlinky.tstl.ibidirectionalcontainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IBidirectionalContainer {
  type ValueType[Container /* <: js.Array[_] | (typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer[_, _]) */] = typingsSlinky.tstl.ipointerMod.IPointer.ValueType[
    typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.IteratorType[Container]
  ]
}
