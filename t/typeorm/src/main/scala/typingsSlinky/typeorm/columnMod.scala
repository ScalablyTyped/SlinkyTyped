package typingsSlinky.typeorm

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.columnCommonOptionsMod.ColumnCommonOptions
import typingsSlinky.typeorm.columnEmbeddedOptionsMod.ColumnEmbeddedOptions
import typingsSlinky.typeorm.columnEnumOptionsMod.ColumnEnumOptions
import typingsSlinky.typeorm.columnHstoreOptionsMod.ColumnHstoreOptions
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
import typingsSlinky.typeorm.typeormStrings.`simple-enum`
import typingsSlinky.typeorm.typeormStrings.enum
import typingsSlinky.typeorm.typeormStrings.hstore
import typingsSlinky.typeorm.typeormStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/decorator/columns/Column", JSImport.Namespace)
@js.native
object columnMod extends js.Object {
  
  def Column(): PropertyDecorator = js.native
  def Column(options: ColumnOptions): PropertyDecorator = js.native
  def Column(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function]): PropertyDecorator = js.native
  def Column(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function], options: ColumnEmbeddedOptions): PropertyDecorator = js.native
  def Column(`type`: SimpleColumnType): PropertyDecorator = js.native
  def Column(`type`: SimpleColumnType, options: ColumnCommonOptions): PropertyDecorator = js.native
  def Column(`type`: SpatialColumnType): PropertyDecorator = js.native
  def Column(`type`: SpatialColumnType, options: ColumnCommonOptions with SpatialColumnOptions): PropertyDecorator = js.native
  def Column(`type`: WithLengthColumnType): PropertyDecorator = js.native
  def Column(`type`: WithLengthColumnType, options: ColumnCommonOptions with ColumnWithLengthOptions): PropertyDecorator = js.native
  def Column(`type`: WithPrecisionColumnType): PropertyDecorator = js.native
  def Column(`type`: WithPrecisionColumnType, options: ColumnCommonOptions with ColumnNumericOptions): PropertyDecorator = js.native
  def Column(`type`: WithWidthColumnType): PropertyDecorator = js.native
  def Column(`type`: WithWidthColumnType, options: ColumnCommonOptions with ColumnWithWidthOptions): PropertyDecorator = js.native
  @JSName("Column")
  def Column_enum(`type`: enum): PropertyDecorator = js.native
  @JSName("Column")
  def Column_enum(`type`: enum, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
  @JSName("Column")
  def Column_hstore(`type`: hstore): PropertyDecorator = js.native
  @JSName("Column")
  def Column_hstore(`type`: hstore, options: ColumnCommonOptions with ColumnHstoreOptions): PropertyDecorator = js.native
  @JSName("Column")
  def Column_set(`type`: set): PropertyDecorator = js.native
  @JSName("Column")
  def Column_set(`type`: set, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
  @JSName("Column")
  def Column_simpleenum(`type`: `simple-enum`): PropertyDecorator = js.native
  @JSName("Column")
  def Column_simpleenum(`type`: `simple-enum`, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
}
