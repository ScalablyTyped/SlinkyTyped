package typingsSlinky.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Js extends js.Object {
  /**
    * @example:
    *  '- {{filePath}}'
    */
  var css: String = js.native
  /**
    * @example:
    *  '- {{filePath}}'
    */
  @JSName("js")
  var js_ : String = js.native
}

object Js {
  @scala.inline
  def apply(css: String, js_ : String): Js = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Js]
  }
  @scala.inline
  implicit class JsOps[Self <: Js] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJs_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

