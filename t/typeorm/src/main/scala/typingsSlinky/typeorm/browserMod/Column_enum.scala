package typingsSlinky.typeorm.browserMod

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.columnCommonOptionsMod.ColumnCommonOptions
import typingsSlinky.typeorm.columnEnumOptionsMod.ColumnEnumOptions
import typingsSlinky.typeorm.typeormStrings.enum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Column")
@js.native
object Column_enum extends js.Object {
  
  def apply(`type`: enum): PropertyDecorator = js.native
  def apply(`type`: enum, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
}
