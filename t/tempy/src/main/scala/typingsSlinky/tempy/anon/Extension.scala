package typingsSlinky.tempy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extension extends js.Object {
  /**
  			_You usually won't need this option. Specify it only when actually needed._
  			File extension. Mutually exclusive with the `name` option.
  			*/
  val extension: js.UndefOr[String] = js.native
}

object Extension {
  @scala.inline
  def apply(): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extension]
  }
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
  }
  
}

