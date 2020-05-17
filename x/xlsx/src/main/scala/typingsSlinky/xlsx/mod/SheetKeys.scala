package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.xlsx.mod.MarginInfo
  - typingsSlinky.xlsx.mod.SheetType
*/
trait SheetKeys extends WSKeys

object SheetKeys {
  @scala.inline
  implicit def apply(value: MarginInfo): SheetKeys = value.asInstanceOf[SheetKeys]
  @scala.inline
  implicit def apply(value: SheetType): SheetKeys = value.asInstanceOf[SheetKeys]
  @scala.inline
  implicit def apply(value: String): SheetKeys = value.asInstanceOf[SheetKeys]
}

