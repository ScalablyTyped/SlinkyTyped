package typingsSlinky.tslint

import typingsSlinky.tslint.abstractFormatterMod.AbstractFormatter
import typingsSlinky.tslint.formatterMod.IFormatterMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylishFormatterMod {
  
  @JSImport("tslint/lib/formatters/stylishFormatter", "Formatter")
  @js.native
  class Formatter () extends AbstractFormatter {
    
    var getPositionMaxSize: js.Any = js.native
    
    var getRuleMaxSize: js.Any = js.native
    
    var mapToMessages: js.Any = js.native
    
    var pad: js.Any = js.native
  }
  /* static members */
  object Formatter {
    
    @JSImport("tslint/lib/formatters/stylishFormatter", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/formatters/stylishFormatter", "Formatter.metadata")
    @js.native
    def metadata: IFormatterMetadata = js.native
    @scala.inline
    def metadata_=(x: IFormatterMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
