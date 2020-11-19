package typingsSlinky.seedrandom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type State = js.Object
  
  type seedrandomCallback = js.Function4[
    /* prng */ js.UndefOr[typingsSlinky.seedrandom.mod.prng], 
    /* shortseed */ js.UndefOr[java.lang.String], 
    /* global */ js.UndefOr[scala.Boolean], 
    /* state */ js.UndefOr[typingsSlinky.seedrandom.mod.State], 
    typingsSlinky.seedrandom.mod.prng
  ]
}
