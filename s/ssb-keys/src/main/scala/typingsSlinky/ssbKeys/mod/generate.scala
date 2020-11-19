package typingsSlinky.ssbKeys.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssb-keys", "generate")
@js.native
object generate extends js.Object {
  
  def apply(): Keys = js.native
  def apply(curve: js.UndefOr[scala.Nothing], seed: Buffer): Keys = js.native
  def apply(curve: String): Keys = js.native
  def apply(curve: String, seed: Buffer): Keys = js.native
}
