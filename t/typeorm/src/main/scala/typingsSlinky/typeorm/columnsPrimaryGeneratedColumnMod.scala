package typingsSlinky.typeorm

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.optionsPrimaryGeneratedColumnNumericOptionsMod.PrimaryGeneratedColumnNumericOptions
import typingsSlinky.typeorm.optionsPrimaryGeneratedColumnUUIDOptionsMod.PrimaryGeneratedColumnUUIDOptions
import typingsSlinky.typeorm.typeormStrings.increment
import typingsSlinky.typeorm.typeormStrings.rowid
import typingsSlinky.typeorm.typeormStrings.uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/decorator/columns/PrimaryGeneratedColumn", JSImport.Namespace)
@js.native
object columnsPrimaryGeneratedColumnMod extends js.Object {
  
  def PrimaryGeneratedColumn(): PropertyDecorator = js.native
  def PrimaryGeneratedColumn(options: PrimaryGeneratedColumnNumericOptions): PropertyDecorator = js.native
  @JSName("PrimaryGeneratedColumn")
  def PrimaryGeneratedColumn_increment(strategy: increment): PropertyDecorator = js.native
  @JSName("PrimaryGeneratedColumn")
  def PrimaryGeneratedColumn_increment(strategy: increment, options: PrimaryGeneratedColumnNumericOptions): PropertyDecorator = js.native
  @JSName("PrimaryGeneratedColumn")
  def PrimaryGeneratedColumn_rowid(strategy: rowid): PropertyDecorator = js.native
  @JSName("PrimaryGeneratedColumn")
  def PrimaryGeneratedColumn_rowid(strategy: rowid, options: PrimaryGeneratedColumnUUIDOptions): PropertyDecorator = js.native
  @JSName("PrimaryGeneratedColumn")
  def PrimaryGeneratedColumn_uuid(strategy: uuid): PropertyDecorator = js.native
  @JSName("PrimaryGeneratedColumn")
  def PrimaryGeneratedColumn_uuid(strategy: uuid, options: PrimaryGeneratedColumnUUIDOptions): PropertyDecorator = js.native
}
