package typingsSlinky.traceback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Traceback extends js.Object {
  
   // | The line number in the file
  var col: Double = js.native
  
   // | The absolute path of the file defining the function
  var file: String = js.native
  
   // | The byte position in the file
  var fun: js.Any = js.native
  
   // | Boolean indicating whether the function is native
  var is_ctor: Boolean = js.native
  
   // | Boolean indicating whether the function was called with a global this
  var is_eval: Boolean = js.native
  
   // | Boolean indicating whether the function comes from an eval() call
  var is_native: Boolean = js.native
  
   // | The CallSite that ran eval(), if this frame is an eval
  var is_top: Boolean = js.native
  
   // | The basename of the path file ("example.js")
  var line: Double = js.native
  
   // | The function itself
  var method: String = js.native
  
  var name: String = js.native
  
   // | The type of this; the name of the constructor function (Object, ReadStream, etc.)
  var origin: js.Any = js.native
  
   // | The function name
  var path: String = js.native
  
   // | The column number in the file
  var pos: Double = js.native
  
   // | If this function was called as a method, the name it is stored as
  var `this`: js.Any = js.native
  
   // | The object bound to the label this in the function
  var `type`: String = js.native
}
object Traceback {
  
  @scala.inline
  def apply(
    col: Double,
    file: String,
    fun: js.Any,
    is_ctor: Boolean,
    is_eval: Boolean,
    is_native: Boolean,
    is_top: Boolean,
    line: Double,
    method: String,
    name: String,
    origin: js.Any,
    path: String,
    pos: Double,
    `this`: js.Any,
    `type`: String
  ): Traceback = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fun = fun.asInstanceOf[js.Any], is_ctor = is_ctor.asInstanceOf[js.Any], is_eval = is_eval.asInstanceOf[js.Any], is_native = is_native.asInstanceOf[js.Any], is_top = is_top.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Traceback]
  }
  
  @scala.inline
  implicit class TracebackOps[Self <: Traceback] (val x: Self) extends AnyVal {
    
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFun(value: js.Any): Self = this.set("fun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_ctor(value: Boolean): Self = this.set("is_ctor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_eval(value: Boolean): Self = this.set("is_eval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_native(value: Boolean): Self = this.set("is_native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_top(value: Boolean): Self = this.set("is_top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: js.Any): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThis(value: js.Any): Self = this.set("this", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
