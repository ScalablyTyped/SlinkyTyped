package typingsSlinky.wampy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function0[scala.Unit]
  type ChallengeCallback = js.Function2[
    /* auth_method */ java.lang.String, 
    /* extra */ typingsSlinky.wampy.mod.Dict, 
    java.lang.String
  ]
  type Dict = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ErrorCallback = js.Function1[/* args */ typingsSlinky.wampy.mod.ErrorArgs, scala.Unit]
  type EventCallback = js.Function1[/* args */ typingsSlinky.wampy.mod.DataArgs, scala.Unit]
  type RPCCallback = js.Function1[
    /* args */ typingsSlinky.wampy.mod.DataArgs, 
    typingsSlinky.wampy.mod.RPCResult | scala.Unit
  ]
  type SuccessCallback = js.Function1[/* args */ typingsSlinky.wampy.mod.DataArgs, scala.Unit]
  type UnsubscibeCallbacksHash = typingsSlinky.wampy.mod.SubscribeCallbacksHash
}
