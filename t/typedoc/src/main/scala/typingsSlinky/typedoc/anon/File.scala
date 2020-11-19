package typingsSlinky.typedoc.anon

import typingsSlinky.typedoc.optionsDeclarationMod.SourceFileMode.Modules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends js.Object {
  
  var file: typingsSlinky.typedoc.optionsDeclarationMod.SourceFileMode.File = js.native
  
  var modules: Modules = js.native
}
object File {
  
  @scala.inline
  def apply(file: typingsSlinky.typedoc.optionsDeclarationMod.SourceFileMode.File, modules: Modules): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    
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
    def setFile(value: typingsSlinky.typedoc.optionsDeclarationMod.SourceFileMode.File): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModules(value: Modules): Self = this.set("modules", value.asInstanceOf[js.Any])
  }
}
