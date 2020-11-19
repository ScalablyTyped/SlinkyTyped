package typingsSlinky.typedoc

import typingsSlinky.typedoc.commentsMod.Comment
import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typedoc.reflectionsMod.ProjectReflection
import typingsSlinky.typedoc.reflectionsMod.Reflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/plugins/CommentPlugin", JSImport.Namespace)
@js.native
object commentPluginMod extends js.Object {
  
  @js.native
  class CommentPlugin () extends AbstractComponent[Converter] {
    
    var applyModifiers: js.Any = js.native
    
    var comments: js.Any = js.native
    
    var excludeTags: js.Array[String] = js.native
    
    var onBegin: js.Any = js.native
    
    var onBeginResolve: js.Any = js.native
    
    var onCreateTypeParameter: js.Any = js.native
    
    var onDeclaration: js.Any = js.native
    
    var onFunctionImplementation: js.Any = js.native
    
    var onResolve: js.Any = js.native
    
    var removeExcludedTags: js.Any = js.native
    
    var storeModuleComment: js.Any = js.native
  }
  /* static members */
  @js.native
  object CommentPlugin extends js.Object {
    
    var isHidden: js.Any = js.native
    
    def removeReflection(project: ProjectReflection, reflection: Reflection): Unit = js.native
    
    def removeReflections(project: ProjectReflection, reflections: js.Array[Reflection]): Unit = js.native
    
    def removeTags(comment: js.UndefOr[scala.Nothing], tagName: String): Unit = js.native
    def removeTags(comment: Comment, tagName: String): Unit = js.native
  }
}
