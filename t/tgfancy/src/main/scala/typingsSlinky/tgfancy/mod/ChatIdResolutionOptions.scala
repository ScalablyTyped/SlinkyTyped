package typingsSlinky.tgfancy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatIdResolutionOptions extends js.Object {
  
  def resolve(
    token: String,
    chatId: String,
    callback: js.Function2[/* error */ js.Error | Null, /* target */ js.Any, Unit]
  ): Unit = js.native
  def resolve(
    token: String,
    chatId: Double,
    callback: js.Function2[/* error */ js.Error | Null, /* target */ js.Any, Unit]
  ): Unit = js.native
}
