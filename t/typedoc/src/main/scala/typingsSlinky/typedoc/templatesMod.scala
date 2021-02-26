package typingsSlinky.typedoc

import typingsSlinky.handlebars.Handlebars.RuntimeOptions
import typingsSlinky.handlebars.Handlebars.TemplateDelegate
import typingsSlinky.typedoc.stackMod.Resource
import typingsSlinky.typedoc.stackMod.ResourceOrigin
import typingsSlinky.typedoc.stackMod.ResourceStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesMod {
  
  @JSImport("typedoc/dist/lib/output/utils/resources/templates", "PartialStack")
  @js.native
  class PartialStack () extends TemplateStack {
    
    var registeredNames: js.Any = js.native
  }
  
  @JSImport("typedoc/dist/lib/output/utils/resources/templates", "Template")
  @js.native
  class Template[T] protected () extends Resource {
    def this(origin: ResourceOrigin[_], name: String, fileName: String) = this()
    
    def getTemplate(): TemplateDelegate[T] = js.native
    
    def render(context: js.Any): String = js.native
    def render(context: js.Any, options: RuntimeOptions): String = js.native
    
    var template: js.Any = js.native
  }
  
  @JSImport("typedoc/dist/lib/output/utils/resources/templates", "TemplateStack")
  @js.native
  class TemplateStack ()
    extends ResourceStack[Template[js.Any]]
}
