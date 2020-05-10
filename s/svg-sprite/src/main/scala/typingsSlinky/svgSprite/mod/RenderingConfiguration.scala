package typingsSlinky.svgSprite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderingConfiguration extends js.Object {
  /**
    * HTML document destination
    * @default "sprite.<mode>.html"
    */
  var dest: js.UndefOr[String] = js.native
  /**
    * HTML document Mustache template
    * @default "tmpl/<mode>/sprite.html"
    */
  var template: js.UndefOr[String] = js.native
}

object RenderingConfiguration {
  @scala.inline
  def apply(): RenderingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingConfiguration]
  }
  @scala.inline
  implicit class RenderingConfigurationOps[Self <: RenderingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

