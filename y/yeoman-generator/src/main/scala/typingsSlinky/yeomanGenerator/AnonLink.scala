package typingsSlinky.yeomanGenerator

import typingsSlinky.yeomanGenerator.yeomanGeneratorStrings.strong
import typingsSlinky.yeomanGenerator.yeomanGeneratorStrings.weak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLink extends js.Object {
  var link: weak | strong = js.native
  var local: String = js.native
}

object AnonLink {
  @scala.inline
  def apply(link: weak | strong, local: String): AnonLink = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLink]
  }
  @scala.inline
  implicit class AnonLinkOps[Self <: AnonLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLink(value: weak | strong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

