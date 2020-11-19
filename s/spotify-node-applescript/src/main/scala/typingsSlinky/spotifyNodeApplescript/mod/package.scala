package typingsSlinky.spotifyNodeApplescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GetTrackCallbackFn = js.Function2[
    /* error */ java.lang.String, 
    /* track */ typingsSlinky.spotifyNodeApplescript.mod.TrackInfo, 
    scala.Unit
  ]
  
  type IsRepeatingCallbackFn = js.Function2[/* error */ java.lang.String, /* repeating */ scala.Boolean, scala.Unit]
  
  type IsRunningCallbackFn = js.Function2[/* error */ java.lang.String, /* isRunning */ scala.Boolean, scala.Unit]
  
  type IsShufflingCallbackFn = js.Function2[/* error */ java.lang.String, /* shuffling */ scala.Boolean, scala.Unit]
  
  type StateCallbackFn = js.Function2[
    /* error */ java.lang.String, 
    /* state */ typingsSlinky.spotifyNodeApplescript.mod.SpotifyState, 
    scala.Unit
  ]
  
  type SuccessCallbackFn = js.Function0[scala.Unit]
}
