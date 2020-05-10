package typingsSlinky.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUriEscapeStatics extends js.Object {
  def escapeComponent(toEscape: String): String = js.native
  def unescapeComponent(toUnescape: String): String = js.native
}

object IUriEscapeStatics {
  @scala.inline
  def apply(escapeComponent: String => String, unescapeComponent: String => String): IUriEscapeStatics = {
    val __obj = js.Dynamic.literal(escapeComponent = js.Any.fromFunction1(escapeComponent), unescapeComponent = js.Any.fromFunction1(unescapeComponent))
    __obj.asInstanceOf[IUriEscapeStatics]
  }
  @scala.inline
  implicit class IUriEscapeStaticsOps[Self <: IUriEscapeStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscapeComponent(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnescapeComponent(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescapeComponent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

