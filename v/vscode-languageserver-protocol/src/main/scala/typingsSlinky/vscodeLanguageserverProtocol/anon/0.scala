package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  /**
    * The code action kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    */
  var valueSet: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionKind]
}

object `0` {
  @scala.inline
  def apply(valueSet: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionKind]): `0` = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

