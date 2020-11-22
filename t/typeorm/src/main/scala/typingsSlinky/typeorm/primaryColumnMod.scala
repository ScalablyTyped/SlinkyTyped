package typingsSlinky.typeorm

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.columnOptionsMod.ColumnOptions
import typingsSlinky.typeorm.columnTypesMod.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/decorator/columns/PrimaryColumn", JSImport.Namespace)
@js.native
object primaryColumnMod extends js.Object {
  
  def PrimaryColumn(): PropertyDecorator = js.native
  def PrimaryColumn(options: ColumnOptions): PropertyDecorator = js.native
  def PrimaryColumn(`type`: js.UndefOr[ColumnType], options: ColumnOptions): PropertyDecorator = js.native
  def PrimaryColumn(`type`: ColumnType): PropertyDecorator = js.native
}
