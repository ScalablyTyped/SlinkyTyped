package typingsSlinky.steamClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SendMessage = js.Function3[
    /* header */ typingsSlinky.steamClient.anon.Msg, 
    /* body */ typingsSlinky.node.Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any), 
    /* callback */ js.UndefOr[
      (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object) | typingsSlinky.steamClient.steamClientBooleans.`false`
    ], 
    scala.Unit
  ]
}
