package typingsSlinky.superstruct.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.superstruct.structMod.Struct
import typingsSlinky.superstruct.utilsMod.StructRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "partial")
@js.native
object partial extends js.Object {
  
  def apply[T, V /* <: StructRecord[_] */](Structs: V): Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typingsSlinky.superstruct.superstructStrings.partial with TopLevel[V], 
    _
  ] = js.native
  def apply[T, V /* <: StructRecord[_] */](Structs: Struct[T, V]): Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typingsSlinky.superstruct.superstructStrings.partial with TopLevel[V], 
    _
  ] = js.native
}
