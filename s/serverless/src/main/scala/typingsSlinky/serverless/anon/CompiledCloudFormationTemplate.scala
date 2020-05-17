package typingsSlinky.serverless.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompiledCloudFormationTemplate extends js.Object {
  var compiledCloudFormationTemplate: Outputs = js.native
  var name: String = js.native
  var region: String = js.native
  var runtime: js.UndefOr[String] = js.native
  var stage: String = js.native
  var timeout: js.UndefOr[Double] = js.native
  var versionFunctions: Boolean = js.native
}

object CompiledCloudFormationTemplate {
  @scala.inline
  def apply(
    compiledCloudFormationTemplate: Outputs,
    name: String,
    region: String,
    stage: String,
    versionFunctions: Boolean
  ): CompiledCloudFormationTemplate = {
    val __obj = js.Dynamic.literal(compiledCloudFormationTemplate = compiledCloudFormationTemplate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], versionFunctions = versionFunctions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledCloudFormationTemplate]
  }
  @scala.inline
  implicit class CompiledCloudFormationTemplateOps[Self <: CompiledCloudFormationTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompiledCloudFormationTemplate(value: Outputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiledCloudFormationTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuntime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

