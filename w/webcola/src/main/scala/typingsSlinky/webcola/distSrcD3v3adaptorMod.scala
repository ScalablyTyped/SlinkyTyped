package typingsSlinky.webcola

import typingsSlinky.webcola.distSrcD3adaptorMod.ID3StyleLayoutAdaptor
import typingsSlinky.webcola.distSrcD3v3adaptorMod.D3StyleLayoutAdaptor
import typingsSlinky.webcola.distSrcLayoutMod.Event
import typingsSlinky.webcola.distSrcLayoutMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/d3v3adaptor", JSImport.Namespace)
@js.native
object distSrcD3v3adaptorMod extends js.Object {
  @js.native
  class D3StyleLayoutAdaptor ()
    extends Layout
       with ID3StyleLayoutAdaptor {
    /* InferMemberOverrides */
    /* protected */ override def kick(): Unit = js.native
    /* InferMemberOverrides */
    /* protected */ override def trigger(e: Event): Unit = js.native
  }
  
  def d3adaptor(): D3StyleLayoutAdaptor = js.native
}

