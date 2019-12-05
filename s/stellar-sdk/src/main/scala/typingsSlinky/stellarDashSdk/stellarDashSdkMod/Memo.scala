package typingsSlinky.stellarDashSdk.stellarDashSdkMod

import typingsSlinky.node.Buffer
import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType
import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType.Hash
import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType.ID
import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType.None
import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType.Return
import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoType.Text
import typingsSlinky.stellarDashBase.stellarDashBaseMod.MemoValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Memo")
@js.native
class Memo[T /* <: MemoType */] protected ()
  extends typingsSlinky.stellarDashBase.stellarDashBaseMod.Memo[T] {
  def this(`type`: None) = this()
  def this(`type`: T, value: MemoValue) = this()
  def this(`type`: Hash, value: String) = this()
  def this(`type`: Hash, value: Buffer) = this()
  def this(`type`: ID, value: String) = this()
  def this(`type`: Return, value: String) = this()
  def this(`type`: Return, value: Buffer) = this()
  def this(`type`: Text, value: String) = this()
}

/* static members */
@JSImport("stellar-sdk", "Memo")
@js.native
object Memo extends js.Object {
  def fromXDRObject(memo: typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Memo): typingsSlinky.stellarDashBase.stellarDashBaseMod.Memo[MemoType] = js.native
  def hash(hash: String): typingsSlinky.stellarDashBase.stellarDashBaseMod.Memo[Hash] = js.native
  def id(id: String): typingsSlinky.stellarDashBase.stellarDashBaseMod.Memo[ID] = js.native
  def none(): typingsSlinky.stellarDashBase.stellarDashBaseMod.Memo[None] = js.native
  def `return`(hash: String): typingsSlinky.stellarDashBase.stellarDashBaseMod.Memo[Return] = js.native
  def text(text: String): typingsSlinky.stellarDashBase.stellarDashBaseMod.Memo[Text] = js.native
}

