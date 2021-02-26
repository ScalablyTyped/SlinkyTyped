package typingsSlinky.tslint

import typingsSlinky.tslint.abstractFormatterMod.AbstractFormatter
import typingsSlinky.tslint.formatterMod.IFormatterMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proseFormatterMod {
  
  @JSImport("tslint/lib/formatters/proseFormatter", "Formatter")
  @js.native
  class Formatter () extends AbstractFormatter
  /* static members */
  object Formatter {
    
    @JSImport("tslint/lib/formatters/proseFormatter", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/formatters/proseFormatter", "Formatter.metadata")
    @js.native
    def metadata: IFormatterMetadata = js.native
    @scala.inline
    def metadata_=(x: IFormatterMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
