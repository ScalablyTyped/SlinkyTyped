package typingsSlinky.typeorm

import typingsSlinky.std.ClassDecorator
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/decorator/Check", JSImport.Namespace)
@js.native
object checkMod extends js.Object {
  
  def Check(expression: String): ClassDecorator with PropertyDecorator = js.native
  def Check(name: String, expression: String): ClassDecorator with PropertyDecorator = js.native
}
