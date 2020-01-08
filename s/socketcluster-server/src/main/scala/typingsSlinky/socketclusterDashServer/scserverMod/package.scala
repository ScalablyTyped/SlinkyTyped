package typingsSlinky.socketclusterDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scserverMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.socketclusterDashServer.Anon_Channel
  import typingsSlinky.socketclusterDashServer.socketclusterDashServerBooleans.`true`

  type AuthToken = StringDictionary[js.Any]
  type badSocketAuthTokenListenerFunction = js.Function2[
    /* scSocket */ typingsSlinky.socketclusterDashServer.scserversocketMod.^, 
    /* status */ badAuthStatus, 
    Unit
  ]
  type connectionListenerFunction = js.Function2[
    /* scSocket */ typingsSlinky.socketclusterDashServer.scserversocketMod.^, 
    /* serverSocketStatus */ SCServerSocketStatus, 
    Unit
  ]
  type disconnectionListenerFunction = js.Function3[
    /* scSocket */ typingsSlinky.socketclusterDashServer.scserversocketMod.^, 
    /* code */ Double, 
    /* data */ js.Any, 
    Unit
  ]
  type handshakeListenerFunction = js.Function1[/* scSocket */ typingsSlinky.socketclusterDashServer.scserversocketMod.^, Unit]
  type nextAuthenticateMiddlewareFunction = js.Function2[
    /* error */ js.UndefOr[`true` | String | js.Error | Null], 
    /* isBadToken */ js.UndefOr[Boolean], 
    Unit
  ]
  type nextHandshakeSCMiddlewareFunction = js.Function2[
    /* error */ js.UndefOr[`true` | String | js.Error | Null], 
    /* statusCode */ js.UndefOr[Double], 
    Unit
  ]
  type nextMiddlewareFunction = js.Function1[/* error */ js.UndefOr[`true` | String | js.Error], Unit]
  type subscriptionListenerFunction = js.Function3[
    /* scSocket */ typingsSlinky.socketclusterDashServer.scserversocketMod.^, 
    /* name */ String, 
    /* options */ Anon_Channel, 
    Unit
  ]
  type unsubscriptionListenerFunction = js.Function2[
    /* scSocket */ typingsSlinky.socketclusterDashServer.scserversocketMod.^, 
    /* channel */ String, 
    Unit
  ]
  type verifyHandshakeFunction = js.Function3[
    /* success */ Boolean, 
    /* errorCode */ js.UndefOr[Double], 
    /* errorMessage */ js.UndefOr[String], 
    Unit
  ]
}
