package typingsSlinky.wonka

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object wonkaTypesGenMod {
  
  type operatorT[a, b] = js.Function1[
    /* _1 */ typingsSlinky.wonka.wonkaTypesGenMod.sourceT[a], 
    typingsSlinky.wonka.wonkaTypesGenMod.sourceT[b]
  ]
  
  type signalT[a] = typingsSlinky.wonka.jsShimMod.signalT[a]
  
  type sinkT[a] = js.Function1[/* _1 */ typingsSlinky.wonka.wonkaTypesGenMod.signalT[a], scala.Unit]
  
  type sourceT[a] = js.Function1[/* _1 */ typingsSlinky.wonka.wonkaTypesGenMod.sinkT[a], scala.Unit]
  
  type talkbackT = typingsSlinky.wonka.jsShimMod.talkbackT
  
  type teardownT = js.Function0[scala.Unit]
}
