package typingsSlinky.tensorflowTfjsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ContainerOrT[T] = typingsSlinky.tensorflowTfjsData.typesMod.Container[T] | T
  type FileElement = org.scalajs.dom.raw.File | org.scalajs.dom.raw.Blob | js.typedarray.Uint8Array
}
