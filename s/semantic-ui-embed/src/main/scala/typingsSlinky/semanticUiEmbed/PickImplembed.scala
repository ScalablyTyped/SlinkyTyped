package typingsSlinky.semanticUiEmbed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.ClassNameSettings._Impl, 'embed'> */
@js.native
trait PickImplembed extends js.Object {
  var embed: String = js.native
}

object PickImplembed {
  @scala.inline
  def apply(embed: String): PickImplembed = {
    val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplembed]
  }
  @scala.inline
  implicit class PickImplembedOps[Self <: PickImplembed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

