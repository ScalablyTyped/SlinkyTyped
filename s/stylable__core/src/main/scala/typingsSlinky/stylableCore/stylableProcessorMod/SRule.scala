package typingsSlinky.stylableCore.stylableProcessorMod

import typingsSlinky.postcss.mod.Rule_
import typingsSlinky.stylableCore.selectorUtilsMod.SelectorAstNode
import typingsSlinky.stylableCore.stylableCoreStrings.`class`
import typingsSlinky.stylableCore.stylableCoreStrings.complex
import typingsSlinky.stylableCore.stylableCoreStrings.element
import typingsSlinky.stylableCore.stylableMetaMod.RefedMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SRule extends Rule_ {
  
  var isSimpleSelector: Boolean = js.native
  
  var mixins: js.UndefOr[js.Array[RefedMixin]] = js.native
  
  var selectorAst: SelectorAstNode = js.native
  
  var selectorType: `class` | element | complex = js.native
  
  var stScopeSelector: js.UndefOr[String] = js.native
}
