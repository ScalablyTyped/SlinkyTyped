package typingsSlinky.tern.inferMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tern.anon.Primnamebool
import typingsSlinky.tern.anon.Primnamenumber
import typingsSlinky.tern.anon.Primnamestring
import typingsSlinky.tern.ternMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  /** The primitive boolean type. */
  var bool: Primnamebool = js.native
  
  /** The primitive number type. */
  var num: Primnamenumber = js.native
  
  var parent: js.UndefOr[Server] = js.native
  
  /** The primitive string type. */
  var str: Primnamestring = js.native
  
  var topScope: Scope = js.native
}
@JSImport("tern/lib/infer", "Context")
@js.native
object Context extends TopLevel[ContextConstructor]
