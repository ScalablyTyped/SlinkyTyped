package typingsSlinky.serverDestroy

import typingsSlinky.node.netMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("server-destroy", JSImport.Namespace)
  @js.native
  def apply(server: Server): Unit = js.native
  
  /* augmented module */
  object netAugmentingMod {
    
    @js.native
    trait Server extends StObject {
      
      def destroy(): Unit = js.native
      def destroy(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    }
  }
}
