package typingsSlinky.webicon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webicon/System/IconPreloader", JSImport.Namespace)
@js.native
object iconPreloaderMod extends js.Object {
  
  @js.native
  trait IconPreloader
    extends js.Promise[Unit] {
    
    /**
      * The names of the icons to download.
      */
    var iconSets: js.Array[String] = js.native
  }
}
