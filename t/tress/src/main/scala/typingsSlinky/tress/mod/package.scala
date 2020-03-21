package typingsSlinky.tress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TressJobCallback = js.ThisFunction1[/* this */ typingsSlinky.tress.mod.TressJobData, /* repeated */ js.Any, scala.Unit]
  type TressJobData = org.scalablytyped.runtime.StringDictionary[js.Object]
  type TressWorkerDoneCallback = js.Function2[
    /* err */ js.UndefOr[scala.Boolean | js.Error | scala.Null], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
}
