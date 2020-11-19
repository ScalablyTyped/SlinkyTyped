package typingsSlinky.superstruct.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.superstruct.structMod.Struct
import typingsSlinky.superstruct.utilsMod.StructRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "type")
@js.native
object `type` extends js.Object {
  
  def apply[V /* <: StructRecord[_] */](Structs: V): Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typingsSlinky.superstruct.superstructStrings.`type` with TopLevel[V], 
    _
  ] = js.native
}
