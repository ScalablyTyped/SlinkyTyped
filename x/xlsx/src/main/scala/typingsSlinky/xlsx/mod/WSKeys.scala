package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xlsx.mod.SheetKeys
  - js.Array[
typingsSlinky.xlsx.mod.ColInfo | typingsSlinky.xlsx.mod.Range | typingsSlinky.xlsx.mod.RowInfo]
  - typingsSlinky.xlsx.mod.ProtectInfo
  - typingsSlinky.xlsx.mod.AutoFilterInfo
*/
trait WSKeys extends js.Object

object WSKeys {
  @scala.inline
  implicit def apply(value: js.Array[ColInfo | Range | RowInfo]): WSKeys = value.asInstanceOf[WSKeys]
  @scala.inline
  implicit def apply(value: AutoFilterInfo): WSKeys = value.asInstanceOf[WSKeys]
  @scala.inline
  implicit def apply(value: ProtectInfo): WSKeys = value.asInstanceOf[WSKeys]
  @scala.inline
  implicit def apply(value: SheetKeys): WSKeys = value.asInstanceOf[WSKeys]
}

