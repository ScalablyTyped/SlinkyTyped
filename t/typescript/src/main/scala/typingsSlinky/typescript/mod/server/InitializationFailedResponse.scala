package typingsSlinky.typescript.mod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializationFailedResponse extends TypingInstallerResponse {
  @JSName("kind")
  val kind_InitializationFailedResponse: EventInitializationFailed = js.native
  val message: String = js.native
}

object InitializationFailedResponse {
  @scala.inline
  def apply(kind: EventInitializationFailed, message: String): InitializationFailedResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializationFailedResponse]
  }
  @scala.inline
  implicit class InitializationFailedResponseOps[Self <: InitializationFailedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: EventInitializationFailed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

