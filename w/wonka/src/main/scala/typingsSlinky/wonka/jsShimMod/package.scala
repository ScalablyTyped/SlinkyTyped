package typingsSlinky.wonka

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jsShimMod {
  
  type ExnT = js.Error
  
  type InternalMeth[_T, R] = js.Function0[R]
  
  type callbagT[a] = typingsSlinky.wonka.jsShimMod.Callbag[scala.Unit, a]
  
  type signalT[a] = (typingsSlinky.wonka.anon.Tag with (js.Array[js.Function1[/* talkback */ typingsSlinky.wonka.jsShimMod.talkbackT, scala.Unit]])) | (typingsSlinky.wonka.anon.`0` with js.Array[a]) | typingsSlinky.wonka.wonkaNumbers.`0`
}
