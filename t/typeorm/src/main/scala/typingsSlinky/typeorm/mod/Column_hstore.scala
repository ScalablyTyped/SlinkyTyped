package typingsSlinky.typeorm.mod

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.optionsColumnCommonOptionsMod.ColumnCommonOptions
import typingsSlinky.typeorm.optionsColumnHstoreOptionsMod.ColumnHstoreOptions
import typingsSlinky.typeorm.typeormStrings.hstore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Column")
@js.native
object Column_hstore extends js.Object {
  
  def apply(`type`: hstore): PropertyDecorator = js.native
  def apply(`type`: hstore, options: ColumnCommonOptions with ColumnHstoreOptions): PropertyDecorator = js.native
}
