package typingsSlinky.undertaker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Task = java.lang.String | typingsSlinky.undertaker.mod.TaskFunction
  type TaskFlags = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type TaskFunctionBase = js.Function1[
    /* done */ js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit | typingsSlinky.node.streamMod.Duplex | typingsSlinky.node.processMod.global.NodeJS.Process | js.Promise[scala.Nothing] | js.Any
  ]
}
