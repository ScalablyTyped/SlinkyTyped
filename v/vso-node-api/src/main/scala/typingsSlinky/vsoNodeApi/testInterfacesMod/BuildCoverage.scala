package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildCoverage extends js.Object {
  var codeCoverageFileUrl: String = js.native
  var configuration: BuildConfiguration = js.native
  var lastError: String = js.native
  var modules: js.Array[ModuleCoverage] = js.native
  var state: String = js.native
}

object BuildCoverage {
  @scala.inline
  def apply(
    codeCoverageFileUrl: String,
    configuration: BuildConfiguration,
    lastError: String,
    modules: js.Array[ModuleCoverage],
    state: String
  ): BuildCoverage = {
    val __obj = js.Dynamic.literal(codeCoverageFileUrl = codeCoverageFileUrl.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], lastError = lastError.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildCoverage]
  }
  @scala.inline
  implicit class BuildCoverageOps[Self <: BuildCoverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeCoverageFileUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeCoverageFileUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfiguration(value: BuildConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: js.Array[ModuleCoverage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

