package typingsSlinky.tern.ternMod

import typingsSlinky.tern.Anon_Bool
import typingsSlinky.tern.Anon_Name
import typingsSlinky.tern.Anon_NameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "Context")
@js.native
class ContextCls protected ()
  extends typingsSlinky.tern.libInferMod.Context {
  def this(defs: js.Array[_], parent: typingsSlinky.tern.libTernMod.Server) = this()
  /** The primitive boolean type. */
  /* CompleteClass */
  override var bool: typingsSlinky.tern.libInferMod.Prim with Anon_Bool = js.native
  /** The primitive number type. */
  /* CompleteClass */
  override var num: typingsSlinky.tern.libInferMod.Prim with Anon_Name = js.native
  /** The primitive string type. */
  /* CompleteClass */
  override var str: typingsSlinky.tern.libInferMod.Prim with Anon_NameString = js.native
  /* CompleteClass */
  override var topScope: typingsSlinky.tern.libInferMod.Scope = js.native
}

