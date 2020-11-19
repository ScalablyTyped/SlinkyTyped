package typingsSlinky.simplSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationContext extends SimpleSchemaValidationContextStatic {
  
  def addValidationErrors(errors: js.Any): Unit = js.native
  
  def clean(args: js.Any*): js.Any = js.native
  
  def getErrorForKey(key: js.Any, args: js.Any*): js.Any = js.native
  
  def reset(): Unit = js.native
  
  def setValidationErrors(errors: js.Any): Unit = js.native
  
  def validationErrors(): js.Any = js.native
}
