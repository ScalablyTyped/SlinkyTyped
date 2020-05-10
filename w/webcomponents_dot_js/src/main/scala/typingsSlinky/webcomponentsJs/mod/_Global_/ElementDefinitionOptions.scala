package typingsSlinky.webcomponentsJs.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This contains duplicates of some types in lib.dom.d.ts in order to support typescript 2.0
@js.native
trait ElementDefinitionOptions extends js.Object {
  var `extends`: js.UndefOr[String] = js.native
}

object ElementDefinitionOptions {
  @scala.inline
  def apply(): ElementDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementDefinitionOptions]
  }
  @scala.inline
  implicit class ElementDefinitionOptionsOps[Self <: ElementDefinitionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtends(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(js.undefined)
        ret
    }
  }
  
}

