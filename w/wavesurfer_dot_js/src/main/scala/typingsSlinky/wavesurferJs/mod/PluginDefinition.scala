package typingsSlinky.wavesurferJs.mod

import typingsSlinky.wavesurferJs.anon.InstantiableWaveSurferPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginDefinition extends js.Object {
  var deferInit: js.UndefOr[Boolean] = js.native
  var instance: InstantiableWaveSurferPlugin = js.native
  var name: String = js.native
  var params: js.Object = js.native
  var staticProps: js.UndefOr[js.Object] = js.native
}

object PluginDefinition {
  @scala.inline
  def apply(instance: InstantiableWaveSurferPlugin, name: String, params: js.Object): PluginDefinition = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginDefinition]
  }
  @scala.inline
  implicit class PluginDefinitionOps[Self <: PluginDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: InstantiableWaveSurferPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeferInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferInit")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticProps")(js.undefined)
        ret
    }
  }
  
}

