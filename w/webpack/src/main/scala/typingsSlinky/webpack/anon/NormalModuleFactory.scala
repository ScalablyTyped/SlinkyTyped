package typingsSlinky.webpack.anon

import typingsSlinky.webpack.mod.compilation.NormalModuleFactory_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalModuleFactory extends js.Object {
  var normalModuleFactory: NormalModuleFactory_ = js.native
}

object NormalModuleFactory {
  @scala.inline
  def apply(normalModuleFactory: NormalModuleFactory_): NormalModuleFactory = {
    val __obj = js.Dynamic.literal(normalModuleFactory = normalModuleFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalModuleFactory]
  }
  @scala.inline
  implicit class NormalModuleFactoryOps[Self <: NormalModuleFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalModuleFactory(value: NormalModuleFactory_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalModuleFactory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

