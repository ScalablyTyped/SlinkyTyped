package typingsSlinky.vueDocgenApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object parseTemplateMod {
  
  type Handler = js.Function4[
    /* documentation */ typingsSlinky.vueDocgenApi.documentationMod.default, 
    /* templateAst */ typingsSlinky.vueCompilerCore.mod.TemplateChildNode, 
    /* siblings */ js.Array[typingsSlinky.vueCompilerCore.mod.TemplateChildNode], 
    /* options */ typingsSlinky.vueDocgenApi.parseTemplateMod.TemplateParserOptions, 
    scala.Unit
  ]
}
