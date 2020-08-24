package typingsSlinky.superstruct

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Record
import typingsSlinky.superstruct.structMod.Struct
import typingsSlinky.superstruct.structMod.StructContext
import typingsSlinky.superstruct.structMod.StructFailure
import typingsSlinky.superstruct.structMod.StructResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def toFailures(result: StructResult, context: StructContext): js.Iterable[StructFailure] = js.native
  type StructRecord[T] = Record[String, Struct[T, js.Any]]
  type StructTuple[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: superstruct.superstruct/lib/struct.Struct<T[K], any>}
    */ typingsSlinky.superstruct.superstructStrings.StructTuple with TopLevel[T]
}

