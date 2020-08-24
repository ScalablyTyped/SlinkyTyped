package typingsSlinky.zapierPlatformCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AppError = js.Error
  type DehydrateFunc = js.Function2[
    /* func */ js.Function2[
      /* z */ typingsSlinky.zapierPlatformCore.mod.ZObject, 
      /* bundle */ typingsSlinky.zapierPlatformCore.mod.Bundle[js.Any], 
      js.Any
    ], 
    /* inputData */ js.Object, 
    java.lang.String
  ]
  type ExpiredAuthError = js.Error
  type HaltedError = js.Error
  type RefreshAuthError = js.Error
}
