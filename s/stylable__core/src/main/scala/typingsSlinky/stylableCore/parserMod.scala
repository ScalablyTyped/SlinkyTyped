package typingsSlinky.stylableCore

import typingsSlinky.postcss.mod.ProcessOptions
import typingsSlinky.postcss.mod.Root_
import typingsSlinky.stylableCore.typesMod.CSSObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  
  def cssObjectToAst(cssObject: CSSObject): js.Any = js.native
  def cssObjectToAst(cssObject: CSSObject, sourceFile: String): js.Any = js.native
  
  def safeParse(css: String): Root_ = js.native
  def safeParse(css: String, options: ProcessOptions): Root_ = js.native
}
