package typingsSlinky.typeorm

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.primaryGeneratedColumnNumericOptionsMod.PrimaryGeneratedColumnNumericOptions
import typingsSlinky.typeorm.primaryGeneratedColumnUUIDOptionsMod.PrimaryGeneratedColumnUUIDOptions
import typingsSlinky.typeorm.typeormStrings.increment
import typingsSlinky.typeorm.typeormStrings.rowid
import typingsSlinky.typeorm.typeormStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primaryGeneratedColumnMod {
  
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn(): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn(options: PrimaryGeneratedColumnNumericOptions): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn_increment(strategy: increment): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn_increment(strategy: increment, options: PrimaryGeneratedColumnNumericOptions): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn_rowid(strategy: rowid): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn_rowid(strategy: rowid, options: PrimaryGeneratedColumnUUIDOptions): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn_uuid(strategy: uuid): PropertyDecorator = js.native
  @JSImport("typeorm/browser/decorator/columns/PrimaryGeneratedColumn", "PrimaryGeneratedColumn")
  @js.native
  def PrimaryGeneratedColumn_uuid(strategy: uuid, options: PrimaryGeneratedColumnUUIDOptions): PropertyDecorator = js.native
}
