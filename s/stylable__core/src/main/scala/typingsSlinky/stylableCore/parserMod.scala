package typingsSlinky.stylableCore

import typingsSlinky.postcss.mod.ProcessOptions
import typingsSlinky.postcss.mod.Root_
import typingsSlinky.stylableCore.typesMod.CSSObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@stylable/core/cjs/parser", "cssObjectToAst")
  @js.native
  def cssObjectToAst(cssObject: CSSObject): js.Any = js.native
  @JSImport("@stylable/core/cjs/parser", "cssObjectToAst")
  @js.native
  def cssObjectToAst(cssObject: CSSObject, sourceFile: String): js.Any = js.native
  
  @JSImport("@stylable/core/cjs/parser", "safeParse")
  @js.native
  def safeParse(css: String): Root_ = js.native
  @JSImport("@stylable/core/cjs/parser", "safeParse")
  @js.native
  def safeParse(css: String, options: ProcessOptions): Root_ = js.native
  
  type CssParser = js.Function2[/* css */ String, /* options */ js.UndefOr[ProcessOptions], Root_]
}
