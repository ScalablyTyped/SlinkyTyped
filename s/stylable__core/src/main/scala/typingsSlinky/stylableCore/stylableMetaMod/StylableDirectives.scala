package typingsSlinky.stylableCore.stylableMetaMod

import typingsSlinky.stylableCore.selectorUtilsMod.SelectorAstNode
import typingsSlinky.stylableCore.stylableValueParsersMod.MappedStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylableDirectives extends js.Object {
  
  var `-st-extends`: js.UndefOr[ImportSymbol | ClassSymbol | ElementSymbol] = js.native
  
  var `-st-global`: js.UndefOr[js.Array[SelectorAstNode]] = js.native
  
  var `-st-root`: js.UndefOr[Boolean] = js.native
  
  var `-st-states`: js.UndefOr[MappedStates] = js.native
}
object StylableDirectives {
  
  @scala.inline
  def apply(): StylableDirectives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylableDirectives]
  }
  
  @scala.inline
  implicit class StylableDirectivesOps[Self <: StylableDirectives] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `set-st-extends`(value: ImportSymbol | ClassSymbol | ElementSymbol): Self = this.set("-st-extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-st-extends`: Self = this.set("-st-extends", js.undefined)
    
    @scala.inline
    def `set-st-globalVarargs`(value: SelectorAstNode*): Self = this.set("-st-global", js.Array(value :_*))
    
    @scala.inline
    def `set-st-global`(value: js.Array[SelectorAstNode]): Self = this.set("-st-global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-st-global`: Self = this.set("-st-global", js.undefined)
    
    @scala.inline
    def `set-st-root`(value: Boolean): Self = this.set("-st-root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-st-root`: Self = this.set("-st-root", js.undefined)
    
    @scala.inline
    def `set-st-states`(value: MappedStates): Self = this.set("-st-states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-st-states`: Self = this.set("-st-states", js.undefined)
  }
}
