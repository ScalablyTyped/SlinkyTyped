package typingsSlinky.typedoc

import typingsSlinky.typedoc.helpersMod.HelperStack
import typingsSlinky.typedoc.templatesMod.PartialStack
import typingsSlinky.typedoc.templatesMod.TemplateStack
import typingsSlinky.typedoc.themeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/utils/resources", JSImport.Namespace)
@js.native
object resourcesMod extends js.Object {
  
  @js.native
  class Resources protected () extends js.Object {
    def this(theme: Theme) = this()
    
    def activate(): Boolean = js.native
    
    def addDirectory(name: String, path: String): Unit = js.native
    
    def deactivate(): Boolean = js.native
    
    def getTheme(): Theme = js.native
    
    var helpers: HelperStack = js.native
    
    var isActive: js.Any = js.native
    
    var layouts: TemplateStack = js.native
    
    var partials: PartialStack = js.native
    
    def removeAllDirectories(): Unit = js.native
    
    def removeDirectory(name: String): Unit = js.native
    
    var templates: TemplateStack = js.native
    
    var theme: js.Any = js.native
  }
}
