package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.std.Date
  - typingsSlinky.std.BufferSource
  - typingsSlinky.std.IDBArrayKey
*/
trait IDBValidKey extends js.Object

object IDBValidKey {
  @scala.inline
  implicit def apply(value: BufferSource): IDBValidKey = value.asInstanceOf[IDBValidKey]
  @scala.inline
  implicit def apply(value: js.Date): IDBValidKey = value.asInstanceOf[IDBValidKey]
  @scala.inline
  implicit def apply(value: Double): IDBValidKey = value.asInstanceOf[IDBValidKey]
  @scala.inline
  implicit def apply(value: IDBArrayKey): IDBValidKey = value.asInstanceOf[IDBValidKey]
  @scala.inline
  implicit def apply(value: java.lang.String): IDBValidKey = value.asInstanceOf[IDBValidKey]
}

