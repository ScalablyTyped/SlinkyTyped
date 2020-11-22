package typingsSlinky.vueDocgenApi.parseTemplateMod

import typingsSlinky.vueCompilerCore.mod.TemplateChildNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/parse-template", "traverse")
@js.native
object traverse extends js.Object {
  
  def apply(
    templateAst: TemplateChildNode,
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
    handlers: js.Array[Handler],
    siblings: js.Array[TemplateChildNode],
    options: TemplateParserOptions
  ): Unit = js.native
}
