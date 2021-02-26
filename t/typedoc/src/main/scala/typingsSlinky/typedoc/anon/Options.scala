package typingsSlinky.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var options: typingsSlinky.typedoc.optionsOptionsMod.Options = js.native
}
object Options {
  
  @scala.inline
  def apply(options: typingsSlinky.typedoc.optionsOptionsMod.Options): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: typingsSlinky.typedoc.optionsOptionsMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
