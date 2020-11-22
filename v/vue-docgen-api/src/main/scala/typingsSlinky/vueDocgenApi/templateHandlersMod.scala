package typingsSlinky.vueDocgenApi

import typingsSlinky.vueCompilerCore.mod.TemplateChildNode
import typingsSlinky.vueDocgenApi.parseTemplateMod.TemplateParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/template-handlers", JSImport.Namespace)
@js.native
object templateHandlersMod extends js.Object {
  
  val default: js.Array[
    js.Function4[
      /* documentation */ typingsSlinky.vueDocgenApi.documentationMod.default, 
      /* templateAst */ TemplateChildNode, 
      /* siblings */ js.Array[TemplateChildNode], 
      /* options */ TemplateParserOptions, 
      Unit
    ]
  ] = js.native
}
