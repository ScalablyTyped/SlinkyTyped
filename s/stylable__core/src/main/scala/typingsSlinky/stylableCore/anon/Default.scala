package typingsSlinky.stylableCore.anon

import typingsSlinky.stylableCore.stylableCoreStrings.`-st-default`
import typingsSlinky.stylableCore.stylableCoreStrings.`-st-extends`
import typingsSlinky.stylableCore.stylableCoreStrings.`-st-from`
import typingsSlinky.stylableCore.stylableCoreStrings.`-st-global`
import typingsSlinky.stylableCore.stylableCoreStrings.`-st-mixin`
import typingsSlinky.stylableCore.stylableCoreStrings.`-st-named`
import typingsSlinky.stylableCore.stylableCoreStrings.`-st-partial-mixin`
import typingsSlinky.stylableCore.stylableCoreStrings.`-st-root`
import typingsSlinky.stylableCore.stylableCoreStrings.`-st-states`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Default extends StObject {
  
  var default: `-st-default` = js.native
  
  var `extends`: `-st-extends` = js.native
  
  var from: `-st-from` = js.native
  
  var global: `-st-global` = js.native
  
  var mixin: `-st-mixin` = js.native
  
  var named: `-st-named` = js.native
  
  var partialMixin: `-st-partial-mixin` = js.native
  
  var root: `-st-root` = js.native
  
  var states: `-st-states` = js.native
}
object Default {
  
  @scala.inline
  def apply(
    default: `-st-default`,
    `extends`: `-st-extends`,
    from: `-st-from`,
    global: `-st-global`,
    mixin: `-st-mixin`,
    named: `-st-named`,
    partialMixin: `-st-partial-mixin`,
    root: `-st-root`,
    states: `-st-states`
  ): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], mixin = mixin.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], partialMixin = partialMixin.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: `-st-default`): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtends(value: `-st-extends`): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: `-st-from`): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal(value: `-st-global`): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixin(value: `-st-mixin`): Self = StObject.set(x, "mixin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamed(value: `-st-named`): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialMixin(value: `-st-partial-mixin`): Self = StObject.set(x, "partialMixin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: `-st-root`): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: `-st-states`): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
  }
}
