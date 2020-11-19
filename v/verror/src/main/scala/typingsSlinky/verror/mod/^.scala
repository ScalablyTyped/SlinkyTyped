package typingsSlinky.verror.mod

import typingsSlinky.verror.anon.TypeofVError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("verror", JSImport.Namespace)
@js.native
class ^ protected () extends VError {
  def this(message: js.UndefOr[scala.Nothing], params: js.Any*) = this()
  def this(message: String, params: js.Any*) = this()
  def this(options: js.Error, message: String, params: js.Any*) = this()
  def this(options: Options, message: String, params: js.Any*) = this()
}
@JSImport("verror", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var VError: TypeofVError = js.native
  
  def cause(err: js.Error): js.Error | Null = js.native
  
  def errorForEach(err: js.Error, func: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def errorFromList[T /* <: js.Error */](errors: js.Array[T]): Null | T | MultiError = js.native
  
  def findCauseByName(err: js.Error, name: String): js.Error | Null = js.native
  
  def fullStack(err: js.Error): String = js.native
  
  def hasCauseWithName(err: js.Error, name: String): Boolean = js.native
  
  def info(err: js.Error): Info = js.native
}
