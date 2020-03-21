package typingsSlinky.vscodeLanguageserverProtocol

import typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  /**
    * The code action kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    */
  var valueSet: js.Array[CodeActionKind]
}

object Anon0 {
  @scala.inline
  def apply(valueSet: js.Array[CodeActionKind]): Anon0 = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon0]
  }
}

