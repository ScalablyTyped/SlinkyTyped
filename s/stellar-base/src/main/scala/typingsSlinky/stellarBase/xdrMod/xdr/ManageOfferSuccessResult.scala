package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManageOfferSuccessResult extends js.Object {
  def offer(): ManageOfferSuccessResultOffer = js.native
  def offer(value: ManageOfferSuccessResultOffer): ManageOfferSuccessResultOffer = js.native
  def offersClaimed(): js.Array[ClaimOfferAtom] = js.native
  def offersClaimed(value: js.Array[ClaimOfferAtom]): js.Array[ClaimOfferAtom] = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}

