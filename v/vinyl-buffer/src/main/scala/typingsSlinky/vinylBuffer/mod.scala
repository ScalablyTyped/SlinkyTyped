package typingsSlinky.vinylBuffer

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vinyl-buffer", JSImport.Namespace)
  @js.native
  val ^ : Buffer = js.native
  
  type Buffer = js.Function0[ReadWriteStream]
  
  type _To = Buffer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Buffer = ^
}
