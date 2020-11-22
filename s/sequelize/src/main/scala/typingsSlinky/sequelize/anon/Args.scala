package typingsSlinky.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Args extends js.Object {
  
  var args: String | (js.Array[String | js.RegExp]) | js.RegExp = js.native
  
  var msg: String = js.native
}
object Args {
  
  @scala.inline
  def apply(args: String | (js.Array[String | js.RegExp]) | js.RegExp, msg: String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: (String | js.RegExp)*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgsRegExp(value: js.RegExp): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: String | (js.Array[String | js.RegExp]) | js.RegExp): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
  }
}
