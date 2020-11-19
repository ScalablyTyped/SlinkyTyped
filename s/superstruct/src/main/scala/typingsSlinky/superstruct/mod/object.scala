package typingsSlinky.superstruct.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Record
import typingsSlinky.superstruct.libTypesMod.OptionalizeObject
import typingsSlinky.superstruct.structMod.Struct
import typingsSlinky.superstruct.utilsMod.StructRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "object")
@js.native
object `object` extends js.Object {
  
  def apply[V /* <: StructRecord[_] */](): Struct[Record[String, _], _] = js.native
  def apply[V /* <: StructRecord[_] */](Structs: V): Struct[
    OptionalizeObject[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typingsSlinky.superstruct.superstructStrings.`object` with TopLevel[V]
    ], 
    V
  ] = js.native
}
