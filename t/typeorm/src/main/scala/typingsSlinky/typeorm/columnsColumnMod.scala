package typingsSlinky.typeorm

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.optionsColumnCommonOptionsMod.ColumnCommonOptions
import typingsSlinky.typeorm.optionsColumnEmbeddedOptionsMod.ColumnEmbeddedOptions
import typingsSlinky.typeorm.optionsColumnEnumOptionsMod.ColumnEnumOptions
import typingsSlinky.typeorm.optionsColumnHstoreOptionsMod.ColumnHstoreOptions
import typingsSlinky.typeorm.optionsColumnNumericOptionsMod.ColumnNumericOptions
import typingsSlinky.typeorm.optionsColumnOptionsMod.ColumnOptions
import typingsSlinky.typeorm.optionsColumnWithLengthOptionsMod.ColumnWithLengthOptions
import typingsSlinky.typeorm.optionsColumnWithWidthOptionsMod.ColumnWithWidthOptions
import typingsSlinky.typeorm.optionsSpatialColumnOptionsMod.SpatialColumnOptions
import typingsSlinky.typeorm.typeormStrings.`simple-enum`
import typingsSlinky.typeorm.typeormStrings.enum
import typingsSlinky.typeorm.typeormStrings.hstore
import typingsSlinky.typeorm.typeormStrings.set
import typingsSlinky.typeorm.typesColumnTypesMod.SimpleColumnType
import typingsSlinky.typeorm.typesColumnTypesMod.SpatialColumnType
import typingsSlinky.typeorm.typesColumnTypesMod.WithLengthColumnType
import typingsSlinky.typeorm.typesColumnTypesMod.WithPrecisionColumnType
import typingsSlinky.typeorm.typesColumnTypesMod.WithWidthColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnsColumnMod {
  
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(options: ColumnOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function]): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: js.Function1[/* type */ js.UndefOr[js.Any], js.Function], options: ColumnEmbeddedOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: SimpleColumnType): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: SimpleColumnType, options: ColumnCommonOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: SpatialColumnType): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: SpatialColumnType, options: ColumnCommonOptions with SpatialColumnOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: WithLengthColumnType): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: WithLengthColumnType, options: ColumnCommonOptions with ColumnWithLengthOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: WithPrecisionColumnType): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: WithPrecisionColumnType, options: ColumnCommonOptions with ColumnNumericOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: WithWidthColumnType): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column(`type`: WithWidthColumnType, options: ColumnCommonOptions with ColumnWithWidthOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_enum(`type`: enum): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_enum(`type`: enum, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_hstore(`type`: hstore): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_hstore(`type`: hstore, options: ColumnCommonOptions with ColumnHstoreOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_set(`type`: set): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_set(`type`: set, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_simpleenum(`type`: `simple-enum`): PropertyDecorator = js.native
  @JSImport("typeorm/decorator/columns/Column", "Column")
  @js.native
  def Column_simpleenum(`type`: `simple-enum`, options: ColumnCommonOptions with ColumnEnumOptions): PropertyDecorator = js.native
}
