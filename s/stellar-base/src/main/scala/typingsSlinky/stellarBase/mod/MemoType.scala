package typingsSlinky.stellarBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stellarBase.mod.MemoType.None
  - typingsSlinky.stellarBase.mod.MemoType.ID
  - typingsSlinky.stellarBase.mod.MemoType.Text
  - typingsSlinky.stellarBase.mod.MemoType.Hash
  - typingsSlinky.stellarBase.mod.MemoType.Return
*/
trait MemoType extends js.Object

@JSImport("stellar-base", "MemoType")
@js.native
object MemoType extends js.Object {
  type Hash = /* "hash" */ String
  type ID = /* "id" */ String
  type None = /* "none" */ String
  type Return = /* "return" */ String
  type Text = /* "text" */ String
}

