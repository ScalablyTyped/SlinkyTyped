package typingsSlinky.xlsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NumberFormat = java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.xlsx.mod.Range
    - typingsSlinky.xlsx.mod.CellAddress
  */
  type RangeSpec = typingsSlinky.xlsx.mod._RangeSpec | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.xlsx.mod.MarginInfo
    - typingsSlinky.xlsx.mod.SheetType
  */
  type SheetKeys = typingsSlinky.xlsx.mod._SheetKeys | java.lang.String
  type StrictWS = org.scalablytyped.runtime.StringDictionary[typingsSlinky.xlsx.mod.CellObject]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.xlsx.mod.SheetKeys
    - js.Array[
  typingsSlinky.xlsx.mod.ColInfo | typingsSlinky.xlsx.mod.Range | typingsSlinky.xlsx.mod.RowInfo]
    - typingsSlinky.xlsx.mod.ProtectInfo
    - typingsSlinky.xlsx.mod.AutoFilterInfo
  */
  type WSKeys = typingsSlinky.xlsx.mod._WSKeys | (js.Array[
    typingsSlinky.xlsx.mod.ColInfo | typingsSlinky.xlsx.mod.Range | typingsSlinky.xlsx.mod.RowInfo
  ]) | java.lang.String
  type WSSpec = java.lang.String | scala.Double | typingsSlinky.xlsx.mod.WorkSheet
}
