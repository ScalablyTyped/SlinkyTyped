package typingsSlinky.typeorm.browserMod

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.columnCommonOptionsMod.ColumnCommonOptions
import typingsSlinky.typeorm.columnHstoreOptionsMod.ColumnHstoreOptions
import typingsSlinky.typeorm.typeormStrings.hstore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Column")
@js.native
object Column_hstore extends js.Object {
  
  def apply(`type`: hstore): PropertyDecorator = js.native
  def apply(`type`: hstore, options: ColumnCommonOptions with ColumnHstoreOptions): PropertyDecorator = js.native
}
