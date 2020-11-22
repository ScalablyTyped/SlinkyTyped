package typingsSlinky.typeorm.mod

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.optionsColumnCommonOptionsMod.ColumnCommonOptions
import typingsSlinky.typeorm.optionsColumnEmbeddedOptionsMod.ColumnEmbeddedOptions
import typingsSlinky.typeorm.optionsColumnNumericOptionsMod.ColumnNumericOptions
import typingsSlinky.typeorm.optionsColumnOptionsMod.ColumnOptions
import typingsSlinky.typeorm.optionsColumnWithLengthOptionsMod.ColumnWithLengthOptions
import typingsSlinky.typeorm.optionsColumnWithWidthOptionsMod.ColumnWithWidthOptions
import typingsSlinky.typeorm.optionsSpatialColumnOptionsMod.SpatialColumnOptions
import typingsSlinky.typeorm.typesColumnTypesMod.SimpleColumnType
import typingsSlinky.typeorm.typesColumnTypesMod.SpatialColumnType
import typingsSlinky.typeorm.typesColumnTypesMod.WithLengthColumnType
import typingsSlinky.typeorm.typesColumnTypesMod.WithPrecisionColumnType
import typingsSlinky.typeorm.typesColumnTypesMod.WithWidthColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Column")
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
