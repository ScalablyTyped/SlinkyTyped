package typingsSlinky.tslint

import typingsSlinky.tslint.abstractFormatterMod.AbstractFormatter
import typingsSlinky.tslint.formatterMod.IFormatterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/formatters/stylishFormatter", JSImport.Namespace)
@js.native
object stylishFormatterMod extends js.Object {
  
  @js.native
  class Formatter () extends AbstractFormatter {
    
    var getPositionMaxSize: js.Any = js.native
    
    var getRuleMaxSize: js.Any = js.native
    
    var mapToMessages: js.Any = js.native
    
    var pad: js.Any = js.native
  }
  /* static members */
  @js.native
  object Formatter extends js.Object {
    
    var metadata: IFormatterMetadata = js.native
  }
}
