package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstTriggerCharacter extends js.Object {
  /**
    * A character on which formatting should be triggered, like `}`.
    */
  var firstTriggerCharacter: String
  /**
    * More trigger characters.
    */
  var moreTriggerCharacter: js.UndefOr[js.Array[String]] = js.undefined
}

object FirstTriggerCharacter {
  @scala.inline
  def apply(firstTriggerCharacter: String, moreTriggerCharacter: js.Array[String] = null): FirstTriggerCharacter = {
    val __obj = js.Dynamic.literal(firstTriggerCharacter = firstTriggerCharacter.asInstanceOf[js.Any])
    if (moreTriggerCharacter != null) __obj.updateDynamic("moreTriggerCharacter")(moreTriggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstTriggerCharacter]
  }
}

