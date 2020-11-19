package typingsSlinky.superstruct.mod

import typingsSlinky.std.InstanceType
import typingsSlinky.superstruct.anon.Instantiable
import typingsSlinky.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "instance")
@js.native
object instance extends js.Object {
  
  def apply[T /* <: Instantiable */](Class: T): Struct[InstanceType[T], _] = js.native
}
