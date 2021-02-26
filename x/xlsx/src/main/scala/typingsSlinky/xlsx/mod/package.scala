package typingsSlinky.xlsx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  def read(data: js.Any): typingsSlinky.xlsx.mod.WorkBook = typingsSlinky.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.xlsx.mod.WorkBook]
  @scala.inline
  def read(data: js.Any, opts: typingsSlinky.xlsx.mod.ParsingOptions): typingsSlinky.xlsx.mod.WorkBook = (typingsSlinky.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xlsx.mod.WorkBook]
  
  @scala.inline
  def readFile(filename: java.lang.String): typingsSlinky.xlsx.mod.WorkBook = typingsSlinky.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filename.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.xlsx.mod.WorkBook]
  @scala.inline
  def readFile(filename: java.lang.String, opts: typingsSlinky.xlsx.mod.ParsingOptions): typingsSlinky.xlsx.mod.WorkBook = (typingsSlinky.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.xlsx.mod.WorkBook]
  
  @scala.inline
  def stream: typingsSlinky.xlsx.mod.StreamUtils = typingsSlinky.xlsx.mod.^.asInstanceOf[js.Dynamic].selectDynamic("stream").asInstanceOf[typingsSlinky.xlsx.mod.StreamUtils]
  
  @scala.inline
  def utils: typingsSlinky.xlsx.mod.XLSXUtils = typingsSlinky.xlsx.mod.^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[typingsSlinky.xlsx.mod.XLSXUtils]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.xlsx.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  
  @scala.inline
  def write(data: typingsSlinky.xlsx.mod.WorkBook): js.Any = typingsSlinky.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def write(data: typingsSlinky.xlsx.mod.WorkBook, opts: typingsSlinky.xlsx.mod.WritingOptions): js.Any = (typingsSlinky.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def writeFile(data: typingsSlinky.xlsx.mod.WorkBook, filename: java.lang.String): js.Any = (typingsSlinky.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def writeFile(
    data: typingsSlinky.xlsx.mod.WorkBook,
    filename: java.lang.String,
    opts: typingsSlinky.xlsx.mod.WritingOptions
  ): js.Any = (typingsSlinky.xlsx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
