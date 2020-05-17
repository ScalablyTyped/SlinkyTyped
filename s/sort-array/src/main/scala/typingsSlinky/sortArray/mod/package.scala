package typingsSlinky.sortArray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomOrder[T] = typingsSlinky.std.Record[/* keyof T */ java.lang.String, typingsSlinky.sortArray.mod.CustomOrderTypes[T]]
  type CustomOrderTypes[T] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
}
