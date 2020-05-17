package typingsSlinky.webpackBlocksTypescript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modules extends js.Object {
  var modules: js.UndefOr[Boolean] = js.native
  var targets: js.UndefOr[String] = js.native
}

object Modules {
  @scala.inline
  def apply(): Modules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modules]
  }
  @scala.inline
  implicit class ModulesOps[Self <: Modules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
  }
  
}

