package typingsSlinky.superstruct.indexEsMod

import typingsSlinky.std.InstanceType
import typingsSlinky.superstruct.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "instance")
@js.native
object instance extends js.Object {
  
  /**
    * Validate that a value is an instance of a class.
    */
  def apply[T /* <: Instantiable */](Class: T): Struct_[InstanceType[T], _] = js.native
}
