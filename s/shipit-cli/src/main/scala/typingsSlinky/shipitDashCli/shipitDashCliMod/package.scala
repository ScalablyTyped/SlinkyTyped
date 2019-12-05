package typingsSlinky.shipitDashCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shipitDashCliMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.node.childUnderscoreProcessMod.ExecOptions

  type EmptyCallback = js.Function0[Unit]
  type LocalOrRemoteCommand = js.Function3[
    /* command */ String, 
    /* options */ js.UndefOr[ExecOptions], 
    /* callback */ js.UndefOr[
      js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
    ], 
    js.Thenable[ShipitLocal]
  ]
  type TaskExecution = js.Function3[
    /* name */ String, 
    /* depsOrFn */ js.Array[String] | EmptyCallback, 
    /* fn */ js.Function0[Unit], 
    js.Any
  ]
  type Tasks = StringDictionary[Task]
}
