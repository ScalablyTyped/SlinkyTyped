package typingsSlinky.superstruct.mod

import typingsSlinky.superstruct.structMod.Struct
import typingsSlinky.superstruct.structMod.StructContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "dynamic")
@js.native
object dynamic extends js.Object {
  
  def apply[T](fn: js.Function2[/* value */ js.Any, /* ctx */ StructContext, Struct[T, _]]): Struct[T, _] = js.native
}
