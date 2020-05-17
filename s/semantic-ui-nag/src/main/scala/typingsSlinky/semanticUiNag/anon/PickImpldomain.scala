package typingsSlinky.semanticUiNag.anon

import typingsSlinky.semanticUiNag.semanticUiNagBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'domain'> */
@js.native
trait PickImpldomain extends js.Object {
  var domain: `false` | String = js.native
}

object PickImpldomain {
  @scala.inline
  def apply(domain: `false` | String): PickImpldomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldomain]
  }
  @scala.inline
  implicit class PickImpldomainOps[Self <: PickImpldomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

