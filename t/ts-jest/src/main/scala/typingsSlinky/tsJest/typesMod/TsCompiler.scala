package typingsSlinky.tsJest.typesMod

import typingsSlinky.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TsCompiler extends js.Object {
  
  var program: js.UndefOr[Program] = js.native
}
object TsCompiler {
  
  @scala.inline
  def apply(): TsCompiler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TsCompiler]
  }
  
  @scala.inline
  implicit class TsCompilerOps[Self <: TsCompiler] (val x: Self) extends AnyVal {
    
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
    def setProgram(value: Program): Self = this.set("program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
  }
}
