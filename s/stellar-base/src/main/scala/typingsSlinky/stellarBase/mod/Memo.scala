package typingsSlinky.stellarBase.mod

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.mod.MemoType.Hash
import typingsSlinky.stellarBase.mod.MemoType.ID
import typingsSlinky.stellarBase.mod.MemoType.None
import typingsSlinky.stellarBase.mod.MemoType.Return
import typingsSlinky.stellarBase.mod.MemoType.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "Memo")
@js.native
class Memo[T /* <: MemoType */] protected () extends js.Object {
  def this(`type`: None) = this()
  def this(`type`: T, value: MemoValue) = this()
  def this(`type`: Hash | ID | Return | Text, value: String) = this()
  def this(`type`: Hash | Return, value: Buffer) = this()
  
  def toXDRObject(): typingsSlinky.stellarBase.xdrMod.default.Memo = js.native
  
  var `type`: T = js.native
  
  var value: MemoValue | Buffer | String | Null = js.native
}
/* static members */
@JSImport("stellar-base", "Memo")
@js.native
object Memo extends js.Object {
  
  def fromXDRObject(memo: typingsSlinky.stellarBase.xdrMod.default.Memo): Memo[MemoType] = js.native
  
  def hash(hash: String): Memo[Hash] = js.native
  
  def id(id: String): Memo[ID] = js.native
  
  def none(): Memo[None] = js.native
  
  def `return`(hash: String): Memo[Return] = js.native
  
  def text(text: String): Memo[Text] = js.native
}
