package typingsSlinky.webpack.mod.compilation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilationModule extends js.Object {
  var build: Boolean = js.native
  var dependencies: Boolean = js.native
  var issuer: Boolean = js.native
  var module: js.Any = js.native
}

object CompilationModule {
  @scala.inline
  def apply(build: Boolean, dependencies: Boolean, issuer: Boolean, module: js.Any): CompilationModule = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationModule]
  }
  @scala.inline
  implicit class CompilationModuleOps[Self <: CompilationModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModule(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

