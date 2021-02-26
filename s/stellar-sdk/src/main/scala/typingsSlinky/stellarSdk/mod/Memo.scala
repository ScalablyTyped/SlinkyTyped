package typingsSlinky.stellarSdk.mod

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.mod.MemoType
import typingsSlinky.stellarBase.mod.MemoType.Hash
import typingsSlinky.stellarBase.mod.MemoType.ID
import typingsSlinky.stellarBase.mod.MemoType.None
import typingsSlinky.stellarBase.mod.MemoType.Return
import typingsSlinky.stellarBase.mod.MemoType.Text
import typingsSlinky.stellarBase.mod.MemoValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "Memo")
@js.native
class Memo[T /* <: MemoType */] protected ()
  extends typingsSlinky.stellarBase.mod.Memo[T] {
  def this(`type`: None) = this()
  def this(`type`: T, value: MemoValue) = this()
  def this(`type`: Hash | ID | Return | Text, value: String) = this()
  def this(`type`: Hash | Return, value: Buffer) = this()
}
/* static members */
object Memo {
  
  @JSImport("stellar-sdk", "Memo.fromXDRObject")
  @js.native
  def fromXDRObject(memo: typingsSlinky.stellarBase.xdrMod.default.Memo): typingsSlinky.stellarBase.mod.Memo[MemoType] = js.native
  
  @JSImport("stellar-sdk", "Memo.hash")
  @js.native
  def hash(hash: String): typingsSlinky.stellarBase.mod.Memo[Hash] = js.native
  
  @JSImport("stellar-sdk", "Memo.id")
  @js.native
  def id(id: String): typingsSlinky.stellarBase.mod.Memo[ID] = js.native
  
  @JSImport("stellar-sdk", "Memo.none")
  @js.native
  def none(): typingsSlinky.stellarBase.mod.Memo[None] = js.native
  
  @JSImport("stellar-sdk", "Memo.text")
  @js.native
  def text(text: String): typingsSlinky.stellarBase.mod.Memo[Text] = js.native
  
  @JSImport("stellar-sdk", "Memo.return")
  @js.native
  def `return`(hash: String): typingsSlinky.stellarBase.mod.Memo[Return] = js.native
}
