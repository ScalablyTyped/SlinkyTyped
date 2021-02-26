package typingsSlinky.yup.mod

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yup", "ValidationError")
@js.native
class ValidationError protected () extends Error {
  def this(errors: String, value: js.Any, path: String) = this()
  def this(errors: js.Array[String], value: js.Any, path: String) = this()
  def this(errors: String, value: js.Any, path: String, `type`: js.Any) = this()
  def this(errors: js.Array[String], value: js.Any, path: String, `type`: js.Any) = this()
  
  /**
    * array of error messages
    */
  var errors: js.Array[String] = js.native
  
  /**
    * In the case of aggregate errors, inner is an array of ValidationErrors throw earlier in the validation chain.
    */
  var inner: js.Array[ValidationError] = js.native
  
  var params: js.UndefOr[js.Object] = js.native
  
  /**
    * A string, indicating where there error was thrown. path is empty at the root level.
    */
  var path: String = js.native
  
  var `type`: js.Any = js.native
  
  var value: js.Any = js.native
}
/* static members */
object ValidationError {
  
  @JSImport("yup", "ValidationError.formatError")
  @js.native
  def formatError(message: String): String | (js.Function1[/* params */ js.UndefOr[js.Any], String]) = js.native
  @JSImport("yup", "ValidationError.formatError")
  @js.native
  def formatError(message: String, params: js.Any): String | (js.Function1[/* params */ js.UndefOr[js.Any], String]) = js.native
  @JSImport("yup", "ValidationError.formatError")
  @js.native
  def formatError(message: js.Function1[/* params */ js.UndefOr[js.Any], String]): String | (js.Function1[/* params */ js.UndefOr[js.Any], String]) = js.native
  @JSImport("yup", "ValidationError.formatError")
  @js.native
  def formatError(message: js.Function1[/* params */ js.UndefOr[js.Any], String], params: js.Any): String | (js.Function1[/* params */ js.UndefOr[js.Any], String]) = js.native
  
  @JSImport("yup", "ValidationError.isError")
  @js.native
  def isError(err: js.Any): /* is yup.yup.ValidationError */ Boolean = js.native
}
