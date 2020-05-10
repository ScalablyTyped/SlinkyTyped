package typingsSlinky.webpack

import typingsSlinky.webpack.mod.compilation.NormalModuleFactory_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNormalModuleFactory extends js.Object {
  var normalModuleFactory: NormalModuleFactory_ = js.native
}

object AnonNormalModuleFactory {
  @scala.inline
  def apply(normalModuleFactory: NormalModuleFactory_): AnonNormalModuleFactory = {
    val __obj = js.Dynamic.literal(normalModuleFactory = normalModuleFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNormalModuleFactory]
  }
  @scala.inline
  implicit class AnonNormalModuleFactoryOps[Self <: AnonNormalModuleFactory] (val x: Self) extends AnyVal {
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

