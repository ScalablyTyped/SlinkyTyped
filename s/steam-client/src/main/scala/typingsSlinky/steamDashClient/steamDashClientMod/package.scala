package typingsSlinky.steamDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object steamDashClientMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.steamDashClient.Anon_False
  import typingsSlinky.steamDashClient.steamDashClientBooleans.`false`

  type SendMessage = js.Function3[
    /* header */ Anon_False, 
    /* body */ Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any), 
    /* callback */ js.UndefOr[
      (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object) | `false`
    ], 
    Unit
  ]
}
