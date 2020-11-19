package typingsSlinky.vegaTypings.dataMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.csv
import typingsSlinky.vegaTypings.vegaTypingsStrings.dsv
import typingsSlinky.vegaTypings.vegaTypingsStrings.json
import typingsSlinky.vegaTypings.vegaTypingsStrings.tsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Format extends js.Object
object _Format {
  
  @scala.inline
  def FormatJSON(`type`: json): _Format = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Format]
  }
  
  @scala.inline
  def FormatSV(`type`: csv | tsv): _Format = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Format]
  }
  
  @scala.inline
  def FormatDSV(delimiter: String, `type`: dsv): _Format = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Format]
  }
  
  @scala.inline
  def Parse(parse: typingsSlinky.vegaTypings.dataMod.Parse): _Format = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Format]
  }
}
