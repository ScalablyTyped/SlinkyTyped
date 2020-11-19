package typingsSlinky.yup.mod

import typingsSlinky.yup.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestContext extends js.Object {
  
  def createError(): ValidationError = js.native
  def createError(params: Message): ValidationError = js.native
  
  var options: ValidateOptions = js.native
  
  var parent: js.Any = js.native
  
  var path: String = js.native
  
  def resolve(value: js.Any): js.Any = js.native
  
  var schema: Schema[_] = js.native
}
