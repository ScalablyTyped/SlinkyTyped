package typingsSlinky.vueDocgenApi

import typingsSlinky.astTypes.nodePathMod.NodePath
import typingsSlinky.babelTypes.mod.File_
import typingsSlinky.vueDocgenApi.documentationMod.default
import typingsSlinky.vueInbrowserCompilerUtils.typesMod.DocBlockTags
import typingsSlinky.vueInbrowserCompilerUtils.typesMod.EventDescriptor
import typingsSlinky.vueInbrowserCompilerUtils.typesMod.ParamTag
import typingsSlinky.vueInbrowserCompilerUtils.typesMod.ParamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventHandlerMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/eventHandler", JSImport.Default)
  @js.native
  def default(
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
    path: NodePath[_, _],
    astPath: File_
  ): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers/eventHandler", "eventHandlerEmits")
  @js.native
  def eventHandlerEmits(documentation: default, path: NodePath[_, _]): Unit = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers/eventHandler", "eventHandlerMethods")
  @js.native
  def eventHandlerMethods(documentation: default, path: NodePath[_, _]): Unit = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers/eventHandler", "setEventDescriptor")
  @js.native
  def setEventDescriptor(eventDescriptor: EventDescriptor, jsDoc: DocBlockTags): EventDescriptor = js.native
  
  @js.native
  trait TypedParamTag extends ParamTag {
    
    @JSName("type")
    var type_TypedParamTag: ParamType = js.native
  }
  object TypedParamTag {
    
    @scala.inline
    def apply(title: String, `type`: ParamType): TypedParamTag = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypedParamTag]
    }
    
    @scala.inline
    implicit class TypedParamTagMutableBuilder[Self <: TypedParamTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: ParamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
