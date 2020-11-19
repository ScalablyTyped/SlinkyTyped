package typingsSlinky.vueTemplateCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ASTElementHandlers = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.vueTemplateCompiler.mod.ASTElementHandler | js.Array[typingsSlinky.vueTemplateCompiler.mod.ASTElementHandler]
  ]
  
  type ASTModifiers = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  type DirectiveFunction = js.Function2[
    /* node */ typingsSlinky.vueTemplateCompiler.mod.ASTElement, 
    /* directiveMeta */ typingsSlinky.vueTemplateCompiler.mod.ASTDirective, 
    scala.Unit
  ]
}
