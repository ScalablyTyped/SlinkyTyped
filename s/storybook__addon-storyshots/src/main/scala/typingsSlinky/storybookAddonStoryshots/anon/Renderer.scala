package typingsSlinky.storybookAddonStoryshots.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  var renderer: js.UndefOr[js.Any] = js.native
  var serializer: js.UndefOr[js.Any] = js.native
}

object Renderer {
  @scala.inline
  def apply(): Renderer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Renderer]
  }
  @scala.inline
  implicit class RendererOps[Self <: Renderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(js.undefined)
        ret
    }
  }
  
}

