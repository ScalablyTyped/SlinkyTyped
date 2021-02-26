package typingsSlinky.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Args extends StObject {
  
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
  implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: String | (js.Array[String | js.RegExp]) | js.RegExp): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsRegExp(value: js.RegExp): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
