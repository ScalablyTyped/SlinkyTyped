package typingsSlinky.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yup", "addMethod")
@js.native
object addMethod extends js.Object {
  
  def apply[T /* <: Schema[_] */](
    schemaCtor: AnySchemaConstructor,
    name: String,
    method: js.ThisFunction1[/* this */ T, /* repeated */ js.Any, T]
  ): Unit = js.native
}
