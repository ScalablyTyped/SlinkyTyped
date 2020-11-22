package typingsSlinky.typeorm.browserMod

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.columnOptionsMod.ColumnOptions
import typingsSlinky.typeorm.columnTypesMod.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "PrimaryColumn")
@js.native
object PrimaryColumn extends js.Object {
  
  def apply(): PropertyDecorator = js.native
  def apply(options: ColumnOptions): PropertyDecorator = js.native
  def apply(`type`: js.UndefOr[ColumnType], options: ColumnOptions): PropertyDecorator = js.native
  def apply(`type`: ColumnType): PropertyDecorator = js.native
}
