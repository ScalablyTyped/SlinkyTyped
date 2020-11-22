package typingsSlinky.stylableCore.stylableResolverMod

import typingsSlinky.stylableCore.stylableMetaMod.ClassSymbol
import typingsSlinky.stylableCore.stylableMetaMod.ElementSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/stylable-resolver", "isInPath")
@js.native
object isInPath extends js.Object {
  
  def apply(
    extendPath: js.Array[CSSResolve[ClassSymbol | ElementSymbol]],
    hasSymbolMeta: CSSResolve[ClassSymbol | ElementSymbol]
  ): js.UndefOr[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
}
