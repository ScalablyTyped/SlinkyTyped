package typingsSlinky.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serializationMod {
  type FromConfigMethod[T /* <: typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable */] = js.Function2[
    /* cls */ typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor[T], 
    /* config */ typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict, 
    T
  ]
}
