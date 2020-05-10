package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFirstTriggerCharacter extends js.Object {
  /**
    * A character on which formatting should be triggered, like `}`.
    */
  var firstTriggerCharacter: String = js.native
  /**
    * More trigger characters.
    */
  var moreTriggerCharacter: js.UndefOr[js.Array[String]] = js.native
}

object AnonFirstTriggerCharacter {
  @scala.inline
  def apply(firstTriggerCharacter: String): AnonFirstTriggerCharacter = {
    val __obj = js.Dynamic.literal(firstTriggerCharacter = firstTriggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFirstTriggerCharacter]
  }
  @scala.inline
  implicit class AnonFirstTriggerCharacterOps[Self <: AnonFirstTriggerCharacter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstTriggerCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstTriggerCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoreTriggerCharacter(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreTriggerCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoreTriggerCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreTriggerCharacter")(js.undefined)
        ret
    }
  }
  
}

