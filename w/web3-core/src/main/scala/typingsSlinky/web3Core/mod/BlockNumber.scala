package typingsSlinky.web3Core.mod

import typingsSlinky.bnJs.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.bnJs.mod.^
  - / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigNumber * / js.Any
  - typingsSlinky.web3Core.web3CoreStrings.latest
  - typingsSlinky.web3Core.web3CoreStrings.pending
  - typingsSlinky.web3Core.web3CoreStrings.earliest
  - typingsSlinky.web3Core.web3CoreStrings.genesis
*/
trait BlockNumber extends js.Object

object BlockNumber {
  @scala.inline
  def latest: typingsSlinky.web3Core.web3CoreStrings.latest = "latest".asInstanceOf[typingsSlinky.web3Core.web3CoreStrings.latest]
  @scala.inline
  def pending: typingsSlinky.web3Core.web3CoreStrings.pending = "pending".asInstanceOf[typingsSlinky.web3Core.web3CoreStrings.pending]
  @scala.inline
  def earliest: typingsSlinky.web3Core.web3CoreStrings.earliest = "earliest".asInstanceOf[typingsSlinky.web3Core.web3CoreStrings.earliest]
  @scala.inline
  def genesis: typingsSlinky.web3Core.web3CoreStrings.genesis = "genesis".asInstanceOf[typingsSlinky.web3Core.web3CoreStrings.genesis]
  @scala.inline
  implicit def apply(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigNumber */ js.Any
  ): BlockNumber = value.asInstanceOf[BlockNumber]
  @scala.inline
  implicit def apply(value: Double): BlockNumber = value.asInstanceOf[BlockNumber]
  @scala.inline
  implicit def apply(value: String): BlockNumber = value.asInstanceOf[BlockNumber]
  @scala.inline
  implicit def apply(value: ^): BlockNumber = value.asInstanceOf[BlockNumber]
}

