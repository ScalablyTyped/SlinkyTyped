package typingsSlinky.tstl.irandomaccesscontainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IRandomAccessContainer {
  type ValueType[Container /* <: js.Array[_] | typingsSlinky.tstl.irandomaccesscontainerMod.IRandomAccessContainer[_] */] = typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer.ValueType[
    typingsSlinky.tstl.irandomaccesscontainerMod.IRandomAccessContainer.IteratorType[Container]
  ]
}
