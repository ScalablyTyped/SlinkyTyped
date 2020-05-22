package typingsSlinky.tern.inferMod

import typingsSlinky.tern.anon.Primnamebool
import typingsSlinky.tern.anon.Primnamenumber
import typingsSlinky.tern.anon.Primnamestring
import typingsSlinky.tern.ternMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", "Context")
@js.native
class ContextCls protected () extends Context {
  def this(defs: js.Array[_], parent: Server) = this()
  /** The primitive boolean type. */
  /* CompleteClass */
  override var bool: Primnamebool = js.native
  /** The primitive number type. */
  /* CompleteClass */
  override var num: Primnamenumber = js.native
  /** The primitive string type. */
  /* CompleteClass */
  override var str: Primnamestring = js.native
  /* CompleteClass */
  override var topScope: Scope = js.native
}

