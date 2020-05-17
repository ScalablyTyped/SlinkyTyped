package typingsSlinky.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseLinkDestination extends js.Object {
  var parseLinkDestination: js.Any = js.native
  var parseLinkLabel: js.Any = js.native
  var parseLinkTitle: js.Any = js.native
}

object ParseLinkDestination {
  @scala.inline
  def apply(parseLinkDestination: js.Any, parseLinkLabel: js.Any, parseLinkTitle: js.Any): ParseLinkDestination = {
    val __obj = js.Dynamic.literal(parseLinkDestination = parseLinkDestination.asInstanceOf[js.Any], parseLinkLabel = parseLinkLabel.asInstanceOf[js.Any], parseLinkTitle = parseLinkTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseLinkDestination]
  }
  @scala.inline
  implicit class ParseLinkDestinationOps[Self <: ParseLinkDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParseLinkDestination(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseLinkDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseLinkLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseLinkLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseLinkTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseLinkTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

