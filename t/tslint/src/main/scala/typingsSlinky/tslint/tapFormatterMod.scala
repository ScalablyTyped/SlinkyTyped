package typingsSlinky.tslint

import typingsSlinky.tslint.abstractFormatterMod.AbstractFormatter
import typingsSlinky.tslint.formatterMod.IFormatterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/formatters/tapFormatter", JSImport.Namespace)
@js.native
object tapFormatterMod extends js.Object {
  
  @js.native
  class Formatter () extends AbstractFormatter {
    
    var mapToMessages: js.Any = js.native
  }
  /* static members */
  @js.native
  object Formatter extends js.Object {
    
    var metadata: IFormatterMetadata = js.native
  }
}
