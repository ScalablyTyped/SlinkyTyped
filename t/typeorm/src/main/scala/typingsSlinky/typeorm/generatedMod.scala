package typingsSlinky.typeorm

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.typeormStrings.increment
import typingsSlinky.typeorm.typeormStrings.rowid
import typingsSlinky.typeorm.typeormStrings.uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/decorator/Generated", JSImport.Namespace)
@js.native
object generatedMod extends js.Object {
  
  def Generated(): PropertyDecorator = js.native
  @JSName("Generated")
  def Generated_increment(strategy: increment): PropertyDecorator = js.native
  @JSName("Generated")
  def Generated_rowid(strategy: rowid): PropertyDecorator = js.native
  @JSName("Generated")
  def Generated_uuid(strategy: uuid): PropertyDecorator = js.native
}
