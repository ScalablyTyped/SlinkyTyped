package typingsSlinky.superstruct.mod

import typingsSlinky.superstruct.structMod.Struct
import typingsSlinky.superstruct.utilsMod.StructTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "union")
@js.native
object union extends js.Object {
  
  def apply[A](Structs: StructTuple[js.Array[A]]): Struct[A, _] = js.native
}
