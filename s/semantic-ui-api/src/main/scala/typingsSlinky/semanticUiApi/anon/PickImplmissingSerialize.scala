package typingsSlinky.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'missingSerialize'> */
@js.native
trait PickImplmissingSerialize extends js.Object {
  var missingSerialize: String = js.native
}

object PickImplmissingSerialize {
  @scala.inline
  def apply(missingSerialize: String): PickImplmissingSerialize = {
    val __obj = js.Dynamic.literal(missingSerialize = missingSerialize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmissingSerialize]
  }
  @scala.inline
  implicit class PickImplmissingSerializeOps[Self <: PickImplmissingSerialize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissingSerialize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingSerialize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

