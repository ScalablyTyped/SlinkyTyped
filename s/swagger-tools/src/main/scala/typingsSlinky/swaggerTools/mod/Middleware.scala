package typingsSlinky.swaggerTools.mod

import typingsSlinky.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Middleware extends js.Object {
  
  def swaggerMetadata(): NextHandleFunction = js.native
  
  def swaggerSecurity(): NextHandleFunction = js.native
  def swaggerSecurity(options: SwaggerSecurityOptions): NextHandleFunction = js.native
  
  def swaggerValidator(): NextHandleFunction = js.native
  def swaggerValidator(options: SwaggerValidatorOptions): NextHandleFunction = js.native
}
