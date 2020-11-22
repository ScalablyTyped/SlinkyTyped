package typingsSlinky.typeorm.browserMod

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.columnCommonOptionsMod.ColumnCommonOptions
import typingsSlinky.typeorm.columnEmbeddedOptionsMod.ColumnEmbeddedOptions
import typingsSlinky.typeorm.columnNumericOptionsMod.ColumnNumericOptions
import typingsSlinky.typeorm.columnOptionsMod.ColumnOptions
import typingsSlinky.typeorm.columnTypesMod.SimpleColumnType
import typingsSlinky.typeorm.columnTypesMod.SpatialColumnType
import typingsSlinky.typeorm.columnTypesMod.WithLengthColumnType
import typingsSlinky.typeorm.columnTypesMod.WithPrecisionColumnType
import typingsSlinky.typeorm.columnTypesMod.WithWidthColumnType
import typingsSlinky.typeorm.columnWithLengthOptionsMod.ColumnWithLengthOptions
import typingsSlinky.typeorm.columnWithWidthOptionsMod.ColumnWithWidthOptions
import typingsSlinky.typeorm.spatialColumnOptionsMod.SpatialColumnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Column")
@js.native
object Column extends js.Object {
  
  def apply(): PropertyDecorator = js.native
  def apply(options: ColumnOptions): PropertyDecorator = js.native
  def apply(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function]): PropertyDecorator = js.native
  def apply(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function], options: ColumnEmbeddedOptions): PropertyDecorator = js.native
  def apply(`type`: SimpleColumnType): PropertyDecorator = js.native
  def apply(`type`: SimpleColumnType, options: ColumnCommonOptions): PropertyDecorator = js.native
  def apply(`type`: SpatialColumnType): PropertyDecorator = js.native
  def apply(`type`: SpatialColumnType, options: ColumnCommonOptions with SpatialColumnOptions): PropertyDecorator = js.native
  def apply(`type`: WithLengthColumnType): PropertyDecorator = js.native
  def apply(`type`: WithLengthColumnType, options: ColumnCommonOptions with ColumnWithLengthOptions): PropertyDecorator = js.native
  def apply(`type`: WithPrecisionColumnType): PropertyDecorator = js.native
  def apply(`type`: WithPrecisionColumnType, options: ColumnCommonOptions with ColumnNumericOptions): PropertyDecorator = js.native
  def apply(`type`: WithWidthColumnType): PropertyDecorator = js.native
  def apply(`type`: WithWidthColumnType, options: ColumnCommonOptions with ColumnWithWidthOptions): PropertyDecorator = js.native
}
