package typingsSlinky.urqlCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object subscriptionMod {
  type SubscriptionForwarder = js.Function1[
    /* operation */ typingsSlinky.urqlCore.subscriptionMod.SubscriptionOperation, 
    typingsSlinky.urqlCore.subscriptionMod.ObservableLike[typingsSlinky.urqlCore.anon.ExecutionResultkeystringa]
  ]
}
