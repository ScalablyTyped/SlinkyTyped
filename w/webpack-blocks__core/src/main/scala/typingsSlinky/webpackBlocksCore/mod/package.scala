package typingsSlinky.webpackBlocksCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfigSetter[T /* <: typingsSlinky.webpackBlocksCore.mod.Context */] = js.Function2[
    /* context */ T, 
    /* util */ typingsSlinky.webpackBlocksCore.mod.Util, 
    js.Function1[
      /* config */ typingsSlinky.webpack.mod.Configuration, 
      typingsSlinky.webpack.mod.Configuration
    ]
  ]
}
