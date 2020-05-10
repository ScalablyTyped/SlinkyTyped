package typingsSlinky.vscodeLanguageserverProtocol

import typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItemKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonValueSetArray extends js.Object {
  /**
    * The completion item kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    *
    * If this property is not present the client only supports
    * the completion items kinds from `Text` to `Reference` as defined in
    * the initial version of the protocol.
    */
  var valueSet: js.UndefOr[js.Array[CompletionItemKind]] = js.native
}

object AnonValueSetArray {
  @scala.inline
  def apply(): AnonValueSetArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonValueSetArray]
  }
  @scala.inline
  implicit class AnonValueSetArrayOps[Self <: AnonValueSetArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValueSet(value: js.Array[CompletionItemKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSet")(js.undefined)
        ret
    }
  }
  
}

