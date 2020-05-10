package typingsSlinky.vueComponentCompilerUtils.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFCDescriptor extends js.Object {
  var customBlocks: js.Array[SFCCustomBlock] = js.native
  var script: SFCBlock | Null = js.native
  var styles: js.Array[SFCBlock] = js.native
  var template: SFCBlock | Null = js.native
}

object SFCDescriptor {
  @scala.inline
  def apply(customBlocks: js.Array[SFCCustomBlock], styles: js.Array[SFCBlock]): SFCDescriptor = {
    val __obj = js.Dynamic.literal(customBlocks = customBlocks.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCDescriptor]
  }
  @scala.inline
  implicit class SFCDescriptorOps[Self <: SFCDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomBlocks(value: js.Array[SFCCustomBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[SFCBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScript(value: SFCBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(null)
        ret
    }
    @scala.inline
    def withTemplate(value: SFCBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(null)
        ret
    }
  }
  
}

