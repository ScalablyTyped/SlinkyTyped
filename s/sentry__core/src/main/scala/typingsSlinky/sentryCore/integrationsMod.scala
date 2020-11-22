package typingsSlinky.sentryCore

import typingsSlinky.sentryCore.anon.PartialInboundFiltersOpti
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/core/dist/integrations", JSImport.Namespace)
@js.native
object integrationsMod extends js.Object {
  
  @js.native
  class FunctionToString ()
    extends typingsSlinky.sentryCore.functiontostringMod.FunctionToString
  /* static members */
  @js.native
  object FunctionToString extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  class InboundFilters ()
    extends typingsSlinky.sentryCore.inboundfiltersMod.InboundFilters {
    def this(_options: PartialInboundFiltersOpti) = this()
  }
  /* static members */
  @js.native
  object InboundFilters extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
}
