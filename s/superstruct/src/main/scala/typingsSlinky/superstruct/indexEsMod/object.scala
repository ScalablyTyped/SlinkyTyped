package typingsSlinky.superstruct.indexEsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "object")
@js.native
object `object` extends js.Object {
  
  /**
    * Validate that an object with specific entry values.
    */
  /**
    * Validate that an object with specific entry values.
    */
  def apply[V /* <: StructRecord[_] */](): Struct_[Record[String, _], _] = js.native
  def apply[V /* <: StructRecord[_] */](Structs: V): Struct_[
    OptionalizeObject[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typingsSlinky.superstruct.superstructStrings.`object` with TopLevel[V]
    ], 
    V
  ] = js.native
}
