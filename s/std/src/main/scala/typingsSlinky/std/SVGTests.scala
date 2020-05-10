package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGTests extends js.Object {
  val requiredExtensions: org.scalajs.dom.raw.SVGStringList = js.native
  val systemLanguage: org.scalajs.dom.raw.SVGStringList = js.native
}

object SVGTests {
  @scala.inline
  def apply(
    requiredExtensions: org.scalajs.dom.raw.SVGStringList,
    systemLanguage: org.scalajs.dom.raw.SVGStringList
  ): SVGTests = {
    val __obj = js.Dynamic.literal(requiredExtensions = requiredExtensions.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTests]
  }
  @scala.inline
  implicit class SVGTestsOps[Self <: org.scalajs.dom.raw.SVGTests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequiredExtensions(value: org.scalajs.dom.raw.SVGStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemLanguage(value: org.scalajs.dom.raw.SVGStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemLanguage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

