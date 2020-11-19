package typingsSlinky.webcola

import typingsSlinky.webcola.d3adaptorMod.ID3StyleLayoutAdaptor
import typingsSlinky.webcola.layoutMod.Event
import typingsSlinky.webcola.layoutMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola/dist/src/d3v3adaptor", JSImport.Namespace)
@js.native
object d3v3adaptorMod extends js.Object {
  
  def d3adaptor(): D3StyleLayoutAdaptor = js.native
  
  @js.native
  class D3StyleLayoutAdaptor ()
    extends Layout
       with ID3StyleLayoutAdaptor {
    
    /* InferMemberOverrides */
    /* protected */ override def kick(): Unit = js.native
    
    /* InferMemberOverrides */
    /* protected */ override def trigger(e: Event): Unit = js.native
  }
}
