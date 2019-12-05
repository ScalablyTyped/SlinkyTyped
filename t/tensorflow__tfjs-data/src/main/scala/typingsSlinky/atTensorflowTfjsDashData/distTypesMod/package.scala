package typingsSlinky.atTensorflowTfjsDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import org.scalajs.dom.raw.Blob
  import org.scalajs.dom.raw.File
  import typingsSlinky.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer

  type ContainerOrT[T] = Container[T] | T
  type DataElement = TensorContainer
  type FileElement = File | Blob | scala.scalajs.js.typedarray.Uint8Array
}
