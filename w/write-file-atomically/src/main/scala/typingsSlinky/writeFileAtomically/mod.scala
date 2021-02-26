package typingsSlinky.writeFileAtomically

import typingsSlinky.node.Buffer
import typingsSlinky.writeFileAtomic.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("write-file-atomically", JSImport.Namespace)
  @js.native
  def apply(path: String, data: Data): js.Promise[Unit] = js.native
  @JSImport("write-file-atomically", JSImport.Namespace)
  @js.native
  def apply(path: String, data: Data, options: Options): js.Promise[Unit] = js.native
  
  type Data = String | Buffer | js.typedarray.Uint8Array
}
