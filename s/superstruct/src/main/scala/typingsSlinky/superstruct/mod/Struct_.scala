package typingsSlinky.superstruct.mod

import typingsSlinky.superstruct.anon.Refiner
import typingsSlinky.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "Struct")
@js.native
class Struct_[T, S] protected () extends Struct[T, S] {
  def this(props: Refiner[S, T]) = this()
}

