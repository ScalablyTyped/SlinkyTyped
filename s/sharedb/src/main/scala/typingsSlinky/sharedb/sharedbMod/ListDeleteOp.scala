package typingsSlinky.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeleteOp extends Op {
  
  var ld: js.Any = js.native
  
  var p: Path = js.native
}
object ListDeleteOp {
  
  @scala.inline
  def apply(ld: js.Any, p: Path): ListDeleteOp = {
    val __obj = js.Dynamic.literal(ld = ld.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeleteOp]
  }
  
  @scala.inline
  implicit class ListDeleteOpMutableBuilder[Self <: ListDeleteOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLd(value: js.Any): Self = StObject.set(x, "ld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
  }
}
