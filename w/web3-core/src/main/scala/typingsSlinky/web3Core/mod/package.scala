package typingsSlinky.web3Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
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
  type BlockNumber = typingsSlinky.web3Core.mod._BlockNumber | java.lang.String | scala.Double | typingsSlinky.bnJs.mod.^  | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigNumber */ js.Any)
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.web3Core.mod.HttpProvider
    - typingsSlinky.web3Core.mod.IpcProvider
    - typingsSlinky.web3Core.mod.WebsocketProvider
    - java.lang.String
    - scala.Null
  */
  type provider = typingsSlinky.web3Core.mod._provider | java.lang.String | scala.Null
}
