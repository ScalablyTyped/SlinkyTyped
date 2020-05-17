package typingsSlinky.sortArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - / * keyof T * / java.lang.String
  - js.Array[/ * keyof T * / java.lang.String]
*/
trait ColumnNames[T] extends js.Object

object ColumnNames {
  @scala.inline
  implicit def apply[T](value: js.Array[/* keyof T */ String]): ColumnNames[T] = value.asInstanceOf[ColumnNames[T]]
  @scala.inline
  implicit def apply[T](value: /* keyof T */ String): ColumnNames[T] = value.asInstanceOf[ColumnNames[T]]
}

