package typingsSlinky.yeomanDashGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Adapter extends js.Object {
  var adapter: Anon_PromptModule
  def error(e: js.Error*): Unit
}

object Anon_Adapter {
  @scala.inline
  def apply(adapter: Anon_PromptModule, error: /* repeated */ js.Error => Unit): Anon_Adapter = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], error = js.Any.fromFunction1(error))
  
    __obj.asInstanceOf[Anon_Adapter]
  }
}

