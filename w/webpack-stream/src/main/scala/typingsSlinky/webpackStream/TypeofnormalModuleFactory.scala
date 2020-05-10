package typingsSlinky.webpackStream

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.webpack.mod.compilation.normalModuleFactory.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofnormalModuleFactory extends js.Object {
  var Parser: Instantiable0[typingsSlinky.webpack.mod.compilation.normalModuleFactory.Parser] = js.native
}

object TypeofnormalModuleFactory {
  @scala.inline
  def apply(Parser: Instantiable0[Parser]): TypeofnormalModuleFactory = {
    val __obj = js.Dynamic.literal(Parser = Parser.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofnormalModuleFactory]
  }
  @scala.inline
  implicit class TypeofnormalModuleFactoryOps[Self <: TypeofnormalModuleFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParser(value: Instantiable0[Parser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parser")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

